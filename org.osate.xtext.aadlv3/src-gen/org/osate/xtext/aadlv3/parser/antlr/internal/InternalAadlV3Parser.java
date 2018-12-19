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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'property'", "':'", "'for'", "','", "'properties'", "'{'", "'}'", "'type'", "'private'", "'interface'", "'extends'", "'is'", "'configuration'", "'sampled'", "'reverse'", "'->'", "'=>'", "'use'", "'.'", "'import'", "'as'", "'*=>'", "'flow'", "'#'", "'('", "')'", "'workingset'", "'::*'", "'::'", "';'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'access'", "'in'", "'out'", "'requires'", "'provides'", "'connection'", "'binding'", "'mapping'", "'final'", "'default'", "'override'", "'virtual'", "'group'", "'to'", "'source'", "'sink'", "'path'", "'point'", "'read'", "'write'", "'readwrite'"
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
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
    // InternalAadlV3.g:83:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:89:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:91:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ruleSEMICOLON
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

                if ( (LA1_0==32) ) {
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

            // InternalAadlV3.g:133:3: ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==13||LA3_0==17||(LA3_0>=20 && LA3_0<=22)||LA3_0==25||LA3_0==39||(LA3_0>=43 && LA3_0<=52)||LA3_0==66) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    {
            	    // InternalAadlV3.g:134:4: ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) )
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
            	    {
            	    // InternalAadlV3.g:135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )
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
            	            // InternalAadlV3.g:216:6: lv_elements_3_6= rulePropertyDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPropertyDefinitionParserRuleCall_3_0_5());
            	              					
            	            }
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_6=rulePropertyDefinition();

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
            	              							"org.osate.xtext.aadlv3.AadlV3.PropertyDefinition");
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


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalAadlV3.g:281:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalAadlV3.g:281:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalAadlV3.g:282:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalAadlV3.g:288:1: rulePropertyDefinition returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )? ruleSEMICOLON ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_AppliesTo_5 = null;

        EObject this_AppliesTo_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:294:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )? ruleSEMICOLON ) )
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:295:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )? ruleSEMICOLON )
            // InternalAadlV3.g:296:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedReference ) ) (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0());
              		
            }
            // InternalAadlV3.g:300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:301:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:322:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:323:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:323:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:324:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:338:3: (otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAadlV3.g:339:4: otherlv_4= 'for' this_AppliesTo_5= ruleAppliesTo[$current] (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getForKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                      				}
                      				newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_AppliesTo_5=ruleAppliesTo(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AppliesTo_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:354:4: (otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current] )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAadlV3.g:355:5: otherlv_6= ',' this_AppliesTo_7= ruleAppliesTo[$current]
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_4_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    this_AppliesTo_7=ruleAppliesTo(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_AppliesTo_7;
                    	      					afterParserOrEnumRuleCall();
                    	      				
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getSEMICOLONParserRuleCall_5());
              		
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "ruleAppliesTo"
    // InternalAadlV3.g:384:1: ruleAppliesTo[EObject in_current] returns [EObject current=in_current] : ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) ;
    public final EObject ruleAppliesTo(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_componentCategories_0_0 = null;

        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;

        AntlrDatatypeRuleToken lv_associationTypes_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:390:2: ( ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) )
            // InternalAadlV3.g:391:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            {
            // InternalAadlV3.g:391:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 66:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==55) ) {
                    alt6=2;
                }
                else if ( (LA6_2==16||LA6_2==42) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 53:
            case 54:
            case 55:
                {
                alt6=2;
                }
                break;
            case 61:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==72) ) {
                    alt6=2;
                }
                else if ( (LA6_4==16||LA6_4==42) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 35:
            case 60:
            case 62:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAadlV3.g:392:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    {
                    // InternalAadlV3.g:392:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    // InternalAadlV3.g:393:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:393:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    // InternalAadlV3.g:394:5: lv_componentCategories_0_0= ruleComponentCategory
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
                    // InternalAadlV3.g:412:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    {
                    // InternalAadlV3.g:412:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    // InternalAadlV3.g:413:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    {
                    // InternalAadlV3.g:413:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    // InternalAadlV3.g:414:5: lv_featureCategories_1_0= ruleFeatureCategory
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
                    // InternalAadlV3.g:432:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    {
                    // InternalAadlV3.g:432:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    // InternalAadlV3.g:433:4: (lv_associationTypes_2_0= ruleAssociationType )
                    {
                    // InternalAadlV3.g:433:4: (lv_associationTypes_2_0= ruleAssociationType )
                    // InternalAadlV3.g:434:5: lv_associationTypes_2_0= ruleAssociationType
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
    // InternalAadlV3.g:455:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:455:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:456:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:462:1: rulePropertySet returns [EObject current=null] : (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( ( ruleQualifiedReference ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ruleSEMICOLON ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAadlV3.g:468:2: ( (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( ( ruleQualifiedReference ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ruleSEMICOLON ) )
            // InternalAadlV3.g:469:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( ( ruleQualifiedReference ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ruleSEMICOLON )
            {
            // InternalAadlV3.g:469:2: (otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( ( ruleQualifiedReference ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ruleSEMICOLON )
            // InternalAadlV3.g:470:3: otherlv_0= 'properties' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( ( ruleQualifiedReference ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertySetAccess().getPropertiesKeyword_0());
              		
            }
            // InternalAadlV3.g:474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:475:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:476:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertySetAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalAadlV3.g:500:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:501:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:501:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:502:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:516:3: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAadlV3.g:517:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalAadlV3.g:521:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:522:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:522:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:523:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_7());
              		
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
    // InternalAadlV3.g:553:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAadlV3.g:553:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAadlV3.g:554:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAadlV3.g:560:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_PropertiesBlock_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:566:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:567:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:567:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:568:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (this_PropertiesBlock_2= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalAadlV3.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            // InternalAadlV3.g:590:3: (this_PropertiesBlock_2= rulePropertiesBlock[$current] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAadlV3.g:591:4: this_PropertiesBlock_2= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:614:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:614:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:615:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:621:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ruleSEMICOLON ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        EObject this_InterfaceExtensions_5 = null;

        EObject this_InterfaceBody_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:627:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ruleSEMICOLON ) )
            // InternalAadlV3.g:628:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ruleSEMICOLON )
            {
            // InternalAadlV3.g:628:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ruleSEMICOLON )
            // InternalAadlV3.g:629:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ruleSEMICOLON
            {
            // InternalAadlV3.g:629:3: ( (lv_private_0_0= 'private' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:630:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:630:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:631:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
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

            // InternalAadlV3.g:643:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=43 && LA10_0<=52)||LA10_0==66) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAadlV3.g:644:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:644:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:645:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:666:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:667:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:667:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:668:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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

            // InternalAadlV3.g:684:3: (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:685:4: otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:689:4: (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID||LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAadlV3.g:690:5: this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_16);
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

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentInterfaceRule());
              			}
              			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_6);
            this_InterfaceBody_6=ruleInterfaceBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InterfaceBody_6;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_6());
              		
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
    // InternalAadlV3.g:726:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_InterfaceElement_1 = null;

        EObject this_InterfaceElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:732:2: ( ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:733:2: ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:733:2: ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:734:3: (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:734:3: (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:735:4: otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInterfaceBodyRule());
                      				}
                      				newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_InterfaceElement_1=ruleInterfaceElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:750:4: ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==42) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==RULE_ID||LA13_1==30||LA13_1==36) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAadlV3.g:751:5: ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    ruleSEMICOLON();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getInterfaceBodyRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_0_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_InterfaceElement_3=ruleInterfaceElement(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_InterfaceElement_3;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalAadlV3.g:770:4: ( ruleSEMICOLON )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==42) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAadlV3.g:771:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_20);
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
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInterfaceBodyAccess().getEndKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:789:1: ruleInterfaceElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] ) ;
    public final EObject ruleInterfaceElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_flows_1_0 = null;

        EObject lv_flows_2_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_propertyAssociations_4_0 = null;

        EObject this_UseProps_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:795:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] ) )
            // InternalAadlV3.g:796:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )
            {
            // InternalAadlV3.g:796:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalAadlV3.g:797:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:797:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:798:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:798:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:799:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:817:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    {
                    // InternalAadlV3.g:817:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    // InternalAadlV3.g:818:4: (lv_flows_1_0= ruleFlowPath )
                    {
                    // InternalAadlV3.g:818:4: (lv_flows_1_0= ruleFlowPath )
                    // InternalAadlV3.g:819:5: lv_flows_1_0= ruleFlowPath
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
                    // InternalAadlV3.g:837:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    {
                    // InternalAadlV3.g:837:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    // InternalAadlV3.g:838:4: (lv_flows_2_0= ruleFlowSource )
                    {
                    // InternalAadlV3.g:838:4: (lv_flows_2_0= ruleFlowSource )
                    // InternalAadlV3.g:839:5: lv_flows_2_0= ruleFlowSource
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
                    // InternalAadlV3.g:857:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    {
                    // InternalAadlV3.g:857:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    // InternalAadlV3.g:858:4: (lv_flows_3_0= ruleFlowSink )
                    {
                    // InternalAadlV3.g:858:4: (lv_flows_3_0= ruleFlowSink )
                    // InternalAadlV3.g:859:5: lv_flows_3_0= ruleFlowSink
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
                    // InternalAadlV3.g:877:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:877:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:878:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:878:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:879:5: lv_propertyAssociations_4_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_4_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"propertyAssociations",
                      						lv_propertyAssociations_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:897:3: this_UseProps_5= ruleUseProps[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getInterfaceElementRule());
                      			}
                      			newCompositeNode(grammarAccess.getInterfaceElementAccess().getUsePropsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UseProps_5=ruleUseProps(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UseProps_5;
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
    // $ANTLR end "ruleInterfaceElement"


    // $ANTLR start "entryRuleComponentImplementation"
    // InternalAadlV3.g:912:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:912:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:913:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:919:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ruleSEMICOLON ) ;
    public final EObject ruleComponentImplementation() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ImplementationExtensions_4 = null;

        EObject this_ImplementationBody_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:925:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ruleSEMICOLON ) )
            // InternalAadlV3.g:926:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ruleSEMICOLON )
            {
            // InternalAadlV3.g:926:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ruleSEMICOLON )
            // InternalAadlV3.g:927:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ruleSEMICOLON
            {
            // InternalAadlV3.g:927:3: ( (lv_private_0_0= 'private' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:928:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:928:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:929:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
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

            // InternalAadlV3.g:941:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:942:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:942:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:943:5: lv_category_1_0= ruleComponentCategory
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

            // InternalAadlV3.g:960:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:961:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:961:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:962:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalAadlV3.g:979:3: (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:980:4: otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:984:4: (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAadlV3.g:985:5: this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentImplementationRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_16);
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

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentImplementationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_6);
            this_ImplementationBody_5=ruleImplementationBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImplementationBody_5;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_5());
              		
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
    // InternalAadlV3.g:1021:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ImplementationElement_1 = null;

        EObject this_ImplementationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1027:2: ( ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:1028:2: ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:1028:2: ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:1029:3: (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:1029:3: (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1030:4: otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getImplementationBodyRule());
                      				}
                      				newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_ImplementationElement_1=ruleImplementationElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:1045:4: ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==42) ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1==RULE_ID||LA20_1==36) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAadlV3.g:1046:5: ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getImplementationBodyAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    ruleSEMICOLON();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getImplementationBodyRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_0_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_ImplementationElement_3=ruleImplementationElement(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_ImplementationElement_3;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // InternalAadlV3.g:1065:4: ( ruleSEMICOLON )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAadlV3.g:1066:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getImplementationBodyAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_20);
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
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getImplementationBodyAccess().getEndKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1084:1: ruleImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureMapping ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_connections_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_components_2_0 = null;

        EObject lv_paths_3_0 = null;

        EObject lv_flowAssignments_4_0 = null;

        EObject lv_configurationAssignments_5_0 = null;

        EObject lv_configurationAssignments_6_0 = null;

        EObject lv_propertyAssociations_7_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1090:2: ( ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureMapping ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:1091:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureMapping ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:1091:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureMapping ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )
            int alt23=8;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1092:3: ( (lv_connections_0_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:1092:3: ( (lv_connections_0_0= ruleConnection ) )
                    // InternalAadlV3.g:1093:4: (lv_connections_0_0= ruleConnection )
                    {
                    // InternalAadlV3.g:1093:4: (lv_connections_0_0= ruleConnection )
                    // InternalAadlV3.g:1094:5: lv_connections_0_0= ruleConnection
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
                    // InternalAadlV3.g:1112:3: ( (lv_connections_1_0= ruleFeatureMapping ) )
                    {
                    // InternalAadlV3.g:1112:3: ( (lv_connections_1_0= ruleFeatureMapping ) )
                    // InternalAadlV3.g:1113:4: (lv_connections_1_0= ruleFeatureMapping )
                    {
                    // InternalAadlV3.g:1113:4: (lv_connections_1_0= ruleFeatureMapping )
                    // InternalAadlV3.g:1114:5: lv_connections_1_0= ruleFeatureMapping
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConnectionsFeatureMappingParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_1_0=ruleFeatureMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"connections",
                      						lv_connections_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1132:3: ( (lv_components_2_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:1132:3: ( (lv_components_2_0= ruleComponent ) )
                    // InternalAadlV3.g:1133:4: (lv_components_2_0= ruleComponent )
                    {
                    // InternalAadlV3.g:1133:4: (lv_components_2_0= ruleComponent )
                    // InternalAadlV3.g:1134:5: lv_components_2_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_2_0=ruleComponent();

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
                      						"org.osate.xtext.aadlv3.AadlV3.Component");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:1152:3: ( (lv_paths_3_0= rulePath ) )
                    {
                    // InternalAadlV3.g:1152:3: ( (lv_paths_3_0= rulePath ) )
                    // InternalAadlV3.g:1153:4: (lv_paths_3_0= rulePath )
                    {
                    // InternalAadlV3.g:1153:4: (lv_paths_3_0= rulePath )
                    // InternalAadlV3.g:1154:5: lv_paths_3_0= rulePath
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
                    // InternalAadlV3.g:1172:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    {
                    // InternalAadlV3.g:1172:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    // InternalAadlV3.g:1173:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    {
                    // InternalAadlV3.g:1173:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    // InternalAadlV3.g:1174:5: lv_flowAssignments_4_0= ruleFlowAssignment
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
                    // InternalAadlV3.g:1192:3: ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) )
                    {
                    // InternalAadlV3.g:1192:3: ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) )
                    // InternalAadlV3.g:1193:4: (lv_configurationAssignments_5_0= ruleConfigurationAssignment )
                    {
                    // InternalAadlV3.g:1193:4: (lv_configurationAssignments_5_0= ruleConfigurationAssignment )
                    // InternalAadlV3.g:1194:5: lv_configurationAssignments_5_0= ruleConfigurationAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_5_0=ruleConfigurationAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:1212:3: ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:1212:3: ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) )
                    // InternalAadlV3.g:1213:4: (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern )
                    {
                    // InternalAadlV3.g:1213:4: (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern )
                    // InternalAadlV3.g:1214:5: lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_6_0=ruleConfigurationAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_6_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:1232:3: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1232:3: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1233:4: (lv_propertyAssociations_7_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1233:4: (lv_propertyAssociations_7_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1234:5: lv_propertyAssociations_7_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_7_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1255:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1255:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1256:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1262:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ruleSEMICOLON ) ;
    public final EObject ruleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_Parameters_3 = null;

        EObject this_ConfigurationExtensions_5 = null;

        EObject this_ConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1268:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ruleSEMICOLON ) )
            // InternalAadlV3.g:1269:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ruleSEMICOLON )
            {
            // InternalAadlV3.g:1269:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ruleSEMICOLON )
            // InternalAadlV3.g:1270:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ruleSEMICOLON
            {
            // InternalAadlV3.g:1270:3: ( (lv_private_0_0= 'private' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1271:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1271:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1272:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1288:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1289:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1289:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1290:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalAadlV3.g:1307:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1308:4: this_Parameters_3= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_27);
            this_ConfigurationExtensions_5=ruleConfigurationExtensions(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationExtensions_5;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_6);
            this_ConfigurationElementBlock_6=ruleConfigurationElementBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElementBlock_6;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_7());
              		
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
    // InternalAadlV3.g:1357:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1357:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1358:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1364:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:1370:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1372:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1372:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1373:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1373:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1374:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:1394:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=56 && LA26_0<=59)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1395:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1395:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1396:5: lv_direction_2_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:1413:3: ( (lv_sampled_3_0= 'sampled' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1414:4: (lv_sampled_3_0= 'sampled' )
                    {
                    // InternalAadlV3.g:1414:4: (lv_sampled_3_0= 'sampled' )
                    // InternalAadlV3.g:1415:5: lv_sampled_3_0= 'sampled'
                    {
                    lv_sampled_3_0=(Token)match(input,26,FOLLOW_30); if (state.failed) return current;
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

            // InternalAadlV3.g:1427:3: ( (lv_category_4_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1428:4: (lv_category_4_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1428:4: (lv_category_4_0= ruleFeatureCategory )
            // InternalAadlV3.g:1429:5: lv_category_4_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:1446:3: ( ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1447:4: ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:1447:4: ( (lv_reverse_5_0= 'reverse' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==27) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAadlV3.g:1448:5: (lv_reverse_5_0= 'reverse' )
                            {
                            // InternalAadlV3.g:1448:5: (lv_reverse_5_0= 'reverse' )
                            // InternalAadlV3.g:1449:6: lv_reverse_5_0= 'reverse'
                            {
                            lv_reverse_5_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_reverse_5_0, grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0_0());
                              					
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

                    // InternalAadlV3.g:1461:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:1462:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:1462:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:1463:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeatureRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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

            }

            // InternalAadlV3.g:1478:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1479:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1495:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1495:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1496:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAadlV3.g:1502:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )? (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReferences_3_0 = null;

        EObject lv_typeReferences_5_0 = null;

        EObject this_NestedComponentImplementationBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1508:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )? (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )? ) )
            // InternalAadlV3.g:1509:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )? (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )? )
            {
            // InternalAadlV3.g:1509:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )? (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )? )
            // InternalAadlV3.g:1510:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )? (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )?
            {
            // InternalAadlV3.g:1510:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1511:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1511:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1512:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:1532:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1533:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1533:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1534:5: lv_category_2_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            // InternalAadlV3.g:1551:3: ( ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1552:4: ( (lv_typeReferences_3_0= ruleTypeReference ) ) (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )*
                    {
                    // InternalAadlV3.g:1552:4: ( (lv_typeReferences_3_0= ruleTypeReference ) )
                    // InternalAadlV3.g:1553:5: (lv_typeReferences_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1553:5: (lv_typeReferences_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1554:6: lv_typeReferences_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_typeReferences_3_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComponentRule());
                      						}
                      						add(
                      							current,
                      							"typeReferences",
                      							lv_typeReferences_3_0,
                      							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:1571:4: (otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )? )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAadlV3.g:1572:5: otherlv_4= ',' ( (lv_typeReferences_5_0= ruleTypeReference ) )?
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:1576:5: ( (lv_typeReferences_5_0= ruleTypeReference ) )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==RULE_ID) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // InternalAadlV3.g:1577:6: (lv_typeReferences_5_0= ruleTypeReference )
                    	            {
                    	            // InternalAadlV3.g:1577:6: (lv_typeReferences_5_0= ruleTypeReference )
                    	            // InternalAadlV3.g:1578:7: lv_typeReferences_5_0= ruleTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_1_1_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_34);
                    	            lv_typeReferences_5_0=ruleTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"typeReferences",
                    	              								lv_typeReferences_5_0,
                    	              								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:1597:3: (this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAadlV3.g:1598:4: this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1614:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1614:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1615:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1621:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:1627:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1628:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1628:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1629:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1629:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1630:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1630:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1631:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1651:3: ( (lv_associationType_2_0= ruleConnectionType ) )
            // InternalAadlV3.g:1652:4: (lv_associationType_2_0= ruleConnectionType )
            {
            // InternalAadlV3.g:1652:4: (lv_associationType_2_0= ruleConnectionType )
            // InternalAadlV3.g:1653:5: lv_associationType_2_0= ruleConnectionType
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

            // InternalAadlV3.g:1670:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1671:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1671:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1672:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1693:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1694:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1694:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1695:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:1712:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:1713:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConnectionRule());
                      				}
                      				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1729:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // InternalAadlV3.g:1729:55: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // InternalAadlV3.g:1730:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
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
    // InternalAadlV3.g:1736:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:1742:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1743:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1743:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1744:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1744:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1745:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1745:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1746:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureMappingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1766:3: ( (lv_associationType_2_0= ruleMappingType ) )
            // InternalAadlV3.g:1767:4: (lv_associationType_2_0= ruleMappingType )
            {
            // InternalAadlV3.g:1767:4: (lv_associationType_2_0= ruleMappingType )
            // InternalAadlV3.g:1768:5: lv_associationType_2_0= ruleMappingType
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

            // InternalAadlV3.g:1785:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1786:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1786:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1787:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureMappingAccess().getEqualsSignGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1808:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1809:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1809:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1810:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:1827:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:1828:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureMappingRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureMappingAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1844:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1844:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1845:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1851:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:1857:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1858:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1858:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1859:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1859:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1860:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1860:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1861:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1881:3: ( (lv_associationType_2_0= ruleFlowPathType ) )
            // InternalAadlV3.g:1882:4: (lv_associationType_2_0= ruleFlowPathType )
            {
            // InternalAadlV3.g:1882:4: (lv_associationType_2_0= ruleFlowPathType )
            // InternalAadlV3.g:1883:5: lv_associationType_2_0= ruleFlowPathType
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

            // InternalAadlV3.g:1900:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1901:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1901:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1902:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1923:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1924:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1924:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1925:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:1942:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAadlV3.g:1943:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1959:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:1959:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:1960:2: iv_ruleFlowSource= ruleFlowSource EOF
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
    // InternalAadlV3.g:1966:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1972:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1973:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1973:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1974:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1974:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1975:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1975:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1976:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1996:3: ( (lv_associationType_2_0= ruleFlowSourceType ) )
            // InternalAadlV3.g:1997:4: (lv_associationType_2_0= ruleFlowSourceType )
            {
            // InternalAadlV3.g:1997:4: (lv_associationType_2_0= ruleFlowSourceType )
            // InternalAadlV3.g:1998:5: lv_associationType_2_0= ruleFlowSourceType
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

            // InternalAadlV3.g:2015:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2016:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2016:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2017:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:2034:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:2035:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSourceRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2051:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:2051:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:2052:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:2058:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2064:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:2065:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:2065:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:2066:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:2066:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2067:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2067:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2068:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2088:3: ( (lv_associationType_2_0= ruleFlowSinkType ) )
            // InternalAadlV3.g:2089:4: (lv_associationType_2_0= ruleFlowSinkType )
            {
            // InternalAadlV3.g:2089:4: (lv_associationType_2_0= ruleFlowSinkType )
            // InternalAadlV3.g:2090:5: lv_associationType_2_0= ruleFlowSinkType
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

            // InternalAadlV3.g:2107:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2108:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2108:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2109:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:2126:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:2127:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSinkRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2144:1: ruleUseProps[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleUseProps(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2150:2: ( (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalAadlV3.g:2151:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalAadlV3.g:2151:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalAadlV3.g:2152:3: otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:2160:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2161:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2161:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2162:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUsePropsRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2176:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAadlV3.g:2177:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2181:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:2182:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:2182:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:2183:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUsePropsRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop40;
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
    // $ANTLR end "ruleUseProps"


    // $ANTLR start "entryRulePath"
    // InternalAadlV3.g:2202:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:2202:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:2203:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:2209:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:2215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:2216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:2216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:2217:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:2217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2218:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2219:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_20); if (state.failed) return current;
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
            // InternalAadlV3.g:2246:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2247:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2247:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2248:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalAadlV3.g:2265:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAadlV3.g:2266:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2270:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2271:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2271:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2272:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // InternalAadlV3.g:2290:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==18) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:2291:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2307:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2307:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2308:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2314:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2320:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2321:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2321:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2322:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2322:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2323:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2323:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2324:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2335:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) && (synpred1_InternalAadlV3())) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAadlV3.g:2336:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2347:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2348:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2348:5: ()
            	    // InternalAadlV3.g:2349:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2359:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2360:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2360:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2361:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2378:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2378:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2379:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2385:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2391:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2392:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2392:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2393:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2397:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalAadlV3.g:2398:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:2398:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:2399:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:2399:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:2400:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
                    // InternalAadlV3.g:2418:4: ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
                    {
                    // InternalAadlV3.g:2418:4: ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
                    // InternalAadlV3.g:2419:5: ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
                    {
                    // InternalAadlV3.g:2419:5: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:2420:6: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2420:6: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:2421:7: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalAadlV3.g:2438:5: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==33) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAadlV3.g:2439:6: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_1_1_1_0());
                              					
                            }
                            // InternalAadlV3.g:2443:6: ( (lv_alias_4_0= RULE_ID ) )
                            // InternalAadlV3.g:2444:7: (lv_alias_4_0= RULE_ID )
                            {
                            // InternalAadlV3.g:2444:7: (lv_alias_4_0= RULE_ID )
                            // InternalAadlV3.g:2445:8: lv_alias_4_0= RULE_ID
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
    // InternalAadlV3.g:2475:1: entryRuleConfigurationAssignment returns [EObject current=null] : iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF ;
    public final EObject entryRuleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignment = null;


        try {
            // InternalAadlV3.g:2475:64: (iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF )
            // InternalAadlV3.g:2476:2: iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF
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
    // InternalAadlV3.g:2482:1: ruleConfigurationAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) ;
    public final EObject ruleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_target_0_0 = null;

        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;

        EObject this_CurlyConfigurationElementBlock_5 = null;

        EObject this_CurlyConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2488:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) )
            // InternalAadlV3.g:2489:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            {
            // InternalAadlV3.g:2489:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            // InternalAadlV3.g:2490:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            {
            // InternalAadlV3.g:2490:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2491:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2491:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2492:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            otherlv_1=(Token)match(input,29,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2513:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==18) ) {
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
                    // InternalAadlV3.g:2514:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2514:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2515:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2515:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2516:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2516:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2517:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_35);
                    lv_assignedClassifiers_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"assignedClassifiers",
                      								lv_assignedClassifiers_2_0,
                      								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:2534:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==16) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalAadlV3.g:2535:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2539:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2540:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2540:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2541:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_assignedClassifiers_4_0=ruleTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"assignedClassifiers",
                    	      									lv_assignedClassifiers_4_0,
                    	      									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
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

                    // InternalAadlV3.g:2559:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==18) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAadlV3.g:2560:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
                              						}
                              						newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_2);
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
                    // InternalAadlV3.g:2574:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
                      				}
                      				newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleConfigurationAssignmentPattern"
    // InternalAadlV3.g:2590:1: entryRuleConfigurationAssignmentPattern returns [EObject current=null] : iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF ;
    public final EObject entryRuleConfigurationAssignmentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignmentPattern = null;


        try {
            // InternalAadlV3.g:2590:71: (iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF )
            // InternalAadlV3.g:2591:2: iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAssignmentPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAssignmentPattern=ruleConfigurationAssignmentPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAssignmentPattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationAssignmentPattern"


    // $ANTLR start "ruleConfigurationAssignmentPattern"
    // InternalAadlV3.g:2597:1: ruleConfigurationAssignmentPattern returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) ;
    public final EObject ruleConfigurationAssignmentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;

        EObject this_CurlyConfigurationElementBlock_5 = null;

        EObject this_CurlyConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2603:2: ( ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) )
            // InternalAadlV3.g:2604:2: ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            {
            // InternalAadlV3.g:2604:2: ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            // InternalAadlV3.g:2605:3: ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            {
            // InternalAadlV3.g:2605:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:2606:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:2606:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:2607:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getTargetPatternTypeCrossReference_0_0());
              				
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

            otherlv_1=(Token)match(input,34,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentPatternAccess().getAsteriskEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2625:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==18) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAadlV3.g:2626:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2626:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2627:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2627:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2628:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2628:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2629:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_35);
                    lv_assignedClassifiers_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConfigurationAssignmentPatternRule());
                      							}
                      							add(
                      								current,
                      								"assignedClassifiers",
                      								lv_assignedClassifiers_2_0,
                      								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:2646:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==16) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAadlV3.g:2647:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2651:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2652:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2652:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2653:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_assignedClassifiers_4_0=ruleTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getConfigurationAssignmentPatternRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"assignedClassifiers",
                    	      									lv_assignedClassifiers_4_0,
                    	      									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
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

                    // InternalAadlV3.g:2671:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==18) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAadlV3.g:2672:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
                              						}
                              						newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_2);
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
                    // InternalAadlV3.g:2686:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
                      				}
                      				newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationAssignmentPattern"


    // $ANTLR start "entryRuleFlowAssignment"
    // InternalAadlV3.g:2702:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2702:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2703:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2709:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ) ;
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
            // InternalAadlV3.g:2715:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ) )
            // InternalAadlV3.g:2716:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* )
            {
            // InternalAadlV3.g:2716:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* )
            // InternalAadlV3.g:2717:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            {
            // InternalAadlV3.g:2717:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2718:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2718:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2719:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            otherlv_1=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2744:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2745:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2745:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2746:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            // InternalAadlV3.g:2763:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAadlV3.g:2764:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2768:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2769:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2769:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2770:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    break loop52;
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
    // $ANTLR end "ruleFlowAssignment"


    // $ANTLR start "entryRulePropertyAssociation"
    // InternalAadlV3.g:2792:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:2792:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:2793:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:2799:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyAssociationType_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2805:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) ) )
            // InternalAadlV3.g:2806:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) )
            {
            // InternalAadlV3.g:2806:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) )
            // InternalAadlV3.g:2807:3: ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) )
            {
            // InternalAadlV3.g:2807:3: ( (lv_target_0_0= ruleModelElementReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAadlV3.g:2808:4: (lv_target_0_0= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:2808:4: (lv_target_0_0= ruleModelElementReference )
                    // InternalAadlV3.g:2809:5: lv_target_0_0= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_49);
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

            otherlv_1=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2830:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2831:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2831:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2832:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0());
              				
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

            // InternalAadlV3.g:2846:3: ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=63 && LA54_0<=65)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAadlV3.g:2847:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
                    {
                    // InternalAadlV3.g:2847:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
                    // InternalAadlV3.g:2848:5: lv_propertyAssociationType_3_0= rulePropertyAssociationType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2869:3: ( (lv_value_5_0= rulePropertyValue ) )
            // InternalAadlV3.g:2870:4: (lv_value_5_0= rulePropertyValue )
            {
            // InternalAadlV3.g:2870:4: (lv_value_5_0= rulePropertyValue )
            // InternalAadlV3.g:2871:5: lv_value_5_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_5_0=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_5_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropertyValue");
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
    // $ANTLR end "rulePropertyAssociation"


    // $ANTLR start "entryRulePropertyValue"
    // InternalAadlV3.g:2892:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:2892:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:2893:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalAadlV3.g:2899:1: rulePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2905:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAadlV3.g:2906:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAadlV3.g:2906:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:2907:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:2907:3: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:2908:4: lv_value_0_0= RULE_INT
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
    // InternalAadlV3.g:2927:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:2927:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:2928:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:2934:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2940:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2941:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2941:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2942:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2942:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2943:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2943:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2944:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2955:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==31) && (synpred2_InternalAadlV3())) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:2956:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2967:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2968:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2968:5: ()
            	    // InternalAadlV3.g:2969:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2979:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2980:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2980:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2981:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

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
    // $ANTLR end "ruleModelElementReference"


    // $ANTLR start "ruleConfigurationElementBlock"
    // InternalAadlV3.g:2999:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ConfigurationElement_1 = null;

        EObject this_ConfigurationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3005:2: ( ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:3006:2: ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:3006:2: ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:3007:3: (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:3007:3: (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3008:4: otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
                      				}
                      				newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_ConfigurationElement_1=ruleConfigurationElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:3023:4: ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==42) ) {
                            int LA56_1 = input.LA(2);

                            if ( (LA56_1==RULE_ID||LA56_1==36) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalAadlV3.g:3024:5: ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    ruleSEMICOLON();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_0_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_ConfigurationElement_3=ruleConfigurationElement(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_ConfigurationElement_3;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    // InternalAadlV3.g:3043:4: ( ruleSEMICOLON )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==42) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAadlV3.g:3044:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_20);
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
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3062:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ConfigurationElement_1 = null;

        EObject this_ConfigurationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3068:2: ( (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3069:2: (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3069:2: (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3070:3: otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
              			}
              			newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_52);
            this_ConfigurationElement_1=ruleConfigurationElement(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElement_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:3085:3: ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==42) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_ID||LA59_1==36) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalAadlV3.g:3086:4: ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_52);
            	    this_ConfigurationElement_3=ruleConfigurationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_ConfigurationElement_3;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // InternalAadlV3.g:3105:3: ( ruleSEMICOLON )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAadlV3.g:3106:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3123:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_propertyAssociations_0_0 = null;

        EObject lv_configurationAssignments_1_0 = null;

        EObject lv_configurationAssignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3129:2: ( ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) ) ) )
            // InternalAadlV3.g:3130:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) ) )
            {
            // InternalAadlV3.g:3130:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) ) )
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalAadlV3.g:3131:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3131:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3132:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3132:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3133:5: lv_propertyAssociations_0_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_0_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"propertyAssociations",
                      						lv_propertyAssociations_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3151:3: ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) )
                    {
                    // InternalAadlV3.g:3151:3: ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) )
                    // InternalAadlV3.g:3152:4: (lv_configurationAssignments_1_0= ruleConfigurationAssignment )
                    {
                    // InternalAadlV3.g:3152:4: (lv_configurationAssignments_1_0= ruleConfigurationAssignment )
                    // InternalAadlV3.g:3153:5: lv_configurationAssignments_1_0= ruleConfigurationAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_1_0=ruleConfigurationAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3171:3: ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:3171:3: ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) )
                    // InternalAadlV3.g:3172:4: (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern )
                    {
                    // InternalAadlV3.g:3172:4: (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern )
                    // InternalAadlV3.g:3173:5: lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_2_0=ruleConfigurationAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
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
    // InternalAadlV3.g:3195:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3201:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3202:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3202:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3203:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3203:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3204:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3204:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3205:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,37,FOLLOW_54); if (state.failed) return current;
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

            // InternalAadlV3.g:3217:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAadlV3.g:3218:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3218:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3219:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3219:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3220:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
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

                    // InternalAadlV3.g:3237:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==16) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalAadlV3.g:3238:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3242:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3243:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3243:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3244:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_55);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3271:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3271:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3272:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:3278:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3284:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3286:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3286:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3287:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3287:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3288:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:3308:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3309:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3309:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3310:5: ruleQualifiedName
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
    // InternalAadlV3.g:3328:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:3328:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:3329:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:3335:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3341:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3342:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3342:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3343:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3343:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:3344:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3344:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3345:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
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

            // InternalAadlV3.g:3357:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3358:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3358:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3359:5: ruleQualifiedReference
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
    // InternalAadlV3.g:3377:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3377:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3378:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:3384:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3390:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3391:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3391:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3392:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3392:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3393:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3393:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3394:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_56);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3408:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==37) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:3409:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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
    // InternalAadlV3.g:3425:1: entryRuleRealizationReference returns [EObject current=null] : iv_ruleRealizationReference= ruleRealizationReference EOF ;
    public final EObject entryRuleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealizationReference = null;


        try {
            // InternalAadlV3.g:3425:61: (iv_ruleRealizationReference= ruleRealizationReference EOF )
            // InternalAadlV3.g:3426:2: iv_ruleRealizationReference= ruleRealizationReference EOF
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
    // InternalAadlV3.g:3432:1: ruleRealizationReference returns [EObject current=null] : ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3438:2: ( ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3439:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3439:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3440:3: ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3440:3: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3441:4: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3441:4: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3442:5: ruleQualifiedDottedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealizationReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealizationReferenceAccess().getTypeComponentRealizationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_56);
            ruleQualifiedDottedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3456:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAadlV3.g:3457:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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
    // InternalAadlV3.g:3473:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:3473:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:3474:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:3480:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3486:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:3487:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:3487:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3488:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3488:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3489:4: ruleQualifiedDottedReference
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
    // InternalAadlV3.g:3507:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_propertyAssociations_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3513:2: ( (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3514:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3514:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3515:3: otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3519:3: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            // InternalAadlV3.g:3520:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            {
            // InternalAadlV3.g:3520:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            // InternalAadlV3.g:3521:5: lv_propertyAssociations_1_0= rulePropertyAssociation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            // InternalAadlV3.g:3538:3: ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==42) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==RULE_ID||LA67_1==36) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // InternalAadlV3.g:3539:4: ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getPropertiesBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalAadlV3.g:3546:4: ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:3547:5: (lv_propertyAssociations_3_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3547:5: (lv_propertyAssociations_3_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3548:6: lv_propertyAssociations_3_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_propertyAssociations_3_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPropertiesBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyAssociations",
            	      							lv_propertyAssociations_3_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalAadlV3.g:3566:3: ( ruleSEMICOLON )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==42) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAadlV3.g:3567:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPropertiesBlockAccess().getSEMICOLONParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3584:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_NestedImplementationElement_1 = null;

        EObject this_NestedImplementationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3590:2: ( (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3591:2: (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3591:2: (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3592:3: otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
              			}
              			newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_52);
            this_NestedImplementationElement_1=ruleNestedImplementationElement(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NestedImplementationElement_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:3607:3: ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==42) ) {
                    int LA69_1 = input.LA(2);

                    if ( (LA69_1==RULE_ID||LA69_1==36) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // InternalAadlV3.g:3608:4: ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_52);
            	    this_NestedImplementationElement_3=ruleNestedImplementationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_NestedImplementationElement_3;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalAadlV3.g:3627:3: ( ruleSEMICOLON )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAadlV3.g:3628:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getSEMICOLONParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3645:1: ruleNestedImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleNestedImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_propertyAssociations_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3651:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:3652:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:3652:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )
            int alt71=5;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalAadlV3.g:3653:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:3653:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:3654:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:3654:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:3655:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:3673:3: ( (lv_connections_1_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:3673:3: ( (lv_connections_1_0= ruleConnection ) )
                    // InternalAadlV3.g:3674:4: (lv_connections_1_0= ruleConnection )
                    {
                    // InternalAadlV3.g:3674:4: (lv_connections_1_0= ruleConnection )
                    // InternalAadlV3.g:3675:5: lv_connections_1_0= ruleConnection
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
                    // InternalAadlV3.g:3693:3: ( (lv_connections_2_0= ruleFeatureMapping ) )
                    {
                    // InternalAadlV3.g:3693:3: ( (lv_connections_2_0= ruleFeatureMapping ) )
                    // InternalAadlV3.g:3694:4: (lv_connections_2_0= ruleFeatureMapping )
                    {
                    // InternalAadlV3.g:3694:4: (lv_connections_2_0= ruleFeatureMapping )
                    // InternalAadlV3.g:3695:5: lv_connections_2_0= ruleFeatureMapping
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getConnectionsFeatureMappingParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_2_0=ruleFeatureMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
                case 4 :
                    // InternalAadlV3.g:3713:3: ( (lv_components_3_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:3713:3: ( (lv_components_3_0= ruleComponent ) )
                    // InternalAadlV3.g:3714:4: (lv_components_3_0= ruleComponent )
                    {
                    // InternalAadlV3.g:3714:4: (lv_components_3_0= ruleComponent )
                    // InternalAadlV3.g:3715:5: lv_components_3_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_3_0=ruleComponent();

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
                      						"org.osate.xtext.aadlv3.AadlV3.Component");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3733:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3733:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3734:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3734:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3735:5: lv_propertyAssociations_4_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_4_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"propertyAssociations",
                      						lv_propertyAssociations_4_0,
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
    // InternalAadlV3.g:3757:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3763:2: ( ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) )
            // InternalAadlV3.g:3764:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            {
            // InternalAadlV3.g:3764:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            // InternalAadlV3.g:3765:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            {
            // InternalAadlV3.g:3765:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) )
            // InternalAadlV3.g:3766:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            {
            // InternalAadlV3.g:3766:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            // InternalAadlV3.g:3767:5: lv_superClassifiers_0_0= ruleRealizationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalAadlV3.g:3784:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==16) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAadlV3.g:3785:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3789:4: ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    // InternalAadlV3.g:3790:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    {
            	    // InternalAadlV3.g:3790:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    // InternalAadlV3.g:3791:6: lv_superClassifiers_2_0= ruleRealizationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleConfigurationExtensions"


    // $ANTLR start "ruleImplementationExtensions"
    // InternalAadlV3.g:3814:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3820:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:3821:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:3821:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:3822:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:3822:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:3823:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:3823:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:3824:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalAadlV3.g:3841:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==16) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAadlV3.g:3842:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3846:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:3847:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:3847:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:3848:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleImplementationExtensions"


    // $ANTLR start "ruleInterfaceExtensions"
    // InternalAadlV3.g:3871:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3877:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:3878:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:3878:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:3879:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:3879:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:3880:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:3880:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:3881:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalAadlV3.g:3898:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAadlV3.g:3899:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3903:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:3904:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:3904:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:3905:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop74;
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
    // InternalAadlV3.g:3928:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3934:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3935:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3935:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3936:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:3940:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAadlV3.g:3941:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:3941:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:3942:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:3942:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:3943:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
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

                    // InternalAadlV3.g:3960:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==16) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalAadlV3.g:3961:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3965:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:3966:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:3966:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:3967:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_55);
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
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3994:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:3994:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:3995:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:4001:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4007:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:4008:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4008:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:4009:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:4009:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:4010:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:4010:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:4011:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:4026:3: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:4027:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4027:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            // InternalAadlV3.g:4028:5: lv_assignedClassifiers_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_assignedClassifiers_2_0=ruleTypeReference();

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
              						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4045:3: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==16) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==RULE_ID) ) {
                        int LA77_3 = input.LA(3);

                        if ( (LA77_3==EOF||LA77_3==16||LA77_3==31||(LA77_3>=37 && LA77_3<=38)||LA77_3==41) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // InternalAadlV3.g:4046:4: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4050:4: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:4051:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:4051:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    // InternalAadlV3.g:4052:6: lv_assignedClassifiers_4_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_assignedClassifiers_4_0=ruleTypeReference();

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
            	      							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // InternalAadlV3.g:4074:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:4074:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:4075:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:4081:1: ruleWorkingset returns [EObject current=null] : (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' (this_UseProps_3= ruleUseProps[$current] )? ( (lv_rootComponents_4_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_8= 'end' ruleSEMICOLON ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject this_UseProps_3 = null;

        EObject lv_rootComponents_4_0 = null;

        EObject lv_rootComponents_6_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4087:2: ( (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' (this_UseProps_3= ruleUseProps[$current] )? ( (lv_rootComponents_4_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_8= 'end' ruleSEMICOLON ) )
            // InternalAadlV3.g:4088:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' (this_UseProps_3= ruleUseProps[$current] )? ( (lv_rootComponents_4_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_8= 'end' ruleSEMICOLON )
            {
            // InternalAadlV3.g:4088:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' (this_UseProps_3= ruleUseProps[$current] )? ( (lv_rootComponents_4_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_8= 'end' ruleSEMICOLON )
            // InternalAadlV3.g:4089:3: otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' (this_UseProps_3= ruleUseProps[$current] )? ( (lv_rootComponents_4_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_8= 'end' ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0());
              		
            }
            // InternalAadlV3.g:4093:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAadlV3.g:4094:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:4094:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAadlV3.g:4095:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            otherlv_2=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkingsetAccess().getIsKeyword_2());
              		
            }
            // InternalAadlV3.g:4116:3: (this_UseProps_3= ruleUseProps[$current] )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==30) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAadlV3.g:4117:4: this_UseProps_3= ruleUseProps[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getWorkingsetRule());
                      				}
                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_UseProps_3=ruleUseProps(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UseProps_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:4129:3: ( (lv_rootComponents_4_0= ruleComponent ) )
            // InternalAadlV3.g:4130:4: (lv_rootComponents_4_0= ruleComponent )
            {
            // InternalAadlV3.g:4130:4: (lv_rootComponents_4_0= ruleComponent )
            // InternalAadlV3.g:4131:5: lv_rootComponents_4_0= ruleComponent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_rootComponents_4_0=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
              					}
              					add(
              						current,
              						"rootComponents",
              						lv_rootComponents_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.Component");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4148:3: ( ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==42) ) {
                    int LA79_1 = input.LA(2);

                    if ( (LA79_1==RULE_ID) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // InternalAadlV3.g:4149:4: ruleSEMICOLON ( (lv_rootComponents_6_0= ruleComponent ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalAadlV3.g:4156:4: ( (lv_rootComponents_6_0= ruleComponent ) )
            	    // InternalAadlV3.g:4157:5: (lv_rootComponents_6_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:4157:5: (lv_rootComponents_6_0= ruleComponent )
            	    // InternalAadlV3.g:4158:6: lv_rootComponents_6_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_rootComponents_6_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWorkingsetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"rootComponents",
            	      							lv_rootComponents_6_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Component");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalAadlV3.g:4176:3: ( ruleSEMICOLON )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==42) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAadlV3.g:4177:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWorkingsetAccess().getEndKeyword_7());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_8());
              		
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
    // $ANTLR end "ruleWorkingset"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAadlV3.g:4200:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:4200:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:4201:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:4207:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4213:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:4214:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:4214:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:4215:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4234:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:4234:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:4235:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:4241:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4247:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4248:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4248:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4249:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:4272:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:4272:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:4273:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:4279:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4285:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:4286:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:4286:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:4287:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:4294:3: (kw= '::' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==41) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalAadlV3.g:4295:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedTypesReference"
    // InternalAadlV3.g:4312:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:4312:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:4313:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
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
    // InternalAadlV3.g:4319:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4325:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:4326:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:4326:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:4327:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:4337:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==31) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAadlV3.g:4338:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:4355:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:4355:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:4356:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
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
    // InternalAadlV3.g:4362:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4368:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:4369:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalAadlV3.g:4382:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:4382:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:4383:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
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
    // InternalAadlV3.g:4389:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4395:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4396:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4396:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4397:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:4423:1: entryRuleSEMICOLON returns [String current=null] : iv_ruleSEMICOLON= ruleSEMICOLON EOF ;
    public final String entryRuleSEMICOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMICOLON = null;


        try {
            // InternalAadlV3.g:4423:49: (iv_ruleSEMICOLON= ruleSEMICOLON EOF )
            // InternalAadlV3.g:4424:2: iv_ruleSEMICOLON= ruleSEMICOLON EOF
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
    // InternalAadlV3.g:4430:1: ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMICOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4436:2: (kw= ';' )
            // InternalAadlV3.g:4437:2: kw= ';'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4445:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:4445:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:4446:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:4452:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:4458:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:4459:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:4459:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt83=16;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalAadlV3.g:4460:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4466:3: kw= 'bus'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4472:3: kw= 'data'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4478:3: kw= 'device'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4484:3: kw= 'memory'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4490:3: kw= 'process'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:4496:3: kw= 'processor'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:4502:3: kw= 'system'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:4508:3: kw= 'thread'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4514:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:4525:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:4536:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:4547:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:4558:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:4564:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:4575:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:4589:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:4589:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:4590:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:4596:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_BindingPointKeywords_4= ruleBindingPointKeywords | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BusAccessKeywords_3 = null;

        AntlrDatatypeRuleToken this_BindingPointKeywords_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4602:2: ( (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_BindingPointKeywords_4= ruleBindingPointKeywords | kw= 'interface' ) )
            // InternalAadlV3.g:4603:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_BindingPointKeywords_4= ruleBindingPointKeywords | kw= 'interface' )
            {
            // InternalAadlV3.g:4603:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_BindingPointKeywords_4= ruleBindingPointKeywords | kw= 'interface' )
            int alt84=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt84=1;
                }
                break;
            case 54:
                {
                alt84=2;
                }
                break;
            case 55:
                {
                alt84=3;
                }
                break;
            case 44:
                {
                alt84=4;
                }
                break;
            case 61:
                {
                alt84=5;
                }
                break;
            case 22:
                {
                alt84=6;
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
                    // InternalAadlV3.g:4604:3: kw= 'feature'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4610:3: kw= 'port'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4616:3: kw= 'access'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4622:3: this_BusAccessKeywords_3= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:4633:3: this_BindingPointKeywords_4= ruleBindingPointKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBindingPointKeywordsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BindingPointKeywords_4=ruleBindingPointKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BindingPointKeywords_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4644:3: kw= 'interface'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4653:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:4653:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:4654:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:4660:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:4666:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:4667:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:4667:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt85=11;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // InternalAadlV3.g:4668:3: kw= 'in'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4674:3: kw= 'out'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4680:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:4691:3: kw= 'requires'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4697:3: kw= 'provides'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4703:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:4714:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:4725:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:4736:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:4747:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:4758:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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


    // $ANTLR start "entryRuleAssociationType"
    // InternalAadlV3.g:4772:1: entryRuleAssociationType returns [String current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final String entryRuleAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationType = null;


        try {
            // InternalAadlV3.g:4772:55: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalAadlV3.g:4773:2: iv_ruleAssociationType= ruleAssociationType EOF
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
    // InternalAadlV3.g:4779:1: ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConnectionType_0= ruleConnectionType | this_MappingType_1= ruleMappingType | this_FlowType_2= ruleFlowType ) ;
    public final AntlrDatatypeRuleToken ruleAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConnectionType_0 = null;

        AntlrDatatypeRuleToken this_MappingType_1 = null;

        AntlrDatatypeRuleToken this_FlowType_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4785:2: ( (this_ConnectionType_0= ruleConnectionType | this_MappingType_1= ruleMappingType | this_FlowType_2= ruleFlowType ) )
            // InternalAadlV3.g:4786:2: (this_ConnectionType_0= ruleConnectionType | this_MappingType_1= ruleMappingType | this_FlowType_2= ruleFlowType )
            {
            // InternalAadlV3.g:4786:2: (this_ConnectionType_0= ruleConnectionType | this_MappingType_1= ruleMappingType | this_FlowType_2= ruleFlowType )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
                {
                alt86=1;
                }
                break;
            case 62:
                {
                alt86=2;
                }
                break;
            case 35:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalAadlV3.g:4787:3: this_ConnectionType_0= ruleConnectionType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getConnectionTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConnectionType_0=ruleConnectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ConnectionType_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4798:3: this_MappingType_1= ruleMappingType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getMappingTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MappingType_1=ruleMappingType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MappingType_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4809:3: this_FlowType_2= ruleFlowType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getFlowTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowType_2=ruleFlowType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FlowType_2);
                      		
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


    // $ANTLR start "entryRuleConnectionType"
    // InternalAadlV3.g:4823:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalAadlV3.g:4823:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalAadlV3.g:4824:2: iv_ruleConnectionType= ruleConnectionType EOF
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
    // InternalAadlV3.g:4830:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'connection' | kw= 'binding' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4836:2: ( (kw= 'connection' | kw= 'binding' ) )
            // InternalAadlV3.g:4837:2: (kw= 'connection' | kw= 'binding' )
            {
            // InternalAadlV3.g:4837:2: (kw= 'connection' | kw= 'binding' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==60) ) {
                alt87=1;
            }
            else if ( (LA87_0==61) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalAadlV3.g:4838:3: kw= 'connection'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getConnectionKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4844:3: kw= 'binding'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4853:1: entryRuleMappingType returns [String current=null] : iv_ruleMappingType= ruleMappingType EOF ;
    public final String entryRuleMappingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappingType = null;


        try {
            // InternalAadlV3.g:4853:51: (iv_ruleMappingType= ruleMappingType EOF )
            // InternalAadlV3.g:4854:2: iv_ruleMappingType= ruleMappingType EOF
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
    // InternalAadlV3.g:4860:1: ruleMappingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mapping' ;
    public final AntlrDatatypeRuleToken ruleMappingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4866:2: (kw= 'mapping' )
            // InternalAadlV3.g:4867:2: kw= 'mapping'
            {
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4875:1: entryRuleFlowPathType returns [String current=null] : iv_ruleFlowPathType= ruleFlowPathType EOF ;
    public final String entryRuleFlowPathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathType = null;


        try {
            // InternalAadlV3.g:4875:52: (iv_ruleFlowPathType= ruleFlowPathType EOF )
            // InternalAadlV3.g:4876:2: iv_ruleFlowPathType= ruleFlowPathType EOF
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
    // InternalAadlV3.g:4882:1: ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowPathKeywords_0= ruleFlowPathKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowPathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowPathKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4888:2: (this_FlowPathKeywords_0= ruleFlowPathKeywords )
            // InternalAadlV3.g:4889:2: this_FlowPathKeywords_0= ruleFlowPathKeywords
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
    // InternalAadlV3.g:4902:1: entryRuleFlowSourceType returns [String current=null] : iv_ruleFlowSourceType= ruleFlowSourceType EOF ;
    public final String entryRuleFlowSourceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceType = null;


        try {
            // InternalAadlV3.g:4902:54: (iv_ruleFlowSourceType= ruleFlowSourceType EOF )
            // InternalAadlV3.g:4903:2: iv_ruleFlowSourceType= ruleFlowSourceType EOF
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
    // InternalAadlV3.g:4909:1: ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSourceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4915:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:4916:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
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
    // InternalAadlV3.g:4929:1: entryRuleFlowSinkType returns [String current=null] : iv_ruleFlowSinkType= ruleFlowSinkType EOF ;
    public final String entryRuleFlowSinkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkType = null;


        try {
            // InternalAadlV3.g:4929:52: (iv_ruleFlowSinkType= ruleFlowSinkType EOF )
            // InternalAadlV3.g:4930:2: iv_ruleFlowSinkType= ruleFlowSinkType EOF
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
    // InternalAadlV3.g:4936:1: ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSinkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4942:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:4943:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
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


    // $ANTLR start "entryRuleFlowType"
    // InternalAadlV3.g:4956:1: entryRuleFlowType returns [String current=null] : iv_ruleFlowType= ruleFlowType EOF ;
    public final String entryRuleFlowType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowType = null;


        try {
            // InternalAadlV3.g:4956:48: (iv_ruleFlowType= ruleFlowType EOF )
            // InternalAadlV3.g:4957:2: iv_ruleFlowType= ruleFlowType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowType=ruleFlowType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowType"


    // $ANTLR start "ruleFlowType"
    // InternalAadlV3.g:4963:1: ruleFlowType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'flow' ;
    public final AntlrDatatypeRuleToken ruleFlowType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4969:2: (kw= 'flow' )
            // InternalAadlV3.g:4970:2: kw= 'flow'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFlowTypeAccess().getFlowKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowType"


    // $ANTLR start "entryRulePropertyAssociationType"
    // InternalAadlV3.g:4978:1: entryRulePropertyAssociationType returns [String current=null] : iv_rulePropertyAssociationType= rulePropertyAssociationType EOF ;
    public final String entryRulePropertyAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAssociationType = null;


        try {
            // InternalAadlV3.g:4978:63: (iv_rulePropertyAssociationType= rulePropertyAssociationType EOF )
            // InternalAadlV3.g:4979:2: iv_rulePropertyAssociationType= rulePropertyAssociationType EOF
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
    // InternalAadlV3.g:4985:1: rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'final' | kw= 'default' | kw= 'override' ) ;
    public final AntlrDatatypeRuleToken rulePropertyAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4991:2: ( (kw= 'final' | kw= 'default' | kw= 'override' ) )
            // InternalAadlV3.g:4992:2: (kw= 'final' | kw= 'default' | kw= 'override' )
            {
            // InternalAadlV3.g:4992:2: (kw= 'final' | kw= 'default' | kw= 'override' )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt88=1;
                }
                break;
            case 64:
                {
                alt88=2;
                }
                break;
            case 65:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalAadlV3.g:4993:3: kw= 'final'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getFinalKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4999:3: kw= 'default'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getDefaultKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5005:3: kw= 'override'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getOverrideKeyword_2());
                      		
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


    // $ANTLR start "entryRuleVirtualProcessorKeywords"
    // InternalAadlV3.g:5014:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:5014:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:5015:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:5021:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5027:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:5028:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:5028:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:5029:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,66,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5043:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:5043:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:5044:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:5050:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5056:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:5057:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:5057:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:5058:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,66,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5072:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:5072:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:5073:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:5079:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5085:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:5086:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:5086:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:5087:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,66,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5101:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:5101:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:5102:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:5108:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5114:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:5115:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:5115:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:5116:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,66,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5130:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:5130:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:5131:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:5137:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5143:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:5144:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:5144:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:5145:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,51,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5159:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:5159:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:5160:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:5166:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5172:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:5173:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:5173:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:5174:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,52,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5188:1: entryRuleEndToEndFlowKeywords returns [String current=null] : iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF ;
    public final String entryRuleEndToEndFlowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFlowKeywords = null;


        try {
            // InternalAadlV3.g:5188:60: (iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF )
            // InternalAadlV3.g:5189:2: iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF
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
    // InternalAadlV3.g:5195:1: ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFlowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5201:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:5202:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:5202:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:5203:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,12,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,12,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5227:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:5227:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:5228:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:5234:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5240:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:5241:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:5241:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:5242:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,35,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5256:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:5256:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:5257:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:5263:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5269:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:5270:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:5270:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:5271:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,35,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5285:1: entryRuleFlowPathKeywords returns [String current=null] : iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF ;
    public final String entryRuleFlowPathKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathKeywords = null;


        try {
            // InternalAadlV3.g:5285:56: (iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF )
            // InternalAadlV3.g:5286:2: iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF
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
    // InternalAadlV3.g:5292:1: ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'path' ) ;
    public final AntlrDatatypeRuleToken ruleFlowPathKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5298:2: ( (kw= 'flow' kw= 'path' ) )
            // InternalAadlV3.g:5299:2: (kw= 'flow' kw= 'path' )
            {
            // InternalAadlV3.g:5299:2: (kw= 'flow' kw= 'path' )
            // InternalAadlV3.g:5300:3: kw= 'flow' kw= 'path'
            {
            kw=(Token)match(input,35,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5314:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:5314:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:5315:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:5321:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5327:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5328:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5328:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5329:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,56,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5343:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:5343:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:5344:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:5350:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5356:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:5357:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:5357:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:5358:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,44,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBindingPointKeywords"
    // InternalAadlV3.g:5372:1: entryRuleBindingPointKeywords returns [String current=null] : iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF ;
    public final String entryRuleBindingPointKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindingPointKeywords = null;


        try {
            // InternalAadlV3.g:5372:60: (iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF )
            // InternalAadlV3.g:5373:2: iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingPointKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindingPointKeywords=ruleBindingPointKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingPointKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingPointKeywords"


    // $ANTLR start "ruleBindingPointKeywords"
    // InternalAadlV3.g:5379:1: ruleBindingPointKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'binding' kw= 'point' ) ;
    public final AntlrDatatypeRuleToken ruleBindingPointKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5385:2: ( (kw= 'binding' kw= 'point' ) )
            // InternalAadlV3.g:5386:2: (kw= 'binding' kw= 'point' )
            {
            // InternalAadlV3.g:5386:2: (kw= 'binding' kw= 'point' )
            // InternalAadlV3.g:5387:3: kw= 'binding' kw= 'point'
            {
            kw=(Token)match(input,61,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBindingPointKeywordsAccess().getBindingKeyword_0());
              		
            }
            kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBindingPointKeywordsAccess().getPointKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingPointKeywords"


    // $ANTLR start "entryRuleProvidesReadKeywords"
    // InternalAadlV3.g:5401:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:5401:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:5402:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:5408:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5414:2: ( (kw= 'provides' kw= 'read' ) )
            // InternalAadlV3.g:5415:2: (kw= 'provides' kw= 'read' )
            {
            // InternalAadlV3.g:5415:2: (kw= 'provides' kw= 'read' )
            // InternalAadlV3.g:5416:3: kw= 'provides' kw= 'read'
            {
            kw=(Token)match(input,59,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5430:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:5430:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:5431:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:5437:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5443:2: ( (kw= 'requires' kw= 'read' ) )
            // InternalAadlV3.g:5444:2: (kw= 'requires' kw= 'read' )
            {
            // InternalAadlV3.g:5444:2: (kw= 'requires' kw= 'read' )
            // InternalAadlV3.g:5445:3: kw= 'requires' kw= 'read'
            {
            kw=(Token)match(input,58,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5459:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:5459:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:5460:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:5466:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5472:2: ( (kw= 'provides' kw= 'write' ) )
            // InternalAadlV3.g:5473:2: (kw= 'provides' kw= 'write' )
            {
            // InternalAadlV3.g:5473:2: (kw= 'provides' kw= 'write' )
            // InternalAadlV3.g:5474:3: kw= 'provides' kw= 'write'
            {
            kw=(Token)match(input,59,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5488:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:5488:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:5489:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:5495:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5501:2: ( (kw= 'requires' kw= 'write' ) )
            // InternalAadlV3.g:5502:2: (kw= 'requires' kw= 'write' )
            {
            // InternalAadlV3.g:5502:2: (kw= 'requires' kw= 'write' )
            // InternalAadlV3.g:5503:3: kw= 'requires' kw= 'write'
            {
            kw=(Token)match(input,58,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5517:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:5517:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:5518:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:5524:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5530:2: ( (kw= 'provides' kw= 'readwrite' ) )
            // InternalAadlV3.g:5531:2: (kw= 'provides' kw= 'readwrite' )
            {
            // InternalAadlV3.g:5531:2: (kw= 'provides' kw= 'readwrite' )
            // InternalAadlV3.g:5532:3: kw= 'provides' kw= 'readwrite'
            {
            kw=(Token)match(input,59,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5546:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:5546:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:5547:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:5553:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5559:2: ( (kw= 'requires' kw= 'readwrite' ) )
            // InternalAadlV3.g:5560:2: (kw= 'requires' kw= 'readwrite' )
            {
            // InternalAadlV3.g:5560:2: (kw= 'requires' kw= 'readwrite' )
            // InternalAadlV3.g:5561:3: kw= 'requires' kw= 'readwrite'
            {
            kw=(Token)match(input,58,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
        // InternalAadlV3.g:2336:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2336:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2336:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2337:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2337:5: ()
        // InternalAadlV3.g:2338:5: 
        {
        }

        match(input,31,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2340:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2341:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2341:6: ( RULE_ID )
        // InternalAadlV3.g:2342:7: RULE_ID
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
        // InternalAadlV3.g:2956:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2956:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2956:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2957:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2957:5: ()
        // InternalAadlV3.g:2958:5: 
        {
        }

        match(input,31,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2960:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2961:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2961:6: ( RULE_ID )
        // InternalAadlV3.g:2962:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalAadlV3

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\13\2\uffff\1\26\11\4\1\54\1\4\6\uffff\6\4";
    static final String dfa_3s = "\1\102\2\uffff\1\102\10\26\1\103\1\61\1\103\6\uffff\6\26";
    static final String dfa_4s = "\1\uffff\1\1\1\2\14\uffff\1\3\1\5\1\6\1\7\1\10\1\4\6\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\21\3\uffff\1\22\2\uffff\1\2\1\3\1\17\2\uffff\1\20\15\uffff\1\23\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\15\uffff\1\15",
            "",
            "",
            "\1\17\2\uffff\1\20\21\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\15\uffff\1\15",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17\54\uffff\1\25",
            "\1\26\1\uffff\1\27\1\31\1\uffff\1\30",
            "\1\24\21\uffff\1\17\54\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17"
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
            return "135:5: (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= ruleDataType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= rulePropertyDefinition | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\1\16\2\uffff\1\26\1\105\4\uffff";
    static final String dfa_9s = "\2\44\2\uffff\1\75\1\107\4\uffff";
    static final String dfa_10s = "\2\uffff\1\5\1\6\2\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\31\uffff\1\3\5\uffff\1\2",
            "\1\4\20\uffff\1\2\4\uffff\1\2",
            "",
            "",
            "\1\6\3\uffff\1\6\10\uffff\1\5\10\uffff\1\6\10\uffff\7\6\1\uffff\1\6",
            "\1\10\1\11\1\7",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "796:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )";
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\4\1\16\1\uffff\1\14\2\4\5\uffff\1\35\2\uffff\1\4\1\35";
    static final String dfa_15s = "\1\44\1\51\1\uffff\1\102\1\4\1\43\5\uffff\1\44\2\uffff\1\4\1\44";
    static final String dfa_16s = "\2\uffff\1\10\3\uffff\1\7\1\2\1\4\1\3\1\1\1\uffff\1\5\1\6\2\uffff";
    static final String dfa_17s = "\20\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\37\uffff\1\2",
            "\1\3\16\uffff\1\5\1\uffff\1\4\2\uffff\1\6\1\uffff\1\2\4\uffff\1\6",
            "",
            "\1\10\36\uffff\12\11\7\uffff\2\12\1\7\3\uffff\1\11",
            "\1\13",
            "\1\15\15\uffff\1\15\20\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\5\1\uffff\1\16\2\uffff\1\6\1\uffff\1\2",
            "",
            "",
            "\1\17",
            "\1\5\1\uffff\1\16\4\uffff\1\2"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1091:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureMapping ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_5_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_19s = "\6\uffff";
    static final String dfa_20s = "\1\4\1\41\1\4\2\uffff\1\41";
    static final String dfa_21s = "\1\4\1\52\1\4\2\uffff\1\52";
    static final String dfa_22s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_23s = "\6\uffff}>";
    static final String[] dfa_24s = {
            "\1\1",
            "\1\4\6\uffff\1\3\1\2\1\4",
            "\1\5",
            "",
            "",
            "\1\4\6\uffff\1\3\1\2\1\4"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2397:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )";
        }
    }
    static final String dfa_25s = "\11\uffff";
    static final String dfa_26s = "\1\4\1\35\2\uffff\1\4\1\uffff\1\35\1\4\1\35";
    static final String dfa_27s = "\1\44\1\51\2\uffff\1\4\1\uffff\1\44\1\4\1\44";
    static final String dfa_28s = "\2\uffff\1\1\1\3\1\uffff\1\2\3\uffff";
    static final String dfa_29s = "\11\uffff}>";
    static final String[] dfa_30s = {
            "\1\1\37\uffff\1\2",
            "\1\5\1\uffff\1\4\2\uffff\1\3\1\uffff\1\2\4\uffff\1\3",
            "",
            "",
            "\1\6",
            "",
            "\1\5\1\uffff\1\7\2\uffff\1\3\1\uffff\1\2",
            "\1\10",
            "\1\5\1\uffff\1\7\4\uffff\1\2"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3130:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_configurationAssignments_1_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignmentPattern ) ) )";
        }
    }
    static final String dfa_31s = "\1\4\1\16\1\uffff\1\26\1\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String dfa_32s = "\2\44\1\uffff\1\102\1\uffff\1\110\1\uffff\1\67\2\uffff";
    static final String dfa_33s = "\2\uffff\1\5\1\uffff\1\2\1\uffff\1\1\1\uffff\1\3\1\4";
    static final String[] dfa_34s = {
            "\1\1\37\uffff\1\2",
            "\1\3\20\uffff\1\2\4\uffff\1\2",
            "",
            "\1\6\3\uffff\1\6\20\uffff\1\11\1\7\10\11\7\6\1\4\1\5\1\10\3\uffff\1\11",
            "",
            "\1\4\103\uffff\1\6",
            "",
            "\1\11\15\uffff\2\11\26\uffff\1\11\14\uffff\1\6",
            "",
            ""
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_11;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "3652:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_35s = "\24\uffff";
    static final String dfa_36s = "\11\uffff\1\15\1\uffff\1\23\10\uffff";
    static final String dfa_37s = "\1\53\10\uffff\1\4\1\54\1\4\10\uffff";
    static final String dfa_38s = "\1\102\10\uffff\1\103\1\61\1\103\10\uffff";
    static final String dfa_39s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\12\1\15\1\13\1\14\1\17\1\16";
    static final String dfa_40s = "\24\uffff}>";
    static final String[] dfa_41s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\15\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\7\uffff\1\15\3\uffff\1\15\1\uffff\2\15\2\uffff\1\15\23\uffff\1\15\30\uffff\1\14",
            "\1\16\1\uffff\1\17\1\21\1\uffff\1\20",
            "\1\23\7\uffff\1\23\3\uffff\1\23\1\uffff\2\23\2\uffff\1\23\23\uffff\1\23\30\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_35;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "4459:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_42s = "\17\uffff";
    static final String dfa_43s = "\1\uffff\1\6\1\uffff\1\10\1\16\12\uffff";
    static final String dfa_44s = "\1\70\1\26\1\uffff\2\26\12\uffff";
    static final String dfa_45s = "\1\73\1\75\1\uffff\2\113\12\uffff";
    static final String dfa_46s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\13\1\4\1\11\1\7\1\6\1\12\1\10\1\5";
    static final String dfa_47s = "\17\uffff}>";
    static final String[] dfa_48s = {
            "\1\1\1\2\1\3\1\4",
            "\1\6\3\uffff\1\6\21\uffff\1\6\10\uffff\3\6\1\uffff\1\5\3\uffff\1\6",
            "",
            "\1\10\3\uffff\1\10\21\uffff\1\10\10\uffff\3\10\5\uffff\1\10\13\uffff\1\12\1\11\1\7",
            "\1\16\3\uffff\1\16\21\uffff\1\16\10\uffff\3\16\5\uffff\1\16\13\uffff\1\13\1\15\1\14",
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

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "4667:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x001FF88102723800L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001FF88002723800L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x70FFF80800400000L,0x0000000000000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x001FF80000400000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000009801010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001040000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001FF80000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001801010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2FE0100004400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x20E0100004400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x20E0100000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008040012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010040002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}