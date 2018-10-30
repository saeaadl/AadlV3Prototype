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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'property'", "'properties'", "','", "'type'", "'private'", "'interface'", "'extends'", "'use'", "'is'", "'configuration'", "':'", "'sampled'", "'reverse'", "'->'", "'.'", "'import'", "'=>'", "'flow'", "'#'", "'{'", "'}'", "'('", "')'", "'workingset'", "'.*'", "';'", "'component'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'access'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'map'", "'virtual'", "'group'", "'to'", "'source'", "'sink'", "'path'", "'read'", "'write'", "'readwrite'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalAadlV3.g:76:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAadlV3.g:76:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAadlV3.g:77:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAadlV3.g:83:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_elements_3_1 = null;

        EObject lv_elements_3_2 = null;

        EObject lv_elements_3_3 = null;

        EObject lv_elements_3_4 = null;

        EObject lv_elements_3_5 = null;

        EObject lv_elements_3_6 = null;

        EObject lv_elements_3_7 = null;

        EObject lv_elements_3_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:89:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:91:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
              		
            }
            // InternalAadlV3.g:95:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAadlV3.g:96:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:96:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAadlV3.g:97:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:114:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAadlV3.g:115:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalAadlV3.g:115:4: (lv_imports_2_0= ruleImport )
            	    // InternalAadlV3.g:116:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAadlV3.g:133:3: ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=13 && LA3_0<=14)||(LA3_0>=16 && LA3_0<=17)||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    {
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
            	    {
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
            	    int alt2=8;
            	    alt2 = dfa2.predict(input);
            	    switch (alt2) {
            	        case 1 :
            	            // InternalAadlV3.g:136:6: lv_elements_3_1= rulePackageDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageDeclarationParserRuleCall_3_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_1=rulePackageDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_1,
            	              							"org.osate.xtext.aadlv3.AadlV3.PackageDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAadlV3.g:152:6: lv_elements_3_2= rulePrimitiveType
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPrimitiveTypeParserRuleCall_3_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_2=rulePrimitiveType();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_2,
            	              							"org.osate.xtext.aadlv3.AadlV3.PrimitiveType");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalAadlV3.g:168:6: lv_elements_3_3= ruleComponentInterface
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentInterfaceParserRuleCall_3_0_2());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_3=ruleComponentInterface();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_3,
            	              							"org.osate.xtext.aadlv3.AadlV3.ComponentInterface");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalAadlV3.g:184:6: lv_elements_3_4= ruleComponentImplementation
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentImplementationParserRuleCall_3_0_3());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_4=ruleComponentImplementation();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_4,
            	              							"org.osate.xtext.aadlv3.AadlV3.ComponentImplementation");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalAadlV3.g:200:6: lv_elements_3_5= ruleComponentConfiguration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentConfigurationParserRuleCall_3_0_4());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_5=ruleComponentConfiguration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_5,
            	              							"org.osate.xtext.aadlv3.AadlV3.ComponentConfiguration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalAadlV3.g:216:6: lv_elements_3_6= ruleProperty
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPropertyParserRuleCall_3_0_5());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_6=ruleProperty();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_6,
            	              							"org.osate.xtext.aadlv3.AadlV3.Property");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // InternalAadlV3.g:232:6: lv_elements_3_7= rulePropertySet
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPropertySetParserRuleCall_3_0_6());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_7=rulePropertySet();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_7,
            	              							"org.osate.xtext.aadlv3.AadlV3.PropertySet");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // InternalAadlV3.g:248:6: lv_elements_3_8= ruleWorkingset
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsWorkingsetParserRuleCall_3_0_7());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_8=ruleWorkingset();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"elements",
            	              							lv_elements_3_8,
            	              							"org.osate.xtext.aadlv3.AadlV3.Workingset");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getEndKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPackageDeclarationAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRuleProperty"
    // InternalAadlV3.g:281:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAadlV3.g:281:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAadlV3.g:282:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalAadlV3.g:288:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:294:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON )
            // InternalAadlV3.g:296:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
              		
            }
            // InternalAadlV3.g:300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:301:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:318:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:319:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:319:4: ( ruleQualifiedName )
            // InternalAadlV3.g:320:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertyAccess().getSEMICOLONParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertySet"
    // InternalAadlV3.g:345:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:345:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:346:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:352:1: rulePropertySet returns [EObject current=null] : (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= 'end' ruleSEMICOLON ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAadlV3.g:358:2: ( (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:359:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:359:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:360:3: otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= 'end' ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertySetAccess().getPropertiesKeyword_0());
              		
            }
            // InternalAadlV3.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:382:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:383:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:383:4: ( ruleQualifiedName )
            // InternalAadlV3.g:384:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:398:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAadlV3.g:399:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:403:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:404:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:404:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:405:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getEndKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRulePrimitiveType"
    // InternalAadlV3.g:435:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalAadlV3.g:435:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalAadlV3.g:436:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalAadlV3.g:442:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_PropertiesBlock_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:448:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:449:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:449:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:450:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalAadlV3.g:454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:455:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:472:3: (this_PropertiesBlock_2= rulePropertiesBlock[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAadlV3.g:473:4: this_PropertiesBlock_2= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      				}
                      				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getPropertiesBlockParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_PropertiesBlock_2=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getSEMICOLONParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRuleComponentInterface"
    // InternalAadlV3.g:496:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:496:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:497:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:503:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        EObject this_InterfaceExtensions_5 = null;

        EObject this_InterfaceBody_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:509:2: ( ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:510:2: ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:510:2: ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:511:3: ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:511:3: ( (lv_private_0_0= 'private' ) )
            // InternalAadlV3.g:512:4: (lv_private_0_0= 'private' )
            {
            // InternalAadlV3.g:512:4: (lv_private_0_0= 'private' )
            // InternalAadlV3.g:513:5: lv_private_0_0= 'private'
            {
            lv_private_0_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
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

            // InternalAadlV3.g:525:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=39 && LA6_0<=48)||LA6_0==58) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAadlV3.g:526:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:526:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:527:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:548:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:549:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:549:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:550:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalAadlV3.g:566:3: (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAadlV3.g:567:4: otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:571:4: (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==25) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalAadlV3.g:572:5: this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_13);
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


                    }
                    break;

            }

            // InternalAadlV3.g:585:3: (this_InterfaceBody_6= ruleInterfaceBody[$current] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:586:4: this_InterfaceBody_6= ruleInterfaceBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_InterfaceBody_6=ruleInterfaceBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceBody_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:598:3: (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAadlV3.g:599:4: otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getUseKeyword_6_0());
                      			
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_6_1());
                      			
                    }
                    // InternalAadlV3.g:607:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:608:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:608:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:609:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:623:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAadlV3.g:624:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:628:5: ( ( ruleQualifiedName ) )
                    	    // InternalAadlV3.g:629:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalAadlV3.g:629:6: ( ruleQualifiedName )
                    	    // InternalAadlV3.g:630:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getComponentInterfaceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop10;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_6_4());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getEndKeyword_7());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:669:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_features_1_0 = null;

        EObject lv_flows_2_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_flows_4_0 = null;

        EObject lv_propertyAssociations_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:675:2: ( (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* ) )
            // InternalAadlV3.g:676:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* )
            {
            // InternalAadlV3.g:676:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* )
            // InternalAadlV3.g:677:3: otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:681:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            loop12:
            do {
                int alt12=6;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalAadlV3.g:682:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:682:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:683:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:683:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:684:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_features_1_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_1_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Feature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:702:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    {
            	    // InternalAadlV3.g:702:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    // InternalAadlV3.g:703:5: (lv_flows_2_0= ruleFlowPath )
            	    {
            	    // InternalAadlV3.g:703:5: (lv_flows_2_0= ruleFlowPath )
            	    // InternalAadlV3.g:704:6: lv_flows_2_0= ruleFlowPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_flows_2_0=ruleFlowPath();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"flows",
            	      							lv_flows_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FlowPath");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAadlV3.g:722:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    {
            	    // InternalAadlV3.g:722:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    // InternalAadlV3.g:723:5: (lv_flows_3_0= ruleFlowSource )
            	    {
            	    // InternalAadlV3.g:723:5: (lv_flows_3_0= ruleFlowSource )
            	    // InternalAadlV3.g:724:6: lv_flows_3_0= ruleFlowSource
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_flows_3_0=ruleFlowSource();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"flows",
            	      							lv_flows_3_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FlowSource");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAadlV3.g:742:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    {
            	    // InternalAadlV3.g:742:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    // InternalAadlV3.g:743:5: (lv_flows_4_0= ruleFlowSink )
            	    {
            	    // InternalAadlV3.g:743:5: (lv_flows_4_0= ruleFlowSink )
            	    // InternalAadlV3.g:744:6: lv_flows_4_0= ruleFlowSink
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_flows_4_0=ruleFlowSink();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"flows",
            	      							lv_flows_4_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FlowSink");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAadlV3.g:762:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:762:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:763:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:763:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:764:6: lv_propertyAssociations_5_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_propertyAssociations_5_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_5_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleInterfaceBody"


    // $ANTLR start "entryRuleComponentImplementation"
    // InternalAadlV3.g:786:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:786:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:787:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:793:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:799:2: ( ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:800:2: ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:800:2: ( ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:801:3: ( (lv_private_0_0= 'private' ) ) ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:801:3: ( (lv_private_0_0= 'private' ) )
            // InternalAadlV3.g:802:4: (lv_private_0_0= 'private' )
            {
            // InternalAadlV3.g:802:4: (lv_private_0_0= 'private' )
            // InternalAadlV3.g:803:5: lv_private_0_0= 'private'
            {
            lv_private_0_0=(Token)match(input,17,FOLLOW_19); if (state.failed) return current;
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

            // InternalAadlV3.g:815:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:816:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:816:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:817:5: lv_category_1_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
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

            // InternalAadlV3.g:834:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:835:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:835:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:836:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

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
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:853:3: (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAadlV3.g:854:4: otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:858:4: (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalAadlV3.g:859:5: this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentImplementationRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_22);
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


                    }
                    break;

            }

            // InternalAadlV3.g:872:3: (this_ImplementationBody_5= ruleImplementationBody[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:873:4: this_ImplementationBody_5= ruleImplementationBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_ImplementationBody_5=ruleImplementationBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationBody_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getComponentImplementationAccess().getEndKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:901:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_connections_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_paths_4_0 = null;

        EObject lv_flowAssignments_5_0 = null;

        EObject lv_assignments_6_0 = null;

        EObject lv_propertyAssociations_7_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:907:2: ( (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* ) )
            // InternalAadlV3.g:908:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* )
            {
            // InternalAadlV3.g:908:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* )
            // InternalAadlV3.g:909:3: otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:913:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*
            loop16:
            do {
                int alt16=8;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalAadlV3.g:914:4: ( (lv_connections_1_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:914:4: ( (lv_connections_1_0= ruleConnection ) )
            	    // InternalAadlV3.g:915:5: (lv_connections_1_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:915:5: (lv_connections_1_0= ruleConnection )
            	    // InternalAadlV3.g:916:6: lv_connections_1_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_connections_1_0=ruleConnection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
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
            	case 2 :
            	    // InternalAadlV3.g:934:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:934:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:935:5: (lv_connections_2_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:935:5: (lv_connections_2_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:936:6: lv_connections_2_0= ruleFeatureMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_connections_2_0=ruleFeatureMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connections",
            	      							lv_connections_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAadlV3.g:954:4: ( (lv_components_3_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:954:4: ( (lv_components_3_0= ruleComponent ) )
            	    // InternalAadlV3.g:955:5: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:955:5: (lv_components_3_0= ruleComponent )
            	    // InternalAadlV3.g:956:6: lv_components_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"components",
            	      							lv_components_3_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Component");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAadlV3.g:974:4: ( (lv_paths_4_0= rulePath ) )
            	    {
            	    // InternalAadlV3.g:974:4: ( (lv_paths_4_0= rulePath ) )
            	    // InternalAadlV3.g:975:5: (lv_paths_4_0= rulePath )
            	    {
            	    // InternalAadlV3.g:975:5: (lv_paths_4_0= rulePath )
            	    // InternalAadlV3.g:976:6: lv_paths_4_0= rulePath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_paths_4_0=rulePath();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"paths",
            	      							lv_paths_4_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Path");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAadlV3.g:994:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    {
            	    // InternalAadlV3.g:994:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    // InternalAadlV3.g:995:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    {
            	    // InternalAadlV3.g:995:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    // InternalAadlV3.g:996:6: lv_flowAssignments_5_0= ruleFlowAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_flowAssignments_5_0=ruleFlowAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"flowAssignments",
            	      							lv_flowAssignments_5_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAadlV3.g:1014:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:1014:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:1015:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:1015:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:1016:6: lv_assignments_6_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_assignments_6_0=ruleConfigurationAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assignments",
            	      							lv_assignments_6_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAadlV3.g:1034:4: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:1034:4: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:1035:5: (lv_propertyAssociations_7_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:1035:5: (lv_propertyAssociations_7_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:1036:6: lv_propertyAssociations_7_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_propertyAssociations_7_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_7_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleImplementationBody"


    // $ANTLR start "entryRuleComponentConfiguration"
    // InternalAadlV3.g:1058:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1058:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1059:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1065:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) ) otherlv_1= 'configuration' ( (lv_name_2_0= ruleQualifiedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ClassifierExtensions_5= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON ) ;
    public final EObject ruleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_Parameters_3 = null;

        EObject this_ClassifierExtensions_5 = null;

        EObject this_ConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1071:2: ( ( ( (lv_private_0_0= 'private' ) ) otherlv_1= 'configuration' ( (lv_name_2_0= ruleQualifiedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ClassifierExtensions_5= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:1072:2: ( ( (lv_private_0_0= 'private' ) ) otherlv_1= 'configuration' ( (lv_name_2_0= ruleQualifiedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ClassifierExtensions_5= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:1072:2: ( ( (lv_private_0_0= 'private' ) ) otherlv_1= 'configuration' ( (lv_name_2_0= ruleQualifiedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ClassifierExtensions_5= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:1073:3: ( (lv_private_0_0= 'private' ) ) otherlv_1= 'configuration' ( (lv_name_2_0= ruleQualifiedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ClassifierExtensions_5= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:1073:3: ( (lv_private_0_0= 'private' ) )
            // InternalAadlV3.g:1074:4: (lv_private_0_0= 'private' )
            {
            // InternalAadlV3.g:1074:4: (lv_private_0_0= 'private' )
            // InternalAadlV3.g:1075:5: lv_private_0_0= 'private'
            {
            lv_private_0_0=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1091:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:1092:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:1092:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:1093:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleQualifiedName();

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
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1110:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:1111:4: this_Parameters_3= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getClassifierExtensionsParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_22);
            this_ClassifierExtensions_5=ruleClassifierExtensions(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ClassifierExtensions_5;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:1138:3: (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAadlV3.g:1139:4: this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_ConfigurationElementBlock_6=ruleConfigurationElementBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationElementBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getComponentConfigurationAccess().getEndKeyword_7());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:1166:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1166:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1167:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1173:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_sampled_3_0=null;
        Token lv_reverse_5_0=null;
        AntlrDatatypeRuleToken lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_category_4_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1179:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1180:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1180:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1181:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1181:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1182:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1182:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1183:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1203:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=53 && LA19_0<=56)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:1204:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1204:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1205:5: lv_direction_2_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
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

            // InternalAadlV3.g:1222:3: ( (lv_sampled_3_0= 'sampled' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAadlV3.g:1223:4: (lv_sampled_3_0= 'sampled' )
                    {
                    // InternalAadlV3.g:1223:4: (lv_sampled_3_0= 'sampled' )
                    // InternalAadlV3.g:1224:5: lv_sampled_3_0= 'sampled'
                    {
                    lv_sampled_3_0=(Token)match(input,24,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sampled_3_0, grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFeatureRule());
                      					}
                      					setWithLastConsumed(current, "sampled", true, "sampled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1236:3: ( (lv_category_4_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1237:4: (lv_category_4_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1237:4: (lv_category_4_0= ruleFeatureCategory )
            // InternalAadlV3.g:1238:5: lv_category_4_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalAadlV3.g:1255:3: ( (lv_reverse_5_0= 'reverse' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAadlV3.g:1256:4: (lv_reverse_5_0= 'reverse' )
                    {
                    // InternalAadlV3.g:1256:4: (lv_reverse_5_0= 'reverse' )
                    // InternalAadlV3.g:1257:5: lv_reverse_5_0= 'reverse'
                    {
                    lv_reverse_5_0=(Token)match(input,25,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reverse_5_0, grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFeatureRule());
                      					}
                      					setWithLastConsumed(current, "reverse", true, "reverse");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1269:3: ( ( ruleQualifiedName ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1270:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:1270:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:1271:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFeatureRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
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

            // InternalAadlV3.g:1285:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1286:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFeatureAccess().getSEMICOLONParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRuleComponent"
    // InternalAadlV3.g:1309:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1309:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1310:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalAadlV3.g:1316:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReference_3_0 = null;

        EObject this_NestedComponentImplementationBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1322:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1323:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1323:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1324:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1324:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1325:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1325:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1326:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1346:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1347:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1347:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1348:5: lv_category_2_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_category_2_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentRule());
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

            // InternalAadlV3.g:1365:3: ( (lv_typeReference_3_0= ruleTypeReference ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1366:4: (lv_typeReference_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1366:4: (lv_typeReference_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1367:5: lv_typeReference_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_typeReference_3_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentRule());
                      					}
                      					set(
                      						current,
                      						"typeReference",
                      						lv_typeReference_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1384:3: (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1385:4: this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_NestedComponentImplementationBlock_4=ruleNestedComponentImplementationBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NestedComponentImplementationBlock_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnection"
    // InternalAadlV3.g:1408:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1408:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1409:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1415:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1421:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1422:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1422:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1423:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1423:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1424:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1424:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1425:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1445:3: ( (lv_associationType_2_0= ruleConnectionType ) )
            // InternalAadlV3.g:1446:4: (lv_associationType_2_0= ruleConnectionType )
            {
            // InternalAadlV3.g:1446:4: (lv_associationType_2_0= ruleConnectionType )
            // InternalAadlV3.g:1447:5: lv_associationType_2_0= ruleConnectionType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeConnectionTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_associationType_2_0=ruleConnectionType();

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
              						"org.osate.xtext.aadlv3.AadlV3.ConnectionType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1464:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1465:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1465:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1466:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1487:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1488:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1488:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1489:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_destination_5_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectionRule());
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

            // InternalAadlV3.g:1506:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1507:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConnectionRule());
                      				}
                      				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConnectionAccess().getSEMICOLONParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRuleFeatureMapping"
    // InternalAadlV3.g:1530:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // InternalAadlV3.g:1530:55: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // InternalAadlV3.g:1531:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureMapping=ruleFeatureMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureMapping; 
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
    // $ANTLR end "entryRuleFeatureMapping"


    // $ANTLR start "ruleFeatureMapping"
    // InternalAadlV3.g:1537:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFeatureMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1543:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1544:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1544:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1545:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1545:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1546:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1546:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1547:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFeatureMappingAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureMappingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureMappingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1567:3: ( (lv_associationType_2_0= ruleMappingType ) )
            // InternalAadlV3.g:1568:4: (lv_associationType_2_0= ruleMappingType )
            {
            // InternalAadlV3.g:1568:4: (lv_associationType_2_0= ruleMappingType )
            // InternalAadlV3.g:1569:5: lv_associationType_2_0= ruleMappingType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getAssociationTypeMappingTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_associationType_2_0=ruleMappingType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.MappingType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1586:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1587:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1587:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1588:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
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

            otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureMappingAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1609:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1610:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1610:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1611:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_destination_5_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
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

            // InternalAadlV3.g:1628:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1629:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureMappingRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureMappingAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFeatureMappingAccess().getSEMICOLONParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleFeatureMapping"


    // $ANTLR start "entryRuleFlowPath"
    // InternalAadlV3.g:1652:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1652:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1653:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1659:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1665:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1667:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1667:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1668:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1668:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1669:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1689:3: ( (lv_associationType_2_0= ruleFlowPathType ) )
            // InternalAadlV3.g:1690:4: (lv_associationType_2_0= ruleFlowPathType )
            {
            // InternalAadlV3.g:1690:4: (lv_associationType_2_0= ruleFlowPathType )
            // InternalAadlV3.g:1691:5: lv_associationType_2_0= ruleFlowPathType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getAssociationTypeFlowPathTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_associationType_2_0=ruleFlowPathType();

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
              						"org.osate.xtext.aadlv3.AadlV3.FlowPathType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1708:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1709:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1709:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1710:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1731:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1732:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1732:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1733:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            // InternalAadlV3.g:1750:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1751:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFlowPathAccess().getSEMICOLONParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:1774:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:1774:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:1775:2: iv_ruleFlowSource= ruleFlowSource EOF
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
    // InternalAadlV3.g:1781:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1787:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1788:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1788:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1789:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1789:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1790:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1790:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1791:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1811:3: ( (lv_associationType_2_0= ruleFlowSourceType ) )
            // InternalAadlV3.g:1812:4: (lv_associationType_2_0= ruleFlowSourceType )
            {
            // InternalAadlV3.g:1812:4: (lv_associationType_2_0= ruleFlowSourceType )
            // InternalAadlV3.g:1813:5: lv_associationType_2_0= ruleFlowSourceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getAssociationTypeFlowSourceTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_associationType_2_0=ruleFlowSourceType();

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
              						"org.osate.xtext.aadlv3.AadlV3.FlowSourceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1830:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1831:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1831:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1832:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            // InternalAadlV3.g:1849:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1850:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSourceRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFlowSourceAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:1873:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:1873:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:1874:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:1880:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1886:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1888:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1888:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1889:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1889:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1890:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1910:3: ( (lv_associationType_2_0= ruleFlowSinkType ) )
            // InternalAadlV3.g:1911:4: (lv_associationType_2_0= ruleFlowSinkType )
            {
            // InternalAadlV3.g:1911:4: (lv_associationType_2_0= ruleFlowSinkType )
            // InternalAadlV3.g:1912:5: lv_associationType_2_0= ruleFlowSinkType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getAssociationTypeFlowSinkTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_associationType_2_0=ruleFlowSinkType();

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
              						"org.osate.xtext.aadlv3.AadlV3.FlowSinkType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1929:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1930:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1930:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1931:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            // InternalAadlV3.g:1948:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1949:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSinkRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFlowSinkAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRulePath"
    // InternalAadlV3.g:1972:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:1972:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:1973:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:1979:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1985:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1986:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1986:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1987:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1987:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1988:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1988:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1989:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPathAccess().getEndToEndFlowKeywordsParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_3);
            ruleEndToEndFlowKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:2016:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2017:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2017:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2018:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:2035:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAadlV3.g:2036:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2040:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2041:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2041:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2042:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // InternalAadlV3.g:2060:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAadlV3.g:2061:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPathAccess().getSEMICOLONParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // InternalAadlV3.g:2084:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2084:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2085:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2091:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2097:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2098:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2098:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2099:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2099:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2100:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2100:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2101:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2112:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) && (synpred1_InternalAadlV3())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAadlV3.g:2113:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2124:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2125:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2125:5: ()
            	    // InternalAadlV3.g:2126:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2136:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2137:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2137:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2138:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAadlV3.g:2155:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2155:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2156:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2162:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2168:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2169:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2169:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2170:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2174:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAadlV3.g:2175:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAadlV3.g:2175:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAadlV3.g:2176:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImportAccess().getSEMICOLONParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRuleConfigurationAssignment"
    // InternalAadlV3.g:2204:1: entryRuleConfigurationAssignment returns [EObject current=null] : iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF ;
    public final EObject entryRuleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignment = null;


        try {
            // InternalAadlV3.g:2204:64: (iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF )
            // InternalAadlV3.g:2205:2: iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAssignment=ruleConfigurationAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAssignment; 
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
    // $ANTLR end "entryRuleConfigurationAssignment"


    // $ANTLR start "ruleConfigurationAssignment"
    // InternalAadlV3.g:2211:1: ruleConfigurationAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) ;
    public final EObject ruleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject this_CurlyConfigurationElementBlock_3 = null;

        EObject this_CurlyConfigurationElementBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2217:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2218:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2218:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            // InternalAadlV3.g:2219:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2219:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2220:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2220:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2221:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_target_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
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

            otherlv_1=(Token)match(input,29,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2242:3: ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==32) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:2243:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2243:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2244:5: ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2244:5: ( (lv_value_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2245:6: (lv_value_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2245:6: (lv_value_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2246:7: lv_value_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getValueTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_29);
                    lv_value_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
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

                    // InternalAadlV3.g:2263:5: (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==32) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAadlV3.g:2264:6: this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
                              						}
                              						newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_1());
                              					
                            }
                            pushFollow(FOLLOW_6);
                            this_CurlyConfigurationElementBlock_3=ruleCurlyConfigurationElementBlock(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_CurlyConfigurationElementBlock_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2278:4: this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
                      				}
                      				newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_CurlyConfigurationElementBlock_4=ruleCurlyConfigurationElementBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CurlyConfigurationElementBlock_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getSEMICOLONParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleConfigurationAssignment"


    // $ANTLR start "entryRuleFlowAssignment"
    // InternalAadlV3.g:2301:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2301:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2302:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2308:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) ;
    public final EObject ruleFlowAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_target_0_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2314:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) )
            // InternalAadlV3.g:2315:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            {
            // InternalAadlV3.g:2315:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            // InternalAadlV3.g:2316:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON
            {
            // InternalAadlV3.g:2316:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2317:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2317:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2318:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            otherlv_1=(Token)match(input,29,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2343:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2344:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2344:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2345:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalAadlV3.g:2362:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAadlV3.g:2363:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2367:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2368:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2368:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2369:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFlowAssignmentAccess().getSEMICOLONParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRulePropertyAssociation"
    // InternalAadlV3.g:2398:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:2398:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:2399:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:2405:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2411:2: ( ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2412:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2412:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2413:3: ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2413:3: ( (lv_target_0_0= rulePropertyReference ) )
            // InternalAadlV3.g:2414:4: (lv_target_0_0= rulePropertyReference )
            {
            // InternalAadlV3.g:2414:4: (lv_target_0_0= rulePropertyReference )
            // InternalAadlV3.g:2415:5: lv_target_0_0= rulePropertyReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_target_0_0=rulePropertyReference();

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
              						"org.osate.xtext.aadlv3.AadlV3.PropertyReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2436:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalAadlV3.g:2437:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalAadlV3.g:2437:4: (lv_value_2_0= rulePropertyValue )
            // InternalAadlV3.g:2438:5: lv_value_2_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_value_2_0=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropertyValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertyAssociationAccess().getSEMICOLONParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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


    // $ANTLR start "entryRulePropertyValue"
    // InternalAadlV3.g:2466:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:2466:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:2467:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalAadlV3.g:2473:1: rulePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2479:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAadlV3.g:2480:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAadlV3.g:2480:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:2481:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:2481:3: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:2482:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPropertyValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleModelElementReference"
    // InternalAadlV3.g:2501:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:2501:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:2502:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:2508:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2514:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2515:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2515:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2516:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2516:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2517:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2517:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2518:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2529:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27) && (synpred2_InternalAadlV3())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAadlV3.g:2530:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2541:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2542:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2542:5: ()
            	    // InternalAadlV3.g:2543:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2553:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2554:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2554:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2555:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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


    // $ANTLR start "entryRulePropertyReference"
    // InternalAadlV3.g:2572:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalAadlV3.g:2572:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalAadlV3.g:2573:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalAadlV3.g:2579:1: rulePropertyReference returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2585:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2586:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2586:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2587:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2587:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:2588:4: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    {
                    // InternalAadlV3.g:2588:4: ( (otherlv_0= RULE_ID ) )
                    // InternalAadlV3.g:2589:5: (otherlv_0= RULE_ID )
                    {
                    // InternalAadlV3.g:2589:5: (otherlv_0= RULE_ID )
                    // InternalAadlV3.g:2590:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertyReferenceRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:2601:4: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) && (synpred3_InternalAadlV3())) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAadlV3.g:2602:5: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    {
                    	    // InternalAadlV3.g:2613:5: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    // InternalAadlV3.g:2614:6: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    // InternalAadlV3.g:2614:6: ()
                    	    // InternalAadlV3.g:2615:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2625:6: ( (otherlv_3= RULE_ID ) )
                    	    // InternalAadlV3.g:2626:7: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalAadlV3.g:2626:7: (otherlv_3= RULE_ID )
                    	    // InternalAadlV3.g:2627:8: otherlv_3= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getPropertyReferenceRule());
                    	      								}
                    	      							
                    	    }
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(otherlv_3, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0());
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2645:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2646:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2646:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2647:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_2_0());
              				
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


    // $ANTLR start "ruleConfigurationElementBlock"
    // InternalAadlV3.g:2666:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2672:2: ( (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) )
            // InternalAadlV3.g:2673:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            {
            // InternalAadlV3.g:2673:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            // InternalAadlV3.g:2674:3: otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:2678:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=3;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // InternalAadlV3.g:2679:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:2679:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:2680:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:2680:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:2681:6: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_propertyAssociations_1_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationElementBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_1_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:2699:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:2699:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:2700:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:2700:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:2701:6: lv_assignments_2_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_assignments_2_0=ruleConfigurationAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationElementBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assignments",
            	      							lv_assignments_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // $ANTLR end "ruleConfigurationElementBlock"


    // $ANTLR start "ruleCurlyConfigurationElementBlock"
    // InternalAadlV3.g:2724:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2730:2: ( (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' ) )
            // InternalAadlV3.g:2731:2: (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' )
            {
            // InternalAadlV3.g:2731:2: (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' )
            // InternalAadlV3.g:2732:3: otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:2736:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalAadlV3.g:2737:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:2737:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:2738:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:2738:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:2739:6: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_propertyAssociations_1_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_1_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:2757:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:2757:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:2758:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:2758:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:2759:6: lv_assignments_2_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_assignments_2_0=ruleConfigurationAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assignments",
            	      							lv_assignments_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2());
              		
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


    // $ANTLR start "ruleParameters"
    // InternalAadlV3.g:2786:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2792:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:2793:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:2793:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:2794:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:2794:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:2795:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:2795:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:2796:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
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

            // InternalAadlV3.g:2808:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAadlV3.g:2809:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:2809:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:2810:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:2810:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:2811:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalAadlV3.g:2828:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalAadlV3.g:2829:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:2833:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:2834:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:2834:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:2835:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2862:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:2862:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:2863:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:2869:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2875:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2876:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2876:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2877:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2877:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2878:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2878:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2879:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2899:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2900:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2900:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2901:5: ruleQualifiedName
            {
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
    // InternalAadlV3.g:2919:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:2919:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:2920:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:2926:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2932:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2933:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2933:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2934:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2934:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAadlV3.g:2935:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:2935:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:2936:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
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

            // InternalAadlV3.g:2948:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2949:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2949:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2950:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0());
              				
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
    // $ANTLR end "ruleReversableInterfaceReference"


    // $ANTLR start "entryRuleTypeReference"
    // InternalAadlV3.g:2968:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:2968:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:2969:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:2975:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2981:2: ( ( ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:2982:2: ( ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:2982:2: ( ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:2983:3: ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:2983:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2984:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2984:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2985:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_45);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2999:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAadlV3.g:3000:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTypeReferenceRule());
                      				}
                      				newCompositeNode(grammarAccess.getTypeReferenceAccess().getConfigurationActualsParserRuleCall_1());
                      			
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleImplementationReference"
    // InternalAadlV3.g:3016:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:3016:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:3017:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:3023:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3029:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3030:2: ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3030:2: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3031:3: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3031:3: ( ruleQualifiedName )
            // InternalAadlV3.g:3032:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getImplementationReferenceRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0());
              			
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
    // $ANTLR end "ruleImplementationReference"


    // $ANTLR start "rulePropertiesBlock"
    // InternalAadlV3.g:3050:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_propertyAssociations_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3056:2: ( (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' ) )
            // InternalAadlV3.g:3057:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' )
            {
            // InternalAadlV3.g:3057:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' )
            // InternalAadlV3.g:3058:3: otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3062:3: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==31) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAadlV3.g:3063:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3063:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3064:5: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_propertyAssociations_1_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPropertiesBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"propertyAssociations",
            	      						lv_propertyAssociations_1_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3090:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_features_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_connections_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_propertyAssociations_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3096:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' ) )
            // InternalAadlV3.g:3097:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' )
            {
            // InternalAadlV3.g:3097:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' )
            // InternalAadlV3.g:3098:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3102:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            loop47:
            do {
                int alt47=6;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // InternalAadlV3.g:3103:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:3103:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:3104:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:3104:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:3105:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_features_1_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_1_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Feature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:3123:4: ( (lv_connections_2_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:3123:4: ( (lv_connections_2_0= ruleConnection ) )
            	    // InternalAadlV3.g:3124:5: (lv_connections_2_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:3124:5: (lv_connections_2_0= ruleConnection )
            	    // InternalAadlV3.g:3125:6: lv_connections_2_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsConnectionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_connections_2_0=ruleConnection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connections",
            	      							lv_connections_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Connection");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAadlV3.g:3143:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:3143:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:3144:5: (lv_connections_3_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:3144:5: (lv_connections_3_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:3145:6: lv_connections_3_0= ruleFeatureMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsFeatureMappingParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_connections_3_0=ruleFeatureMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connections",
            	      							lv_connections_3_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAadlV3.g:3163:4: ( (lv_components_4_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:3163:4: ( (lv_components_4_0= ruleComponent ) )
            	    // InternalAadlV3.g:3164:5: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3164:5: (lv_components_4_0= ruleComponent )
            	    // InternalAadlV3.g:3165:6: lv_components_4_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsComponentParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"components",
            	      							lv_components_4_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Component");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAadlV3.g:3183:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:3183:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:3184:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3184:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3185:6: lv_propertyAssociations_5_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_propertyAssociations_5_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_5_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2());
              		
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


    // $ANTLR start "ruleClassifierExtensions"
    // InternalAadlV3.g:3212:1: ruleClassifierExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleClassifierExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3218:2: ( ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:3219:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:3219:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:3220:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:3220:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) )
            // InternalAadlV3.g:3221:4: (lv_superClassifiers_0_0= ruleTypeReference )
            {
            // InternalAadlV3.g:3221:4: (lv_superClassifiers_0_0= ruleTypeReference )
            // InternalAadlV3.g:3222:5: lv_superClassifiers_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_superClassifiers_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierExtensionsRule());
              					}
              					add(
              						current,
              						"superClassifiers",
              						lv_superClassifiers_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3239:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==15) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAadlV3.g:3240:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getClassifierExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3244:4: ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:3245:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:3245:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    // InternalAadlV3.g:3246:6: lv_superClassifiers_2_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_superClassifiers_2_0=ruleTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassifierExtensionsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"superClassifiers",
            	      							lv_superClassifiers_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleClassifierExtensions"


    // $ANTLR start "ruleImplementationExtensions"
    // InternalAadlV3.g:3269:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3275:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:3276:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:3276:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:3277:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:3277:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:3278:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:3278:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:3279:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            // InternalAadlV3.g:3296:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==15) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAadlV3.g:3297:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3301:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:3302:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:3302:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:3303:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop49;
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
    // InternalAadlV3.g:3326:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3332:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:3333:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:3333:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:3334:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:3334:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:3335:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:3335:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:3336:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            // InternalAadlV3.g:3353:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAadlV3.g:3354:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3358:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:3359:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:3359:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:3360:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop50;
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
    // InternalAadlV3.g:3383:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3389:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3390:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3390:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3391:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:3395:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAadlV3.g:3396:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:3396:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:3397:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:3397:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:3398:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalAadlV3.g:3415:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==15) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalAadlV3.g:3416:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3420:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:3421:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:3421:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:3422:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3449:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:3449:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:3450:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:3456:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3462:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) )
            // InternalAadlV3.g:3463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            {
            // InternalAadlV3.g:3463:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            // InternalAadlV3.g:3464:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) )
            {
            // InternalAadlV3.g:3464:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:3465:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:3465:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:3466:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3481:3: ( (lv_value_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:3482:4: (lv_value_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:3482:4: (lv_value_2_0= ruleTypeReference )
            // InternalAadlV3.g:3483:5: lv_value_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getValueTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
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
    // InternalAadlV3.g:3504:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:3504:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:3505:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:3511:1: ruleWorkingset returns [EObject current=null] : (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rootComponents_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3517:2: ( (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) )
            // InternalAadlV3.g:3518:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            {
            // InternalAadlV3.g:3518:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            // InternalAadlV3.g:3519:3: otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0());
              		
            }
            // InternalAadlV3.g:3523:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAadlV3.g:3524:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:3524:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAadlV3.g:3525:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkingsetAccess().getIsKeyword_2());
              		
            }
            // InternalAadlV3.g:3546:3: ( (lv_rootComponents_3_0= ruleComponent ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAadlV3.g:3547:4: (lv_rootComponents_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3547:4: (lv_rootComponents_3_0= ruleComponent )
            	    // InternalAadlV3.g:3548:5: lv_rootComponents_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_rootComponents_3_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rootComponents",
            	      						lv_rootComponents_3_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkingsetAccess().getEndKeyword_4());
              		
            }
            // InternalAadlV3.g:3569:3: ( ruleSEMICOLON )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAadlV3.g:3570:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleWorkingset"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAadlV3.g:3582:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:3582:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:3583:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:3589:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3595:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAadlV3.g:3596:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAadlV3.g:3596:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAadlV3.g:3597:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:3607:3: (kw= '.*' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAadlV3.g:3608:4: kw= '.*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAadlV3.g:3618:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:3618:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:3619:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:3625:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3631:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:3632:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:3632:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:3633:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:3640:3: (kw= '.' this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==27) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAadlV3.g:3641:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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


    // $ANTLR start "entryRuleSEMICOLON"
    // InternalAadlV3.g:3658:1: entryRuleSEMICOLON returns [String current=null] : iv_ruleSEMICOLON= ruleSEMICOLON EOF ;
    public final String entryRuleSEMICOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMICOLON = null;


        try {
            // InternalAadlV3.g:3658:49: (iv_ruleSEMICOLON= ruleSEMICOLON EOF )
            // InternalAadlV3.g:3659:2: iv_ruleSEMICOLON= ruleSEMICOLON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSEMICOLONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSEMICOLON=ruleSEMICOLON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSEMICOLON.getText(); 
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
    // $ANTLR end "entryRuleSEMICOLON"


    // $ANTLR start "ruleSEMICOLON"
    // InternalAadlV3.g:3665:1: ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMICOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3671:2: (kw= ';' )
            // InternalAadlV3.g:3672:2: kw= ';'
            {
            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSEMICOLONAccess().getSemicolonKeyword());
              	
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
    // $ANTLR end "ruleSEMICOLON"


    // $ANTLR start "entryRuleComponentCategory"
    // InternalAadlV3.g:3680:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:3680:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:3681:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:3687:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:3693:2: ( (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:3694:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:3694:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt57=16;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalAadlV3.g:3695:3: kw= 'component'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getComponentKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3701:3: kw= 'bus'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3707:3: kw= 'data'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3713:3: kw= 'device'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3719:3: kw= 'memory'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:3725:3: kw= 'process'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:3731:3: kw= 'processor'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:3737:3: kw= 'system'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:3743:3: kw= 'thread'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:3749:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:3760:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:3771:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:3782:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:3793:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:3799:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:3810:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:3824:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:3824:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:3825:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:3831:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BusAccessKeywords_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3837:2: ( (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:3838:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:3838:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt58=1;
                }
                break;
            case 50:
                {
                alt58=2;
                }
                break;
            case 51:
                {
                alt58=3;
                }
                break;
            case 40:
                {
                alt58=4;
                }
                break;
            case 52:
                {
                alt58=5;
                }
                break;
            case 18:
                {
                alt58=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3839:3: kw= 'feature'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3845:3: kw= 'port'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3851:3: kw= 'access'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3857:3: this_BusAccessKeywords_3= ruleBusAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BusAccessKeywords_3=ruleBusAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BusAccessKeywords_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3868:3: kw= 'binding'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:3874:3: kw= 'interface'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_5());
                      		
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
    // InternalAadlV3.g:3883:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:3883:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:3884:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:3890:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:3896:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:3897:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:3897:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt59=11;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalAadlV3.g:3898:3: kw= 'in'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3904:3: kw= 'out'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3910:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:3921:3: kw= 'requires'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3927:3: kw= 'provides'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:3933:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:3944:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:3955:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:3966:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:3977:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:3988:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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


    // $ANTLR start "entryRuleConnectionType"
    // InternalAadlV3.g:4002:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalAadlV3.g:4002:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalAadlV3.g:4003:2: iv_ruleConnectionType= ruleConnectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectionType=ruleConnectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectionType.getText(); 
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
    // $ANTLR end "entryRuleConnectionType"


    // $ANTLR start "ruleConnectionType"
    // InternalAadlV3.g:4009:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4015:2: ( (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' ) )
            // InternalAadlV3.g:4016:2: (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' )
            {
            // InternalAadlV3.g:4016:2: (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt60=1;
                }
                break;
            case 40:
                {
                alt60=2;
                }
                break;
            case 52:
                {
                alt60=3;
                }
                break;
            case 18:
                {
                alt60=4;
                }
                break;
            case 50:
                {
                alt60=5;
                }
                break;
            case 41:
                {
                alt60=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalAadlV3.g:4017:3: kw= 'feature'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4023:3: kw= 'bus'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4029:3: kw= 'binding'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBindingKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4035:3: kw= 'interface'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getInterfaceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4041:3: kw= 'port'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getPortKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4047:3: kw= 'data'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getDataKeyword_5());
                      		
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
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "entryRuleMappingType"
    // InternalAadlV3.g:4056:1: entryRuleMappingType returns [String current=null] : iv_ruleMappingType= ruleMappingType EOF ;
    public final String entryRuleMappingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappingType = null;


        try {
            // InternalAadlV3.g:4056:51: (iv_ruleMappingType= ruleMappingType EOF )
            // InternalAadlV3.g:4057:2: iv_ruleMappingType= ruleMappingType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMappingType=ruleMappingType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingType.getText(); 
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
    // $ANTLR end "entryRuleMappingType"


    // $ANTLR start "ruleMappingType"
    // InternalAadlV3.g:4063:1: ruleMappingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'map' ;
    public final AntlrDatatypeRuleToken ruleMappingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4069:2: (kw= 'map' )
            // InternalAadlV3.g:4070:2: kw= 'map'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMappingTypeAccess().getMapKeyword());
              	
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
    // $ANTLR end "ruleMappingType"


    // $ANTLR start "entryRuleFlowPathType"
    // InternalAadlV3.g:4078:1: entryRuleFlowPathType returns [String current=null] : iv_ruleFlowPathType= ruleFlowPathType EOF ;
    public final String entryRuleFlowPathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathType = null;


        try {
            // InternalAadlV3.g:4078:52: (iv_ruleFlowPathType= ruleFlowPathType EOF )
            // InternalAadlV3.g:4079:2: iv_ruleFlowPathType= ruleFlowPathType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowPathTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowPathType=ruleFlowPathType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowPathType.getText(); 
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
    // $ANTLR end "entryRuleFlowPathType"


    // $ANTLR start "ruleFlowPathType"
    // InternalAadlV3.g:4085:1: ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowPathKeywords_0= ruleFlowPathKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowPathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowPathKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4091:2: (this_FlowPathKeywords_0= ruleFlowPathKeywords )
            // InternalAadlV3.g:4092:2: this_FlowPathKeywords_0= ruleFlowPathKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFlowPathTypeAccess().getFlowPathKeywordsParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_FlowPathKeywords_0=ruleFlowPathKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FlowPathKeywords_0);
              	
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
    // $ANTLR end "ruleFlowPathType"


    // $ANTLR start "entryRuleFlowSourceType"
    // InternalAadlV3.g:4105:1: entryRuleFlowSourceType returns [String current=null] : iv_ruleFlowSourceType= ruleFlowSourceType EOF ;
    public final String entryRuleFlowSourceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceType = null;


        try {
            // InternalAadlV3.g:4105:54: (iv_ruleFlowSourceType= ruleFlowSourceType EOF )
            // InternalAadlV3.g:4106:2: iv_ruleFlowSourceType= ruleFlowSourceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSourceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSourceType=ruleFlowSourceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSourceType.getText(); 
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
    // $ANTLR end "entryRuleFlowSourceType"


    // $ANTLR start "ruleFlowSourceType"
    // InternalAadlV3.g:4112:1: ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSourceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4118:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:4119:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFlowSourceTypeAccess().getFlowSourceKeywordsParserRuleCall());
              	
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
    // $ANTLR end "ruleFlowSourceType"


    // $ANTLR start "entryRuleFlowSinkType"
    // InternalAadlV3.g:4132:1: entryRuleFlowSinkType returns [String current=null] : iv_ruleFlowSinkType= ruleFlowSinkType EOF ;
    public final String entryRuleFlowSinkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkType = null;


        try {
            // InternalAadlV3.g:4132:52: (iv_ruleFlowSinkType= ruleFlowSinkType EOF )
            // InternalAadlV3.g:4133:2: iv_ruleFlowSinkType= ruleFlowSinkType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSinkTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSinkType=ruleFlowSinkType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSinkType.getText(); 
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
    // $ANTLR end "entryRuleFlowSinkType"


    // $ANTLR start "ruleFlowSinkType"
    // InternalAadlV3.g:4139:1: ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSinkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4145:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:4146:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFlowSinkTypeAccess().getFlowSinkKeywordsParserRuleCall());
              	
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
    // $ANTLR end "ruleFlowSinkType"


    // $ANTLR start "entryRuleVirtualProcessorKeywords"
    // InternalAadlV3.g:4159:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:4159:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:4160:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:4166:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4172:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:4173:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:4173:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:4174:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,58,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4188:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:4188:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:4189:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:4195:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4201:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:4202:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:4202:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:4203:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,58,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4217:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:4217:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:4218:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:4224:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4230:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:4231:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:4231:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:4232:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,58,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4246:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:4246:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:4247:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:4253:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4259:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:4260:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:4260:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:4261:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,58,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4275:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:4275:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:4276:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:4282:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4288:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:4289:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:4289:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:4290:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,47,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4304:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:4304:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:4305:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:4311:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4317:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:4318:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:4318:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:4319:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,48,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEndToEndFlowKeywords"
    // InternalAadlV3.g:4333:1: entryRuleEndToEndFlowKeywords returns [String current=null] : iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF ;
    public final String entryRuleEndToEndFlowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFlowKeywords = null;


        try {
            // InternalAadlV3.g:4333:60: (iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF )
            // InternalAadlV3.g:4334:2: iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndToEndFlowKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEndToEndFlowKeywords=ruleEndToEndFlowKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEndToEndFlowKeywords.getText(); 
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
    // $ANTLR end "entryRuleEndToEndFlowKeywords"


    // $ANTLR start "ruleEndToEndFlowKeywords"
    // InternalAadlV3.g:4340:1: ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFlowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4346:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:4347:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:4347:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:4348:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,12,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,60,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,12,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getFlowKeyword_3());
              		
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
    // $ANTLR end "ruleEndToEndFlowKeywords"


    // $ANTLR start "entryRuleFlowSourceKeywords"
    // InternalAadlV3.g:4372:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:4372:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:4373:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:4379:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4385:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:4386:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:4386:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:4387:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,30,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4401:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:4401:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:4402:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:4408:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4414:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:4415:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:4415:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:4416:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,30,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFlowPathKeywords"
    // InternalAadlV3.g:4430:1: entryRuleFlowPathKeywords returns [String current=null] : iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF ;
    public final String entryRuleFlowPathKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathKeywords = null;


        try {
            // InternalAadlV3.g:4430:56: (iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF )
            // InternalAadlV3.g:4431:2: iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowPathKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowPathKeywords=ruleFlowPathKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowPathKeywords.getText(); 
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
    // $ANTLR end "entryRuleFlowPathKeywords"


    // $ANTLR start "ruleFlowPathKeywords"
    // InternalAadlV3.g:4437:1: ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'path' ) ;
    public final AntlrDatatypeRuleToken ruleFlowPathKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4443:2: ( (kw= 'flow' kw= 'path' ) )
            // InternalAadlV3.g:4444:2: (kw= 'flow' kw= 'path' )
            {
            // InternalAadlV3.g:4444:2: (kw= 'flow' kw= 'path' )
            // InternalAadlV3.g:4445:3: kw= 'flow' kw= 'path'
            {
            kw=(Token)match(input,30,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getPathKeyword_1());
              		
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
    // $ANTLR end "ruleFlowPathKeywords"


    // $ANTLR start "entryRuleInOutKeywords"
    // InternalAadlV3.g:4459:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:4459:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:4460:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:4466:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4472:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:4473:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:4473:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:4474:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,53,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4488:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:4488:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:4489:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:4495:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4501:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:4502:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:4502:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:4503:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,40,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProvidesReadKeywords"
    // InternalAadlV3.g:4517:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:4517:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:4518:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:4524:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4530:2: ( (kw= 'provides' kw= 'read' ) )
            // InternalAadlV3.g:4531:2: (kw= 'provides' kw= 'read' )
            {
            // InternalAadlV3.g:4531:2: (kw= 'provides' kw= 'read' )
            // InternalAadlV3.g:4532:3: kw= 'provides' kw= 'read'
            {
            kw=(Token)match(input,56,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getReadKeyword_1());
              		
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
    // InternalAadlV3.g:4546:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:4546:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:4547:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:4553:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4559:2: ( (kw= 'requires' kw= 'read' ) )
            // InternalAadlV3.g:4560:2: (kw= 'requires' kw= 'read' )
            {
            // InternalAadlV3.g:4560:2: (kw= 'requires' kw= 'read' )
            // InternalAadlV3.g:4561:3: kw= 'requires' kw= 'read'
            {
            kw=(Token)match(input,55,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getReadKeyword_1());
              		
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
    // InternalAadlV3.g:4575:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:4575:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:4576:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:4582:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4588:2: ( (kw= 'provides' kw= 'write' ) )
            // InternalAadlV3.g:4589:2: (kw= 'provides' kw= 'write' )
            {
            // InternalAadlV3.g:4589:2: (kw= 'provides' kw= 'write' )
            // InternalAadlV3.g:4590:3: kw= 'provides' kw= 'write'
            {
            kw=(Token)match(input,56,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getWriteKeyword_1());
              		
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
    // InternalAadlV3.g:4604:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:4604:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:4605:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:4611:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4617:2: ( (kw= 'requires' kw= 'write' ) )
            // InternalAadlV3.g:4618:2: (kw= 'requires' kw= 'write' )
            {
            // InternalAadlV3.g:4618:2: (kw= 'requires' kw= 'write' )
            // InternalAadlV3.g:4619:3: kw= 'requires' kw= 'write'
            {
            kw=(Token)match(input,55,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getWriteKeyword_1());
              		
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
    // InternalAadlV3.g:4633:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:4633:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:4634:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:4640:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4646:2: ( (kw= 'provides' kw= 'readwrite' ) )
            // InternalAadlV3.g:4647:2: (kw= 'provides' kw= 'readwrite' )
            {
            // InternalAadlV3.g:4647:2: (kw= 'provides' kw= 'readwrite' )
            // InternalAadlV3.g:4648:3: kw= 'provides' kw= 'readwrite'
            {
            kw=(Token)match(input,56,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getReadwriteKeyword_1());
              		
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
    // InternalAadlV3.g:4662:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:4662:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:4663:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:4669:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4675:2: ( (kw= 'requires' kw= 'readwrite' ) )
            // InternalAadlV3.g:4676:2: (kw= 'requires' kw= 'readwrite' )
            {
            // InternalAadlV3.g:4676:2: (kw= 'requires' kw= 'readwrite' )
            // InternalAadlV3.g:4677:3: kw= 'requires' kw= 'readwrite'
            {
            kw=(Token)match(input,55,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getReadwriteKeyword_1());
              		
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

    // $ANTLR start synpred1_InternalAadlV3
    public final void synpred1_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2113:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2113:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2113:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2114:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2114:5: ()
        // InternalAadlV3.g:2115:5: 
        {
        }

        match(input,27,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2117:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2118:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2118:6: ( RULE_ID )
        // InternalAadlV3.g:2119:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalAadlV3

    // $ANTLR start synpred2_InternalAadlV3
    public final void synpred2_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2530:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2530:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2530:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2531:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2531:5: ()
        // InternalAadlV3.g:2532:5: 
        {
        }

        match(input,27,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2534:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2535:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2535:6: ( RULE_ID )
        // InternalAadlV3.g:2536:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalAadlV3

    // $ANTLR start synpred3_InternalAadlV3
    public final void synpred3_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2602:5: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2602:6: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2602:6: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2603:6: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2603:6: ()
        // InternalAadlV3.g:2604:6: 
        {
        }

        match(input,27,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2606:6: ( ( RULE_ID ) )
        // InternalAadlV3.g:2607:7: ( RULE_ID )
        {
        // InternalAadlV3.g:2607:7: ( RULE_ID )
        // InternalAadlV3.g:2608:8: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalAadlV3

    // Delegated rules

    public final boolean synpred1_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\13\2\uffff\1\22\3\uffff\11\4\1\50\1\4\3\uffff\6\4";
    static final String dfa_3s = "\1\44\2\uffff\1\72\3\uffff\10\22\1\73\1\55\1\73\3\uffff\6\22";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\6\1\7\1\10\13\uffff\1\3\1\5\1\4\6\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\4\1\5\1\uffff\1\2\1\3\22\uffff\1\6",
            "",
            "",
            "\1\22\3\uffff\1\23\20\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\11\uffff\1\20",
            "",
            "",
            "",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22\50\uffff\1\25",
            "\1\30\1\uffff\1\31\1\27\1\uffff\1\26",
            "\1\24\15\uffff\1\22\50\uffff\1\32",
            "",
            "",
            "",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22",
            "\1\24\15\uffff\1\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\27\1\uffff\1\22\1\75\4\uffff";
    static final String dfa_9s = "\1\37\1\uffff\1\37\1\uffff\1\70\1\77\4\uffff";
    static final String dfa_10s = "\1\uffff\1\6\1\uffff\1\5\2\uffff\1\1\1\4\1\3\1\2";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1\7\uffff\1\1\12\uffff\1\3",
            "",
            "\1\4\3\uffff\1\3\3\uffff\1\3",
            "",
            "\1\6\5\uffff\1\6\5\uffff\1\5\11\uffff\1\6\10\uffff\10\6",
            "\1\10\1\7\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 681:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\4\1\uffff\1\27\1\uffff\1\14\2\4\2\uffff\2\4\2\uffff\1\33\2\uffff\1\32\1\4\1\32";
    static final String dfa_15s = "\1\37\1\uffff\1\37\1\uffff\1\72\1\4\1\40\2\uffff\2\46\2\uffff\1\37\2\uffff\1\46\1\4\1\46";
    static final String dfa_16s = "\1\uffff\1\10\1\uffff\1\7\3\uffff\1\2\1\1\2\uffff\1\4\1\3\1\uffff\1\6\1\5\3\uffff";
    static final String dfa_17s = "\23\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\7\uffff\1\1\22\uffff\1\3",
            "",
            "\1\4\3\uffff\1\5\1\uffff\1\6\1\uffff\1\3",
            "",
            "\1\13\5\uffff\1\10\24\uffff\1\14\1\11\1\12\7\14\2\10\1\uffff\1\10\4\uffff\1\7\1\14",
            "\1\15",
            "\1\16\31\uffff\1\17\1\uffff\1\16",
            "",
            "",
            "\1\20\33\uffff\1\14\5\uffff\1\14",
            "\1\20\33\uffff\1\14\5\uffff\1\14",
            "",
            "",
            "\1\5\1\uffff\1\6\1\uffff\1\3",
            "",
            "",
            "\1\10\1\21\4\uffff\1\14\1\uffff\1\14\3\uffff\1\14",
            "\1\22",
            "\1\10\1\21\4\uffff\1\14\1\uffff\1\14\3\uffff\1\14"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 913:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_19s = "\7\uffff";
    static final String dfa_20s = "\1\4\1\uffff\1\33\1\uffff\1\4\1\uffff\1\33";
    static final String dfa_21s = "\1\37\1\uffff\1\37\1\uffff\1\4\1\uffff\1\37";
    static final String dfa_22s = "\1\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_23s = "\7\uffff}>";
    static final String[] dfa_24s = {
            "\1\2\7\uffff\1\1\22\uffff\1\3",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\3"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 2678:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+";
        }
    }
    static final String dfa_25s = "\1\41\1\uffff\1\37\1\uffff\1\4\1\uffff\1\37";
    static final String[] dfa_26s = {
            "\1\2\32\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\3"
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_25;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 2736:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )*";
        }
    }
    static final String dfa_27s = "\25\uffff";
    static final String dfa_28s = "\1\4\1\uffff\1\27\1\uffff\1\22\1\uffff\6\4\2\uffff\2\32\1\4\1\uffff\1\4\2\32";
    static final String dfa_29s = "\1\41\1\uffff\1\37\1\uffff\1\72\1\uffff\2\46\1\63\3\46\2\uffff\2\46\1\4\1\uffff\1\4\2\46";
    static final String dfa_30s = "\1\uffff\1\6\1\uffff\1\5\1\uffff\1\1\6\uffff\1\3\1\4\3\uffff\1\2\3\uffff";
    static final String dfa_31s = "\25\uffff}>";
    static final String[] dfa_32s = {
            "\1\2\32\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\3\uffff\1\3\3\uffff\1\3",
            "",
            "\1\12\5\uffff\1\5\16\uffff\1\15\1\10\1\13\7\15\1\6\1\7\1\5\1\11\4\5\1\14\1\15",
            "",
            "\1\16\24\uffff\1\5\6\uffff\1\5\5\uffff\1\5",
            "\1\16\24\uffff\1\5\6\uffff\1\5\5\uffff\1\5",
            "\1\17\33\uffff\1\15\5\uffff\1\15\14\uffff\1\5",
            "\1\16\24\uffff\1\5\6\uffff\1\5\5\uffff\1\5",
            "\1\16\24\uffff\1\5\6\uffff\1\5\5\uffff\1\5",
            "\1\17\33\uffff\1\15\5\uffff\1\15",
            "",
            "",
            "\1\21\1\20\4\uffff\1\5\5\uffff\1\5",
            "\1\21\1\22\4\uffff\1\15\1\uffff\1\15\3\uffff\1\15",
            "\1\23",
            "",
            "\1\24",
            "\1\21\1\20\4\uffff\1\5\5\uffff\1\5",
            "\1\21\1\22\4\uffff\1\15\1\uffff\1\15\3\uffff\1\15"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 3102:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_33s = "\24\uffff";
    static final String dfa_34s = "\11\uffff\1\14\1\uffff\1\23\10\uffff";
    static final String dfa_35s = "\1\47\10\uffff\1\4\1\50\1\4\10\uffff";
    static final String dfa_36s = "\1\72\10\uffff\1\73\1\55\1\73\10\uffff";
    static final String dfa_37s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\11\1\20\1\15\1\13\1\14\1\12\1\17\1\16";
    static final String dfa_38s = "\24\uffff}>";
    static final String[] dfa_39s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\11\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\15\uffff\1\14\15\uffff\1\14\5\uffff\1\14\24\uffff\1\15",
            "\1\21\1\uffff\1\16\1\20\1\uffff\1\17",
            "\1\23\15\uffff\1\23\15\uffff\1\23\5\uffff\1\23\24\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "3694:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_40s = "\17\uffff";
    static final String dfa_41s = "\1\uffff\1\6\1\uffff\1\10\1\14\12\uffff";
    static final String dfa_42s = "\1\65\1\22\1\uffff\2\22\12\uffff";
    static final String dfa_43s = "\1\70\1\66\1\uffff\2\102\12\uffff";
    static final String dfa_44s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\7\1\4\1\13\1\11\1\6\1\5\1\12\1\10";
    static final String dfa_45s = "\17\uffff}>";
    static final String[] dfa_46s = {
            "\1\1\1\2\1\3\1\4",
            "\1\6\5\uffff\1\6\17\uffff\1\6\10\uffff\4\6\1\uffff\1\5",
            "",
            "\1\10\5\uffff\1\10\17\uffff\1\10\10\uffff\4\10\13\uffff\1\7\1\12\1\11",
            "\1\14\5\uffff\1\14\17\uffff\1\14\10\uffff\4\14\13\uffff\1\13\1\16\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_40;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "3897:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001010037800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000037800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0401FF8000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000381000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002301010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000301000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0401FF8000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000281000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000201010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x01FE010001040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004102000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0016030000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004104000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000280000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}