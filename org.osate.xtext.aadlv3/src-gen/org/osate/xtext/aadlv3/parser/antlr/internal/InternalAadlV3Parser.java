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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'package'", "'end'", "'property'", "':'", "'for'", "','", "'properties'", "'{'", "'}'", "'type'", "'interface'", "'extends'", "'is'", "'configuration'", "'->'", "'<->'", "'use'", "'.'", "'import'", "'as'", "'=>'", "'*=>'", "'flow'", "'#'", "'('", "')'", "'reverse'", "'workingset'", "'::*'", "'::'", "';'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'in'", "'out'", "'requires'", "'provides'", "'connection'", "'binding'", "'delegate'", "'final'", "'default'", "'override'", "'virtual'", "'group'", "'to'", "'source'", "'sink'", "'path'", "'access'", "'point'"
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
    // InternalAadlV3.g:83:1: rulePackageDeclaration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )* otherlv_5= 'end' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:89:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )* otherlv_5= 'end' ) )
            // InternalAadlV3.g:90:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )* otherlv_5= 'end' )
            {
            // InternalAadlV3.g:90:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )* otherlv_5= 'end' )
            // InternalAadlV3.g:91:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )* otherlv_5= 'end'
            {
            // InternalAadlV3.g:91:3: ( (lv_private_0_0= 'private' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAadlV3.g:92:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:92:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:93:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_1());
              		
            }
            // InternalAadlV3.g:109:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:110:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:110:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:111:5: lv_name_2_0= ruleQualifiedName
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

            // InternalAadlV3.g:128:3: ( ( (lv_imports_3_0= ruleImport ) ) | ( (lv_elements_4_0= rulePackageElement ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==14||LA2_0==18||(LA2_0>=21 && LA2_0<=22)||LA2_0==25||LA2_0==39||(LA2_0>=43 && LA2_0<=52)||LA2_0==65) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAadlV3.g:129:4: ( (lv_imports_3_0= ruleImport ) )
            	    {
            	    // InternalAadlV3.g:129:4: ( (lv_imports_3_0= ruleImport ) )
            	    // InternalAadlV3.g:130:5: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalAadlV3.g:130:5: (lv_imports_3_0= ruleImport )
            	    // InternalAadlV3.g:131:6: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"imports",
            	      							lv_imports_3_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Import");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:149:4: ( (lv_elements_4_0= rulePackageElement ) )
            	    {
            	    // InternalAadlV3.g:149:4: ( (lv_elements_4_0= rulePackageElement ) )
            	    // InternalAadlV3.g:150:5: (lv_elements_4_0= rulePackageElement )
            	    {
            	    // InternalAadlV3.g:150:5: (lv_elements_4_0= rulePackageElement )
            	    // InternalAadlV3.g:151:6: lv_elements_4_0= rulePackageElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_elements_4_0=rulePackageElement();

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

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getEndKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRulePackageElement"
    // InternalAadlV3.g:177:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalAadlV3.g:177:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalAadlV3.g:178:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalAadlV3.g:184:1: rulePackageElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_DataType_1 = null;

        EObject this_ComponentInterface_2 = null;

        EObject this_ComponentImplementation_3 = null;

        EObject this_ComponentConfiguration_4 = null;

        EObject this_PropertyDefinition_5 = null;

        EObject this_PropertySet_6 = null;

        EObject this_Workingset_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:190:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset ) )
            // InternalAadlV3.g:191:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )
            {
            // InternalAadlV3.g:191:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAadlV3.g:192:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {
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
                    // InternalAadlV3.g:201:3: this_DataType_1= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getDataTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:210:3: this_ComponentInterface_2= ruleComponentInterface
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentInterface_2=ruleComponentInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentInterface_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:219:3: this_ComponentImplementation_3= ruleComponentImplementation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentImplementation_3=ruleComponentImplementation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentImplementation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:228:3: this_ComponentConfiguration_4= ruleComponentConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentConfiguration_4=ruleComponentConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentConfiguration_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:237:3: this_PropertyDefinition_5= rulePropertyDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyDefinition_5=rulePropertyDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyDefinition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:246:3: this_PropertySet_6= rulePropertySet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertySet_6=rulePropertySet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertySet_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:255:3: this_Workingset_7= ruleWorkingset
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Workingset_7=ruleWorkingset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Workingset_7;
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
    // InternalAadlV3.g:267:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalAadlV3.g:267:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalAadlV3.g:268:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalAadlV3.g:274:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )? ruleSEMICOLON ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_AppliesTo_6 = null;

        EObject this_AppliesTo_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:280:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )? ruleSEMICOLON ) )
            // InternalAadlV3.g:281:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:281:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )? ruleSEMICOLON )
            // InternalAadlV3.g:282:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )? ruleSEMICOLON
            {
            // InternalAadlV3.g:282:3: ( (lv_private_0_0= 'private' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAadlV3.g:283:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:283:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:284:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1());
              		
            }
            // InternalAadlV3.g:300:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:301:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:301:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:302:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
              		
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

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeCrossReference_4_0());
              				
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

            // InternalAadlV3.g:338:3: (otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAadlV3.g:339:4: otherlv_5= 'for' this_AppliesTo_6= ruleAppliesTo[$current] (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                      				}
                      				newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_AppliesTo_6=ruleAppliesTo(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AppliesTo_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:354:4: (otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAadlV3.g:355:5: otherlv_7= ',' this_AppliesTo_8= ruleAppliesTo[$current]
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    this_AppliesTo_8=ruleAppliesTo(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_AppliesTo_8;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getSEMICOLONParserRuleCall_6());
              		
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
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
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
    // InternalAadlV3.g:462:1: rulePropertySet returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ruleSEMICOLON ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAadlV3.g:468:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ruleSEMICOLON ) )
            // InternalAadlV3.g:469:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ruleSEMICOLON )
            {
            // InternalAadlV3.g:469:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ruleSEMICOLON )
            // InternalAadlV3.g:470:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ruleSEMICOLON
            {
            // InternalAadlV3.g:470:3: ( (lv_private_0_0= 'private' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAadlV3.g:471:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:471:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:472:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:488:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:489:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:489:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:490:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getColonKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalAadlV3.g:514:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:515:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:515:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:516:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:530:3: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAadlV3.g:531:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalAadlV3.g:535:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:536:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:536:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:537:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7());
              		
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


    // $ANTLR start "entryRuleDataType"
    // InternalAadlV3.g:567:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAadlV3.g:567:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAadlV3.g:568:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAadlV3.g:574:1: ruleDataType returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? ruleSEMICOLON ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject this_PropertiesBlock_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:580:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? ruleSEMICOLON ) )
            // InternalAadlV3.g:581:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:581:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? ruleSEMICOLON )
            // InternalAadlV3.g:582:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? ruleSEMICOLON
            {
            // InternalAadlV3.g:582:3: ( (lv_private_0_0= 'private' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAadlV3.g:583:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:583:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:584:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getDataTypeAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataTypeRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getTypeKeyword_1());
              		
            }
            // InternalAadlV3.g:600:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:601:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:601:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:602:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:618:3: (this_PropertiesBlock_3= rulePropertiesBlock[$current] )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAadlV3.g:619:4: this_PropertiesBlock_3= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDataTypeRule());
                      				}
                      				newCompositeNode(grammarAccess.getDataTypeAccess().getPropertiesBlockParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_PropertiesBlock_3=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDataTypeAccess().getSEMICOLONParserRuleCall_4());
              		
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
    // InternalAadlV3.g:642:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:642:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:643:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:649:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ) ;
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
            // InternalAadlV3.g:655:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] ) )
            // InternalAadlV3.g:656:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] )
            {
            // InternalAadlV3.g:656:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current] )
            // InternalAadlV3.g:657:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )? this_InterfaceBody_6= ruleInterfaceBody[$current]
            {
            // InternalAadlV3.g:657:3: ( (lv_private_0_0= 'private' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:658:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:658:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:659:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_16); if (state.failed) return current;
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

            // InternalAadlV3.g:671:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=43 && LA13_0<=52)||LA13_0==65) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAadlV3.g:672:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:672:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:673:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:694:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:695:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:695:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:696:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            // InternalAadlV3.g:712:3: (otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:713:4: otherlv_4= 'extends' (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:717:4: (this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID||LA14_0==38) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAadlV3.g:718:5: this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_18);
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
            pushFollow(FOLLOW_2);
            this_InterfaceBody_6=ruleInterfaceBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InterfaceBody_6;
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
    // InternalAadlV3.g:747:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_InterfaceElement_1 = null;

        EObject this_InterfaceElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:753:2: ( ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:754:2: ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:754:2: ( (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:755:3: (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:755:3: (otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAadlV3.g:756:4: otherlv_0= 'is' this_InterfaceElement_1= ruleInterfaceElement[$current] ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInterfaceBodyRule());
                      				}
                      				newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_InterfaceElement_1=ruleInterfaceElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:771:4: ( ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current] )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1==RULE_ID||LA16_1==28||LA16_1==35) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAadlV3.g:772:5: ruleSEMICOLON this_InterfaceElement_3= ruleInterfaceElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop16;
                        }
                    } while (true);

                    // InternalAadlV3.g:791:4: ( ruleSEMICOLON )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==42) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAadlV3.g:792:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:810:1: ruleInterfaceElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] ) ;
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
            // InternalAadlV3.g:816:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] ) )
            // InternalAadlV3.g:817:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )
            {
            // InternalAadlV3.g:817:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )
            int alt19=6;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:818:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:818:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:819:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:819:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:820:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:838:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    {
                    // InternalAadlV3.g:838:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    // InternalAadlV3.g:839:4: (lv_flows_1_0= ruleFlowPath )
                    {
                    // InternalAadlV3.g:839:4: (lv_flows_1_0= ruleFlowPath )
                    // InternalAadlV3.g:840:5: lv_flows_1_0= ruleFlowPath
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
                    // InternalAadlV3.g:858:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    {
                    // InternalAadlV3.g:858:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    // InternalAadlV3.g:859:4: (lv_flows_2_0= ruleFlowSource )
                    {
                    // InternalAadlV3.g:859:4: (lv_flows_2_0= ruleFlowSource )
                    // InternalAadlV3.g:860:5: lv_flows_2_0= ruleFlowSource
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
                    // InternalAadlV3.g:878:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    {
                    // InternalAadlV3.g:878:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    // InternalAadlV3.g:879:4: (lv_flows_3_0= ruleFlowSink )
                    {
                    // InternalAadlV3.g:879:4: (lv_flows_3_0= ruleFlowSink )
                    // InternalAadlV3.g:880:5: lv_flows_3_0= ruleFlowSink
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
                    // InternalAadlV3.g:898:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:898:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:899:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:899:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:900:5: lv_propertyAssociations_4_0= rulePropertyAssociation
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
                    // InternalAadlV3.g:918:3: this_UseProps_5= ruleUseProps[$current]
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
    // InternalAadlV3.g:933:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:933:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:934:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:940:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ) ;
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
            // InternalAadlV3.g:946:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] ) )
            // InternalAadlV3.g:947:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] )
            {
            // InternalAadlV3.g:947:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current] )
            // InternalAadlV3.g:948:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )? this_ImplementationBody_5= ruleImplementationBody[$current]
            {
            // InternalAadlV3.g:948:3: ( (lv_private_0_0= 'private' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAadlV3.g:949:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:949:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:950:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_23); if (state.failed) return current;
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

            // InternalAadlV3.g:962:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:963:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:963:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:964:5: lv_category_1_0= ruleComponentCategory
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

            // InternalAadlV3.g:981:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:982:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:982:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:983:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            // InternalAadlV3.g:1000:3: (otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1001:4: otherlv_3= 'extends' (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:1005:4: (this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAadlV3.g:1006:5: this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getComponentImplementationRule());
                              					}
                              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_18);
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
            pushFollow(FOLLOW_2);
            this_ImplementationBody_5=ruleImplementationBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImplementationBody_5;
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
    // InternalAadlV3.g:1035:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ImplementationElement_1 = null;

        EObject this_ImplementationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1041:2: ( ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:1042:2: ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:1042:2: ( (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:1043:3: (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:1043:3: (otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1044:4: otherlv_0= 'is' this_ImplementationElement_1= ruleImplementationElement[$current] ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getImplementationBodyRule());
                      				}
                      				newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_ImplementationElement_1=ruleImplementationElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:1059:4: ( ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current] )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==42) ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==RULE_ID||LA23_1==35) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalAadlV3.g:1060:5: ruleSEMICOLON this_ImplementationElement_3= ruleImplementationElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getImplementationBodyAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop23;
                        }
                    } while (true);

                    // InternalAadlV3.g:1079:4: ( ruleSEMICOLON )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==42) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAadlV3.g:1080:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getImplementationBodyAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1098:1: ruleImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureDelegate ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_connections_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_bindings_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_paths_4_0 = null;

        EObject lv_flowAssignments_5_0 = null;

        EObject lv_configurationAssignments_6_0 = null;

        EObject lv_configurationAssignments_7_0 = null;

        EObject lv_propertyAssociations_8_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1104:2: ( ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureDelegate ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:1105:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureDelegate ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:1105:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureDelegate ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) ) )
            int alt26=9;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1106:3: ( (lv_connections_0_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:1106:3: ( (lv_connections_0_0= ruleConnection ) )
                    // InternalAadlV3.g:1107:4: (lv_connections_0_0= ruleConnection )
                    {
                    // InternalAadlV3.g:1107:4: (lv_connections_0_0= ruleConnection )
                    // InternalAadlV3.g:1108:5: lv_connections_0_0= ruleConnection
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
                    // InternalAadlV3.g:1126:3: ( (lv_connections_1_0= ruleFeatureDelegate ) )
                    {
                    // InternalAadlV3.g:1126:3: ( (lv_connections_1_0= ruleFeatureDelegate ) )
                    // InternalAadlV3.g:1127:4: (lv_connections_1_0= ruleFeatureDelegate )
                    {
                    // InternalAadlV3.g:1127:4: (lv_connections_1_0= ruleFeatureDelegate )
                    // InternalAadlV3.g:1128:5: lv_connections_1_0= ruleFeatureDelegate
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConnectionsFeatureDelegateParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_1_0=ruleFeatureDelegate();

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
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureDelegate");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1146:3: ( (lv_bindings_2_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:1146:3: ( (lv_bindings_2_0= ruleBinding ) )
                    // InternalAadlV3.g:1147:4: (lv_bindings_2_0= ruleBinding )
                    {
                    // InternalAadlV3.g:1147:4: (lv_bindings_2_0= ruleBinding )
                    // InternalAadlV3.g:1148:5: lv_bindings_2_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bindings_2_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
                    // InternalAadlV3.g:1166:3: ( (lv_components_3_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:1166:3: ( (lv_components_3_0= ruleComponent ) )
                    // InternalAadlV3.g:1167:4: (lv_components_3_0= ruleComponent )
                    {
                    // InternalAadlV3.g:1167:4: (lv_components_3_0= ruleComponent )
                    // InternalAadlV3.g:1168:5: lv_components_3_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_3_0=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
                    // InternalAadlV3.g:1186:3: ( (lv_paths_4_0= rulePath ) )
                    {
                    // InternalAadlV3.g:1186:3: ( (lv_paths_4_0= rulePath ) )
                    // InternalAadlV3.g:1187:4: (lv_paths_4_0= rulePath )
                    {
                    // InternalAadlV3.g:1187:4: (lv_paths_4_0= rulePath )
                    // InternalAadlV3.g:1188:5: lv_paths_4_0= rulePath
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_paths_4_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
                case 6 :
                    // InternalAadlV3.g:1206:3: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
                    {
                    // InternalAadlV3.g:1206:3: ( (lv_flowAssignments_5_0= ruleFlowAssignment ) )
                    // InternalAadlV3.g:1207:4: (lv_flowAssignments_5_0= ruleFlowAssignment )
                    {
                    // InternalAadlV3.g:1207:4: (lv_flowAssignments_5_0= ruleFlowAssignment )
                    // InternalAadlV3.g:1208:5: lv_flowAssignments_5_0= ruleFlowAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_flowAssignments_5_0=ruleFlowAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
                case 7 :
                    // InternalAadlV3.g:1226:3: ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) )
                    {
                    // InternalAadlV3.g:1226:3: ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) )
                    // InternalAadlV3.g:1227:4: (lv_configurationAssignments_6_0= ruleConfigurationAssignment )
                    {
                    // InternalAadlV3.g:1227:4: (lv_configurationAssignments_6_0= ruleConfigurationAssignment )
                    // InternalAadlV3.g:1228:5: lv_configurationAssignments_6_0= ruleConfigurationAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_6_0=ruleConfigurationAssignment();

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
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:1246:3: ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:1246:3: ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) )
                    // InternalAadlV3.g:1247:4: (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern )
                    {
                    // InternalAadlV3.g:1247:4: (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern )
                    // InternalAadlV3.g:1248:5: lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_7_0=ruleConfigurationAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_7_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:1266:3: ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1266:3: ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1267:4: (lv_propertyAssociations_8_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1267:4: (lv_propertyAssociations_8_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1268:5: lv_propertyAssociations_8_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_8_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"propertyAssociations",
                      						lv_propertyAssociations_8_0,
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
    // InternalAadlV3.g:1289:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1289:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1290:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1296:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ) ;
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
            // InternalAadlV3.g:1302:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] ) )
            // InternalAadlV3.g:1303:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )
            {
            // InternalAadlV3.g:1303:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] )
            // InternalAadlV3.g:1304:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current]
            {
            // InternalAadlV3.g:1304:3: ( (lv_private_0_0= 'private' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1305:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1305:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1306:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_26); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1322:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1323:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1323:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1324:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalAadlV3.g:1341:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1342:4: this_Parameters_3= ruleParameters[$current]
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

            // InternalAadlV3.g:1354:3: (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1355:4: otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_27);
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

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_ConfigurationElementBlock_6=ruleConfigurationElementBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElementBlock_6;
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
    // InternalAadlV3.g:1386:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1386:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1387:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1393:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReference_4_0 = null;

        EObject this_PropertiesBlock_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1399:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1400:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1400:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1401:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1401:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1402:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1402:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1403:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1423:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=55 && LA30_0<=58)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1424:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1424:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1425:5: lv_direction_2_0= ruleFeatureDirection
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

            // InternalAadlV3.g:1442:3: ( (lv_category_3_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1443:4: (lv_category_3_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1443:4: (lv_category_3_0= ruleFeatureCategory )
            // InternalAadlV3.g:1444:5: lv_category_3_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            // InternalAadlV3.g:1461:3: ( (lv_typeReference_4_0= ruleReversableTypeReference ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1462:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    {
                    // InternalAadlV3.g:1462:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    // InternalAadlV3.g:1463:5: lv_typeReference_4_0= ruleReversableTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:1480:3: (this_PropertiesBlock_5= rulePropertiesBlock[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAadlV3.g:1481:4: this_PropertiesBlock_5= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1497:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1497:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1498:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAadlV3.g:1504:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReferences_3_0 = null;

        EObject this_NestedComponentImplementationBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1510:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? ) )
            // InternalAadlV3.g:1511:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? )
            {
            // InternalAadlV3.g:1511:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? )
            // InternalAadlV3.g:1512:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            {
            // InternalAadlV3.g:1512:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1513:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1513:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1514:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1534:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1535:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1535:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1536:5: lv_category_2_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:1553:3: ( (lv_typeReferences_3_0= ruleTypeReference ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1554:4: (lv_typeReferences_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1554:4: (lv_typeReferences_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1555:5: lv_typeReferences_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
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
                    break;

            }

            // InternalAadlV3.g:1572:3: (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAadlV3.g:1573:4: this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1589:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1589:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1590:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1596:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_directional_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1602:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1603:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1603:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1604:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleConnectionType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1604:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1605:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1605:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1606:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1626:3: ( (lv_associationType_2_0= ruleConnectionType ) )
            // InternalAadlV3.g:1627:4: (lv_associationType_2_0= ruleConnectionType )
            {
            // InternalAadlV3.g:1627:4: (lv_associationType_2_0= ruleConnectionType )
            // InternalAadlV3.g:1628:5: lv_associationType_2_0= ruleConnectionType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeConnectionTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalAadlV3.g:1645:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1646:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1646:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1647:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            // InternalAadlV3.g:1664:3: ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            else if ( (LA35_0==27) ) {
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
                    // InternalAadlV3.g:1665:4: ( (lv_directional_4_0= '->' ) )
                    {
                    // InternalAadlV3.g:1665:4: ( (lv_directional_4_0= '->' ) )
                    // InternalAadlV3.g:1666:5: (lv_directional_4_0= '->' )
                    {
                    // InternalAadlV3.g:1666:5: (lv_directional_4_0= '->' )
                    // InternalAadlV3.g:1667:6: lv_directional_4_0= '->'
                    {
                    lv_directional_4_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_directional_4_0, grammarAccess.getConnectionAccess().getDirectionalHyphenMinusGreaterThanSignKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      						setWithLastConsumed(current, "directional", true, "->");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1680:4: otherlv_5= '<->'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:1685:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1686:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1686:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:1687:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:1704:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:1705:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConnectionRule());
                      				}
                      				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
                      			
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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleFeatureDelegate"
    // InternalAadlV3.g:1721:1: entryRuleFeatureDelegate returns [EObject current=null] : iv_ruleFeatureDelegate= ruleFeatureDelegate EOF ;
    public final EObject entryRuleFeatureDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDelegate = null;


        try {
            // InternalAadlV3.g:1721:56: (iv_ruleFeatureDelegate= ruleFeatureDelegate EOF )
            // InternalAadlV3.g:1722:2: iv_ruleFeatureDelegate= ruleFeatureDelegate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureDelegateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDelegate=ruleFeatureDelegate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureDelegate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureDelegate"


    // $ANTLR start "ruleFeatureDelegate"
    // InternalAadlV3.g:1728:1: ruleFeatureDelegate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleDelegateType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFeatureDelegate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_directional_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1734:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleDelegateType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1735:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleDelegateType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1735:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleDelegateType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1736:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleDelegateType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1736:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1737:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1737:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1738:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFeatureDelegateAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureDelegateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureDelegateAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1758:3: ( (lv_associationType_2_0= ruleDelegateType ) )
            // InternalAadlV3.g:1759:4: (lv_associationType_2_0= ruleDelegateType )
            {
            // InternalAadlV3.g:1759:4: (lv_associationType_2_0= ruleDelegateType )
            // InternalAadlV3.g:1760:5: lv_associationType_2_0= ruleDelegateType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getAssociationTypeDelegateTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleDelegateType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.DelegateType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1777:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1778:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1778:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1779:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
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

            // InternalAadlV3.g:1796:3: ( ( (lv_directional_4_0= '->' ) ) | otherlv_5= '<->' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            else if ( (LA37_0==27) ) {
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
                    // InternalAadlV3.g:1797:4: ( (lv_directional_4_0= '->' ) )
                    {
                    // InternalAadlV3.g:1797:4: ( (lv_directional_4_0= '->' ) )
                    // InternalAadlV3.g:1798:5: (lv_directional_4_0= '->' )
                    {
                    // InternalAadlV3.g:1798:5: (lv_directional_4_0= '->' )
                    // InternalAadlV3.g:1799:6: lv_directional_4_0= '->'
                    {
                    lv_directional_4_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_directional_4_0, grammarAccess.getFeatureDelegateAccess().getDirectionalHyphenMinusGreaterThanSignKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeatureDelegateRule());
                      						}
                      						setWithLastConsumed(current, "directional", true, "->");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1812:4: otherlv_5= '<->'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFeatureDelegateAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:1817:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1818:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1818:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:1819:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_destination_6_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
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

            // InternalAadlV3.g:1836:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:1837:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureDelegateRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureDelegateAccess().getPropertiesBlockParserRuleCall_6());
                      			
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
    // $ANTLR end "ruleFeatureDelegate"


    // $ANTLR start "entryRuleBinding"
    // InternalAadlV3.g:1853:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAadlV3.g:1853:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAadlV3.g:1854:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalAadlV3.g:1860:1: ruleBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleBindingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleBinding() throws RecognitionException {
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
            // InternalAadlV3.g:1866:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleBindingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleBindingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleBindingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1868:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleBindingType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1868:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1869:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1869:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1870:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1890:3: ( (lv_associationType_2_0= ruleBindingType ) )
            // InternalAadlV3.g:1891:4: (lv_associationType_2_0= ruleBindingType )
            {
            // InternalAadlV3.g:1891:4: (lv_associationType_2_0= ruleBindingType )
            // InternalAadlV3.g:1892:5: lv_associationType_2_0= ruleBindingType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getAssociationTypeBindingTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleBindingType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.BindingType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1909:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1910:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1910:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1911:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
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

            otherlv_4=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:1932:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1933:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1933:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:1934:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_destination_5_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
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

            // InternalAadlV3.g:1951:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:1952:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getBindingRule());
                      				}
                      				newCompositeNode(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_6());
                      			
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleFlowPath"
    // InternalAadlV3.g:1968:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1968:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1969:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1975:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:1981:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:1982:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:1982:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:1983:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowPathType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:1983:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1984:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1984:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1985:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2005:3: ( (lv_associationType_2_0= ruleFlowPathType ) )
            // InternalAadlV3.g:2006:4: (lv_associationType_2_0= ruleFlowPathType )
            {
            // InternalAadlV3.g:2006:4: (lv_associationType_2_0= ruleFlowPathType )
            // InternalAadlV3.g:2007:5: lv_associationType_2_0= ruleFlowPathType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getAssociationTypeFlowPathTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalAadlV3.g:2024:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2025:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2025:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2026:5: lv_source_3_0= ruleModelElementReference
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

            otherlv_4=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2047:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2048:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2048:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:2049:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:2066:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:2067:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2083:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:2083:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:2084:2: iv_ruleFlowSource= ruleFlowSource EOF
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
    // InternalAadlV3.g:2090:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2096:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:2097:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:2097:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:2098:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSourceType ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:2098:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2099:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2099:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2100:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2120:3: ( (lv_associationType_2_0= ruleFlowSourceType ) )
            // InternalAadlV3.g:2121:4: (lv_associationType_2_0= ruleFlowSourceType )
            {
            // InternalAadlV3.g:2121:4: (lv_associationType_2_0= ruleFlowSourceType )
            // InternalAadlV3.g:2122:5: lv_associationType_2_0= ruleFlowSourceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getAssociationTypeFlowSourceTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalAadlV3.g:2139:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2140:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2140:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2141:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:2158:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAadlV3.g:2159:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2175:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:2175:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:2176:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:2182:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2188:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:2189:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:2189:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:2190:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleFlowSinkType ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:2190:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2191:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2191:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2192:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2212:3: ( (lv_associationType_2_0= ruleFlowSinkType ) )
            // InternalAadlV3.g:2213:4: (lv_associationType_2_0= ruleFlowSinkType )
            {
            // InternalAadlV3.g:2213:4: (lv_associationType_2_0= ruleFlowSinkType )
            // InternalAadlV3.g:2214:5: lv_associationType_2_0= ruleFlowSinkType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getAssociationTypeFlowSinkTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalAadlV3.g:2231:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2232:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2232:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2233:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:2250:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:2251:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2268:1: ruleUseProps[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleUseProps(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2274:2: ( (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalAadlV3.g:2275:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalAadlV3.g:2275:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalAadlV3.g:2276:3: otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:2284:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2285:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2285:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2286:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUsePropsRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2300:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==17) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAadlV3.g:2301:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2305:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:2306:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:2306:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:2307:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUsePropsRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleUseProps"


    // $ANTLR start "entryRulePath"
    // InternalAadlV3.g:2326:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:2326:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:2327:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:2333:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) ;
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
            // InternalAadlV3.g:2339:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? ) )
            // InternalAadlV3.g:2340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            {
            // InternalAadlV3.g:2340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? )
            // InternalAadlV3.g:2341:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFlowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            {
            // InternalAadlV3.g:2341:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2342:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2342:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2343:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPathAccess().getEndToEndFlowKeywordsParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            ruleEndToEndFlowKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:2370:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2371:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2371:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2372:5: lv_elements_3_0= rulePathElement
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

            // InternalAadlV3.g:2389:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAadlV3.g:2390:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2394:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2395:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2395:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2396:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // InternalAadlV3.g:2414:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAadlV3.g:2415:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
    // InternalAadlV3.g:2431:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2431:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2432:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2438:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2444:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2445:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2445:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2446:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2446:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2447:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2447:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2448:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2459:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) && (synpred1_InternalAadlV3())) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAadlV3.g:2460:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2471:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2472:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2472:5: ()
            	    // InternalAadlV3.g:2473:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2483:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2484:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2484:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2485:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalAadlV3.g:2502:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2502:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2503:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2509:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ruleSEMICOLON ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2515:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ruleSEMICOLON ) )
            // InternalAadlV3.g:2516:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ruleSEMICOLON )
            {
            // InternalAadlV3.g:2516:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ruleSEMICOLON )
            // InternalAadlV3.g:2517:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ruleSEMICOLON
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2521:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalAadlV3.g:2522:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:2522:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:2523:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:2523:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:2524:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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
                    // InternalAadlV3.g:2542:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:2542:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:2543:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2543:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:2544:6: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

            // InternalAadlV3.g:2562:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAadlV3.g:2563:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:2567:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalAadlV3.g:2568:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalAadlV3.g:2568:5: (lv_alias_4_0= RULE_ID )
                    // InternalAadlV3.g:2569:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImportAccess().getSEMICOLONParserRuleCall_3());
              		
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
    // InternalAadlV3.g:2597:1: entryRuleConfigurationAssignment returns [EObject current=null] : iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF ;
    public final EObject entryRuleConfigurationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignment = null;


        try {
            // InternalAadlV3.g:2597:64: (iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF )
            // InternalAadlV3.g:2598:2: iv_ruleConfigurationAssignment= ruleConfigurationAssignment EOF
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
    // InternalAadlV3.g:2604:1: ruleConfigurationAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) ;
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
            // InternalAadlV3.g:2610:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) )
            // InternalAadlV3.g:2611:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            {
            // InternalAadlV3.g:2611:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            // InternalAadlV3.g:2612:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            {
            // InternalAadlV3.g:2612:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2613:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2613:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2614:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            otherlv_1=(Token)match(input,32,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2635:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==19) ) {
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
                    // InternalAadlV3.g:2636:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2636:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2637:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2637:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2638:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2638:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2639:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalAadlV3.g:2656:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==17) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAadlV3.g:2657:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2661:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2662:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2662:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2663:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop49;
                        }
                    } while (true);

                    // InternalAadlV3.g:2681:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==19) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAadlV3.g:2682:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:2696:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:2712:1: entryRuleConfigurationAssignmentPattern returns [EObject current=null] : iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF ;
    public final EObject entryRuleConfigurationAssignmentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAssignmentPattern = null;


        try {
            // InternalAadlV3.g:2712:71: (iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF )
            // InternalAadlV3.g:2713:2: iv_ruleConfigurationAssignmentPattern= ruleConfigurationAssignmentPattern EOF
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
    // InternalAadlV3.g:2719:1: ruleConfigurationAssignmentPattern returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) ;
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
            // InternalAadlV3.g:2725:2: ( ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) ) )
            // InternalAadlV3.g:2726:2: ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            {
            // InternalAadlV3.g:2726:2: ( ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) )
            // InternalAadlV3.g:2727:3: ( ( ruleQualifiedTypesReference ) ) otherlv_1= '*=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            {
            // InternalAadlV3.g:2727:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:2728:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:2728:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:2729:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getTargetPatternTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentPatternAccess().getAsteriskEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2747:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==19) ) {
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
                    // InternalAadlV3.g:2748:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2748:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2749:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2749:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2750:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2750:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2751:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalAadlV3.g:2768:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==17) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalAadlV3.g:2769:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2773:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2774:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2774:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2775:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop52;
                        }
                    } while (true);

                    // InternalAadlV3.g:2793:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==19) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAadlV3.g:2794:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:2808:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:2824:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2824:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2825:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2831:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ) ;
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
            // InternalAadlV3.g:2837:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* ) )
            // InternalAadlV3.g:2838:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* )
            {
            // InternalAadlV3.g:2838:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* )
            // InternalAadlV3.g:2839:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            {
            // InternalAadlV3.g:2839:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2840:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2840:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2841:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            otherlv_1=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2866:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2867:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2867:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2868:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            // InternalAadlV3.g:2885:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==26) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:2886:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2890:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2891:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2891:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2892:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:2914:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:2914:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:2915:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:2921:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyAssociationType_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2927:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) ) )
            // InternalAadlV3.g:2928:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) )
            {
            // InternalAadlV3.g:2928:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) ) )
            // InternalAadlV3.g:2929:3: ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )? otherlv_4= '=>' ( (lv_value_5_0= rulePropertyValue ) )
            {
            // InternalAadlV3.g:2929:3: ( (lv_target_0_0= ruleModelElementReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAadlV3.g:2930:4: (lv_target_0_0= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:2930:4: (lv_target_0_0= ruleModelElementReference )
                    // InternalAadlV3.g:2931:5: lv_target_0_0= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_48);
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

            otherlv_1=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2952:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2953:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2953:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2954:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2968:3: ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=62 && LA57_0<=64)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAadlV3.g:2969:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
                    {
                    // InternalAadlV3.g:2969:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
                    // InternalAadlV3.g:2970:5: lv_propertyAssociationType_3_0= rulePropertyAssociationType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_43);
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

            otherlv_4=(Token)match(input,32,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2991:3: ( (lv_value_5_0= rulePropertyValue ) )
            // InternalAadlV3.g:2992:4: (lv_value_5_0= rulePropertyValue )
            {
            // InternalAadlV3.g:2992:4: (lv_value_5_0= rulePropertyValue )
            // InternalAadlV3.g:2993:5: lv_value_5_0= rulePropertyValue
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
    // InternalAadlV3.g:3014:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:3014:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:3015:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalAadlV3.g:3021:1: rulePropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3027:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:3028:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:3028:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? )
            // InternalAadlV3.g:3029:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:3029:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:3030:4: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:3030:4: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:3031:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0_0());
              				
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

            // InternalAadlV3.g:3047:3: ( (lv_unit_1_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3048:4: (lv_unit_1_0= RULE_ID )
                    {
                    // InternalAadlV3.g:3048:4: (lv_unit_1_0= RULE_ID )
                    // InternalAadlV3.g:3049:5: lv_unit_1_0= RULE_ID
                    {
                    lv_unit_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_unit_1_0, grammarAccess.getPropertyValueAccess().getUnitIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertyValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"unit",
                      						lv_unit_1_0,
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleModelElementReference"
    // InternalAadlV3.g:3069:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:3069:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:3070:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:3076:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3082:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:3083:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:3083:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:3084:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:3084:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:3085:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:3085:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:3086:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:3097:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==29) && (synpred2_InternalAadlV3())) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAadlV3.g:3098:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:3109:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:3110:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:3110:5: ()
            	    // InternalAadlV3.g:3111:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:3121:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:3122:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:3122:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:3123:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalAadlV3.g:3141:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ConfigurationElement_1 = null;

        EObject this_ConfigurationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3147:2: ( ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' ) )
            // InternalAadlV3.g:3148:2: ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            {
            // InternalAadlV3.g:3148:2: ( (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end' )
            // InternalAadlV3.g:3149:3: (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )? otherlv_5= 'end'
            {
            // InternalAadlV3.g:3149:3: (otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==24) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAadlV3.g:3150:4: otherlv_0= 'is' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
                      				}
                      				newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_ConfigurationElement_1=ruleConfigurationElement(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationElement_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAadlV3.g:3165:4: ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==42) ) {
                            int LA60_1 = input.LA(2);

                            if ( (LA60_1==RULE_ID||LA60_1==35) ) {
                                alt60=1;
                            }


                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalAadlV3.g:3166:5: ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_0_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop60;
                        }
                    } while (true);

                    // InternalAadlV3.g:3185:4: ( ruleSEMICOLON )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==42) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAadlV3.g:3186:5: ruleSEMICOLON
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_0_3());
                              				
                            }
                            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3204:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_ConfigurationElement_1 = null;

        EObject this_ConfigurationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3210:2: ( (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3211:2: (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3211:2: (otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3212:3: otherlv_0= '{' this_ConfigurationElement_1= ruleConfigurationElement[$current] ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_25); if (state.failed) return current;
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
            // InternalAadlV3.g:3227:3: ( ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current] )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==42) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==RULE_ID||LA63_1==35) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalAadlV3.g:3228:4: ruleSEMICOLON this_ConfigurationElement_3= ruleConfigurationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop63;
                }
            } while (true);

            // InternalAadlV3.g:3247:3: ( ruleSEMICOLON )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:3248:4: ruleSEMICOLON
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3265:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_propertyAssociations_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_configurationAssignments_2_0 = null;

        EObject lv_configurationAssignments_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3271:2: ( ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) ) ) )
            // InternalAadlV3.g:3272:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) ) )
            {
            // InternalAadlV3.g:3272:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) ) )
            int alt65=4;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:3273:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3273:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3274:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3274:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3275:5: lv_propertyAssociations_0_0= rulePropertyAssociation
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
                    // InternalAadlV3.g:3293:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3293:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:3294:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3294:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:3295:5: lv_bindings_1_0= ruleBinding
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
                    // InternalAadlV3.g:3313:3: ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) )
                    {
                    // InternalAadlV3.g:3313:3: ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) )
                    // InternalAadlV3.g:3314:4: (lv_configurationAssignments_2_0= ruleConfigurationAssignment )
                    {
                    // InternalAadlV3.g:3314:4: (lv_configurationAssignments_2_0= ruleConfigurationAssignment )
                    // InternalAadlV3.g:3315:5: lv_configurationAssignments_2_0= ruleConfigurationAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_2_0=ruleConfigurationAssignment();

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
                      						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3333:3: ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:3333:3: ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) )
                    // InternalAadlV3.g:3334:4: (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern )
                    {
                    // InternalAadlV3.g:3334:4: (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern )
                    // InternalAadlV3.g:3335:5: lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_configurationAssignments_3_0=ruleConfigurationAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"configurationAssignments",
                      						lv_configurationAssignments_3_0,
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
    // InternalAadlV3.g:3357:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3363:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3364:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3364:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3365:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3365:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3366:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3366:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3367:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,36,FOLLOW_54); if (state.failed) return current;
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

            // InternalAadlV3.g:3379:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAadlV3.g:3380:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3380:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3381:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3381:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3382:6: lv_parameters_1_0= ruleConfigurationParameter
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

                    // InternalAadlV3.g:3399:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==17) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAadlV3.g:3400:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3404:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3405:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3405:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3406:7: lv_parameters_3_0= ruleConfigurationParameter
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3433:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3433:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3434:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:3440:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3446:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3447:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3447:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3448:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3448:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3449:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3449:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3450:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:3470:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3471:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3471:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3472:5: ruleQualifiedName
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
    // InternalAadlV3.g:3490:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:3490:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:3491:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:3497:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3503:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3504:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3504:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3505:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3505:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==38) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAadlV3.g:3506:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3506:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3507:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
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

            // InternalAadlV3.g:3519:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3520:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3520:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3521:5: ruleQualifiedReference
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


    // $ANTLR start "entryRuleReversableTypeReference"
    // InternalAadlV3.g:3539:1: entryRuleReversableTypeReference returns [EObject current=null] : iv_ruleReversableTypeReference= ruleReversableTypeReference EOF ;
    public final EObject entryRuleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableTypeReference = null;


        try {
            // InternalAadlV3.g:3539:64: (iv_ruleReversableTypeReference= ruleReversableTypeReference EOF )
            // InternalAadlV3.g:3540:2: iv_ruleReversableTypeReference= ruleReversableTypeReference EOF
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
    // InternalAadlV3.g:3546:1: ruleReversableTypeReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3552:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3553:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3553:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3554:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3554:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAadlV3.g:3555:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3555:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3556:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
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

            // InternalAadlV3.g:3568:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3569:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3569:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3570:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeCrossReference_1_0());
              				
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalAadlV3.g:3588:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3588:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3589:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:3595:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3601:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3602:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3602:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3603:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3603:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3604:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3604:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3605:5: ruleQualifiedTypesReference
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

            // InternalAadlV3.g:3619:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==36) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAadlV3.g:3620:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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
    // InternalAadlV3.g:3636:1: entryRuleRealizationReference returns [EObject current=null] : iv_ruleRealizationReference= ruleRealizationReference EOF ;
    public final EObject entryRuleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealizationReference = null;


        try {
            // InternalAadlV3.g:3636:61: (iv_ruleRealizationReference= ruleRealizationReference EOF )
            // InternalAadlV3.g:3637:2: iv_ruleRealizationReference= ruleRealizationReference EOF
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
    // InternalAadlV3.g:3643:1: ruleRealizationReference returns [EObject current=null] : ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleRealizationReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3649:2: ( ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3650:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3650:2: ( ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3651:3: ( ( ruleQualifiedDottedReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3651:3: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3652:4: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3652:4: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3653:5: ruleQualifiedDottedReference
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

            // InternalAadlV3.g:3667:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==36) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAadlV3.g:3668:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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
    // InternalAadlV3.g:3684:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:3684:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:3685:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:3691:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3697:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:3698:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:3698:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3699:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3699:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3700:4: ruleQualifiedDottedReference
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
    // InternalAadlV3.g:3718:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_propertyAssociations_1_0 = null;

        EObject lv_propertyAssociations_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3724:2: ( (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3725:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3725:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3726:3: otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) ) ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3730:3: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )
            // InternalAadlV3.g:3731:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            {
            // InternalAadlV3.g:3731:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            // InternalAadlV3.g:3732:5: lv_propertyAssociations_1_0= rulePropertyAssociation
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

            // InternalAadlV3.g:3749:3: ( ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==42) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==RULE_ID||LA72_1==35) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // InternalAadlV3.g:3750:4: ruleSEMICOLON ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getPropertiesBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_25);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalAadlV3.g:3757:4: ( (lv_propertyAssociations_3_0= rulePropertyAssociation ) )
            	    // InternalAadlV3.g:3758:5: (lv_propertyAssociations_3_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3758:5: (lv_propertyAssociations_3_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3759:6: lv_propertyAssociations_3_0= rulePropertyAssociation
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
            	    break loop72;
                }
            } while (true);

            // InternalAadlV3.g:3777:3: ( ruleSEMICOLON )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==42) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAadlV3.g:3778:4: ruleSEMICOLON
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3795:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_NestedImplementationElement_1 = null;

        EObject this_NestedImplementationElement_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3801:2: ( (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' ) )
            // InternalAadlV3.g:3802:2: (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            {
            // InternalAadlV3.g:3802:2: (otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}' )
            // InternalAadlV3.g:3803:3: otherlv_0= '{' this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )* ( ruleSEMICOLON )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_25); if (state.failed) return current;
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
            // InternalAadlV3.g:3818:3: ( ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current] )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==42) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==RULE_ID||LA74_1==35) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // InternalAadlV3.g:3819:4: ruleSEMICOLON this_NestedImplementationElement_3= ruleNestedImplementationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getSEMICOLONParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop74;
                }
            } while (true);

            // InternalAadlV3.g:3838:3: ( ruleSEMICOLON )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==42) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAadlV3.g:3839:4: ruleSEMICOLON
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3856:1: ruleNestedImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureDelegate ) ) | ( (lv_bindings_3_0= ruleBinding ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleNestedImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_connections_2_0 = null;

        EObject lv_bindings_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_propertyAssociations_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3862:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureDelegate ) ) | ( (lv_bindings_3_0= ruleBinding ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:3863:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureDelegate ) ) | ( (lv_bindings_3_0= ruleBinding ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:3863:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureDelegate ) ) | ( (lv_bindings_3_0= ruleBinding ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )
            int alt76=6;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalAadlV3.g:3864:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:3864:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:3865:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:3865:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:3866:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:3884:3: ( (lv_connections_1_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:3884:3: ( (lv_connections_1_0= ruleConnection ) )
                    // InternalAadlV3.g:3885:4: (lv_connections_1_0= ruleConnection )
                    {
                    // InternalAadlV3.g:3885:4: (lv_connections_1_0= ruleConnection )
                    // InternalAadlV3.g:3886:5: lv_connections_1_0= ruleConnection
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
                    // InternalAadlV3.g:3904:3: ( (lv_connections_2_0= ruleFeatureDelegate ) )
                    {
                    // InternalAadlV3.g:3904:3: ( (lv_connections_2_0= ruleFeatureDelegate ) )
                    // InternalAadlV3.g:3905:4: (lv_connections_2_0= ruleFeatureDelegate )
                    {
                    // InternalAadlV3.g:3905:4: (lv_connections_2_0= ruleFeatureDelegate )
                    // InternalAadlV3.g:3906:5: lv_connections_2_0= ruleFeatureDelegate
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getConnectionsFeatureDelegateParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_2_0=ruleFeatureDelegate();

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
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureDelegate");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3924:3: ( (lv_bindings_3_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3924:3: ( (lv_bindings_3_0= ruleBinding ) )
                    // InternalAadlV3.g:3925:4: (lv_bindings_3_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3925:4: (lv_bindings_3_0= ruleBinding )
                    // InternalAadlV3.g:3926:5: lv_bindings_3_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bindings_3_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"bindings",
                      						lv_bindings_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Binding");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3944:3: ( (lv_components_4_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:3944:3: ( (lv_components_4_0= ruleComponent ) )
                    // InternalAadlV3.g:3945:4: (lv_components_4_0= ruleComponent )
                    {
                    // InternalAadlV3.g:3945:4: (lv_components_4_0= ruleComponent )
                    // InternalAadlV3.g:3946:5: lv_components_4_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_4_0=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
                case 6 :
                    // InternalAadlV3.g:3964:3: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3964:3: ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3965:4: (lv_propertyAssociations_5_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3965:4: (lv_propertyAssociations_5_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3966:5: lv_propertyAssociations_5_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_propertyAssociations_5_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:3988:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3994:2: ( ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* ) )
            // InternalAadlV3.g:3995:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            {
            // InternalAadlV3.g:3995:2: ( ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )* )
            // InternalAadlV3.g:3996:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            {
            // InternalAadlV3.g:3996:3: ( (lv_superClassifiers_0_0= ruleRealizationReference ) )
            // InternalAadlV3.g:3997:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            {
            // InternalAadlV3.g:3997:4: (lv_superClassifiers_0_0= ruleRealizationReference )
            // InternalAadlV3.g:3998:5: lv_superClassifiers_0_0= ruleRealizationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalAadlV3.g:4015:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==17) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalAadlV3.g:4016:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4020:4: ( (lv_superClassifiers_2_0= ruleRealizationReference ) )
            	    // InternalAadlV3.g:4021:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    {
            	    // InternalAadlV3.g:4021:5: (lv_superClassifiers_2_0= ruleRealizationReference )
            	    // InternalAadlV3.g:4022:6: lv_superClassifiers_2_0= ruleRealizationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleConfigurationExtensions"


    // $ANTLR start "ruleImplementationExtensions"
    // InternalAadlV3.g:4045:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4051:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:4052:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:4052:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:4053:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:4053:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:4054:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:4054:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:4055:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalAadlV3.g:4072:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==17) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalAadlV3.g:4073:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4077:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:4078:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:4078:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:4079:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop78;
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
    // InternalAadlV3.g:4102:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4108:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:4109:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:4109:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:4110:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:4110:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:4111:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:4111:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:4112:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalAadlV3.g:4129:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==17) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalAadlV3.g:4130:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4134:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:4135:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:4135:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:4136:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop79;
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
    // InternalAadlV3.g:4159:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4165:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:4166:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:4166:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:4167:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:4171:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAadlV3.g:4172:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:4172:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:4173:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:4173:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:4174:6: lv_actuals_1_0= ruleConfigurationActual
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

                    // InternalAadlV3.g:4191:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==17) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalAadlV3.g:4192:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:4196:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:4197:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:4197:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:4198:7: lv_actuals_3_0= ruleConfigurationActual
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
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4225:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:4225:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:4226:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:4232:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4238:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:4239:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4239:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:4240:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:4240:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:4241:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:4241:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:4242:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:4257:3: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:4258:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4258:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            // InternalAadlV3.g:4259:5: lv_assignedClassifiers_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            // InternalAadlV3.g:4276:3: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==17) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==RULE_ID) ) {
                        int LA82_3 = input.LA(3);

                        if ( (LA82_3==EOF||LA82_3==17||LA82_3==29||(LA82_3>=36 && LA82_3<=37)||LA82_3==41) ) {
                            alt82=1;
                        }


                    }


                }


                switch (alt82) {
            	case 1 :
            	    // InternalAadlV3.g:4277:4: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4281:4: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:4282:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:4282:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    // InternalAadlV3.g:4283:6: lv_assignedClassifiers_4_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleConfigurationActual"


    // $ANTLR start "entryRuleWorkingset"
    // InternalAadlV3.g:4305:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:4305:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:4306:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:4312:1: ruleWorkingset returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_9= 'end' ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_UseProps_4 = null;

        EObject lv_rootComponents_5_0 = null;

        EObject lv_rootComponents_7_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4318:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_9= 'end' ) )
            // InternalAadlV3.g:4319:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_9= 'end' )
            {
            // InternalAadlV3.g:4319:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_9= 'end' )
            // InternalAadlV3.g:4320:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) ) ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )* ( ruleSEMICOLON )? otherlv_9= 'end'
            {
            // InternalAadlV3.g:4320:3: ( (lv_private_0_0= 'private' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==11) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAadlV3.g:4321:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:4321:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:4322:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_58); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1());
              		
            }
            // InternalAadlV3.g:4338:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:4339:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:4339:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:4340:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            otherlv_3=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWorkingsetAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:4361:3: (this_UseProps_4= ruleUseProps[$current] )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==28) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAadlV3.g:4362:4: this_UseProps_4= ruleUseProps[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getWorkingsetRule());
                      				}
                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_4);
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

            // InternalAadlV3.g:4374:3: ( (lv_rootComponents_5_0= ruleComponent ) )
            // InternalAadlV3.g:4375:4: (lv_rootComponents_5_0= ruleComponent )
            {
            // InternalAadlV3.g:4375:4: (lv_rootComponents_5_0= ruleComponent )
            // InternalAadlV3.g:4376:5: lv_rootComponents_5_0= ruleComponent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_rootComponents_5_0=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
              					}
              					add(
              						current,
              						"rootComponents",
              						lv_rootComponents_5_0,
              						"org.osate.xtext.aadlv3.AadlV3.Component");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4393:3: ( ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==42) ) {
                    int LA85_1 = input.LA(2);

                    if ( (LA85_1==RULE_ID) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // InternalAadlV3.g:4394:4: ruleSEMICOLON ( (lv_rootComponents_7_0= ruleComponent ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_6_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruleSEMICOLON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalAadlV3.g:4401:4: ( (lv_rootComponents_7_0= ruleComponent ) )
            	    // InternalAadlV3.g:4402:5: (lv_rootComponents_7_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:4402:5: (lv_rootComponents_7_0= ruleComponent )
            	    // InternalAadlV3.g:4403:6: lv_rootComponents_7_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_rootComponents_7_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWorkingsetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"rootComponents",
            	      							lv_rootComponents_7_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Component");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // InternalAadlV3.g:4421:3: ( ruleSEMICOLON )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==42) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAadlV3.g:4422:4: ruleSEMICOLON
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    ruleSEMICOLON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getWorkingsetAccess().getEndKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:4438:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:4438:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:4439:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:4445:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4451:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:4452:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:4452:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:4453:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
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
    // InternalAadlV3.g:4472:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:4472:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:4473:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:4479:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4485:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4486:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4486:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4487:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4510:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:4510:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:4511:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:4517:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4523:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:4524:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:4524:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:4525:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:4532:3: (kw= '::' this_ID_2= RULE_ID )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==41) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAadlV3.g:4533:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // InternalAadlV3.g:4550:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:4550:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:4551:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
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
    // InternalAadlV3.g:4557:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4563:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:4564:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:4564:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:4565:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:4575:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==29) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAadlV3.g:4576:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4593:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:4593:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:4594:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
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
    // InternalAadlV3.g:4600:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4606:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:4607:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalAadlV3.g:4620:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:4620:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:4621:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
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
    // InternalAadlV3.g:4627:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4633:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4634:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4634:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4635:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4661:1: entryRuleSEMICOLON returns [String current=null] : iv_ruleSEMICOLON= ruleSEMICOLON EOF ;
    public final String entryRuleSEMICOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMICOLON = null;


        try {
            // InternalAadlV3.g:4661:49: (iv_ruleSEMICOLON= ruleSEMICOLON EOF )
            // InternalAadlV3.g:4662:2: iv_ruleSEMICOLON= ruleSEMICOLON EOF
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
    // InternalAadlV3.g:4668:1: ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMICOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4674:2: (kw= ';' )
            // InternalAadlV3.g:4675:2: kw= ';'
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
    // InternalAadlV3.g:4683:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:4683:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:4684:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:4690:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:4696:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:4697:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:4697:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt89=16;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // InternalAadlV3.g:4698:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4704:3: kw= 'bus'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4710:3: kw= 'data'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4716:3: kw= 'device'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4722:3: kw= 'memory'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4728:3: kw= 'process'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:4734:3: kw= 'processor'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:4740:3: kw= 'system'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:4746:3: kw= 'thread'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4752:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:4763:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:4774:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:4785:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:4796:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:4802:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:4813:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:4827:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:4827:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:4828:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:4834:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | this_DataAccessKeywords_2= ruleDataAccessKeywords | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords | this_BindingPointKeywords_7= ruleBindingPointKeywords | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataAccessKeywords_2 = null;

        AntlrDatatypeRuleToken this_BusAccessKeywords_3 = null;

        AntlrDatatypeRuleToken this_VirtualBusAccessKeywords_4 = null;

        AntlrDatatypeRuleToken this_SubprogramAccessKeywords_5 = null;

        AntlrDatatypeRuleToken this_SubprogramGroupAccessKeywords_6 = null;

        AntlrDatatypeRuleToken this_BindingPointKeywords_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4840:2: ( (kw= 'feature' | kw= 'port' | this_DataAccessKeywords_2= ruleDataAccessKeywords | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords | this_BindingPointKeywords_7= ruleBindingPointKeywords | kw= 'interface' ) )
            // InternalAadlV3.g:4841:2: (kw= 'feature' | kw= 'port' | this_DataAccessKeywords_2= ruleDataAccessKeywords | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords | this_BindingPointKeywords_7= ruleBindingPointKeywords | kw= 'interface' )
            {
            // InternalAadlV3.g:4841:2: (kw= 'feature' | kw= 'port' | this_DataAccessKeywords_2= ruleDataAccessKeywords | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords | this_BindingPointKeywords_7= ruleBindingPointKeywords | kw= 'interface' )
            int alt90=9;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalAadlV3.g:4842:3: kw= 'feature'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4848:3: kw= 'port'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4854:3: this_DataAccessKeywords_2= ruleDataAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataAccessKeywords_2=ruleDataAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DataAccessKeywords_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4865:3: this_BusAccessKeywords_3= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:4876:3: this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualBusAccessKeywords_4=ruleVirtualBusAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualBusAccessKeywords_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4887:3: this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubprogramAccessKeywords_5=ruleSubprogramAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SubprogramAccessKeywords_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:4898:3: this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubprogramGroupAccessKeywords_6=ruleSubprogramGroupAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SubprogramGroupAccessKeywords_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:4909:3: this_BindingPointKeywords_7= ruleBindingPointKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBindingPointKeywordsParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BindingPointKeywords_7=ruleBindingPointKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BindingPointKeywords_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:4920:3: kw= 'interface'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_8());
                      		
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
    // InternalAadlV3.g:4929:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:4929:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:4930:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:4936:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:4942:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:4943:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:4943:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt91=11;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalAadlV3.g:4944:3: kw= 'in'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4950:3: kw= 'out'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4956:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:4967:3: kw= 'requires'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4973:3: kw= 'provides'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4979:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:4990:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:5001:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:5012:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:5023:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:5034:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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
    // InternalAadlV3.g:5048:1: entryRuleAssociationType returns [String current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final String entryRuleAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationType = null;


        try {
            // InternalAadlV3.g:5048:55: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalAadlV3.g:5049:2: iv_ruleAssociationType= ruleAssociationType EOF
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
    // InternalAadlV3.g:5055:1: ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConnectionType_0= ruleConnectionType | this_BindingType_1= ruleBindingType | this_DelegateType_2= ruleDelegateType | this_FlowType_3= ruleFlowType ) ;
    public final AntlrDatatypeRuleToken ruleAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConnectionType_0 = null;

        AntlrDatatypeRuleToken this_BindingType_1 = null;

        AntlrDatatypeRuleToken this_DelegateType_2 = null;

        AntlrDatatypeRuleToken this_FlowType_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5061:2: ( (this_ConnectionType_0= ruleConnectionType | this_BindingType_1= ruleBindingType | this_DelegateType_2= ruleDelegateType | this_FlowType_3= ruleFlowType ) )
            // InternalAadlV3.g:5062:2: (this_ConnectionType_0= ruleConnectionType | this_BindingType_1= ruleBindingType | this_DelegateType_2= ruleDelegateType | this_FlowType_3= ruleFlowType )
            {
            // InternalAadlV3.g:5062:2: (this_ConnectionType_0= ruleConnectionType | this_BindingType_1= ruleBindingType | this_DelegateType_2= ruleDelegateType | this_FlowType_3= ruleFlowType )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt92=1;
                }
                break;
            case 60:
                {
                alt92=2;
                }
                break;
            case 61:
                {
                alt92=3;
                }
                break;
            case 34:
                {
                alt92=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalAadlV3.g:5063:3: this_ConnectionType_0= ruleConnectionType
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
                    // InternalAadlV3.g:5074:3: this_BindingType_1= ruleBindingType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getBindingTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BindingType_1=ruleBindingType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BindingType_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5085:3: this_DelegateType_2= ruleDelegateType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getDelegateTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DelegateType_2=ruleDelegateType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DelegateType_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:5096:3: this_FlowType_3= ruleFlowType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getFlowTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowType_3=ruleFlowType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FlowType_3);
                      		
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
    // InternalAadlV3.g:5110:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalAadlV3.g:5110:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalAadlV3.g:5111:2: iv_ruleConnectionType= ruleConnectionType EOF
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
    // InternalAadlV3.g:5117:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'connection' ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5123:2: (kw= 'connection' )
            // InternalAadlV3.g:5124:2: kw= 'connection'
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getConnectionKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleBindingType"
    // InternalAadlV3.g:5132:1: entryRuleBindingType returns [String current=null] : iv_ruleBindingType= ruleBindingType EOF ;
    public final String entryRuleBindingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindingType = null;


        try {
            // InternalAadlV3.g:5132:51: (iv_ruleBindingType= ruleBindingType EOF )
            // InternalAadlV3.g:5133:2: iv_ruleBindingType= ruleBindingType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindingType=ruleBindingType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingType"


    // $ANTLR start "ruleBindingType"
    // InternalAadlV3.g:5139:1: ruleBindingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'binding' ;
    public final AntlrDatatypeRuleToken ruleBindingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5145:2: (kw= 'binding' )
            // InternalAadlV3.g:5146:2: kw= 'binding'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getBindingTypeAccess().getBindingKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingType"


    // $ANTLR start "entryRuleDelegateType"
    // InternalAadlV3.g:5154:1: entryRuleDelegateType returns [String current=null] : iv_ruleDelegateType= ruleDelegateType EOF ;
    public final String entryRuleDelegateType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDelegateType = null;


        try {
            // InternalAadlV3.g:5154:52: (iv_ruleDelegateType= ruleDelegateType EOF )
            // InternalAadlV3.g:5155:2: iv_ruleDelegateType= ruleDelegateType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDelegateTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDelegateType=ruleDelegateType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelegateType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegateType"


    // $ANTLR start "ruleDelegateType"
    // InternalAadlV3.g:5161:1: ruleDelegateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'delegate' ;
    public final AntlrDatatypeRuleToken ruleDelegateType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5167:2: (kw= 'delegate' )
            // InternalAadlV3.g:5168:2: kw= 'delegate'
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDelegateTypeAccess().getDelegateKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegateType"


    // $ANTLR start "entryRuleFlowPathType"
    // InternalAadlV3.g:5176:1: entryRuleFlowPathType returns [String current=null] : iv_ruleFlowPathType= ruleFlowPathType EOF ;
    public final String entryRuleFlowPathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathType = null;


        try {
            // InternalAadlV3.g:5176:52: (iv_ruleFlowPathType= ruleFlowPathType EOF )
            // InternalAadlV3.g:5177:2: iv_ruleFlowPathType= ruleFlowPathType EOF
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
    // InternalAadlV3.g:5183:1: ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowPathKeywords_0= ruleFlowPathKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowPathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowPathKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5189:2: (this_FlowPathKeywords_0= ruleFlowPathKeywords )
            // InternalAadlV3.g:5190:2: this_FlowPathKeywords_0= ruleFlowPathKeywords
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
    // InternalAadlV3.g:5203:1: entryRuleFlowSourceType returns [String current=null] : iv_ruleFlowSourceType= ruleFlowSourceType EOF ;
    public final String entryRuleFlowSourceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceType = null;


        try {
            // InternalAadlV3.g:5203:54: (iv_ruleFlowSourceType= ruleFlowSourceType EOF )
            // InternalAadlV3.g:5204:2: iv_ruleFlowSourceType= ruleFlowSourceType EOF
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
    // InternalAadlV3.g:5210:1: ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSourceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5216:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:5217:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
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
    // InternalAadlV3.g:5230:1: entryRuleFlowSinkType returns [String current=null] : iv_ruleFlowSinkType= ruleFlowSinkType EOF ;
    public final String entryRuleFlowSinkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkType = null;


        try {
            // InternalAadlV3.g:5230:52: (iv_ruleFlowSinkType= ruleFlowSinkType EOF )
            // InternalAadlV3.g:5231:2: iv_ruleFlowSinkType= ruleFlowSinkType EOF
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
    // InternalAadlV3.g:5237:1: ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleFlowSinkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5243:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:5244:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
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
    // InternalAadlV3.g:5257:1: entryRuleFlowType returns [String current=null] : iv_ruleFlowType= ruleFlowType EOF ;
    public final String entryRuleFlowType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowType = null;


        try {
            // InternalAadlV3.g:5257:48: (iv_ruleFlowType= ruleFlowType EOF )
            // InternalAadlV3.g:5258:2: iv_ruleFlowType= ruleFlowType EOF
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
    // InternalAadlV3.g:5264:1: ruleFlowType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'flow' ;
    public final AntlrDatatypeRuleToken ruleFlowType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5270:2: (kw= 'flow' )
            // InternalAadlV3.g:5271:2: kw= 'flow'
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5279:1: entryRulePropertyAssociationType returns [String current=null] : iv_rulePropertyAssociationType= rulePropertyAssociationType EOF ;
    public final String entryRulePropertyAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAssociationType = null;


        try {
            // InternalAadlV3.g:5279:63: (iv_rulePropertyAssociationType= rulePropertyAssociationType EOF )
            // InternalAadlV3.g:5280:2: iv_rulePropertyAssociationType= rulePropertyAssociationType EOF
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
    // InternalAadlV3.g:5286:1: rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'final' | kw= 'default' | kw= 'override' ) ;
    public final AntlrDatatypeRuleToken rulePropertyAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5292:2: ( (kw= 'final' | kw= 'default' | kw= 'override' ) )
            // InternalAadlV3.g:5293:2: (kw= 'final' | kw= 'default' | kw= 'override' )
            {
            // InternalAadlV3.g:5293:2: (kw= 'final' | kw= 'default' | kw= 'override' )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt93=1;
                }
                break;
            case 63:
                {
                alt93=2;
                }
                break;
            case 64:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalAadlV3.g:5294:3: kw= 'final'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getFinalKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5300:3: kw= 'default'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getDefaultKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5306:3: kw= 'override'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5315:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:5315:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:5316:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:5322:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5328:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:5329:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:5329:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:5330:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,65,FOLLOW_63); if (state.failed) return current;
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
    // InternalAadlV3.g:5344:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:5344:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:5345:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:5351:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5357:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:5358:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:5358:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:5359:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,65,FOLLOW_64); if (state.failed) return current;
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
    // InternalAadlV3.g:5373:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:5373:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:5374:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:5380:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5386:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:5387:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:5387:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:5388:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,65,FOLLOW_65); if (state.failed) return current;
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
    // InternalAadlV3.g:5402:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:5402:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:5403:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:5409:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5415:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:5416:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:5416:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:5417:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,65,FOLLOW_66); if (state.failed) return current;
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
    // InternalAadlV3.g:5431:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:5431:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:5432:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:5438:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5444:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:5445:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:5445:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:5446:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,51,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5460:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:5460:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:5461:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:5467:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5473:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:5474:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:5474:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:5475:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,52,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5489:1: entryRuleEndToEndFlowKeywords returns [String current=null] : iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF ;
    public final String entryRuleEndToEndFlowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFlowKeywords = null;


        try {
            // InternalAadlV3.g:5489:60: (iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF )
            // InternalAadlV3.g:5490:2: iv_ruleEndToEndFlowKeywords= ruleEndToEndFlowKeywords EOF
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
    // InternalAadlV3.g:5496:1: ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFlowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5502:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:5503:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:5503:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:5504:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,13,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,13,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5528:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:5528:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:5529:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:5535:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5541:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:5542:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:5542:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:5543:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,34,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5557:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:5557:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:5558:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:5564:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5570:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:5571:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:5571:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:5572:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,34,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5586:1: entryRuleFlowPathKeywords returns [String current=null] : iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF ;
    public final String entryRuleFlowPathKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowPathKeywords = null;


        try {
            // InternalAadlV3.g:5586:56: (iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF )
            // InternalAadlV3.g:5587:2: iv_ruleFlowPathKeywords= ruleFlowPathKeywords EOF
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
    // InternalAadlV3.g:5593:1: ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'path' ) ;
    public final AntlrDatatypeRuleToken ruleFlowPathKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5599:2: ( (kw= 'flow' kw= 'path' ) )
            // InternalAadlV3.g:5600:2: (kw= 'flow' kw= 'path' )
            {
            // InternalAadlV3.g:5600:2: (kw= 'flow' kw= 'path' )
            // InternalAadlV3.g:5601:3: kw= 'flow' kw= 'path'
            {
            kw=(Token)match(input,34,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5615:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:5615:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:5616:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:5622:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5628:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5629:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5629:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5630:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,55,FOLLOW_72); if (state.failed) return current;
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
    // InternalAadlV3.g:5644:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:5644:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:5645:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:5651:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5657:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:5658:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:5658:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:5659:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,44,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5673:1: entryRuleVirtualBusAccessKeywords returns [String current=null] : iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF ;
    public final String entryRuleVirtualBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:5673:64: (iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF )
            // InternalAadlV3.g:5674:2: iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF
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
    // InternalAadlV3.g:5680:1: ruleVirtualBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5686:2: ( (kw= 'virtual' kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:5687:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:5687:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:5688:3: kw= 'virtual' kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,65,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,44,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5707:1: entryRuleDataAccessKeywords returns [String current=null] : iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF ;
    public final String entryRuleDataAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataAccessKeywords = null;


        try {
            // InternalAadlV3.g:5707:58: (iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF )
            // InternalAadlV3.g:5708:2: iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF
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
    // InternalAadlV3.g:5714:1: ruleDataAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'data' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleDataAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5720:2: ( (kw= 'data' kw= 'access' ) )
            // InternalAadlV3.g:5721:2: (kw= 'data' kw= 'access' )
            {
            // InternalAadlV3.g:5721:2: (kw= 'data' kw= 'access' )
            // InternalAadlV3.g:5722:3: kw= 'data' kw= 'access'
            {
            kw=(Token)match(input,45,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5736:1: entryRuleSubprogramAccessKeywords returns [String current=null] : iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF ;
    public final String entryRuleSubprogramAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramAccessKeywords = null;


        try {
            // InternalAadlV3.g:5736:64: (iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF )
            // InternalAadlV3.g:5737:2: iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF
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
    // InternalAadlV3.g:5743:1: ruleSubprogramAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5749:2: ( (kw= 'subprogram' kw= 'access' ) )
            // InternalAadlV3.g:5750:2: (kw= 'subprogram' kw= 'access' )
            {
            // InternalAadlV3.g:5750:2: (kw= 'subprogram' kw= 'access' )
            // InternalAadlV3.g:5751:3: kw= 'subprogram' kw= 'access'
            {
            kw=(Token)match(input,52,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5765:1: entryRuleSubprogramGroupAccessKeywords returns [String current=null] : iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF ;
    public final String entryRuleSubprogramGroupAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupAccessKeywords = null;


        try {
            // InternalAadlV3.g:5765:69: (iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF )
            // InternalAadlV3.g:5766:2: iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF
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
    // InternalAadlV3.g:5772:1: ruleSubprogramGroupAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5778:2: ( (kw= 'subprogram' kw= 'group' kw= 'access' ) )
            // InternalAadlV3.g:5779:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            {
            // InternalAadlV3.g:5779:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            // InternalAadlV3.g:5780:3: kw= 'subprogram' kw= 'group' kw= 'access'
            {
            kw=(Token)match(input,52,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1());
              		
            }
            kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBindingPointKeywords"
    // InternalAadlV3.g:5799:1: entryRuleBindingPointKeywords returns [String current=null] : iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF ;
    public final String entryRuleBindingPointKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindingPointKeywords = null;


        try {
            // InternalAadlV3.g:5799:60: (iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF )
            // InternalAadlV3.g:5800:2: iv_ruleBindingPointKeywords= ruleBindingPointKeywords EOF
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
    // InternalAadlV3.g:5806:1: ruleBindingPointKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'binding' kw= 'point' ) ;
    public final AntlrDatatypeRuleToken ruleBindingPointKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5812:2: ( (kw= 'binding' kw= 'point' ) )
            // InternalAadlV3.g:5813:2: (kw= 'binding' kw= 'point' )
            {
            // InternalAadlV3.g:5813:2: (kw= 'binding' kw= 'point' )
            // InternalAadlV3.g:5814:3: kw= 'binding' kw= 'point'
            {
            kw=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
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
    // InternalAadlV3.g:5828:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:5828:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:5829:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:5835:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5841:2: ( (kw= 'provides' kw= 'in' ) )
            // InternalAadlV3.g:5842:2: (kw= 'provides' kw= 'in' )
            {
            // InternalAadlV3.g:5842:2: (kw= 'provides' kw= 'in' )
            // InternalAadlV3.g:5843:3: kw= 'provides' kw= 'in'
            {
            kw=(Token)match(input,58,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5857:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:5857:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:5858:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:5864:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5870:2: ( (kw= 'requires' kw= 'in' ) )
            // InternalAadlV3.g:5871:2: (kw= 'requires' kw= 'in' )
            {
            // InternalAadlV3.g:5871:2: (kw= 'requires' kw= 'in' )
            // InternalAadlV3.g:5872:3: kw= 'requires' kw= 'in'
            {
            kw=(Token)match(input,57,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5886:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:5886:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:5887:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:5893:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5899:2: ( (kw= 'provides' kw= 'out' ) )
            // InternalAadlV3.g:5900:2: (kw= 'provides' kw= 'out' )
            {
            // InternalAadlV3.g:5900:2: (kw= 'provides' kw= 'out' )
            // InternalAadlV3.g:5901:3: kw= 'provides' kw= 'out'
            {
            kw=(Token)match(input,58,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5915:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:5915:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:5916:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:5922:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5928:2: ( (kw= 'requires' kw= 'out' ) )
            // InternalAadlV3.g:5929:2: (kw= 'requires' kw= 'out' )
            {
            // InternalAadlV3.g:5929:2: (kw= 'requires' kw= 'out' )
            // InternalAadlV3.g:5930:3: kw= 'requires' kw= 'out'
            {
            kw=(Token)match(input,57,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5944:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:5944:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:5945:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:5951:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5957:2: ( (kw= 'provides' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5958:2: (kw= 'provides' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5958:2: (kw= 'provides' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5959:3: kw= 'provides' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,58,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5978:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:5978:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:5979:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:5985:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5991:2: ( (kw= 'requires' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5992:2: (kw= 'requires' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5992:2: (kw= 'requires' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5993:3: kw= 'requires' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,57,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalAadlV3
    public final void synpred1_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2460:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2460:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2460:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2461:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2461:5: ()
        // InternalAadlV3.g:2462:5: 
        {
        }

        match(input,29,FOLLOW_4); if (state.failed) return ;
        // InternalAadlV3.g:2464:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2465:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2465:6: ( RULE_ID )
        // InternalAadlV3.g:2466:7: RULE_ID
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
        // InternalAadlV3.g:3098:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:3098:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:3098:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:3099:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:3099:5: ()
        // InternalAadlV3.g:3100:5: 
        {
        }

        match(input,29,FOLLOW_4); if (state.failed) return ;
        // InternalAadlV3.g:3102:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:3103:6: ( RULE_ID )
        {
        // InternalAadlV3.g:3103:6: ( RULE_ID )
        // InternalAadlV3.g:3104:7: RULE_ID
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\13\1\14\2\uffff\11\4\1\54\1\4\6\uffff\6\4";
    static final String dfa_3s = "\2\101\2\uffff\10\26\1\102\1\61\1\102\6\uffff\6\26";
    static final String dfa_4s = "\2\uffff\1\1\1\2\13\uffff\1\3\1\5\1\6\1\7\1\10\1\4\6\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\uffff\1\21\3\uffff\1\22\2\uffff\1\3\1\17\2\uffff\1\20\15\uffff\1\23\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\14\uffff\1\15",
            "\1\2\1\uffff\1\21\3\uffff\1\22\2\uffff\1\3\1\17\2\uffff\1\20\15\uffff\1\23\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\14\uffff\1\15",
            "",
            "",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17",
            "\1\24\21\uffff\1\17\53\uffff\1\25",
            "\1\26\1\uffff\1\27\1\31\1\uffff\1\30",
            "\1\24\21\uffff\1\17\53\uffff\1\32",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "191:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\26\1\uffff\2\21\1\54\1\21\1\uffff\1\21\1\uffff\2\21";
    static final String dfa_9s = "\1\101\1\uffff\2\107\1\61\1\107\1\uffff\1\110\1\uffff\2\107";
    static final String dfa_10s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\13\uffff\1\10\10\uffff\1\1\1\2\1\3\6\1\1\5\2\6\4\uffff\1\10\1\7\1\10\3\uffff\1\4",
            "",
            "\1\1\30\uffff\1\1\34\uffff\1\6",
            "\1\1\30\uffff\1\1\34\uffff\1\6",
            "\1\11\1\uffff\2\1\1\uffff\1\1",
            "\1\1\30\uffff\1\1\27\uffff\1\12\4\uffff\1\6",
            "",
            "\1\10\30\uffff\1\10\35\uffff\1\6",
            "",
            "\1\1\30\uffff\1\1\34\uffff\1\6",
            "\1\1\30\uffff\1\1\34\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "391:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )";
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\4\1\17\2\uffff\1\26\1\104\4\uffff";
    static final String dfa_15s = "\2\43\2\uffff\1\101\1\106\4\uffff";
    static final String dfa_16s = "\2\uffff\1\5\1\6\2\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_17s = "\12\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\27\uffff\1\3\6\uffff\1\2",
            "\1\4\15\uffff\1\2\5\uffff\1\2",
            "",
            "",
            "\1\6\13\uffff\1\5\11\uffff\2\6\6\uffff\7\6\1\uffff\1\6\4\uffff\1\6",
            "\1\10\1\11\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "817:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | this_UseProps_5= ruleUseProps[$current] )";
        }
    }
    static final String dfa_19s = "\21\uffff";
    static final String dfa_20s = "\1\4\1\17\1\uffff\2\4\1\uffff\1\15\1\35\7\uffff\1\4\1\35";
    static final String dfa_21s = "\1\43\1\51\1\uffff\1\4\1\42\1\uffff\1\101\1\43\7\uffff\1\4\1\43";
    static final String dfa_22s = "\2\uffff\1\11\2\uffff\1\10\2\uffff\1\6\1\7\1\2\1\3\1\4\1\5\1\1\2\uffff";
    static final String dfa_23s = "\21\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\36\uffff\1\2",
            "\1\6\15\uffff\1\3\2\uffff\1\4\1\5\1\uffff\1\2\5\uffff\1\5",
            "",
            "\1\7",
            "\1\11\16\uffff\1\11\16\uffff\1\10",
            "",
            "\1\15\35\uffff\12\14\6\uffff\1\16\1\13\1\12\3\uffff\1\14",
            "\1\17\2\uffff\1\4\1\5\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\17\2\uffff\1\4\2\uffff\1\2"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1105:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_connections_1_0= ruleFeatureDelegate ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_paths_4_0= rulePath ) ) | ( (lv_flowAssignments_5_0= ruleFlowAssignment ) ) | ( (lv_configurationAssignments_6_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_7_0= ruleConfigurationAssignmentPattern ) ) | ( (lv_propertyAssociations_8_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_25s = "\6\uffff";
    static final String dfa_26s = "\1\4\1\37\1\4\2\uffff\1\37";
    static final String dfa_27s = "\1\4\1\52\1\4\2\uffff\1\52";
    static final String dfa_28s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_29s = "\6\uffff}>";
    static final String[] dfa_30s = {
            "\1\1",
            "\1\4\10\uffff\1\3\1\2\1\4",
            "\1\5",
            "",
            "",
            "\1\4\10\uffff\1\3\1\2\1\4"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2521:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_31s = "\1\4\1\17\2\uffff\1\4\2\uffff\1\35\1\4\1\35";
    static final String dfa_32s = "\1\43\1\51\2\uffff\1\4\2\uffff\1\43\1\4\1\43";
    static final String dfa_33s = "\2\uffff\1\1\1\4\1\uffff\1\2\1\3\3\uffff";
    static final String[] dfa_34s = {
            "\1\1\36\uffff\1\2",
            "\1\5\15\uffff\1\4\2\uffff\1\6\1\3\1\uffff\1\2\5\uffff\1\3",
            "",
            "",
            "\1\7",
            "",
            "",
            "\1\10\2\uffff\1\6\1\3\1\uffff\1\2",
            "\1\11",
            "\1\10\2\uffff\1\6\2\uffff\1\2"
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_17;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "3272:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_configurationAssignments_2_0= ruleConfigurationAssignment ) ) | ( (lv_configurationAssignments_3_0= ruleConfigurationAssignmentPattern ) ) )";
        }
    }
    static final String dfa_35s = "\20\uffff";
    static final String dfa_36s = "\1\4\1\17\1\uffff\1\26\1\uffff\2\4\1\54\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff";
    static final String dfa_37s = "\2\43\1\uffff\1\101\1\uffff\2\107\1\61\1\107\2\uffff\1\110\1\uffff\2\107\1\uffff";
    static final String dfa_38s = "\2\uffff\1\6\1\uffff\1\5\4\uffff\1\2\1\1\1\uffff\1\3\2\uffff\1\4";
    static final String dfa_39s = "\20\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\36\uffff\1\2",
            "\1\3\15\uffff\1\2\5\uffff\1\2",
            "",
            "\1\12\24\uffff\1\4\1\5\1\6\6\4\1\10\6\12\1\11\1\13\1\14\3\uffff\1\7",
            "",
            "\1\4\16\uffff\2\4\25\uffff\1\4\34\uffff\1\12",
            "\1\4\16\uffff\2\4\25\uffff\1\4\34\uffff\1\12",
            "\1\15\1\uffff\2\4\1\uffff\1\4",
            "\1\4\16\uffff\2\4\25\uffff\1\4\27\uffff\1\16\4\uffff\1\12",
            "",
            "",
            "\1\17\103\uffff\1\12",
            "",
            "\1\4\16\uffff\2\4\25\uffff\1\4\34\uffff\1\12",
            "\1\4\16\uffff\2\4\25\uffff\1\4\34\uffff\1\12",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_35;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "3863:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_connections_2_0= ruleFeatureDelegate ) ) | ( (lv_bindings_3_0= ruleBinding ) ) | ( (lv_components_4_0= ruleComponent ) ) | ( (lv_propertyAssociations_5_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_41s = "\24\uffff";
    static final String dfa_42s = "\11\uffff\1\15\1\uffff\1\22\10\uffff";
    static final String dfa_43s = "\1\53\10\uffff\1\4\1\54\1\4\10\uffff";
    static final String dfa_44s = "\1\101\10\uffff\1\102\1\61\1\102\10\uffff";
    static final String dfa_45s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\13\1\14\1\12\1\15\1\16\1\17";
    static final String dfa_46s = "\24\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\14\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\10\uffff\1\15\3\uffff\1\15\1\uffff\2\15\1\uffff\1\15\23\uffff\1\15\27\uffff\1\14",
            "\1\20\1\uffff\1\21\1\17\1\uffff\1\16",
            "\1\22\10\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\1\22\23\uffff\1\22\27\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_41;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "4697:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_48s = "\1\26\5\uffff\1\102\4\uffff";
    static final String dfa_49s = "\1\101\5\uffff\1\107\4\uffff";
    static final String dfa_50s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\7\1\6";
    static final String[] dfa_51s = {
            "\1\10\25\uffff\1\4\1\3\6\uffff\1\6\1\1\1\2\5\uffff\1\7\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\4\uffff\1\12",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_11;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "4841:2: (kw= 'feature' | kw= 'port' | this_DataAccessKeywords_2= ruleDataAccessKeywords | this_BusAccessKeywords_3= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_4= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_5= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_6= ruleSubprogramGroupAccessKeywords | this_BindingPointKeywords_7= ruleBindingPointKeywords | kw= 'interface' )";
        }
    }
    static final String dfa_52s = "\1\uffff\1\5\1\uffff\1\11\1\14\2\uffff\1\15\2\uffff\1\17\6\uffff";
    static final String dfa_53s = "\1\67\1\26\1\uffff\2\26\2\uffff\1\26\2\uffff\1\26\6\uffff";
    static final String dfa_54s = "\1\72\1\101\1\uffff\2\101\2\uffff\1\101\2\uffff\1\101\6\uffff";
    static final String dfa_55s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\uffff\1\11\1\4\1\uffff\1\10\1\5\1\7\1\13\1\6\1\12";
    static final String[] dfa_56s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\25\uffff\2\5\6\uffff\3\5\1\uffff\1\6\3\uffff\1\5\4\uffff\1\5",
            "",
            "\1\11\25\uffff\2\11\6\uffff\3\11\1\7\1\10\3\uffff\1\11\4\uffff\1\11",
            "\1\14\25\uffff\2\14\6\uffff\3\14\1\12\1\13\3\uffff\1\14\4\uffff\1\14",
            "",
            "",
            "\1\15\25\uffff\2\15\6\uffff\3\15\1\uffff\1\16\3\uffff\1\15\4\uffff\1\15",
            "",
            "",
            "\1\17\25\uffff\2\17\6\uffff\3\17\1\uffff\1\20\3\uffff\1\17\4\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_19;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_23;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "4943:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001FF88042647800L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x387FF80400400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000090000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001FF80000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004001802010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000810000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000012000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001FF80000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001802010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001001802000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x17F0300000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1070300000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000080012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004080002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040080010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000A0012L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xC000000100000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000110000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0080000000000000L});

}