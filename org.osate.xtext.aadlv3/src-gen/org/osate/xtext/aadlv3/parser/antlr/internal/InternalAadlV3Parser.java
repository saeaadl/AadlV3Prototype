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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'property'", "':'", "'properties'", "'is'", "','", "'type'", "'private'", "'interface'", "'extends'", "'use'", "'configuration'", "'sampled'", "'reverse'", "'->'", "'=>'", "'.'", "'import'", "'as'", "'flow'", "'#'", "'{'", "'}'", "'('", "')'", "'workingset'", "'::*'", "'::'", "';'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'access'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'connection'", "'mapping'", "'virtual'", "'group'", "'to'", "'source'", "'sink'", "'path'", "'read'", "'write'", "'readwrite'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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
    // InternalAadlV3.g:83:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:89:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:91:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON
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

                if ( (LA1_0==29) ) {
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

            // InternalAadlV3.g:133:3: ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==13||LA3_0==15||(LA3_0>=18 && LA3_0<=20)||LA3_0==23||LA3_0==37||(LA3_0>=41 && LA3_0<=50)||LA3_0==61) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    {
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
            	    {
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
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
            	            // InternalAadlV3.g:152:6: lv_elements_3_2= ruleDataType
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsDataTypeParserRuleCall_3_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_2=ruleDataType();

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
            	              							"org.osate.xtext.aadlv3.AadlV3.DataType");
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
    // InternalAadlV3.g:288:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) ruleSEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:294:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) ruleSEMICOLON )
            // InternalAadlV3.g:296:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) ruleSEMICOLON
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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:322:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:323:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:323:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:324:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertyAccess().getSEMICOLONParserRuleCall_4());
              		
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
    // InternalAadlV3.g:349:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:349:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:350:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:356:1: rulePropertySet returns [EObject current=null] : (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( ruleQualifiedReference ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= 'end' ruleSEMICOLON ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAadlV3.g:362:2: ( (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( ruleQualifiedReference ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:363:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( ruleQualifiedReference ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:363:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( ruleQualifiedReference ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:364:3: otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( ruleQualifiedReference ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= 'end' ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertySetAccess().getPropertiesKeyword_0());
              		
            }
            // InternalAadlV3.g:368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:369:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:370:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertySetAccess().getIsKeyword_2());
              		
            }
            // InternalAadlV3.g:390:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:391:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:391:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:392:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:406:3: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAadlV3.g:407:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:411:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:412:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:412:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:413:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_4_1_0());
            	      					
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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getEndKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_6());
              		
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


    // $ANTLR start "entryRuleDataType"
    // InternalAadlV3.g:443:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAadlV3.g:443:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAadlV3.g:444:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalAadlV3.g:450:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_PropertiesBlock_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:456:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:457:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:457:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:458:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalAadlV3.g:462:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:463:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:463:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:464:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:480:3: (this_PropertiesBlock_2= rulePropertiesBlock[$current] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAadlV3.g:481:4: this_PropertiesBlock_2= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDataTypeRule());
                      				}
                      				newCompositeNode(grammarAccess.getDataTypeAccess().getPropertiesBlockParserRuleCall_2());
                      			
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

              			newCompositeNode(grammarAccess.getDataTypeAccess().getSEMICOLONParserRuleCall_3());
              		
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleComponentInterface"
    // InternalAadlV3.g:504:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:504:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:505:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:511:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:517:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:518:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:518:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:519:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? (this_InterfaceBody_6= ruleInterfaceBody[$current] )? (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )? otherlv_13= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:519:3: ( (lv_private_0_0= 'private' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAadlV3.g:520:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:520:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:521:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
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

            // InternalAadlV3.g:533:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=41 && LA7_0<=50)||LA7_0==61) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAadlV3.g:534:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:534:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:535:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:556:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:557:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:557:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:558:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            // InternalAadlV3.g:574:3: (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:575:4: otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:579:4: (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==25) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAadlV3.g:580:5: this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_15);
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

            // InternalAadlV3.g:593:3: (this_InterfaceBody_6= ruleInterfaceBody[$current] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAadlV3.g:594:4: this_InterfaceBody_6= ruleInterfaceBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalAadlV3.g:606:3: (otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:607:4: otherlv_7= 'use' otherlv_8= 'properties' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* ruleSEMICOLON
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getUseKeyword_6_0());
                      			
                    }
                    otherlv_8=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_6_1());
                      			
                    }
                    // InternalAadlV3.g:615:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:616:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:616:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:617:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:631:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAadlV3.g:632:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:636:5: ( ( ruleQualifiedName ) )
                    	    // InternalAadlV3.g:637:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalAadlV3.g:637:6: ( ruleQualifiedName )
                    	    // InternalAadlV3.g:638:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getComponentInterfaceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
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

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_6_4());
                      			
                    }
                    pushFollow(FOLLOW_19);
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
    // InternalAadlV3.g:677:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* ) ;
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
            // InternalAadlV3.g:683:2: ( (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* ) )
            // InternalAadlV3.g:684:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* )
            {
            // InternalAadlV3.g:684:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* )
            // InternalAadlV3.g:685:3: otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:689:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            loop13:
            do {
                int alt13=6;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalAadlV3.g:690:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:690:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:691:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:691:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:692:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:710:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    {
            	    // InternalAadlV3.g:710:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    // InternalAadlV3.g:711:5: (lv_flows_2_0= ruleFlowPath )
            	    {
            	    // InternalAadlV3.g:711:5: (lv_flows_2_0= ruleFlowPath )
            	    // InternalAadlV3.g:712:6: lv_flows_2_0= ruleFlowPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:730:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    {
            	    // InternalAadlV3.g:730:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    // InternalAadlV3.g:731:5: (lv_flows_3_0= ruleFlowSource )
            	    {
            	    // InternalAadlV3.g:731:5: (lv_flows_3_0= ruleFlowSource )
            	    // InternalAadlV3.g:732:6: lv_flows_3_0= ruleFlowSource
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:750:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    {
            	    // InternalAadlV3.g:750:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    // InternalAadlV3.g:751:5: (lv_flows_4_0= ruleFlowSink )
            	    {
            	    // InternalAadlV3.g:751:5: (lv_flows_4_0= ruleFlowSink )
            	    // InternalAadlV3.g:752:6: lv_flows_4_0= ruleFlowSink
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:770:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:770:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:771:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:771:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:772:6: lv_propertyAssociations_5_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop13;
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
    // InternalAadlV3.g:794:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:794:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:795:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:801:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:807:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:808:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:808:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:809:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? (this_ImplementationBody_5= ruleImplementationBody[$current] )? otherlv_6= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:809:3: ( (lv_private_0_0= 'private' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAadlV3.g:810:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:810:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:811:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
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

            // InternalAadlV3.g:823:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:824:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:824:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:825:5: lv_category_1_0= ruleComponentCategory
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

            // InternalAadlV3.g:842:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:843:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:843:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:844:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalAadlV3.g:861:3: (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAadlV3.g:862:4: otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:866:4: (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAadlV3.g:867:5: this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentImplementationRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_24);
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

            // InternalAadlV3.g:880:3: (this_ImplementationBody_5= ruleImplementationBody[$current] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:881:4: this_ImplementationBody_5= ruleImplementationBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_19);
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
    // InternalAadlV3.g:909:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* ) ;
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
            // InternalAadlV3.g:915:2: ( (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* ) )
            // InternalAadlV3.g:916:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* )
            {
            // InternalAadlV3.g:916:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )* )
            // InternalAadlV3.g:917:3: otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:921:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*
            loop18:
            do {
                int alt18=8;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalAadlV3.g:922:4: ( (lv_connections_1_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:922:4: ( (lv_connections_1_0= ruleConnection ) )
            	    // InternalAadlV3.g:923:5: (lv_connections_1_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:923:5: (lv_connections_1_0= ruleConnection )
            	    // InternalAadlV3.g:924:6: lv_connections_1_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:942:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:942:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:943:5: (lv_connections_2_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:943:5: (lv_connections_2_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:944:6: lv_connections_2_0= ruleFeatureMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:962:4: ( (lv_components_3_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:962:4: ( (lv_components_3_0= ruleComponent ) )
            	    // InternalAadlV3.g:963:5: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:963:5: (lv_components_3_0= ruleComponent )
            	    // InternalAadlV3.g:964:6: lv_components_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:982:4: ( (lv_paths_4_0= rulePath ) )
            	    {
            	    // InternalAadlV3.g:982:4: ( (lv_paths_4_0= rulePath ) )
            	    // InternalAadlV3.g:983:5: (lv_paths_4_0= rulePath )
            	    {
            	    // InternalAadlV3.g:983:5: (lv_paths_4_0= rulePath )
            	    // InternalAadlV3.g:984:6: lv_paths_4_0= rulePath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:1002:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    {
            	    // InternalAadlV3.g:1002:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    // InternalAadlV3.g:1003:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    {
            	    // InternalAadlV3.g:1003:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    // InternalAadlV3.g:1004:6: lv_flowAssignments_5_0= ruleFlowAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:1022:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:1022:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:1023:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:1023:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:1024:6: lv_assignments_6_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:1042:4: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:1042:4: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:1043:5: (lv_propertyAssociations_7_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:1043:5: (lv_propertyAssociations_7_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:1044:6: lv_propertyAssociations_7_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop18;
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
    // InternalAadlV3.g:1066:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1066:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1067:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1073:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1079:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:1080:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:1080:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:1081:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )? otherlv_7= 'end' ruleSEMICOLON
            {
            // InternalAadlV3.g:1081:3: ( (lv_private_0_0= 'private' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:1082:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1082:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1083:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,19,FOLLOW_25); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1099:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1100:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1100:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1101:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            // InternalAadlV3.g:1118:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAadlV3.g:1119:4: this_Parameters_3= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_27);
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

            otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_24);
            this_ConfigurationExtensions_5=ruleConfigurationExtensions(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationExtensions_5;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:1146:3: (this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAadlV3.g:1147:4: this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_19);
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
    // InternalAadlV3.g:1174:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1174:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1175:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1181:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1187:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1189:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1189:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1190:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1190:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1191:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1211:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=55 && LA22_0<=58)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1212:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1212:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1213:5: lv_direction_2_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
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

            // InternalAadlV3.g:1230:3: ( (lv_sampled_3_0= 'sampled' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1231:4: (lv_sampled_3_0= 'sampled' )
                    {
                    // InternalAadlV3.g:1231:4: (lv_sampled_3_0= 'sampled' )
                    // InternalAadlV3.g:1232:5: lv_sampled_3_0= 'sampled'
                    {
                    lv_sampled_3_0=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
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

            // InternalAadlV3.g:1244:3: ( (lv_category_4_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1245:4: (lv_category_4_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1245:4: (lv_category_4_0= ruleFeatureCategory )
            // InternalAadlV3.g:1246:5: lv_category_4_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:1263:3: ( (lv_reverse_5_0= 'reverse' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1264:4: (lv_reverse_5_0= 'reverse' )
                    {
                    // InternalAadlV3.g:1264:4: (lv_reverse_5_0= 'reverse' )
                    // InternalAadlV3.g:1265:5: lv_reverse_5_0= 'reverse'
                    {
                    lv_reverse_5_0=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
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

            // InternalAadlV3.g:1277:3: ( ( ruleQualifiedName ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1278:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:1278:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:1279:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFeatureRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1293:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1294:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1317:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1317:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1318:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAadlV3.g:1324:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReference_3_0 = null;

        EObject this_NestedComponentImplementationBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1330:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1331:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1331:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1332:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1332:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1333:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1333:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1334:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1354:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1355:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1355:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1356:5: lv_category_2_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            // InternalAadlV3.g:1373:3: ( (lv_typeReference_3_0= ruleTypeReference ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1374:4: (lv_typeReference_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1374:4: (lv_typeReference_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1375:5: lv_typeReference_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1392:3: (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1393:4: this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current]
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
    // InternalAadlV3.g:1416:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1416:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1417:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1423:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1429:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1430:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1430:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1431:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1431:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1432:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1432:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1433:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1453:3: ( (lv_associationType_2_0= ruleConnectionType ) )
            // InternalAadlV3.g:1454:4: (lv_associationType_2_0= ruleConnectionType )
            {
            // InternalAadlV3.g:1454:4: (lv_associationType_2_0= ruleConnectionType )
            // InternalAadlV3.g:1455:5: lv_associationType_2_0= ruleConnectionType
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

            // InternalAadlV3.g:1472:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1473:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1473:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1474:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_32);
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
            // InternalAadlV3.g:1495:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1496:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1496:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1497:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1514:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1515:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1538:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // InternalAadlV3.g:1538:55: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // InternalAadlV3.g:1539:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
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
    // InternalAadlV3.g:1545:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1551:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1552:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1552:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1553:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1553:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1554:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1554:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1555:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureMappingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1575:3: ( (lv_associationType_2_0= ruleMappingType ) )
            // InternalAadlV3.g:1576:4: (lv_associationType_2_0= ruleMappingType )
            {
            // InternalAadlV3.g:1576:4: (lv_associationType_2_0= ruleMappingType )
            // InternalAadlV3.g:1577:5: lv_associationType_2_0= ruleMappingType
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

            // InternalAadlV3.g:1594:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1595:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1595:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1596:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureMappingAccess().getEqualsSignGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1617:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1618:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1618:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1619:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1636:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1637:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1660:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1660:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1661:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1667:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1673:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1674:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1674:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1675:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1675:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1676:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1676:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1677:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1697:3: ( (lv_associationType_2_0= ruleFlowPathType ) )
            // InternalAadlV3.g:1698:4: (lv_associationType_2_0= ruleFlowPathType )
            {
            // InternalAadlV3.g:1698:4: (lv_associationType_2_0= ruleFlowPathType )
            // InternalAadlV3.g:1699:5: lv_associationType_2_0= ruleFlowPathType
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

            // InternalAadlV3.g:1716:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1717:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1717:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1718:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_32);
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
            // InternalAadlV3.g:1739:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1740:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1740:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1741:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1758:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1759:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1782:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:1782:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:1783:2: iv_ruleFlowSource= ruleFlowSource EOF
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
    // InternalAadlV3.g:1789:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1795:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1797:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1797:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1798:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1798:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1799:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1819:3: ( (lv_associationType_2_0= ruleFlowSourceType ) )
            // InternalAadlV3.g:1820:4: (lv_associationType_2_0= ruleFlowSourceType )
            {
            // InternalAadlV3.g:1820:4: (lv_associationType_2_0= ruleFlowSourceType )
            // InternalAadlV3.g:1821:5: lv_associationType_2_0= ruleFlowSourceType
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

            // InternalAadlV3.g:1838:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1839:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1839:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1840:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1857:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAadlV3.g:1858:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1881:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:1881:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:1882:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:1888:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1894:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1896:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1896:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1897:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1897:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1898:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1918:3: ( (lv_associationType_2_0= ruleFlowSinkType ) )
            // InternalAadlV3.g:1919:4: (lv_associationType_2_0= ruleFlowSinkType )
            {
            // InternalAadlV3.g:1919:4: (lv_associationType_2_0= ruleFlowSinkType )
            // InternalAadlV3.g:1920:5: lv_associationType_2_0= ruleFlowSinkType
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

            // InternalAadlV3.g:1937:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1938:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1938:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1939:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAadlV3.g:1956:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1957:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1980:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:1980:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:1981:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:1987:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1993:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1994:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1994:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1995:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1995:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1996:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1996:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1997:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_19); if (state.failed) return current;
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
            // InternalAadlV3.g:2024:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2025:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2025:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2026:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:2043:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAadlV3.g:2044:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2048:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2049:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2049:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2050:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // InternalAadlV3.g:2068:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:2069:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2092:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2092:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2093:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2099:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2105:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2106:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2106:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2107:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2107:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2108:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2108:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2109:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2120:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==28) && (synpred1_InternalAadlV3())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAadlV3.g:2121:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2132:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2133:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2133:5: ()
            	    // InternalAadlV3.g:2134:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2144:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2145:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2145:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2146:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAadlV3.g:2163:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2163:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2164:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2170:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2176:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2177:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2177:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2178:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2182:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:2183:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:2183:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:2184:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:2184:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:2185:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
                      					
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


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2203:4: ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
                    {
                    // InternalAadlV3.g:2203:4: ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
                    // InternalAadlV3.g:2204:5: ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
                    {
                    // InternalAadlV3.g:2204:5: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:2205:6: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2205:6: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:2206:7: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalAadlV3.g:2223:5: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==30) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAadlV3.g:2224:6: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_1_1_1_0());
                              					
                            }
                            // InternalAadlV3.g:2228:6: ( (lv_alias_4_0= RULE_ID ) )
                            // InternalAadlV3.g:2229:7: (lv_alias_4_0= RULE_ID )
                            {
                            // InternalAadlV3.g:2229:7: (lv_alias_4_0= RULE_ID )
                            // InternalAadlV3.g:2230:8: lv_alias_4_0= RULE_ID
                            {
                            lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_alias_4_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_1_1_1_1_0());
                              							
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


                    }


                    }
                    break;

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
    // InternalAadlV3.g:2260:1: entryRuleConfigurationAssignment returns [EObject current=null] : iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF ;
    public final EObject entryRuleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignment = null;


        try {
            // InternalAadlV3.g:2260:64: (iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF )
            // InternalAadlV3.g:2261:2: iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF
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
    // InternalAadlV3.g:2267:1: ruleConfigurationAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) ;
    public final EObject ruleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject this_CurlyConfigurationElementBlock_3 = null;

        EObject this_CurlyConfigurationElementBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2273:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2274:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2274:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            // InternalAadlV3.g:2275:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2275:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2276:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2276:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2277:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_1=(Token)match(input,27,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2298:3: ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==33) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:2299:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2299:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2300:5: ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2300:5: ( (lv_value_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2301:6: (lv_value_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2301:6: (lv_value_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2302:7: lv_value_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getValueTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_30);
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

                    // InternalAadlV3.g:2319:5: (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==33) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAadlV3.g:2320:6: this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:2334:4: this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:2357:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2357:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2358:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2364:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:2370:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) )
            // InternalAadlV3.g:2371:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            {
            // InternalAadlV3.g:2371:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            // InternalAadlV3.g:2372:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON
            {
            // InternalAadlV3.g:2372:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2373:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2373:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2374:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_1=(Token)match(input,27,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2399:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2400:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2400:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2401:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalAadlV3.g:2418:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==26) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAadlV3.g:2419:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2423:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2424:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2424:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2425:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop41;
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
    // InternalAadlV3.g:2454:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:2454:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:2455:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:2461:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2467:2: ( ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2468:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2468:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2469:3: ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2469:3: ( (lv_target_0_0= rulePropertyReference ) )
            // InternalAadlV3.g:2470:4: (lv_target_0_0= rulePropertyReference )
            {
            // InternalAadlV3.g:2470:4: (lv_target_0_0= rulePropertyReference )
            // InternalAadlV3.g:2471:5: lv_target_0_0= rulePropertyReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_1=(Token)match(input,27,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2492:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalAadlV3.g:2493:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalAadlV3.g:2493:4: (lv_value_2_0= rulePropertyValue )
            // InternalAadlV3.g:2494:5: lv_value_2_0= rulePropertyValue
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
    // InternalAadlV3.g:2522:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:2522:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:2523:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalAadlV3.g:2529:1: rulePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2535:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAadlV3.g:2536:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAadlV3.g:2536:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:2537:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:2537:3: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:2538:4: lv_value_0_0= RULE_INT
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
    // InternalAadlV3.g:2557:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:2557:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:2558:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:2564:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2570:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2571:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2571:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2572:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2572:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2573:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2573:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2574:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2585:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) && (synpred2_InternalAadlV3())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAadlV3.g:2586:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2597:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2598:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2598:5: ()
            	    // InternalAadlV3.g:2599:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2609:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2610:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2610:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2611:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2628:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalAadlV3.g:2628:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalAadlV3.g:2629:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalAadlV3.g:2635:1: rulePropertyReference returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2641:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2642:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2642:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2643:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2643:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAadlV3.g:2644:4: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    {
                    // InternalAadlV3.g:2644:4: ( (otherlv_0= RULE_ID ) )
                    // InternalAadlV3.g:2645:5: (otherlv_0= RULE_ID )
                    {
                    // InternalAadlV3.g:2645:5: (otherlv_0= RULE_ID )
                    // InternalAadlV3.g:2646:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertyReferenceRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:2657:4: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==28) && (synpred3_InternalAadlV3())) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAadlV3.g:2658:5: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    {
                    	    // InternalAadlV3.g:2669:5: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    // InternalAadlV3.g:2670:6: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    // InternalAadlV3.g:2670:6: ()
                    	    // InternalAadlV3.g:2671:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2681:6: ( (otherlv_3= RULE_ID ) )
                    	    // InternalAadlV3.g:2682:7: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalAadlV3.g:2682:7: (otherlv_3= RULE_ID )
                    	    // InternalAadlV3.g:2683:8: otherlv_3= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getPropertyReferenceRule());
                    	      								}
                    	      							
                    	    }
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(otherlv_3, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0());
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2701:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2702:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2702:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2703:5: ruleQualifiedName
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
    // InternalAadlV3.g:2722:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2728:2: ( (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) )
            // InternalAadlV3.g:2729:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            {
            // InternalAadlV3.g:2729:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            // InternalAadlV3.g:2730:3: otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:2734:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=3;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalAadlV3.g:2735:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:2735:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:2736:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:2736:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:2737:6: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    // InternalAadlV3.g:2755:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:2755:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:2756:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:2756:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:2757:6: lv_assignments_2_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // InternalAadlV3.g:2780:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2786:2: ( (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' ) )
            // InternalAadlV3.g:2787:2: (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' )
            {
            // InternalAadlV3.g:2787:2: (otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}' )
            // InternalAadlV3.g:2788:3: otherlv_0= '{' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:2792:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )*
            loop46:
            do {
                int alt46=3;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // InternalAadlV3.g:2793:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:2793:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:2794:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:2794:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:2795:6: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    // InternalAadlV3.g:2813:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:2813:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:2814:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:2814:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:2815:6: lv_assignments_2_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop46;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2842:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2848:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:2849:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:2849:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:2850:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:2850:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:2851:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:2851:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:2852:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,35,FOLLOW_45); if (state.failed) return current;
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

            // InternalAadlV3.g:2864:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAadlV3.g:2865:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:2865:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:2866:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:2866:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:2867:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalAadlV3.g:2884:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==17) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalAadlV3.g:2885:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:2889:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:2890:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:2890:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:2891:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2918:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:2918:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:2919:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:2925:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2931:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2932:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2932:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2933:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2933:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2934:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2934:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2935:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2955:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2956:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2956:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2957:5: ruleQualifiedName
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
    // InternalAadlV3.g:2975:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:2975:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:2976:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:2982:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2988:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:2989:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:2989:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:2990:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:2990:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAadlV3.g:2991:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:2991:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:2992:5: lv_reverse_0_0= 'reverse'
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

            // InternalAadlV3.g:3004:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3005:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3005:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3006:5: ruleQualifiedReference
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalAadlV3.g:3024:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3024:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3025:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:3031:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3037:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3038:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3038:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3039:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3039:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3040:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3040:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3041:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_47);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3055:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAadlV3.g:3056:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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


    // $ANTLR start "entryRuleRealizationReference"
    // InternalAadlV3.g:3072:1: entryRuleRealizationReference returns [EObject current=null] : iv_ruleRealizationReference= ruleRealizationReference EOF ;
    public final EObject entryRuleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealizationReference = null;


        try {
            // InternalAadlV3.g:3072:61: (iv_ruleRealizationReference= ruleRealizationReference EOF )
            // InternalAadlV3.g:3073:2: iv_ruleRealizationReference= ruleRealizationReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealizationReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealizationReference=ruleRealizationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealizationReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealizationReference"


    // $ANTLR start "ruleRealizationReference"
    // InternalAadlV3.g:3079:1: ruleRealizationReference returns [EObject current=null] : ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3085:2: ( ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3086:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3086:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3087:3: ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3087:3: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3088:4: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3088:4: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3089:5: ruleQualifiedDottedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealizationReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealizationReferenceAccess().getTypeComponentRealizationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_47);
            ruleQualifiedDottedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3103:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAadlV3.g:3104:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getRealizationReferenceRule());
                      				}
                      				newCompositeNode(grammarAccess.getRealizationReferenceAccess().getConfigurationActualsParserRuleCall_1());
                      			
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
    // $ANTLR end "ruleRealizationReference"


    // $ANTLR start "entryRuleImplementationReference"
    // InternalAadlV3.g:3120:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:3120:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:3121:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:3127:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3133:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:3134:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:3134:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3135:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3135:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3136:4: ruleQualifiedDottedReference
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


    // $ANTLR start "rulePropertiesBlock"
    // InternalAadlV3.g:3154:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_propertyAssociations_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3160:2: ( (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' ) )
            // InternalAadlV3.g:3161:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' )
            {
            // InternalAadlV3.g:3161:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}' )
            // InternalAadlV3.g:3162:3: otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3166:3: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||LA52_0==32) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAadlV3.g:3167:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3167:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3168:5: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop52;
                }
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3194:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' ) ;
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
            // InternalAadlV3.g:3200:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' ) )
            // InternalAadlV3.g:3201:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' )
            {
            // InternalAadlV3.g:3201:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}' )
            // InternalAadlV3.g:3202:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3206:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*
            loop53:
            do {
                int alt53=6;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalAadlV3.g:3207:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:3207:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:3208:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:3208:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:3209:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    // InternalAadlV3.g:3227:4: ( (lv_connections_2_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:3227:4: ( (lv_connections_2_0= ruleConnection ) )
            	    // InternalAadlV3.g:3228:5: (lv_connections_2_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:3228:5: (lv_connections_2_0= ruleConnection )
            	    // InternalAadlV3.g:3229:6: lv_connections_2_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsConnectionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    // InternalAadlV3.g:3247:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:3247:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:3248:5: (lv_connections_3_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:3248:5: (lv_connections_3_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:3249:6: lv_connections_3_0= ruleFeatureMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsFeatureMappingParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    // InternalAadlV3.g:3267:4: ( (lv_components_4_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:3267:4: ( (lv_components_4_0= ruleComponent ) )
            	    // InternalAadlV3.g:3268:5: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3268:5: (lv_components_4_0= ruleComponent )
            	    // InternalAadlV3.g:3269:6: lv_components_4_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsComponentParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    // InternalAadlV3.g:3287:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:3287:4: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:3288:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3288:5: (lv_propertyAssociations_5_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3289:6: lv_propertyAssociations_5_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleConfigurationExtensions"
    // InternalAadlV3.g:3316:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3322:2: ( ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) )
            // InternalAadlV3.g:3323:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            {
            // InternalAadlV3.g:3323:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            // InternalAadlV3.g:3324:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            {
            // InternalAadlV3.g:3324:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) )
            // InternalAadlV3.g:3325:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            {
            // InternalAadlV3.g:3325:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            // InternalAadlV3.g:3326:5: lv_superClassifiers_0_0= ruleRealizationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_superClassifiers_0_0=ruleRealizationReference();

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
              						"org.osate.xtext.aadlv3.AadlV3.RealizationReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3343:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==17) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAadlV3.g:3344:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3348:4: ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    // InternalAadlV3.g:3349:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    {
            	    // InternalAadlV3.g:3349:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    // InternalAadlV3.g:3350:6: lv_superClassifiers_2_0= ruleRealizationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_superClassifiers_2_0=ruleRealizationReference();

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
            	      							"org.osate.xtext.aadlv3.AadlV3.RealizationReference");
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3373:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3379:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:3380:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:3380:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:3381:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:3381:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:3382:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:3382:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:3383:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            // InternalAadlV3.g:3400:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==17) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:3401:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3405:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:3406:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:3406:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:3407:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    break loop55;
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
    // InternalAadlV3.g:3430:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3436:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:3437:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:3437:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:3438:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:3438:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:3439:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:3439:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:3440:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            // InternalAadlV3.g:3457:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==17) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAadlV3.g:3458:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3462:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:3463:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:3463:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:3464:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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
    // $ANTLR end "ruleInterfaceExtensions"


    // $ANTLR start "ruleConfigurationActuals"
    // InternalAadlV3.g:3487:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3493:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3494:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3494:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3495:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:3499:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3500:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:3500:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:3501:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:3501:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:3502:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    // InternalAadlV3.g:3519:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==17) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAadlV3.g:3520:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3524:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:3525:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:3525:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:3526:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3553:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:3553:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:3554:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:3560:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3566:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) )
            // InternalAadlV3.g:3567:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            {
            // InternalAadlV3.g:3567:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            // InternalAadlV3.g:3568:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) )
            {
            // InternalAadlV3.g:3568:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:3569:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:3569:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:3570:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3585:3: ( (lv_value_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:3586:4: (lv_value_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:3586:4: (lv_value_2_0= ruleTypeReference )
            // InternalAadlV3.g:3587:5: lv_value_2_0= ruleTypeReference
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
    // InternalAadlV3.g:3608:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:3608:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:3609:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:3615:1: ruleWorkingset returns [EObject current=null] : (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rootComponents_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3621:2: ( (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) )
            // InternalAadlV3.g:3622:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            {
            // InternalAadlV3.g:3622:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            // InternalAadlV3.g:3623:3: otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0());
              		
            }
            // InternalAadlV3.g:3627:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAadlV3.g:3628:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:3628:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAadlV3.g:3629:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,16,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkingsetAccess().getIsKeyword_2());
              		
            }
            // InternalAadlV3.g:3650:3: ( (lv_rootComponents_3_0= ruleComponent ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAadlV3.g:3651:4: (lv_rootComponents_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3651:4: (lv_rootComponents_3_0= ruleComponent )
            	    // InternalAadlV3.g:3652:5: lv_rootComponents_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_50);
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
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkingsetAccess().getEndKeyword_4());
              		
            }
            // InternalAadlV3.g:3673:3: ( ruleSEMICOLON )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAadlV3.g:3674:4: ruleSEMICOLON
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
    // InternalAadlV3.g:3686:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:3686:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:3687:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:3693:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3699:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:3700:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:3700:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:3701:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3720:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:3720:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:3721:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:3727:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3733:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:3734:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:3734:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:3735:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:3758:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:3758:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:3759:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:3765:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3771:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:3772:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:3772:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:3773:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:3780:3: (kw= '::' this_ID_2= RULE_ID )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==39) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAadlV3.g:3781:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalAadlV3.g:3798:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:3798:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:3799:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
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
    // InternalAadlV3.g:3805:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3811:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:3812:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:3812:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:3813:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:3823:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==28) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAadlV3.g:3824:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:3841:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:3841:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:3842:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
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
    // InternalAadlV3.g:3848:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3854:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:3855:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalAadlV3.g:3868:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:3868:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:3869:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
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
    // InternalAadlV3.g:3875:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3881:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:3882:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:3882:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:3883:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSEMICOLON"
    // InternalAadlV3.g:3909:1: entryRuleSEMICOLON returns [String current=null] : iv_ruleSEMICOLON= ruleSEMICOLON EOF ;
    public final String entryRuleSEMICOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMICOLON = null;


        try {
            // InternalAadlV3.g:3909:49: (iv_ruleSEMICOLON= ruleSEMICOLON EOF )
            // InternalAadlV3.g:3910:2: iv_ruleSEMICOLON= ruleSEMICOLON EOF
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
    // InternalAadlV3.g:3916:1: ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMICOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3922:2: (kw= ';' )
            // InternalAadlV3.g:3923:2: kw= ';'
            {
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3931:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:3931:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:3932:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:3938:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:3944:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:3945:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:3945:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt63=16;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalAadlV3.g:3946:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3952:3: kw= 'bus'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3958:3: kw= 'data'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3964:3: kw= 'device'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3970:3: kw= 'memory'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:3976:3: kw= 'process'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:3982:3: kw= 'processor'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:3988:3: kw= 'system'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:3994:3: kw= 'thread'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4000:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:4011:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:4022:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:4033:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:4044:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:4050:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:4061:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:4075:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:4075:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:4076:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:4082:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BusAccessKeywords_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4088:2: ( (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:4089:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:4089:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt64=1;
                }
                break;
            case 52:
                {
                alt64=2;
                }
                break;
            case 53:
                {
                alt64=3;
                }
                break;
            case 42:
                {
                alt64=4;
                }
                break;
            case 54:
                {
                alt64=5;
                }
                break;
            case 20:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:4090:3: kw= 'feature'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4096:3: kw= 'port'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4102:3: kw= 'access'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4108:3: this_BusAccessKeywords_3= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:4119:3: kw= 'binding'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4125:3: kw= 'interface'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4134:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:4134:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:4135:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:4141:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:4147:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:4148:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:4148:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt65=11;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:4149:3: kw= 'in'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4155:3: kw= 'out'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4161:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:4172:3: kw= 'requires'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4178:3: kw= 'provides'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4184:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:4195:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:4206:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:4217:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:4228:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:4239:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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
    // InternalAadlV3.g:4253:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalAadlV3.g:4253:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalAadlV3.g:4254:2: iv_ruleConnectionType= ruleConnectionType EOF
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
    // InternalAadlV3.g:4260:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'connection' | kw= 'binding' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4266:2: ( (kw= 'connection' | kw= 'binding' ) )
            // InternalAadlV3.g:4267:2: (kw= 'connection' | kw= 'binding' )
            {
            // InternalAadlV3.g:4267:2: (kw= 'connection' | kw= 'binding' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            else if ( (LA66_0==54) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAadlV3.g:4268:3: kw= 'connection'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getConnectionKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4274:3: kw= 'binding'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBindingKeyword_1());
                      		
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
    // InternalAadlV3.g:4283:1: entryRuleMappingType returns [String current=null] : iv_ruleMappingType= ruleMappingType EOF ;
    public final String entryRuleMappingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappingType = null;


        try {
            // InternalAadlV3.g:4283:51: (iv_ruleMappingType= ruleMappingType EOF )
            // InternalAadlV3.g:4284:2: iv_ruleMappingType= ruleMappingType EOF
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
    // InternalAadlV3.g:4290:1: ruleMappingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mapping' ;
    public final AntlrDatatypeRuleToken ruleMappingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4296:2: (kw= 'mapping' )
            // InternalAadlV3.g:4297:2: kw= 'mapping'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMappingTypeAccess().getMappingKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:4305:1: entryRuleFlowPathType returns [String current=null] : iv_ruleFlowPathType= ruleFlowPathType EOF ;
    public final String entryRuleFlowPathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathType = null;


        try {
            // InternalAadlV3.g:4305:52: (iv_ruleFlowPathType= ruleFlowPathType EOF )
            // InternalAadlV3.g:4306:2: iv_ruleFlowPathType= ruleFlowPathType EOF
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
    // InternalAadlV3.g:4312:1: ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowPathKeywords_0= ruleFlowPathKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowPathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowPathKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4318:2: (this_FlowPathKeywords_0= ruleFlowPathKeywords )
            // InternalAadlV3.g:4319:2: this_FlowPathKeywords_0= ruleFlowPathKeywords
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
    // InternalAadlV3.g:4332:1: entryRuleFlowSourceType returns [String current=null] : iv_ruleFlowSourceType= ruleFlowSourceType EOF ;
    public final String entryRuleFlowSourceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceType = null;


        try {
            // InternalAadlV3.g:4332:54: (iv_ruleFlowSourceType= ruleFlowSourceType EOF )
            // InternalAadlV3.g:4333:2: iv_ruleFlowSourceType= ruleFlowSourceType EOF
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
    // InternalAadlV3.g:4339:1: ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSourceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4345:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:4346:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
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
    // InternalAadlV3.g:4359:1: entryRuleFlowSinkType returns [String current=null] : iv_ruleFlowSinkType= ruleFlowSinkType EOF ;
    public final String entryRuleFlowSinkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkType = null;


        try {
            // InternalAadlV3.g:4359:52: (iv_ruleFlowSinkType= ruleFlowSinkType EOF )
            // InternalAadlV3.g:4360:2: iv_ruleFlowSinkType= ruleFlowSinkType EOF
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
    // InternalAadlV3.g:4366:1: ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSinkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4372:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:4373:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
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
    // InternalAadlV3.g:4386:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:4386:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:4387:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:4393:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4399:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:4400:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:4400:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:4401:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,61,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4415:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:4415:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:4416:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:4422:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4428:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:4429:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:4429:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:4430:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,61,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4444:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:4444:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:4445:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:4451:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4457:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:4458:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:4458:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:4459:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,61,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4473:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:4473:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:4474:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:4480:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4486:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:4487:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:4487:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:4488:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,61,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4502:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:4502:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:4503:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:4509:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4515:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:4516:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:4516:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:4517:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,49,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4531:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:4531:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:4532:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:4538:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4544:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:4545:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:4545:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:4546:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,50,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4560:1: entryRuleEndToEndFlowKeywords returns [String current=null] : iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF ;
    public final String entryRuleEndToEndFlowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFlowKeywords = null;


        try {
            // InternalAadlV3.g:4560:60: (iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF )
            // InternalAadlV3.g:4561:2: iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF
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
    // InternalAadlV3.g:4567:1: ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFlowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4573:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:4574:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:4574:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:4575:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,12,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,12,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4599:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:4599:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:4600:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:4606:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4612:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:4613:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:4613:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:4614:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,31,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4628:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:4628:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:4629:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:4635:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4641:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:4642:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:4642:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:4643:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,31,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4657:1: entryRuleFlowPathKeywords returns [String current=null] : iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF ;
    public final String entryRuleFlowPathKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathKeywords = null;


        try {
            // InternalAadlV3.g:4657:56: (iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF )
            // InternalAadlV3.g:4658:2: iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF
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
    // InternalAadlV3.g:4664:1: ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'path' ) ;
    public final AntlrDatatypeRuleToken ruleFlowPathKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4670:2: ( (kw= 'flow' kw= 'path' ) )
            // InternalAadlV3.g:4671:2: (kw= 'flow' kw= 'path' )
            {
            // InternalAadlV3.g:4671:2: (kw= 'flow' kw= 'path' )
            // InternalAadlV3.g:4672:3: kw= 'flow' kw= 'path'
            {
            kw=(Token)match(input,31,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4686:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:4686:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:4687:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:4693:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4699:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:4700:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:4700:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:4701:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,55,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4715:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:4715:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:4716:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:4722:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4728:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:4729:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:4729:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:4730:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,42,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4744:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:4744:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:4745:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:4751:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4757:2: ( (kw= 'provides' kw= 'read' ) )
            // InternalAadlV3.g:4758:2: (kw= 'provides' kw= 'read' )
            {
            // InternalAadlV3.g:4758:2: (kw= 'provides' kw= 'read' )
            // InternalAadlV3.g:4759:3: kw= 'provides' kw= 'read'
            {
            kw=(Token)match(input,58,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4773:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:4773:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:4774:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:4780:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4786:2: ( (kw= 'requires' kw= 'read' ) )
            // InternalAadlV3.g:4787:2: (kw= 'requires' kw= 'read' )
            {
            // InternalAadlV3.g:4787:2: (kw= 'requires' kw= 'read' )
            // InternalAadlV3.g:4788:3: kw= 'requires' kw= 'read'
            {
            kw=(Token)match(input,57,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4802:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:4802:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:4803:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:4809:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4815:2: ( (kw= 'provides' kw= 'write' ) )
            // InternalAadlV3.g:4816:2: (kw= 'provides' kw= 'write' )
            {
            // InternalAadlV3.g:4816:2: (kw= 'provides' kw= 'write' )
            // InternalAadlV3.g:4817:3: kw= 'provides' kw= 'write'
            {
            kw=(Token)match(input,58,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4831:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:4831:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:4832:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:4838:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4844:2: ( (kw= 'requires' kw= 'write' ) )
            // InternalAadlV3.g:4845:2: (kw= 'requires' kw= 'write' )
            {
            // InternalAadlV3.g:4845:2: (kw= 'requires' kw= 'write' )
            // InternalAadlV3.g:4846:3: kw= 'requires' kw= 'write'
            {
            kw=(Token)match(input,57,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4860:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:4860:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:4861:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:4867:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4873:2: ( (kw= 'provides' kw= 'readwrite' ) )
            // InternalAadlV3.g:4874:2: (kw= 'provides' kw= 'readwrite' )
            {
            // InternalAadlV3.g:4874:2: (kw= 'provides' kw= 'readwrite' )
            // InternalAadlV3.g:4875:3: kw= 'provides' kw= 'readwrite'
            {
            kw=(Token)match(input,58,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4889:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:4889:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:4890:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:4896:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4902:2: ( (kw= 'requires' kw= 'readwrite' ) )
            // InternalAadlV3.g:4903:2: (kw= 'requires' kw= 'readwrite' )
            {
            // InternalAadlV3.g:4903:2: (kw= 'requires' kw= 'readwrite' )
            // InternalAadlV3.g:4904:3: kw= 'requires' kw= 'readwrite'
            {
            kw=(Token)match(input,57,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
        // InternalAadlV3.g:2121:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2121:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2121:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2122:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2122:5: ()
        // InternalAadlV3.g:2123:5: 
        {
        }

        match(input,28,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2125:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2126:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2126:6: ( RULE_ID )
        // InternalAadlV3.g:2127:7: RULE_ID
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
        // InternalAadlV3.g:2586:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2586:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2586:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2587:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2587:5: ()
        // InternalAadlV3.g:2588:5: 
        {
        }

        match(input,28,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2590:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2591:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2591:6: ( RULE_ID )
        // InternalAadlV3.g:2592:7: RULE_ID
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
        // InternalAadlV3.g:2658:5: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2658:6: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2658:6: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2659:6: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2659:6: ()
        // InternalAadlV3.g:2660:6: 
        {
        }

        match(input,28,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2662:6: ( ( RULE_ID ) )
        // InternalAadlV3.g:2663:7: ( RULE_ID )
        {
        // InternalAadlV3.g:2663:7: ( RULE_ID )
        // InternalAadlV3.g:2664:8: RULE_ID
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\13\2\uffff\1\24\11\4\1\52\1\4\6\uffff\6\4";
    static final String dfa_3s = "\1\75\2\uffff\1\75\10\24\1\76\1\57\1\76\6\uffff\6\24";
    static final String dfa_4s = "\1\uffff\1\1\1\2\14\uffff\1\3\1\5\1\6\1\7\1\10\1\4\6\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\21\1\uffff\1\22\2\uffff\1\2\1\3\1\17\2\uffff\1\20\15\uffff\1\23\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\12\uffff\1\15",
            "",
            "",
            "\1\17\2\uffff\1\20\21\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\12\uffff\1\15",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17\51\uffff\1\25",
            "\1\26\1\uffff\1\27\1\31\1\uffff\1\30",
            "\1\24\17\uffff\1\17\51\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17",
            "\1\24\17\uffff\1\17"
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
            return "135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\16\1\uffff\1\24\1\100\4\uffff";
    static final String dfa_9s = "\1\40\1\uffff\1\40\1\uffff\1\72\1\102\4\uffff";
    static final String dfa_10s = "\1\uffff\1\6\1\uffff\1\5\2\uffff\1\1\1\2\1\4\1\3";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1\11\uffff\1\1\11\uffff\1\3",
            "",
            "\1\4\15\uffff\1\3\3\uffff\1\3",
            "",
            "\1\6\3\uffff\1\6\6\uffff\1\5\12\uffff\1\6\10\uffff\10\6",
            "\1\11\1\10\1\7",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 689:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\1\4\1\uffff\1\16\1\uffff\1\14\2\4\4\uffff\1\33\2\uffff";
    static final String dfa_15s = "\1\40\1\uffff\1\40\1\uffff\1\75\1\4\1\41\4\uffff\1\40\2\uffff";
    static final String dfa_16s = "\1\uffff\1\10\1\uffff\1\7\3\uffff\1\2\1\1\1\4\1\3\1\uffff\1\6\1\5";
    static final String dfa_17s = "\16\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\7\uffff\1\1\23\uffff\1\3",
            "",
            "\1\4\14\uffff\1\6\1\5\3\uffff\1\3",
            "",
            "\1\11\34\uffff\12\12\3\uffff\1\10\4\uffff\1\10\1\7\1\12",
            "\1\13",
            "\1\14\32\uffff\1\15\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "\1\6\1\5\3\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 921:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_19s = "\6\uffff";
    static final String dfa_20s = "\1\4\1\36\1\4\2\uffff\1\36";
    static final String dfa_21s = "\1\4\1\50\1\4\2\uffff\1\50";
    static final String dfa_22s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_23s = "\6\uffff}>";
    static final String[] dfa_24s = {
            "\1\1",
            "\1\3\7\uffff\1\4\1\2\1\3",
            "\1\5",
            "",
            "",
            "\1\3\7\uffff\1\4\1\2\1\3"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2182:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )";
        }
    }
    static final String dfa_25s = "\7\uffff";
    static final String dfa_26s = "\1\4\1\uffff\1\33\1\uffff\1\4\1\uffff\1\33";
    static final String dfa_27s = "\1\40\1\uffff\1\40\1\uffff\1\4\1\uffff\1\40";
    static final String dfa_28s = "\1\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_29s = "\7\uffff}>";
    static final String[] dfa_30s = {
            "\1\2\7\uffff\1\1\23\uffff\1\3",
            "",
            "\1\5\1\4\3\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\5\1\4\3\uffff\1\3"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()+ loopback of 2734:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+";
        }
    }
    static final String dfa_31s = "\1\42\1\uffff\1\40\1\uffff\1\4\1\uffff\1\40";
    static final String[] dfa_32s = {
            "\1\2\33\uffff\1\3\1\uffff\1\1",
            "",
            "\1\5\1\4\3\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\5\1\4\3\uffff\1\3"
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_31;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 2792:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )*";
        }
    }
    static final String dfa_33s = "\14\uffff";
    static final String dfa_34s = "\1\4\1\uffff\1\16\1\uffff\1\24\1\uffff\1\4\1\uffff\1\4\2\uffff\1\32";
    static final String dfa_35s = "\1\42\1\uffff\1\40\1\uffff\1\75\1\uffff\1\65\1\uffff\1\50\2\uffff\1\50";
    static final String dfa_36s = "\1\uffff\1\6\1\uffff\1\5\1\uffff\1\4\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff";
    static final String dfa_37s = "\14\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\33\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\15\uffff\1\3\3\uffff\1\3",
            "",
            "\1\7\3\uffff\1\7\20\uffff\1\5\1\6\10\5\3\7\1\10\4\7\1\11\1\12\1\5",
            "",
            "\1\5\34\uffff\1\5\6\uffff\1\5\14\uffff\1\7",
            "",
            "\1\13\24\uffff\1\7\7\uffff\1\7\6\uffff\1\7",
            "",
            "",
            "\1\11\1\uffff\1\11\4\uffff\1\7\5\uffff\2\7"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "()* loopback of 3206:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )*";
        }
    }
    static final String dfa_39s = "\24\uffff";
    static final String dfa_40s = "\11\uffff\1\15\1\uffff\1\23\10\uffff";
    static final String dfa_41s = "\1\51\10\uffff\1\4\1\52\1\4\10\uffff";
    static final String dfa_42s = "\1\75\10\uffff\1\76\1\57\1\76\10\uffff";
    static final String dfa_43s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\12\1\15\1\13\1\14\1\17\1\16";
    static final String dfa_44s = "\24\uffff}>";
    static final String[] dfa_45s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\12\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\17\uffff\1\15\14\uffff\1\15\6\uffff\1\15\25\uffff\1\14",
            "\1\16\1\uffff\1\17\1\21\1\uffff\1\20",
            "\1\23\17\uffff\1\23\14\uffff\1\23\6\uffff\1\23\25\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "3945:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_46s = "\17\uffff";
    static final String dfa_47s = "\1\uffff\1\6\1\uffff\1\11\1\15\12\uffff";
    static final String dfa_48s = "\1\67\1\24\1\uffff\2\24\12\uffff";
    static final String dfa_49s = "\1\72\1\70\1\uffff\2\105\12\uffff";
    static final String dfa_50s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\13\1\11\1\4\1\7\1\12\1\10\1\5\1\6";
    static final String dfa_51s = "\17\uffff}>";
    static final String[] dfa_52s = {
            "\1\1\1\2\1\3\1\4",
            "\1\6\3\uffff\1\6\21\uffff\1\6\10\uffff\4\6\1\uffff\1\5",
            "",
            "\1\11\3\uffff\1\11\21\uffff\1\11\10\uffff\4\11\14\uffff\1\12\1\10\1\7",
            "\1\15\3\uffff\1\15\21\uffff\1\15\10\uffff\4\15\14\uffff\1\16\1\14\1\13",
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

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "4148:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2007FE20209CB800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2007FE20009CB800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2007FE0000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000611000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002411010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000411000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2007FE0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000211000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x07F8040001100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010202000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010200000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010204000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000500000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}