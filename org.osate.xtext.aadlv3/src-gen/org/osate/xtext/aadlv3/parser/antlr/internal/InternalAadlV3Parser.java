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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'property'", "':'", "'properties'", "'is'", "','", "'type'", "'interface'", "'extends'", "'use'", "'features'", "'flows'", "'.'", "'subcomponents'", "'connections'", "'configuration'", "'sampled'", "'reverse'", "'->'", "'=>'", "'import'", "'flow'", "'#'", "'{'", "'}'", "'('", "')'", "'workingset'", "'.*'", "'::'", "';'", "'component'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'access'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'mapping'", "'virtual'", "'group'", "'to'", "'source'", "'sink'", "'path'", "'read'", "'write'", "'readwrite'"
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
    // InternalAadlV3.g:83:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ( ruleQualifiedName )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:89:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ( ruleQualifiedName )? ruleSEMICOLON ) )
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ( ruleQualifiedName )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:90:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ( ruleQualifiedName )? ruleSEMICOLON )
            // InternalAadlV3.g:91:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )* otherlv_4= 'end' ( ruleQualifiedName )? ruleSEMICOLON
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

            // InternalAadlV3.g:133:3: ( ( (lv_elements_3_1= rulePackageDeclaration | lv_elements_3_2= rulePrimitiveType | lv_elements_3_3= ruleComponentInterface | lv_elements_3_4= ruleComponentImplementation | lv_elements_3_5= ruleComponentConfiguration | lv_elements_3_6= ruleProperty | lv_elements_3_7= rulePropertySet | lv_elements_3_8= ruleWorkingset ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==11||LA3_0==13||(LA3_0>=18 && LA3_0<=19)||LA3_0==27||LA3_0==39||(LA3_0>=43 && LA3_0<=52)||LA3_0==62) ) {
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
            // InternalAadlV3.g:270:3: ( ruleQualifiedName )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAadlV3.g:271:4: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPackageDeclarationAccess().getQualifiedNameParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPackageDeclarationAccess().getSEMICOLONParserRuleCall_6());
              		
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
    // InternalAadlV3.g:290:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAadlV3.g:290:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAadlV3.g:291:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAadlV3.g:297:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:303:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:304:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:304:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON )
            // InternalAadlV3.g:305:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
              		
            }
            // InternalAadlV3.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:311:5: lv_name_1_0= RULE_ID
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

            // InternalAadlV3.g:327:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:328:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:328:4: ( ruleQualifiedName )
            // InternalAadlV3.g:329:5: ruleQualifiedName
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
    // InternalAadlV3.g:354:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:354:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:355:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:361:1: rulePropertySet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'properties' otherlv_3= 'is' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= 'end' (this_ID_8= RULE_ID )? ruleSEMICOLON ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_ID_8=null;


        	enterRule();

        try {
            // InternalAadlV3.g:367:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'properties' otherlv_3= 'is' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= 'end' (this_ID_8= RULE_ID )? ruleSEMICOLON ) )
            // InternalAadlV3.g:368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'properties' otherlv_3= 'is' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= 'end' (this_ID_8= RULE_ID )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'properties' otherlv_3= 'is' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= 'end' (this_ID_8= RULE_ID )? ruleSEMICOLON )
            // InternalAadlV3.g:369:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'properties' otherlv_3= 'is' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= 'end' (this_ID_8= RULE_ID )? ruleSEMICOLON
            {
            // InternalAadlV3.g:369:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:370:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:370:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:371:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertySetAccess().getPropertiesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:399:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:400:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:400:4: ( ruleQualifiedName )
            // InternalAadlV3.g:401:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_4_0());
              				
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

            // InternalAadlV3.g:415:3: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAadlV3.g:416:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalAadlV3.g:420:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:421:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:421:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:422:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_5_1_0());
            	      					
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


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPropertySetAccess().getEndKeyword_6());
              		
            }
            // InternalAadlV3.g:441:3: (this_ID_8= RULE_ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAadlV3.g:442:4: this_ID_8= RULE_ID
                    {
                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_8, grammarAccess.getPropertySetAccess().getIDTerminalRuleCall_7());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_8());
              		
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
    // InternalAadlV3.g:458:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalAadlV3.g:458:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalAadlV3.g:459:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalAadlV3.g:465:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ruleSEMICOLON ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:471:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:472:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:472:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ruleSEMICOLON )
            // InternalAadlV3.g:473:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalAadlV3.g:477:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:478:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:478:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:479:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getSEMICOLONParserRuleCall_2());
              		
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
    // InternalAadlV3.g:506:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:506:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:507:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:513:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_category_0_0= ruleComponentCategory ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )? (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] ) otherlv_12= 'end' (this_ID_13= RULE_ID )? ruleSEMICOLON ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token this_ID_13=null;
        AntlrDatatypeRuleToken lv_category_0_0 = null;

        EObject this_InterfaceExtensions_4 = null;

        EObject this_SectionsInterfaceBody_10 = null;

        EObject this_InterfaceBody_11 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:519:2: ( ( ( (lv_category_0_0= ruleComponentCategory ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )? (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] ) otherlv_12= 'end' (this_ID_13= RULE_ID )? ruleSEMICOLON ) )
            // InternalAadlV3.g:520:2: ( ( (lv_category_0_0= ruleComponentCategory ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )? (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] ) otherlv_12= 'end' (this_ID_13= RULE_ID )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:520:2: ( ( (lv_category_0_0= ruleComponentCategory ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )? (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] ) otherlv_12= 'end' (this_ID_13= RULE_ID )? ruleSEMICOLON )
            // InternalAadlV3.g:521:3: ( (lv_category_0_0= ruleComponentCategory ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )? (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] ) otherlv_12= 'end' (this_ID_13= RULE_ID )? ruleSEMICOLON
            {
            // InternalAadlV3.g:521:3: ( (lv_category_0_0= ruleComponentCategory ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=43 && LA7_0<=52)||LA7_0==62) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAadlV3.g:522:4: (lv_category_0_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:522:4: (lv_category_0_0= ruleComponentCategory )
                    // InternalAadlV3.g:523:5: lv_category_0_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_category_0_0=ruleComponentCategory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                      					}
                      					set(
                      						current,
                      						"category",
                      						lv_category_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_1());
              		
            }
            // InternalAadlV3.g:544:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:545:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:545:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:546:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:562:3: (otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:563:4: otherlv_3= 'extends' (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:567:4: (this_InterfaceExtensions_4= ruleInterfaceExtensions[$current] )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==29) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAadlV3.g:568:5: this_InterfaceExtensions_4= ruleInterfaceExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_12);
                            this_InterfaceExtensions_4=ruleInterfaceExtensions(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_InterfaceExtensions_4;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:581:3: (otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAadlV3.g:582:4: otherlv_5= 'use' otherlv_6= 'properties' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComponentInterfaceAccess().getUseKeyword_4_0());
                      			
                    }
                    otherlv_6=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_4_1());
                      			
                    }
                    // InternalAadlV3.g:590:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:591:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:591:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:592:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:606:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAadlV3.g:607:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:611:5: ( ( ruleQualifiedName ) )
                    	    // InternalAadlV3.g:612:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalAadlV3.g:612:6: ( ruleQualifiedName )
                    	    // InternalAadlV3.g:613:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getComponentInterfaceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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


                    }
                    break;

            }

            // InternalAadlV3.g:629:3: (this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current] | this_InterfaceBody_11= ruleInterfaceBody[$current] )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12||LA12_0==15||(LA12_0>=22 && LA12_0<=23)) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:630:4: this_SectionsInterfaceBody_10= ruleSectionsInterfaceBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSectionsInterfaceBodyParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_SectionsInterfaceBody_10=ruleSectionsInterfaceBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SectionsInterfaceBody_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:642:4: this_InterfaceBody_11= ruleInterfaceBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_InterfaceBody_11=ruleInterfaceBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceBody_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getEndKeyword_6());
              		
            }
            // InternalAadlV3.g:658:3: (this_ID_13= RULE_ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAadlV3.g:659:4: this_ID_13= RULE_ID
                    {
                    this_ID_13=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_13, grammarAccess.getComponentInterfaceAccess().getIDTerminalRuleCall_7());
                      			
                    }

                    }
                    break;

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


    // $ANTLR start "ruleSectionsInterfaceBody"
    // InternalAadlV3.g:676:1: ruleSectionsInterfaceBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )? (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )? (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )? ) ;
    public final EObject ruleSectionsInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_features_1_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_flows_4_0 = null;

        EObject lv_flows_5_0 = null;

        EObject this_PropertyElement_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:682:2: ( ( (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )? (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )? (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )? ) )
            // InternalAadlV3.g:683:2: ( (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )? (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )? (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )? )
            {
            // InternalAadlV3.g:683:2: ( (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )? (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )? (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )? )
            // InternalAadlV3.g:684:3: (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )? (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )? (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )?
            {
            // InternalAadlV3.g:684:3: (otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:685:4: otherlv_0= 'features' ( (lv_features_1_0= ruleFeature ) )+
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesKeyword_0_0());
                      			
                    }
                    // InternalAadlV3.g:689:4: ( (lv_features_1_0= ruleFeature ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAadlV3.g:690:5: (lv_features_1_0= ruleFeature )
                    	    {
                    	    // InternalAadlV3.g:690:5: (lv_features_1_0= ruleFeature )
                    	    // InternalAadlV3.g:691:6: lv_features_1_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_features_1_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSectionsInterfaceBodyRule());
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
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:709:3: (otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:710:4: otherlv_2= 'flows' ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSectionsInterfaceBodyAccess().getFlowsKeyword_1_0());
                      			
                    }
                    // InternalAadlV3.g:714:4: ( ( (lv_flows_3_0= ruleFlowPath ) ) | ( (lv_flows_4_0= ruleFlowSource ) ) | ( (lv_flows_5_0= ruleFlowSink ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=4;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==14) ) {
                                int LA16_3 = input.LA(3);

                                if ( (LA16_3==33) ) {
                                    switch ( input.LA(4) ) {
                                    case 65:
                                        {
                                        alt16=2;
                                        }
                                        break;
                                    case 67:
                                        {
                                        alt16=1;
                                        }
                                        break;
                                    case 66:
                                        {
                                        alt16=3;
                                        }
                                        break;

                                    }

                                }


                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAadlV3.g:715:5: ( (lv_flows_3_0= ruleFlowPath ) )
                    	    {
                    	    // InternalAadlV3.g:715:5: ( (lv_flows_3_0= ruleFlowPath ) )
                    	    // InternalAadlV3.g:716:6: (lv_flows_3_0= ruleFlowPath )
                    	    {
                    	    // InternalAadlV3.g:716:6: (lv_flows_3_0= ruleFlowPath )
                    	    // InternalAadlV3.g:717:7: lv_flows_3_0= ruleFlowPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_flows_3_0=ruleFlowPath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsInterfaceBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"flows",
                    	      								lv_flows_3_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.FlowPath");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAadlV3.g:735:5: ( (lv_flows_4_0= ruleFlowSource ) )
                    	    {
                    	    // InternalAadlV3.g:735:5: ( (lv_flows_4_0= ruleFlowSource ) )
                    	    // InternalAadlV3.g:736:6: (lv_flows_4_0= ruleFlowSource )
                    	    {
                    	    // InternalAadlV3.g:736:6: (lv_flows_4_0= ruleFlowSource )
                    	    // InternalAadlV3.g:737:7: lv_flows_4_0= ruleFlowSource
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_flows_4_0=ruleFlowSource();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsInterfaceBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"flows",
                    	      								lv_flows_4_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.FlowSource");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAadlV3.g:755:5: ( (lv_flows_5_0= ruleFlowSink ) )
                    	    {
                    	    // InternalAadlV3.g:755:5: ( (lv_flows_5_0= ruleFlowSink ) )
                    	    // InternalAadlV3.g:756:6: (lv_flows_5_0= ruleFlowSink )
                    	    {
                    	    // InternalAadlV3.g:756:6: (lv_flows_5_0= ruleFlowSink )
                    	    // InternalAadlV3.g:757:7: lv_flows_5_0= ruleFlowSink
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_flows_5_0=ruleFlowSink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsInterfaceBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"flows",
                    	      								lv_flows_5_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.FlowSink");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:776:3: (otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:777:4: otherlv_6= 'properties' (this_PropertyElement_7= rulePropertyElement[$current] )+
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSectionsInterfaceBodyAccess().getPropertiesKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:781:4: (this_PropertyElement_7= rulePropertyElement[$current] )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==34) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalAadlV3.g:782:5: this_PropertyElement_7= rulePropertyElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getSectionsInterfaceBodyRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getSectionsInterfaceBodyAccess().getPropertyElementParserRuleCall_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_PropertyElement_7=rulePropertyElement(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_PropertyElement_7;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


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
    // $ANTLR end "ruleSectionsInterfaceBody"


    // $ANTLR start "ruleInterfaceBody"
    // InternalAadlV3.g:800:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_features_1_0 = null;

        EObject lv_flows_2_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_flows_4_0 = null;

        EObject this_PropertyElement_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:806:2: ( (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* ) )
            // InternalAadlV3.g:807:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* )
            {
            // InternalAadlV3.g:807:2: (otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* )
            // InternalAadlV3.g:808:3: otherlv_0= 'is' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:812:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )*
            loop20:
            do {
                int alt20=6;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalAadlV3.g:813:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:813:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:814:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:814:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:815:6: lv_features_1_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:833:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    {
            	    // InternalAadlV3.g:833:4: ( (lv_flows_2_0= ruleFlowPath ) )
            	    // InternalAadlV3.g:834:5: (lv_flows_2_0= ruleFlowPath )
            	    {
            	    // InternalAadlV3.g:834:5: (lv_flows_2_0= ruleFlowPath )
            	    // InternalAadlV3.g:835:6: lv_flows_2_0= ruleFlowPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:853:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    {
            	    // InternalAadlV3.g:853:4: ( (lv_flows_3_0= ruleFlowSource ) )
            	    // InternalAadlV3.g:854:5: (lv_flows_3_0= ruleFlowSource )
            	    {
            	    // InternalAadlV3.g:854:5: (lv_flows_3_0= ruleFlowSource )
            	    // InternalAadlV3.g:855:6: lv_flows_3_0= ruleFlowSource
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:873:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    {
            	    // InternalAadlV3.g:873:4: ( (lv_flows_4_0= ruleFlowSink ) )
            	    // InternalAadlV3.g:874:5: (lv_flows_4_0= ruleFlowSink )
            	    {
            	    // InternalAadlV3.g:874:5: (lv_flows_4_0= ruleFlowSink )
            	    // InternalAadlV3.g:875:6: lv_flows_4_0= ruleFlowSink
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:893:4: this_PropertyElement_5= rulePropertyElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getInterfaceBodyRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getInterfaceBodyAccess().getPropertyElementParserRuleCall_1_4());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_PropertyElement_5=rulePropertyElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_PropertyElement_5;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalAadlV3.g:909:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:909:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:910:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:916:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_category_0_0= ruleComponentCategory ) ) ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )? (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] ) otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON ) ;
    public final EObject ruleComponentImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_category_0_0 = null;

        EObject this_ClassifierExtensions_5 = null;

        EObject this_SectionsImplementationBody_6 = null;

        EObject this_ImplementationBody_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:922:2: ( ( ( (lv_category_0_0= ruleComponentCategory ) ) ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )? (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] ) otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON ) )
            // InternalAadlV3.g:923:2: ( ( (lv_category_0_0= ruleComponentCategory ) ) ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )? (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] ) otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:923:2: ( ( (lv_category_0_0= ruleComponentCategory ) ) ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )? (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] ) otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON )
            // InternalAadlV3.g:924:3: ( (lv_category_0_0= ruleComponentCategory ) ) ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )? (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] ) otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON
            {
            // InternalAadlV3.g:924:3: ( (lv_category_0_0= ruleComponentCategory ) )
            // InternalAadlV3.g:925:4: (lv_category_0_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:925:4: (lv_category_0_0= ruleComponentCategory )
            // InternalAadlV3.g:926:5: lv_category_0_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_category_0_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:943:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:944:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:944:4: ( ruleQualifiedName )
            // InternalAadlV3.g:945:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentImplementationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getInterfaceComponentInterfaceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentImplementationAccess().getFullStopKeyword_2());
              		
            }
            // InternalAadlV3.g:963:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:964:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:964:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:965:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getComponentImplementationAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentImplementationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:981:3: (otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:982:4: otherlv_4= 'extends' (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )?
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:986:4: (this_ClassifierExtensions_5= ruleClassifierExtensions[$current] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAadlV3.g:987:5: this_ClassifierExtensions_5= ruleClassifierExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentImplementationRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getClassifierExtensionsParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_21);
                            this_ClassifierExtensions_5=ruleClassifierExtensions(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_ClassifierExtensions_5;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1000:3: (this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current] | this_ImplementationBody_7= ruleImplementationBody[$current] )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12||LA23_0==15||LA23_0==23||(LA23_0>=25 && LA23_0<=26)) ) {
                alt23=1;
            }
            else if ( (LA23_0==16) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1001:4: this_SectionsImplementationBody_6= ruleSectionsImplementationBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getSectionsImplementationBodyParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_SectionsImplementationBody_6=ruleSectionsImplementationBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SectionsImplementationBody_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1013:4: this_ImplementationBody_7= ruleImplementationBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_ImplementationBody_7=ruleImplementationBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationBody_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComponentImplementationAccess().getEndKeyword_6());
              		
            }
            // InternalAadlV3.g:1029:3: ( ruleDottedName )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1030:4: ruleDottedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getDottedNameParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    ruleDottedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_8());
              		
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


    // $ANTLR start "ruleSectionsImplementationBody"
    // InternalAadlV3.g:1050:1: ruleSectionsImplementationBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )? (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )? (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )? (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )? ) ;
    public final EObject ruleSectionsImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_components_1_0 = null;

        EObject lv_assignments_2_0 = null;

        EObject lv_connections_4_1 = null;

        EObject lv_connections_4_2 = null;

        EObject lv_flowAssignments_6_0 = null;

        EObject lv_paths_7_0 = null;

        EObject this_PropertyElement_9 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1056:2: ( ( (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )? (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )? (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )? (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )? ) )
            // InternalAadlV3.g:1057:2: ( (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )? (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )? (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )? (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )? )
            {
            // InternalAadlV3.g:1057:2: ( (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )? (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )? (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )? (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )? )
            // InternalAadlV3.g:1058:3: (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )? (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )? (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )? (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )?
            {
            // InternalAadlV3.g:1058:3: (otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1059:4: otherlv_0= 'subcomponents' ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSectionsImplementationBodyAccess().getSubcomponentsKeyword_0_0());
                      			
                    }
                    // InternalAadlV3.g:1063:4: ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==14) ) {
                                alt25=1;
                            }
                            else if ( (LA25_2==24||LA25_2==31) ) {
                                alt25=2;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalAadlV3.g:1064:5: ( (lv_components_1_0= ruleComponent ) )
                    	    {
                    	    // InternalAadlV3.g:1064:5: ( (lv_components_1_0= ruleComponent ) )
                    	    // InternalAadlV3.g:1065:6: (lv_components_1_0= ruleComponent )
                    	    {
                    	    // InternalAadlV3.g:1065:6: (lv_components_1_0= ruleComponent )
                    	    // InternalAadlV3.g:1066:7: lv_components_1_0= ruleComponent
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getComponentsComponentParserRuleCall_0_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_components_1_0=ruleComponent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"components",
                    	      								lv_components_1_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Component");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAadlV3.g:1084:5: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
                    	    {
                    	    // InternalAadlV3.g:1084:5: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
                    	    // InternalAadlV3.g:1085:6: (lv_assignments_2_0= ruleConfigurationAssignment )
                    	    {
                    	    // InternalAadlV3.g:1085:6: (lv_assignments_2_0= ruleConfigurationAssignment )
                    	    // InternalAadlV3.g:1086:7: lv_assignments_2_0= ruleConfigurationAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_assignments_2_0=ruleConfigurationAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
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
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:1105:3: (otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1106:4: otherlv_3= 'connections' ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSectionsImplementationBodyAccess().getConnectionsKeyword_1_0());
                      			
                    }
                    // InternalAadlV3.g:1110:4: ( ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalAadlV3.g:1111:5: ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) )
                    	    {
                    	    // InternalAadlV3.g:1111:5: ( (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping ) )
                    	    // InternalAadlV3.g:1112:6: (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping )
                    	    {
                    	    // InternalAadlV3.g:1112:6: (lv_connections_4_1= ruleConnection | lv_connections_4_2= ruleFeatureMapping )
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==RULE_ID) ) {
                    	        int LA27_1 = input.LA(2);

                    	        if ( (LA27_1==14) ) {
                    	            int LA27_2 = input.LA(3);

                    	            if ( (LA27_2==19||(LA27_2>=44 && LA27_2<=45)||(LA27_2>=53 && LA27_2<=54)||LA27_2==56) ) {
                    	                alt27=1;
                    	            }
                    	            else if ( (LA27_2==61) ) {
                    	                alt27=2;
                    	            }
                    	            else {
                    	                if (state.backtracking>0) {state.failed=true; return current;}
                    	                NoViableAltException nvae =
                    	                    new NoViableAltException("", 27, 2, input);

                    	                throw nvae;
                    	            }
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 27, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalAadlV3.g:1113:7: lv_connections_4_1= ruleConnection
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_16);
                    	            lv_connections_4_1=ruleConnection();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"connections",
                    	              								lv_connections_4_1,
                    	              								"org.osate.xtext.aadlv3.AadlV3.Connection");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalAadlV3.g:1129:7: lv_connections_4_2= ruleFeatureMapping
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_16);
                    	            lv_connections_4_2=ruleFeatureMapping();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"connections",
                    	              								lv_connections_4_2,
                    	              								"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:1148:3: (otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1149:4: otherlv_5= 'flows' ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSectionsImplementationBodyAccess().getFlowsKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:1153:4: ( ( (lv_flowAssignments_6_0= ruleFlowAssignment ) ) | ( (lv_paths_7_0= rulePath ) ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            int LA30_2 = input.LA(2);

                            if ( (LA30_2==14) ) {
                                alt30=2;
                            }
                            else if ( (LA30_2==24||LA30_2==31) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalAadlV3.g:1154:5: ( (lv_flowAssignments_6_0= ruleFlowAssignment ) )
                    	    {
                    	    // InternalAadlV3.g:1154:5: ( (lv_flowAssignments_6_0= ruleFlowAssignment ) )
                    	    // InternalAadlV3.g:1155:6: (lv_flowAssignments_6_0= ruleFlowAssignment )
                    	    {
                    	    // InternalAadlV3.g:1155:6: (lv_flowAssignments_6_0= ruleFlowAssignment )
                    	    // InternalAadlV3.g:1156:7: lv_flowAssignments_6_0= ruleFlowAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_flowAssignments_6_0=ruleFlowAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"flowAssignments",
                    	      								lv_flowAssignments_6_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAadlV3.g:1174:5: ( (lv_paths_7_0= rulePath ) )
                    	    {
                    	    // InternalAadlV3.g:1174:5: ( (lv_paths_7_0= rulePath ) )
                    	    // InternalAadlV3.g:1175:6: (lv_paths_7_0= rulePath )
                    	    {
                    	    // InternalAadlV3.g:1175:6: (lv_paths_7_0= rulePath )
                    	    // InternalAadlV3.g:1176:7: lv_paths_7_0= rulePath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getPathsPathParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_paths_7_0=rulePath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSectionsImplementationBodyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"paths",
                    	      								lv_paths_7_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Path");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;

            }

            // InternalAadlV3.g:1195:3: (otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1196:4: otherlv_8= 'properties' (this_PropertyElement_9= rulePropertyElement[$current] )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSectionsImplementationBodyAccess().getPropertiesKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:1200:4: (this_PropertyElement_9= rulePropertyElement[$current] )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID||LA32_0==34) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAadlV3.g:1201:5: this_PropertyElement_9= rulePropertyElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getSectionsImplementationBodyRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getSectionsImplementationBodyAccess().getPropertyElementParserRuleCall_3_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    this_PropertyElement_9=rulePropertyElement(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_PropertyElement_9;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


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
    // $ANTLR end "ruleSectionsImplementationBody"


    // $ANTLR start "ruleImplementationBody"
    // InternalAadlV3.g:1219:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )* ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_connections_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_paths_4_0 = null;

        EObject lv_flowAssignments_5_0 = null;

        EObject lv_assignments_6_0 = null;

        EObject this_PropertyElement_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1225:2: ( (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )* ) )
            // InternalAadlV3.g:1226:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )* )
            {
            // InternalAadlV3.g:1226:2: (otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )* )
            // InternalAadlV3.g:1227:3: otherlv_0= 'is' ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1231:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )*
            loop34:
            do {
                int alt34=8;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalAadlV3.g:1232:4: ( (lv_connections_1_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:1232:4: ( (lv_connections_1_0= ruleConnection ) )
            	    // InternalAadlV3.g:1233:5: (lv_connections_1_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:1233:5: (lv_connections_1_0= ruleConnection )
            	    // InternalAadlV3.g:1234:6: lv_connections_1_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1252:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:1252:4: ( (lv_connections_2_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:1253:5: (lv_connections_2_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:1253:5: (lv_connections_2_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:1254:6: lv_connections_2_0= ruleFeatureMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1272:4: ( (lv_components_3_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:1272:4: ( (lv_components_3_0= ruleComponent ) )
            	    // InternalAadlV3.g:1273:5: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:1273:5: (lv_components_3_0= ruleComponent )
            	    // InternalAadlV3.g:1274:6: lv_components_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1292:4: ( (lv_paths_4_0= rulePath ) )
            	    {
            	    // InternalAadlV3.g:1292:4: ( (lv_paths_4_0= rulePath ) )
            	    // InternalAadlV3.g:1293:5: (lv_paths_4_0= rulePath )
            	    {
            	    // InternalAadlV3.g:1293:5: (lv_paths_4_0= rulePath )
            	    // InternalAadlV3.g:1294:6: lv_paths_4_0= rulePath
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1312:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    {
            	    // InternalAadlV3.g:1312:4: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
            	    // InternalAadlV3.g:1313:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    {
            	    // InternalAadlV3.g:1313:5: (lv_flowAssignments_5_0= ruleFlowAssignment )
            	    // InternalAadlV3.g:1314:6: lv_flowAssignments_5_0= ruleFlowAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1332:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:1332:4: ( (lv_assignments_6_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:1333:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:1333:5: (lv_assignments_6_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:1334:6: lv_assignments_6_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:1352:4: this_PropertyElement_7= rulePropertyElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getImplementationBodyRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getImplementationBodyAccess().getPropertyElementParserRuleCall_1_6());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_PropertyElement_7=rulePropertyElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_PropertyElement_7;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAadlV3.g:1368:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1368:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1369:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1375:1: ruleComponentConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (this_Parameters_4= ruleParameters[$current] )? otherlv_5= 'extends' this_ClassifierExtensions_6= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )? otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON ) ;
    public final EObject ruleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Parameters_4 = null;

        EObject this_ClassifierExtensions_6 = null;

        EObject this_ConfigurationElementBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1381:2: ( (otherlv_0= 'configuration' ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (this_Parameters_4= ruleParameters[$current] )? otherlv_5= 'extends' this_ClassifierExtensions_6= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )? otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1382:2: (otherlv_0= 'configuration' ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (this_Parameters_4= ruleParameters[$current] )? otherlv_5= 'extends' this_ClassifierExtensions_6= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )? otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1382:2: (otherlv_0= 'configuration' ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (this_Parameters_4= ruleParameters[$current] )? otherlv_5= 'extends' this_ClassifierExtensions_6= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )? otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON )
            // InternalAadlV3.g:1383:3: otherlv_0= 'configuration' ( ( ruleQualifiedName ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) (this_Parameters_4= ruleParameters[$current] )? otherlv_5= 'extends' this_ClassifierExtensions_6= ruleClassifierExtensions[$current] (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )? otherlv_8= 'end' ( ruleDottedName )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_0());
              		
            }
            // InternalAadlV3.g:1387:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:1388:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:1388:4: ( ruleQualifiedName )
            // InternalAadlV3.g:1389:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentConfigurationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getInterfaceComponentInterfaceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentConfigurationAccess().getFullStopKeyword_2());
              		
            }
            // InternalAadlV3.g:1407:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:1408:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:1408:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:1409:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getComponentConfigurationAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentConfigurationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:1425:3: (this_Parameters_4= ruleParameters[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:1426:4: this_Parameters_4= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getClassifierExtensionsParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_26);
            this_ClassifierExtensions_6=ruleClassifierExtensions(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ClassifierExtensions_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:1453:3: (this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:1454:4: this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_ConfigurationElementBlock_7=ruleConfigurationElementBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationElementBlock_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComponentConfigurationAccess().getEndKeyword_8());
              		
            }
            // InternalAadlV3.g:1470:3: ( ruleDottedName )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAadlV3.g:1471:4: ruleDottedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getDottedNameParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    ruleDottedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_10());
              		
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
    // InternalAadlV3.g:1490:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1490:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1491:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1497:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1503:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1504:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1504:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1505:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_sampled_3_0= 'sampled' ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_reverse_5_0= 'reverse' ) )? ( ( ruleQualifiedName ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1505:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1506:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1506:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1507:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1527:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=57 && LA38_0<=60)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:1528:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1528:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1529:5: lv_direction_2_0= ruleFeatureDirection
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

            // InternalAadlV3.g:1546:3: ( (lv_sampled_3_0= 'sampled' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:1547:4: (lv_sampled_3_0= 'sampled' )
                    {
                    // InternalAadlV3.g:1547:4: (lv_sampled_3_0= 'sampled' )
                    // InternalAadlV3.g:1548:5: lv_sampled_3_0= 'sampled'
                    {
                    lv_sampled_3_0=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
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

            // InternalAadlV3.g:1560:3: ( (lv_category_4_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1561:4: (lv_category_4_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1561:4: (lv_category_4_0= ruleFeatureCategory )
            // InternalAadlV3.g:1562:5: lv_category_4_0= ruleFeatureCategory
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

            // InternalAadlV3.g:1579:3: ( (lv_reverse_5_0= 'reverse' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:1580:4: (lv_reverse_5_0= 'reverse' )
                    {
                    // InternalAadlV3.g:1580:4: (lv_reverse_5_0= 'reverse' )
                    // InternalAadlV3.g:1581:5: lv_reverse_5_0= 'reverse'
                    {
                    lv_reverse_5_0=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
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

            // InternalAadlV3.g:1593:3: ( ( ruleQualifiedName ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAadlV3.g:1594:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:1594:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:1595:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFeatureRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0());
                      				
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
                    break;

            }

            // InternalAadlV3.g:1609:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:1610:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1633:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1633:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1634:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAadlV3.g:1640:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReference_3_0 = null;

        EObject this_NestedComponentImplementationBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1646:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1648:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReference_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1648:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1649:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1649:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1650:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1670:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1671:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1671:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1672:5: lv_category_2_0= ruleComponentCategory
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

            // InternalAadlV3.g:1689:3: ( (lv_typeReference_3_0= ruleTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAadlV3.g:1690:4: (lv_typeReference_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1690:4: (lv_typeReference_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1691:5: lv_typeReference_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:1708:3: (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAadlV3.g:1709:4: this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current]
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
    // InternalAadlV3.g:1732:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1732:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1733:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1739:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1745:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1747:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1747:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1748:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1748:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1749:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:1769:3: ( (lv_associationType_2_0= ruleConnectionType ) )
            // InternalAadlV3.g:1770:4: (lv_associationType_2_0= ruleConnectionType )
            {
            // InternalAadlV3.g:1770:4: (lv_associationType_2_0= ruleConnectionType )
            // InternalAadlV3.g:1771:5: lv_associationType_2_0= ruleConnectionType
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

            // InternalAadlV3.g:1788:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1789:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1789:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1790:5: lv_source_3_0= ruleModelElementReference
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

            otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1811:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1812:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1812:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1813:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:1830:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAadlV3.g:1831:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1854:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // InternalAadlV3.g:1854:55: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // InternalAadlV3.g:1855:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
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
    // InternalAadlV3.g:1861:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1867:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1869:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleMappingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '=>' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1869:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1870:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1870:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1871:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:1891:3: ( (lv_associationType_2_0= ruleMappingType ) )
            // InternalAadlV3.g:1892:4: (lv_associationType_2_0= ruleMappingType )
            {
            // InternalAadlV3.g:1892:4: (lv_associationType_2_0= ruleMappingType )
            // InternalAadlV3.g:1893:5: lv_associationType_2_0= ruleMappingType
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

            // InternalAadlV3.g:1910:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1911:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1911:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1912:5: lv_source_3_0= ruleModelElementReference
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

            otherlv_4=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureMappingAccess().getEqualsSignGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1933:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1934:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1934:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1935:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:1952:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAadlV3.g:1953:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:1976:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1976:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1977:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1983:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:1989:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:1990:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:1990:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:1991:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:1991:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1992:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1992:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1993:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:2013:3: ( (lv_associationType_2_0= ruleFlowPathType ) )
            // InternalAadlV3.g:2014:4: (lv_associationType_2_0= ruleFlowPathType )
            {
            // InternalAadlV3.g:2014:4: (lv_associationType_2_0= ruleFlowPathType )
            // InternalAadlV3.g:2015:5: lv_associationType_2_0= ruleFlowPathType
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

            // InternalAadlV3.g:2032:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2033:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2033:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2034:5: lv_source_3_0= ruleModelElementReference
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

            otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2055:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2056:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2056:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:2057:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:2074:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAadlV3.g:2075:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2098:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:2098:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:2099:2: iv_ruleFlowSource= ruleFlowSource EOF
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
    // InternalAadlV3.g:2105:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2111:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:2112:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:2112:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:2113:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:2113:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2114:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2114:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2115:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:2135:3: ( (lv_associationType_2_0= ruleFlowSourceType ) )
            // InternalAadlV3.g:2136:4: (lv_associationType_2_0= ruleFlowSourceType )
            {
            // InternalAadlV3.g:2136:4: (lv_associationType_2_0= ruleFlowSourceType )
            // InternalAadlV3.g:2137:5: lv_associationType_2_0= ruleFlowSourceType
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

            // InternalAadlV3.g:2154:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2155:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2155:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2156:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:2173:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAadlV3.g:2174:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2197:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:2197:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:2198:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:2204:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2210:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:2211:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:2211:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:2212:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:2212:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2213:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2213:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2214:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:2234:3: ( (lv_associationType_2_0= ruleFlowSinkType ) )
            // InternalAadlV3.g:2235:4: (lv_associationType_2_0= ruleFlowSinkType )
            {
            // InternalAadlV3.g:2235:4: (lv_associationType_2_0= ruleFlowSinkType )
            // InternalAadlV3.g:2236:5: lv_associationType_2_0= ruleFlowSinkType
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

            // InternalAadlV3.g:2253:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2254:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2254:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2255:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalAadlV3.g:2272:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAadlV3.g:2273:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2296:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:2296:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:2297:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:2303:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:2309:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:2310:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:2310:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:2311:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:2311:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2312:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2312:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2313:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
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
            // InternalAadlV3.g:2340:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2341:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2341:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2342:5: lv_elements_3_0= rulePathElement
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

            // InternalAadlV3.g:2359:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==30) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAadlV3.g:2360:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2364:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2365:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2365:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2366:6: lv_elements_5_0= rulePathElement
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
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // InternalAadlV3.g:2384:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAadlV3.g:2385:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2408:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2408:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2409:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2415:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2421:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2422:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2422:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2423:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2423:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2424:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2424:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2425:5: otherlv_0= RULE_ID
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

            // InternalAadlV3.g:2436:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==24) && (synpred1_InternalAadlV3())) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAadlV3.g:2437:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2448:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2449:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2449:5: ()
            	    // InternalAadlV3.g:2450:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2460:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2461:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2461:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2462:7: otherlv_3= RULE_ID
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
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleImport"
    // InternalAadlV3.g:2479:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2479:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2480:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2486:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2492:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2493:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2493:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2494:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2498:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAadlV3.g:2499:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAadlV3.g:2499:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAadlV3.g:2500:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalAadlV3.g:2528:1: entryRuleConfigurationAssignment returns [EObject current=null] : iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF ;
    public final EObject entryRuleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignment = null;


        try {
            // InternalAadlV3.g:2528:64: (iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF )
            // InternalAadlV3.g:2529:2: iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF
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
    // InternalAadlV3.g:2535:1: ruleConfigurationAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) ;
    public final EObject ruleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject this_CurlyConfigurationElementBlock_3 = null;

        EObject this_CurlyConfigurationElementBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2541:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2542:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2542:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON )
            // InternalAadlV3.g:2543:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2543:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2544:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2544:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2545:5: lv_target_0_0= ruleModelElementReference
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

            otherlv_1=(Token)match(input,31,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2566:3: ( ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current] )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==35) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalAadlV3.g:2567:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2567:4: ( ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2568:5: ( (lv_value_2_0= ruleTypeReference ) ) (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2568:5: ( (lv_value_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2569:6: (lv_value_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2569:6: (lv_value_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2570:7: lv_value_2_0= ruleTypeReference
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

                    // InternalAadlV3.g:2587:5: (this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==35) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAadlV3.g:2588:6: this_CurlyConfigurationElementBlock_3= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:2602:4: this_CurlyConfigurationElementBlock_4= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:2625:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2625:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2626:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2632:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) ;
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
            // InternalAadlV3.g:2638:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON ) )
            // InternalAadlV3.g:2639:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            {
            // InternalAadlV3.g:2639:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON )
            // InternalAadlV3.g:2640:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ruleSEMICOLON
            {
            // InternalAadlV3.g:2640:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2641:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2641:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2642:5: lv_target_0_0= ruleModelElementReference
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

            otherlv_1=(Token)match(input,31,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2667:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2668:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2668:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2669:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalAadlV3.g:2686:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==30) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:2687:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2691:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2692:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2692:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2693:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop55;
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
    // InternalAadlV3.g:2722:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:2722:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:2723:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:2729:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2735:2: ( ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON ) )
            // InternalAadlV3.g:2736:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            {
            // InternalAadlV3.g:2736:2: ( ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON )
            // InternalAadlV3.g:2737:3: ( (lv_target_0_0= rulePropertyReference ) ) otherlv_1= '=>' ( (lv_value_2_0= rulePropertyValue ) ) ruleSEMICOLON
            {
            // InternalAadlV3.g:2737:3: ( (lv_target_0_0= rulePropertyReference ) )
            // InternalAadlV3.g:2738:4: (lv_target_0_0= rulePropertyReference )
            {
            // InternalAadlV3.g:2738:4: (lv_target_0_0= rulePropertyReference )
            // InternalAadlV3.g:2739:5: lv_target_0_0= rulePropertyReference
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

            otherlv_1=(Token)match(input,31,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2760:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalAadlV3.g:2761:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalAadlV3.g:2761:4: (lv_value_2_0= rulePropertyValue )
            // InternalAadlV3.g:2762:5: lv_value_2_0= rulePropertyValue
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
    // InternalAadlV3.g:2790:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:2790:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:2791:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalAadlV3.g:2797:1: rulePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2803:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAadlV3.g:2804:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAadlV3.g:2804:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:2805:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:2805:3: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:2806:4: lv_value_0_0= RULE_INT
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
    // InternalAadlV3.g:2825:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:2825:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:2826:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:2832:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2838:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2839:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2839:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2840:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2840:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2841:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2841:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2842:5: otherlv_0= RULE_ID
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

            // InternalAadlV3.g:2853:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==24) && (synpred2_InternalAadlV3())) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAadlV3.g:2854:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2865:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2866:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2866:5: ()
            	    // InternalAadlV3.g:2867:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2877:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2878:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2878:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2879:7: otherlv_3= RULE_ID
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
    // $ANTLR end "ruleModelElementReference"


    // $ANTLR start "entryRulePropertyReference"
    // InternalAadlV3.g:2896:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalAadlV3.g:2896:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalAadlV3.g:2897:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalAadlV3.g:2903:1: rulePropertyReference returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2909:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:2910:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:2910:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:2911:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )? otherlv_4= '#' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:2911:3: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:2912:4: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    {
                    // InternalAadlV3.g:2912:4: ( (otherlv_0= RULE_ID ) )
                    // InternalAadlV3.g:2913:5: (otherlv_0= RULE_ID )
                    {
                    // InternalAadlV3.g:2913:5: (otherlv_0= RULE_ID )
                    // InternalAadlV3.g:2914:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertyReferenceRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:2925:4: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==24) && (synpred3_InternalAadlV3())) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAadlV3.g:2926:5: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    {
                    	    // InternalAadlV3.g:2937:5: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    	    // InternalAadlV3.g:2938:6: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    // InternalAadlV3.g:2938:6: ()
                    	    // InternalAadlV3.g:2939:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2949:6: ( (otherlv_3= RULE_ID ) )
                    	    // InternalAadlV3.g:2950:7: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalAadlV3.g:2950:7: (otherlv_3= RULE_ID )
                    	    // InternalAadlV3.g:2951:8: otherlv_3= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getPropertyReferenceRule());
                    	      								}
                    	      							
                    	    }
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(otherlv_3, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0());
                    	      							
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
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2969:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2970:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2970:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2971:5: ruleQualifiedName
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
    // InternalAadlV3.g:2990:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2996:2: ( (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ ) )
            // InternalAadlV3.g:2997:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            {
            // InternalAadlV3.g:2997:2: (otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+ )
            // InternalAadlV3.g:2998:3: otherlv_0= 'is' ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:3002:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=3;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalAadlV3.g:3003:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    {
            	    // InternalAadlV3.g:3003:4: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:3004:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3004:5: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3005:6: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAadlV3.g:3023:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    {
            	    // InternalAadlV3.g:3023:4: ( (lv_assignments_2_0= ruleConfigurationAssignment ) )
            	    // InternalAadlV3.g:3024:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    {
            	    // InternalAadlV3.g:3024:5: (lv_assignments_2_0= ruleConfigurationAssignment )
            	    // InternalAadlV3.g:3025:6: lv_assignments_2_0= ruleConfigurationAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // InternalAadlV3.g:3048:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )* otherlv_3= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_PropertyElement_1 = null;

        EObject this_ConfigurationElement_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3054:2: ( (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )* otherlv_3= '}' ) )
            // InternalAadlV3.g:3055:2: (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )* otherlv_3= '}' )
            {
            // InternalAadlV3.g:3055:2: (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )* otherlv_3= '}' )
            // InternalAadlV3.g:3056:3: otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3060:3: (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )*
            loop60:
            do {
                int alt60=3;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // InternalAadlV3.g:3061:4: this_PropertyElement_1= rulePropertyElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyElementParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_42);
            	    this_PropertyElement_1=rulePropertyElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_PropertyElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:3073:4: this_ConfigurationElement_2= ruleConfigurationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_42);
            	    this_ConfigurationElement_2=ruleConfigurationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_ConfigurationElement_2;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "rulePropertyElement"
    // InternalAadlV3.g:3094:1: rulePropertyElement[EObject in_current] returns [EObject current=in_current] : ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) ;
    public final EObject rulePropertyElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_propertyAssociations_0_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3100:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) )
            // InternalAadlV3.g:3101:2: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
            {
            // InternalAadlV3.g:3101:2: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
            // InternalAadlV3.g:3102:3: (lv_propertyAssociations_0_0= rulePropertyAssociation )
            {
            // InternalAadlV3.g:3102:3: (lv_propertyAssociations_0_0= rulePropertyAssociation )
            // InternalAadlV3.g:3103:4: lv_propertyAssociations_0_0= rulePropertyAssociation
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPropertyElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_propertyAssociations_0_0=rulePropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPropertyElementRule());
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyElement"


    // $ANTLR start "ruleConfigurationElement"
    // InternalAadlV3.g:3124:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( (lv_assignments_0_0= ruleConfigurationAssignment ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_assignments_0_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3130:2: ( ( (lv_assignments_0_0= ruleConfigurationAssignment ) ) )
            // InternalAadlV3.g:3131:2: ( (lv_assignments_0_0= ruleConfigurationAssignment ) )
            {
            // InternalAadlV3.g:3131:2: ( (lv_assignments_0_0= ruleConfigurationAssignment ) )
            // InternalAadlV3.g:3132:3: (lv_assignments_0_0= ruleConfigurationAssignment )
            {
            // InternalAadlV3.g:3132:3: (lv_assignments_0_0= ruleConfigurationAssignment )
            // InternalAadlV3.g:3133:4: lv_assignments_0_0= ruleConfigurationAssignment
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationElementAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_assignments_0_0=ruleConfigurationAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
              				}
              				add(
              					current,
              					"assignments",
              					lv_assignments_0_0,
              					"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
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
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "ruleParameters"
    // InternalAadlV3.g:3154:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3160:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3161:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3161:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3162:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3162:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3163:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3163:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3164:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,37,FOLLOW_43); if (state.failed) return current;
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

            // InternalAadlV3.g:3176:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAadlV3.g:3177:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3177:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3178:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3178:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3179:6: lv_parameters_1_0= ruleConfigurationParameter
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

                    // InternalAadlV3.g:3196:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalAadlV3.g:3197:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3201:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3202:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3202:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3203:7: lv_parameters_3_0= ruleConfigurationParameter
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
                    	    break loop61;
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
    // InternalAadlV3.g:3230:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3230:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3231:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:3237:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3243:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3244:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3244:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3245:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3245:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3246:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3246:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3247:5: lv_name_0_0= RULE_ID
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
            // InternalAadlV3.g:3267:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3268:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3268:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3269:5: ruleQualifiedName
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


    // $ANTLR start "entryRuleReversableTypeReference"
    // InternalAadlV3.g:3287:1: entryRuleReversableTypeReference returns [EObject current=null] : iv_ruleReversableTypeReference= ruleReversableTypeReference EOF ;
    public final EObject entryRuleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableTypeReference = null;


        try {
            // InternalAadlV3.g:3287:64: (iv_ruleReversableTypeReference= ruleReversableTypeReference EOF )
            // InternalAadlV3.g:3288:2: iv_ruleReversableTypeReference= ruleReversableTypeReference EOF
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
    // InternalAadlV3.g:3294:1: ruleReversableTypeReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;
        EObject this_ConfigurationActuals_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3300:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3301:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3301:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3302:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedName ) ) (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3302:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAadlV3.g:3303:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3303:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3304:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
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

            // InternalAadlV3.g:3316:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3317:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3317:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3318:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeCrossReference_1_0());
              				
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

            // InternalAadlV3.g:3332:3: (this_ConfigurationActuals_2= ruleConfigurationActuals[$current] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:3333:4: this_ConfigurationActuals_2= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
                      				}
                      				newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getConfigurationActualsParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationActuals_2=ruleConfigurationActuals(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationActuals_2;
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
    // $ANTLR end "ruleReversableTypeReference"


    // $ANTLR start "entryRuleTypeReference"
    // InternalAadlV3.g:3349:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3349:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3350:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:3356:1: ruleTypeReference returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) ) (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_ConfigurationActuals_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3362:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) ) (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3363:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) ) (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3363:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) ) (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3364:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) ) (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3364:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) )
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:3365:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalAadlV3.g:3365:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    // InternalAadlV3.g:3366:5: ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalAadlV3.g:3366:5: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:3367:6: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:3367:6: ( ruleQualifiedName )
                    // InternalAadlV3.g:3368:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTypeReferenceRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTypeReferenceAccess().getComponentinterfaceComponentInterfaceCrossReference_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getTypeReferenceAccess().getFullStopKeyword_0_0_1());
                      				
                    }
                    // InternalAadlV3.g:3386:5: ( (otherlv_2= RULE_ID ) )
                    // InternalAadlV3.g:3387:6: (otherlv_2= RULE_ID )
                    {
                    // InternalAadlV3.g:3387:6: (otherlv_2= RULE_ID )
                    // InternalAadlV3.g:3388:7: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTypeReferenceRule());
                      							}
                      						
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0_2_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3401:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:3401:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:3402:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:3402:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:3403:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeReferenceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0());
                      					
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


                    }
                    break;

            }

            // InternalAadlV3.g:3418:3: (this_ConfigurationActuals_4= ruleConfigurationActuals[$current] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAadlV3.g:3419:4: this_ConfigurationActuals_4= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTypeReferenceRule());
                      				}
                      				newCompositeNode(grammarAccess.getTypeReferenceAccess().getConfigurationActualsParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationActuals_4=ruleConfigurationActuals(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationActuals_4;
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


    // $ANTLR start "rulePropertiesBlock"
    // InternalAadlV3.g:3436:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] )* otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PropertyElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3442:2: ( (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] )* otherlv_2= '}' ) )
            // InternalAadlV3.g:3443:2: (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] )* otherlv_2= '}' )
            {
            // InternalAadlV3.g:3443:2: (otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] )* otherlv_2= '}' )
            // InternalAadlV3.g:3444:3: otherlv_0= '{' (this_PropertyElement_1= rulePropertyElement[$current] )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3448:3: (this_PropertyElement_1= rulePropertyElement[$current] )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==34) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAadlV3.g:3449:4: this_PropertyElement_1= rulePropertyElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getPropertiesBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_42);
            	    this_PropertyElement_1=rulePropertyElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_PropertyElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3470:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* otherlv_6= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_features_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_connections_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject this_PropertyElement_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3476:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* otherlv_6= '}' ) )
            // InternalAadlV3.g:3477:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* otherlv_6= '}' )
            {
            // InternalAadlV3.g:3477:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* otherlv_6= '}' )
            // InternalAadlV3.g:3478:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3482:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )*
            loop68:
            do {
                int alt68=6;
                alt68 = dfa68.predict(input);
                switch (alt68) {
            	case 1 :
            	    // InternalAadlV3.g:3483:4: ( (lv_features_1_0= ruleFeature ) )
            	    {
            	    // InternalAadlV3.g:3483:4: ( (lv_features_1_0= ruleFeature ) )
            	    // InternalAadlV3.g:3484:5: (lv_features_1_0= ruleFeature )
            	    {
            	    // InternalAadlV3.g:3484:5: (lv_features_1_0= ruleFeature )
            	    // InternalAadlV3.g:3485:6: lv_features_1_0= ruleFeature
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
            	    // InternalAadlV3.g:3503:4: ( (lv_connections_2_0= ruleConnection ) )
            	    {
            	    // InternalAadlV3.g:3503:4: ( (lv_connections_2_0= ruleConnection ) )
            	    // InternalAadlV3.g:3504:5: (lv_connections_2_0= ruleConnection )
            	    {
            	    // InternalAadlV3.g:3504:5: (lv_connections_2_0= ruleConnection )
            	    // InternalAadlV3.g:3505:6: lv_connections_2_0= ruleConnection
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
            	    // InternalAadlV3.g:3523:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    {
            	    // InternalAadlV3.g:3523:4: ( (lv_connections_3_0= ruleFeatureMapping ) )
            	    // InternalAadlV3.g:3524:5: (lv_connections_3_0= ruleFeatureMapping )
            	    {
            	    // InternalAadlV3.g:3524:5: (lv_connections_3_0= ruleFeatureMapping )
            	    // InternalAadlV3.g:3525:6: lv_connections_3_0= ruleFeatureMapping
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
            	    // InternalAadlV3.g:3543:4: ( (lv_components_4_0= ruleComponent ) )
            	    {
            	    // InternalAadlV3.g:3543:4: ( (lv_components_4_0= ruleComponent ) )
            	    // InternalAadlV3.g:3544:5: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3544:5: (lv_components_4_0= ruleComponent )
            	    // InternalAadlV3.g:3545:6: lv_components_4_0= ruleComponent
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
            	    // InternalAadlV3.g:3563:4: this_PropertyElement_5= rulePropertyElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyElementParserRuleCall_1_4());
            	      			
            	    }
            	    pushFollow(FOLLOW_42);
            	    this_PropertyElement_5=rulePropertyElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_PropertyElement_5;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3584:1: ruleClassifierExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleClassifierExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3590:2: ( ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:3591:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:3591:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:3592:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:3592:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) )
            // InternalAadlV3.g:3593:4: (lv_superClassifiers_0_0= ruleTypeReference )
            {
            // InternalAadlV3.g:3593:4: (lv_superClassifiers_0_0= ruleTypeReference )
            // InternalAadlV3.g:3594:5: lv_superClassifiers_0_0= ruleTypeReference
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

            // InternalAadlV3.g:3611:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==17) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAadlV3.g:3612:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getClassifierExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3616:4: ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:3617:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:3617:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    // InternalAadlV3.g:3618:6: lv_superClassifiers_2_0= ruleTypeReference
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
            	    break loop69;
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


    // $ANTLR start "ruleInterfaceExtensions"
    // InternalAadlV3.g:3641:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3647:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )* ) )
            // InternalAadlV3.g:3648:2: ( ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )* )
            {
            // InternalAadlV3.g:3648:2: ( ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )* )
            // InternalAadlV3.g:3649:3: ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )*
            {
            // InternalAadlV3.g:3649:3: ( (lv_superClassifiers_0_0= ruleReversableTypeReference ) )
            // InternalAadlV3.g:3650:4: (lv_superClassifiers_0_0= ruleReversableTypeReference )
            {
            // InternalAadlV3.g:3650:4: (lv_superClassifiers_0_0= ruleReversableTypeReference )
            // InternalAadlV3.g:3651:5: lv_superClassifiers_0_0= ruleReversableTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_superClassifiers_0_0=ruleReversableTypeReference();

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
              						"org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3668:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==17) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalAadlV3.g:3669:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3673:4: ( (lv_superClassifiers_2_0= ruleReversableTypeReference ) )
            	    // InternalAadlV3.g:3674:5: (lv_superClassifiers_2_0= ruleReversableTypeReference )
            	    {
            	    // InternalAadlV3.g:3674:5: (lv_superClassifiers_2_0= ruleReversableTypeReference )
            	    // InternalAadlV3.g:3675:6: lv_superClassifiers_2_0= ruleReversableTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_superClassifiers_2_0=ruleReversableTypeReference();

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
            	      							"org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3698:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3704:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3705:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3705:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3706:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:3710:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAadlV3.g:3711:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:3711:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:3712:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:3712:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:3713:6: lv_actuals_1_0= ruleConfigurationActual
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

                    // InternalAadlV3.g:3730:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalAadlV3.g:3731:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3735:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:3736:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:3736:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:3737:7: lv_actuals_3_0= ruleConfigurationActual
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
                    	    break loop71;
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
    // InternalAadlV3.g:3764:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:3764:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:3765:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:3771:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3777:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) ) )
            // InternalAadlV3.g:3778:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            {
            // InternalAadlV3.g:3778:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) ) )
            // InternalAadlV3.g:3779:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleTypeReference ) )
            {
            // InternalAadlV3.g:3779:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:3780:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:3780:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:3781:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3796:3: ( (lv_value_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:3797:4: (lv_value_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:3797:4: (lv_value_2_0= ruleTypeReference )
            // InternalAadlV3.g:3798:5: lv_value_2_0= ruleTypeReference
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
    // InternalAadlV3.g:3819:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:3819:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:3820:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:3826:1: ruleWorkingset returns [EObject current=null] : (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rootComponents_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3832:2: ( (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? ) )
            // InternalAadlV3.g:3833:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            {
            // InternalAadlV3.g:3833:2: (otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )? )
            // InternalAadlV3.g:3834:3: otherlv_0= 'workingset' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'is' ( (lv_rootComponents_3_0= ruleComponent ) )* otherlv_4= 'end' ( ruleSEMICOLON )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0());
              		
            }
            // InternalAadlV3.g:3838:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAadlV3.g:3839:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:3839:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAadlV3.g:3840:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,16,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkingsetAccess().getIsKeyword_2());
              		
            }
            // InternalAadlV3.g:3861:3: ( (lv_rootComponents_3_0= ruleComponent ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAadlV3.g:3862:4: (lv_rootComponents_3_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:3862:4: (lv_rootComponents_3_0= ruleComponent )
            	    // InternalAadlV3.g:3863:5: lv_rootComponents_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    break loop73;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkingsetAccess().getEndKeyword_4());
              		
            }
            // InternalAadlV3.g:3884:3: ( ruleSEMICOLON )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==42) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAadlV3.g:3885:4: ruleSEMICOLON
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
    // InternalAadlV3.g:3897:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:3897:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:3898:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:3904:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3910:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAadlV3.g:3911:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAadlV3.g:3911:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAadlV3.g:3912:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:3922:3: (kw= '.*' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==40) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAadlV3.g:3923:4: kw= '.*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDottedName"
    // InternalAadlV3.g:3933:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:3933:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:3934:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:3940:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3946:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:3947:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:3947:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:3948:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
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
    // InternalAadlV3.g:3971:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:3971:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:3972:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:3978:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3984:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:3985:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:3985:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:3986:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:3993:3: (kw= '::' this_ID_2= RULE_ID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==41) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAadlV3.g:3994:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSEMICOLON"
    // InternalAadlV3.g:4011:1: entryRuleSEMICOLON returns [String current=null] : iv_ruleSEMICOLON= ruleSEMICOLON EOF ;
    public final String entryRuleSEMICOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMICOLON = null;


        try {
            // InternalAadlV3.g:4011:49: (iv_ruleSEMICOLON= ruleSEMICOLON EOF )
            // InternalAadlV3.g:4012:2: iv_ruleSEMICOLON= ruleSEMICOLON EOF
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
    // InternalAadlV3.g:4018:1: ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMICOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4024:2: (kw= ';' )
            // InternalAadlV3.g:4025:2: kw= ';'
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
    // InternalAadlV3.g:4033:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:4033:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:4034:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:4040:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:4046:2: ( (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:4047:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:4047:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt77=16;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalAadlV3.g:4048:3: kw= 'component'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getComponentKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4054:3: kw= 'bus'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4060:3: kw= 'data'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4066:3: kw= 'device'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4072:3: kw= 'memory'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4078:3: kw= 'process'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:4084:3: kw= 'processor'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:4090:3: kw= 'system'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:4096:3: kw= 'thread'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4102:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:4113:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:4124:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:4135:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:4146:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:4152:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:4163:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:4177:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:4177:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:4178:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:4184:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BusAccessKeywords_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4190:2: ( (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:4191:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:4191:2: (kw= 'feature' | kw= 'port' | kw= 'access' | this_BusAccessKeywords_3= ruleBusAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt78=1;
                }
                break;
            case 54:
                {
                alt78=2;
                }
                break;
            case 55:
                {
                alt78=3;
                }
                break;
            case 44:
                {
                alt78=4;
                }
                break;
            case 56:
                {
                alt78=5;
                }
                break;
            case 19:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalAadlV3.g:4192:3: kw= 'feature'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4198:3: kw= 'port'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4204:3: kw= 'access'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4210:3: this_BusAccessKeywords_3= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:4221:3: kw= 'binding'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4227:3: kw= 'interface'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4236:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:4236:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:4237:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:4243:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:4249:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:4250:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:4250:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt79=11;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalAadlV3.g:4251:3: kw= 'in'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4257:3: kw= 'out'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4263:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:4274:3: kw= 'requires'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4280:3: kw= 'provides'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4286:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:4297:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:4308:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:4319:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:4330:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:4341:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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
    // InternalAadlV3.g:4355:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalAadlV3.g:4355:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalAadlV3.g:4356:2: iv_ruleConnectionType= ruleConnectionType EOF
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
    // InternalAadlV3.g:4362:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4368:2: ( (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' ) )
            // InternalAadlV3.g:4369:2: (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' )
            {
            // InternalAadlV3.g:4369:2: (kw= 'feature' | kw= 'bus' | kw= 'binding' | kw= 'interface' | kw= 'port' | kw= 'data' )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt80=1;
                }
                break;
            case 44:
                {
                alt80=2;
                }
                break;
            case 56:
                {
                alt80=3;
                }
                break;
            case 19:
                {
                alt80=4;
                }
                break;
            case 54:
                {
                alt80=5;
                }
                break;
            case 45:
                {
                alt80=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalAadlV3.g:4370:3: kw= 'feature'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4376:3: kw= 'bus'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4382:3: kw= 'binding'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBindingKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4388:3: kw= 'interface'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getInterfaceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4394:3: kw= 'port'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getPortKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4400:3: kw= 'data'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4409:1: entryRuleMappingType returns [String current=null] : iv_ruleMappingType= ruleMappingType EOF ;
    public final String entryRuleMappingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappingType = null;


        try {
            // InternalAadlV3.g:4409:51: (iv_ruleMappingType= ruleMappingType EOF )
            // InternalAadlV3.g:4410:2: iv_ruleMappingType= ruleMappingType EOF
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
    // InternalAadlV3.g:4416:1: ruleMappingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mapping' ;
    public final AntlrDatatypeRuleToken ruleMappingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4422:2: (kw= 'mapping' )
            // InternalAadlV3.g:4423:2: kw= 'mapping'
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4431:1: entryRuleFlowPathType returns [String current=null] : iv_ruleFlowPathType= ruleFlowPathType EOF ;
    public final String entryRuleFlowPathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathType = null;


        try {
            // InternalAadlV3.g:4431:52: (iv_ruleFlowPathType= ruleFlowPathType EOF )
            // InternalAadlV3.g:4432:2: iv_ruleFlowPathType= ruleFlowPathType EOF
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
    // InternalAadlV3.g:4438:1: ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowPathKeywords_0= ruleFlowPathKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowPathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowPathKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4444:2: (this_FlowPathKeywords_0= ruleFlowPathKeywords )
            // InternalAadlV3.g:4445:2: this_FlowPathKeywords_0= ruleFlowPathKeywords
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
    // InternalAadlV3.g:4458:1: entryRuleFlowSourceType returns [String current=null] : iv_ruleFlowSourceType= ruleFlowSourceType EOF ;
    public final String entryRuleFlowSourceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceType = null;


        try {
            // InternalAadlV3.g:4458:54: (iv_ruleFlowSourceType= ruleFlowSourceType EOF )
            // InternalAadlV3.g:4459:2: iv_ruleFlowSourceType= ruleFlowSourceType EOF
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
    // InternalAadlV3.g:4465:1: ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSourceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4471:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:4472:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
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
    // InternalAadlV3.g:4485:1: entryRuleFlowSinkType returns [String current=null] : iv_ruleFlowSinkType= ruleFlowSinkType EOF ;
    public final String entryRuleFlowSinkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkType = null;


        try {
            // InternalAadlV3.g:4485:52: (iv_ruleFlowSinkType= ruleFlowSinkType EOF )
            // InternalAadlV3.g:4486:2: iv_ruleFlowSinkType= ruleFlowSinkType EOF
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
    // InternalAadlV3.g:4492:1: ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSinkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4498:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:4499:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
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
    // InternalAadlV3.g:4512:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:4512:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:4513:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:4519:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4525:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:4526:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:4526:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:4527:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,62,FOLLOW_52); if (state.failed) return current;
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
    // InternalAadlV3.g:4541:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:4541:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:4542:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:4548:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4554:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:4555:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:4555:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:4556:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
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
    // InternalAadlV3.g:4570:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:4570:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:4571:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:4577:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4583:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:4584:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:4584:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:4585:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,62,FOLLOW_54); if (state.failed) return current;
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
    // InternalAadlV3.g:4599:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:4599:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:4600:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:4606:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4612:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:4613:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:4613:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:4614:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,62,FOLLOW_55); if (state.failed) return current;
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
    // InternalAadlV3.g:4628:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:4628:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:4629:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:4635:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4641:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:4642:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:4642:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:4643:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,51,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4657:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:4657:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:4658:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:4664:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4670:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:4671:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:4671:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:4672:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,52,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4686:1: entryRuleEndToEndFlowKeywords returns [String current=null] : iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF ;
    public final String entryRuleEndToEndFlowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFlowKeywords = null;


        try {
            // InternalAadlV3.g:4686:60: (iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF )
            // InternalAadlV3.g:4687:2: iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF
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
    // InternalAadlV3.g:4693:1: ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFlowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4699:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:4700:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:4700:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:4701:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,12,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,64,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,12,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4725:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:4725:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:4726:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:4732:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4738:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:4739:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:4739:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:4740:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,33,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4754:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:4754:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:4755:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:4761:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4767:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:4768:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:4768:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:4769:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,33,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4783:1: entryRuleFlowPathKeywords returns [String current=null] : iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF ;
    public final String entryRuleFlowPathKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathKeywords = null;


        try {
            // InternalAadlV3.g:4783:56: (iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF )
            // InternalAadlV3.g:4784:2: iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF
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
    // InternalAadlV3.g:4790:1: ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'path' ) ;
    public final AntlrDatatypeRuleToken ruleFlowPathKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4796:2: ( (kw= 'flow' kw= 'path' ) )
            // InternalAadlV3.g:4797:2: (kw= 'flow' kw= 'path' )
            {
            // InternalAadlV3.g:4797:2: (kw= 'flow' kw= 'path' )
            // InternalAadlV3.g:4798:3: kw= 'flow' kw= 'path'
            {
            kw=(Token)match(input,33,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4812:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:4812:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:4813:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:4819:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4825:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:4826:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:4826:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:4827:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,57,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4841:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:4841:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:4842:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:4848:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4854:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:4855:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:4855:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:4856:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,44,FOLLOW_62); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProvidesReadKeywords"
    // InternalAadlV3.g:4870:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:4870:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:4871:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:4877:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4883:2: ( (kw= 'provides' kw= 'read' ) )
            // InternalAadlV3.g:4884:2: (kw= 'provides' kw= 'read' )
            {
            // InternalAadlV3.g:4884:2: (kw= 'provides' kw= 'read' )
            // InternalAadlV3.g:4885:3: kw= 'provides' kw= 'read'
            {
            kw=(Token)match(input,60,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4899:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:4899:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:4900:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:4906:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'read' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4912:2: ( (kw= 'requires' kw= 'read' ) )
            // InternalAadlV3.g:4913:2: (kw= 'requires' kw= 'read' )
            {
            // InternalAadlV3.g:4913:2: (kw= 'requires' kw= 'read' )
            // InternalAadlV3.g:4914:3: kw= 'requires' kw= 'read'
            {
            kw=(Token)match(input,59,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4928:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:4928:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:4929:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:4935:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4941:2: ( (kw= 'provides' kw= 'write' ) )
            // InternalAadlV3.g:4942:2: (kw= 'provides' kw= 'write' )
            {
            // InternalAadlV3.g:4942:2: (kw= 'provides' kw= 'write' )
            // InternalAadlV3.g:4943:3: kw= 'provides' kw= 'write'
            {
            kw=(Token)match(input,60,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4957:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:4957:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:4958:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:4964:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'write' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4970:2: ( (kw= 'requires' kw= 'write' ) )
            // InternalAadlV3.g:4971:2: (kw= 'requires' kw= 'write' )
            {
            // InternalAadlV3.g:4971:2: (kw= 'requires' kw= 'write' )
            // InternalAadlV3.g:4972:3: kw= 'requires' kw= 'write'
            {
            kw=(Token)match(input,59,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4986:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:4986:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:4987:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:4993:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4999:2: ( (kw= 'provides' kw= 'readwrite' ) )
            // InternalAadlV3.g:5000:2: (kw= 'provides' kw= 'readwrite' )
            {
            // InternalAadlV3.g:5000:2: (kw= 'provides' kw= 'readwrite' )
            // InternalAadlV3.g:5001:3: kw= 'provides' kw= 'readwrite'
            {
            kw=(Token)match(input,60,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5015:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:5015:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:5016:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:5022:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'readwrite' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5028:2: ( (kw= 'requires' kw= 'readwrite' ) )
            // InternalAadlV3.g:5029:2: (kw= 'requires' kw= 'readwrite' )
            {
            // InternalAadlV3.g:5029:2: (kw= 'requires' kw= 'readwrite' )
            // InternalAadlV3.g:5030:3: kw= 'requires' kw= 'readwrite'
            {
            kw=(Token)match(input,59,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
        // InternalAadlV3.g:2437:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2437:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2437:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2438:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2438:5: ()
        // InternalAadlV3.g:2439:5: 
        {
        }

        match(input,24,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2441:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2442:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2442:6: ( RULE_ID )
        // InternalAadlV3.g:2443:7: RULE_ID
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
        // InternalAadlV3.g:2854:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2854:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2854:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2855:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2855:5: ()
        // InternalAadlV3.g:2856:5: 
        {
        }

        match(input,24,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2858:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2859:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2859:6: ( RULE_ID )
        // InternalAadlV3.g:2860:7: RULE_ID
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
        // InternalAadlV3.g:2926:5: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2926:6: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2926:6: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2927:6: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2927:6: ()
        // InternalAadlV3.g:2928:6: 
        {
        }

        match(input,24,FOLLOW_3); if (state.failed) return ;
        // InternalAadlV3.g:2930:6: ( ( RULE_ID ) )
        // InternalAadlV3.g:2931:7: ( RULE_ID )
        {
        // InternalAadlV3.g:2931:7: ( RULE_ID )
        // InternalAadlV3.g:2932:8: RULE_ID
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
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\4\2\uffff\11\4\1\54\1\4\6\uffff\6\4";
    static final String dfa_3s = "\1\76\2\uffff\10\23\1\77\1\61\1\77\6\uffff\6\23";
    static final String dfa_4s = "\1\uffff\1\1\1\2\13\uffff\1\3\1\5\1\6\1\7\1\10\1\4\6\uffff";
    static final String dfa_5s = "\32\uffff}>";
    static final String[] dfa_6s = {
            "\1\21\6\uffff\1\1\1\uffff\1\20\4\uffff\1\2\1\16\7\uffff\1\17\13\uffff\1\22\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\11\uffff\1\14",
            "",
            "",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16\53\uffff\1\24",
            "\1\25\1\uffff\1\26\1\30\1\uffff\1\27",
            "\1\23\16\uffff\1\16\53\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16",
            "\1\23\16\uffff\1\16"
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
    static final String dfa_8s = "\1\4\1\uffff\1\16\1\uffff\1\23\1\101\4\uffff";
    static final String dfa_9s = "\1\42\1\uffff\1\42\1\uffff\1\74\1\103\4\uffff";
    static final String dfa_10s = "\1\uffff\1\6\1\uffff\1\5\2\uffff\1\1\1\3\1\2\1\4";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1\25\uffff\1\3",
            "",
            "\1\4\11\uffff\1\3\11\uffff\1\3",
            "",
            "\1\6\10\uffff\1\6\4\uffff\1\5\12\uffff\1\6\10\uffff\10\6",
            "\1\7\1\11\1\10",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 812:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_flows_2_0= ruleFlowPath ) ) | ( (lv_flows_3_0= ruleFlowSource ) ) | ( (lv_flows_4_0= ruleFlowSink ) ) | this_PropertyElement_5= rulePropertyElement[$current] )*";
        }
    }
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\4\1\uffff\1\16\1\uffff\1\14\2\4\2\uffff\2\4\2\uffff\1\30\2\uffff\1\30\1\4\1\30";
    static final String dfa_15s = "\1\42\1\uffff\1\42\1\uffff\1\76\1\4\1\43\2\uffff\2\52\2\uffff\1\42\2\uffff\1\52\1\4\1\52";
    static final String dfa_16s = "\1\uffff\1\10\1\uffff\1\7\3\uffff\1\4\1\3\2\uffff\1\1\1\2\1\uffff\1\6\1\5\3\uffff";
    static final String dfa_17s = "\23\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\7\uffff\1\1\25\uffff\1\3",
            "",
            "\1\4\11\uffff\1\5\6\uffff\1\6\2\uffff\1\3",
            "",
            "\1\7\6\uffff\1\13\27\uffff\1\10\1\11\1\12\7\10\2\13\1\uffff\1\13\4\uffff\1\14\1\10",
            "\1\15",
            "\1\16\34\uffff\1\17\1\uffff\1\16",
            "",
            "",
            "\1\20\36\uffff\1\10\6\uffff\1\10",
            "\1\20\36\uffff\1\10\6\uffff\1\10",
            "",
            "",
            "\1\5\6\uffff\1\6\2\uffff\1\3",
            "",
            "",
            "\1\21\5\uffff\1\13\4\uffff\1\10\1\uffff\1\10\3\uffff\2\10",
            "\1\22",
            "\1\13\5\uffff\1\13\4\uffff\1\10\1\uffff\1\10\4\uffff\1\10"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 1231:3: ( ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureMapping ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_assignments_6_0= ruleConfigurationAssignment ) ) | this_PropertyElement_7= rulePropertyElement[$current] )*";
        }
    }
    static final String dfa_19s = "\7\uffff";
    static final String dfa_20s = "\1\4\1\uffff\1\30\1\uffff\1\4\1\uffff\1\30";
    static final String dfa_21s = "\1\42\1\uffff\1\42\1\uffff\1\4\1\uffff\1\42";
    static final String dfa_22s = "\1\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_23s = "\7\uffff}>";
    static final String[] dfa_24s = {
            "\1\2\7\uffff\1\1\25\uffff\1\3",
            "",
            "\1\4\6\uffff\1\5\2\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\4\6\uffff\1\5\2\uffff\1\3"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 3002:3: ( ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) | ( (lv_assignments_2_0= ruleConfigurationAssignment ) ) )+";
        }
    }
    static final String dfa_25s = "\1\44\1\uffff\1\42\1\uffff\1\4\1\uffff\1\42";
    static final String[] dfa_26s = {
            "\1\2\35\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\6\uffff\1\5\2\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\4\6\uffff\1\5\2\uffff\1\3"
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_25;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 3060:3: (this_PropertyElement_1= rulePropertyElement[$current] | this_ConfigurationElement_2= ruleConfigurationElement[$current] )*";
        }
    }
    static final String dfa_27s = "\6\uffff";
    static final String dfa_28s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_29s = "\1\4\1\14\1\4\2\uffff\1\14";
    static final String dfa_30s = "\1\4\1\52\1\4\2\uffff\1\52";
    static final String dfa_31s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_32s = "\6\uffff}>";
    static final String[] dfa_33s = {
            "\1\1",
            "\1\4\2\uffff\3\4\5\uffff\1\4\1\3\2\4\10\uffff\1\4\1\uffff\2\4\2\uffff\1\2\1\4",
            "\1\5",
            "",
            "",
            "\1\4\2\uffff\3\4\5\uffff\1\4\1\3\2\4\10\uffff\1\4\1\uffff\2\4\2\uffff\1\2\1\4"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "3364:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_34s = "\1\4\1\uffff\1\16\1\uffff\1\23\1\uffff\2\4\1\uffff\4\4\1\uffff\2\30\1\4\1\uffff\1\30";
    static final String dfa_35s = "\1\44\1\uffff\1\42\1\uffff\1\76\1\uffff\1\67\1\52\1\uffff\4\52\1\uffff\2\52\1\4\1\uffff\1\52";
    static final String dfa_36s = "\1\uffff\1\6\1\uffff\1\5\1\uffff\1\4\2\uffff\1\1\4\uffff\1\3\3\uffff\1\2\1\uffff";
    static final String[] dfa_37s = {
            "\1\2\35\uffff\1\3\1\uffff\1\1",
            "",
            "\1\4\11\uffff\1\3\11\uffff\1\3",
            "",
            "\1\14\10\uffff\1\10\16\uffff\1\5\1\6\1\7\7\5\1\11\1\12\1\10\1\13\4\10\1\15\1\5",
            "",
            "\1\16\36\uffff\1\5\6\uffff\1\5\14\uffff\1\10",
            "\1\16\36\uffff\1\5\6\uffff\1\5",
            "",
            "\1\17\30\uffff\1\10\5\uffff\1\10\6\uffff\1\10",
            "\1\17\30\uffff\1\10\5\uffff\1\10\6\uffff\1\10",
            "\1\17\30\uffff\1\10\5\uffff\1\10\6\uffff\1\10",
            "\1\17\30\uffff\1\10\5\uffff\1\10\6\uffff\1\10",
            "",
            "\1\20\5\uffff\1\21\4\uffff\1\5\1\uffff\1\5\3\uffff\2\5",
            "\1\21\5\uffff\1\21\4\uffff\1\10\5\uffff\2\10",
            "\1\22",
            "",
            "\1\21\5\uffff\1\21\4\uffff\1\5\1\uffff\1\5\4\uffff\1\5"
    };
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_17;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()* loopback of 3482:3: ( ( (lv_features_1_0= ruleFeature ) ) | ( (lv_connections_2_0= ruleConnection ) ) | ( (lv_connections_3_0= ruleFeatureMapping ) ) | ( (lv_components_4_0= ruleComponent ) ) | this_PropertyElement_5= rulePropertyElement[$current] )*";
        }
    }
    static final String dfa_38s = "\24\uffff";
    static final String dfa_39s = "\11\uffff\1\15\1\uffff\1\22\10\uffff";
    static final String dfa_40s = "\1\53\10\uffff\1\4\1\54\1\4\10\uffff";
    static final String dfa_41s = "\1\76\10\uffff\1\77\1\61\1\77\10\uffff";
    static final String dfa_42s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\15\1\13\1\14\1\12\1\16\1\17";
    static final String dfa_43s = "\24\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\11\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\16\uffff\1\15\17\uffff\1\15\6\uffff\1\15\24\uffff\1\14",
            "\1\21\1\uffff\1\16\1\20\1\uffff\1\17",
            "\1\22\16\uffff\1\22\17\uffff\1\22\6\uffff\1\22\24\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "4047:2: (kw= 'component' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_45s = "\17\uffff";
    static final String dfa_46s = "\1\uffff\1\5\1\uffff\1\11\1\16\12\uffff";
    static final String dfa_47s = "\1\71\1\23\1\uffff\2\23\12\uffff";
    static final String dfa_48s = "\1\74\1\72\1\uffff\2\106\12\uffff";
    static final String dfa_49s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\7\1\13\1\4\1\11\1\6\1\12\1\10\1\5";
    static final String dfa_50s = "\17\uffff}>";
    static final String[] dfa_51s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\10\uffff\1\5\17\uffff\1\5\10\uffff\4\5\1\uffff\1\6",
            "",
            "\1\11\10\uffff\1\11\17\uffff\1\11\10\uffff\4\11\13\uffff\1\7\1\12\1\10",
            "\1\16\10\uffff\1\16\17\uffff\1\16\10\uffff\4\16\13\uffff\1\13\1\15\1\14",
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

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "4250:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x401FF881080C3810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x401FF880080C3810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F19000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020F19010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F39000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006919000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006919010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004808012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1FE0100010080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040820000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040800000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x401FF80000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0160300000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040840000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040040000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001400000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}