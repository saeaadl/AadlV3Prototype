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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'package'", "'is'", "'end'", "';'", "'property'", "':'", "'for'", "'('", "'all'", "','", "')'", "'properties'", "'{'", "'}'", "'type'", "'interface'", "'extends'", "'configuration'", "'->'", "'<->'", "'use'", "'flow'", "'.'", "'import'", "'as'", "'=>'", "'#'", "'reverse'", "'@'", "'{*'", "'*}'", "'workingset'", "'::*'", "'::'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'parameter'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'connection'", "'='", "'*=>'", "'virtual'", "'group'", "'source'", "'sink'", "'access'"
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
    // InternalAadlV3.g:89:1: rulePackageDeclaration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )* otherlv_6= 'end' otherlv_7= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:95:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )* otherlv_6= 'end' otherlv_7= ';' ) )
            // InternalAadlV3.g:96:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )* otherlv_6= 'end' otherlv_7= ';' )
            {
            // InternalAadlV3.g:96:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )* otherlv_6= 'end' otherlv_7= ';' )
            // InternalAadlV3.g:97:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )* otherlv_6= 'end' otherlv_7= ';'
            {
            // InternalAadlV3.g:97:3: ( (lv_private_0_0= 'private' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAadlV3.g:98:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:98:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:99:5: lv_private_0_0= 'private'
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

            otherlv_3=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:138:3: ( ( (lv_imports_4_0= ruleImport ) ) | ( (lv_elements_5_0= rulePackageElement ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==16||LA2_0==23||(LA2_0>=26 && LA2_0<=27)||LA2_0==29||LA2_0==43||(LA2_0>=46 && LA2_0<=55)||LA2_0==67) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAadlV3.g:139:4: ( (lv_imports_4_0= ruleImport ) )
            	    {
            	    // InternalAadlV3.g:139:4: ( (lv_imports_4_0= ruleImport ) )
            	    // InternalAadlV3.g:140:5: (lv_imports_4_0= ruleImport )
            	    {
            	    // InternalAadlV3.g:140:5: (lv_imports_4_0= ruleImport )
            	    // InternalAadlV3.g:141:6: lv_imports_4_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_imports_4_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"imports",
            	      							lv_imports_4_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Import");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAadlV3.g:159:4: ( (lv_elements_5_0= rulePackageElement ) )
            	    {
            	    // InternalAadlV3.g:159:4: ( (lv_elements_5_0= rulePackageElement ) )
            	    // InternalAadlV3.g:160:5: (lv_elements_5_0= rulePackageElement )
            	    {
            	    // InternalAadlV3.g:160:5: (lv_elements_5_0= rulePackageElement )
            	    // InternalAadlV3.g:161:6: lv_elements_5_0= rulePackageElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_elements_5_0=rulePackageElement();

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

            otherlv_6=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPackageDeclarationAccess().getEndKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:191:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalAadlV3.g:191:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalAadlV3.g:192:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalAadlV3.g:198:1: rulePackageElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset ) ;
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
            // InternalAadlV3.g:204:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset ) )
            // InternalAadlV3.g:205:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )
            {
            // InternalAadlV3.g:205:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAadlV3.g:206:3: this_PackageDeclaration_0= rulePackageDeclaration
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
                    // InternalAadlV3.g:218:3: this_DataType_1= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:230:3: this_ComponentInterface_2= ruleComponentInterface
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:242:3: this_ComponentImplementation_3= ruleComponentImplementation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:254:3: this_ComponentConfiguration_4= ruleComponentConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:266:3: this_PropertyDefinition_5= rulePropertyDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:278:3: this_PropertySet_6= rulePropertySet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalAadlV3.g:290:3: this_Workingset_7= ruleWorkingset
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
    // InternalAadlV3.g:305:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalAadlV3.g:305:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalAadlV3.g:306:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalAadlV3.g:312:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' ) ;
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
        EObject this_AppliesTo_8 = null;

        EObject this_AppliesTo_10 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:318:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' ) )
            // InternalAadlV3.g:319:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' )
            {
            // InternalAadlV3.g:319:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' )
            // InternalAadlV3.g:320:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedReference ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';'
            {
            // InternalAadlV3.g:320:3: ( (lv_private_0_0= 'private' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAadlV3.g:321:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:321:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:322:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1());
              		
            }
            // InternalAadlV3.g:338:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:339:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:339:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:340:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
              		
            }
            // InternalAadlV3.g:360:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:361:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:361:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:362:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:379:3: (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAadlV3.g:380:4: otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalAadlV3.g:388:4: ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==27||LA6_0==33||(LA6_0>=46 && LA6_0<=59)||LA6_0==64||LA6_0==67) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAadlV3.g:389:5: ( (lv_forAll_7_0= 'all' ) )
                            {
                            // InternalAadlV3.g:389:5: ( (lv_forAll_7_0= 'all' ) )
                            // InternalAadlV3.g:390:6: (lv_forAll_7_0= 'all' )
                            {
                            // InternalAadlV3.g:390:6: (lv_forAll_7_0= 'all' )
                            // InternalAadlV3.g:391:7: lv_forAll_7_0= 'all'
                            {
                            lv_forAll_7_0=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
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
                            // InternalAadlV3.g:404:5: (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* )
                            {
                            // InternalAadlV3.g:404:5: (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* )
                            // InternalAadlV3.g:405:6: this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )*
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
                            pushFollow(FOLLOW_14);
                            this_AppliesTo_8=ruleAppliesTo(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_AppliesTo_8;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalAadlV3.g:419:6: (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==21) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalAadlV3.g:420:7: otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current]
                            	    {
                            	    otherlv_9=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
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
                            	    pushFollow(FOLLOW_14);
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
                            	    break loop5;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:455:1: ruleAppliesTo[EObject in_current] returns [EObject current=in_current] : ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) ;
    public final EObject ruleAppliesTo(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_componentCategories_0_0 = null;

        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;

        AntlrDatatypeRuleToken lv_associationTypes_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:461:2: ( ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) )
            // InternalAadlV3.g:462:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            {
            // InternalAadlV3.g:462:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAadlV3.g:463:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    {
                    // InternalAadlV3.g:463:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    // InternalAadlV3.g:464:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:464:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    // InternalAadlV3.g:465:5: lv_componentCategories_0_0= ruleComponentCategory
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
                    // InternalAadlV3.g:483:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    {
                    // InternalAadlV3.g:483:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    // InternalAadlV3.g:484:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    {
                    // InternalAadlV3.g:484:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    // InternalAadlV3.g:485:5: lv_featureCategories_1_0= ruleFeatureCategory
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
                    // InternalAadlV3.g:503:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    {
                    // InternalAadlV3.g:503:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    // InternalAadlV3.g:504:4: (lv_associationTypes_2_0= ruleAssociationType )
                    {
                    // InternalAadlV3.g:504:4: (lv_associationTypes_2_0= ruleAssociationType )
                    // InternalAadlV3.g:505:5: lv_associationTypes_2_0= ruleAssociationType
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
    // InternalAadlV3.g:526:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:526:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:527:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:533:1: rulePropertySet returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' ) ;
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
            // InternalAadlV3.g:539:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalAadlV3.g:540:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalAadlV3.g:540:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalAadlV3.g:541:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';'
            {
            // InternalAadlV3.g:541:3: ( (lv_private_0_0= 'private' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:542:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:542:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:543:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_15); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:559:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:560:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:560:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:561:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getColonKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalAadlV3.g:585:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:586:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:586:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:587:5: ruleQualifiedReference
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
            pushFollow(FOLLOW_17);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:604:3: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAadlV3.g:605:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalAadlV3.g:609:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:610:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:610:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:611:6: ruleQualifiedName
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
            	    pushFollow(FOLLOW_17);
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

            otherlv_8=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDataType"
    // InternalAadlV3.g:641:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAadlV3.g:641:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAadlV3.g:642:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAadlV3.g:648:1: ruleDataType returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? otherlv_4= ';' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject this_PropertiesBlock_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:654:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? otherlv_4= ';' ) )
            // InternalAadlV3.g:655:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? otherlv_4= ';' )
            {
            // InternalAadlV3.g:655:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? otherlv_4= ';' )
            // InternalAadlV3.g:656:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (this_PropertiesBlock_3= rulePropertiesBlock[$current] )? otherlv_4= ';'
            {
            // InternalAadlV3.g:656:3: ( (lv_private_0_0= 'private' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAadlV3.g:657:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:657:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:658:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_18); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getTypeKeyword_1());
              		
            }
            // InternalAadlV3.g:674:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:675:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:675:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:676:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            // InternalAadlV3.g:692:3: (this_PropertiesBlock_3= rulePropertiesBlock[$current] )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:693:4: this_PropertiesBlock_3= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDataTypeRule());
                      				}
                      				newCompositeNode(grammarAccess.getDataTypeAccess().getPropertiesBlockParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:716:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:716:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:717:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:723:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:729:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' ) )
            // InternalAadlV3.g:730:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' )
            {
            // InternalAadlV3.g:730:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' )
            // InternalAadlV3.g:731:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';'
            {
            // InternalAadlV3.g:731:3: ( (lv_private_0_0= 'private' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAadlV3.g:732:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:732:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:733:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_20); if (state.failed) return current;
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

            // InternalAadlV3.g:745:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=46 && LA14_0<=55)||LA14_0==67) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAadlV3.g:746:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:746:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:747:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:768:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:769:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:769:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:770:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            // InternalAadlV3.g:786:3: (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:787:4: otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_23); if (state.failed) return current;
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
                    pushFollow(FOLLOW_22);
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
            pushFollow(FOLLOW_7);
            this_InterfaceBody_6=ruleInterfaceBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InterfaceBody_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:829:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_InterfaceElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:835:2: ( (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:836:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:836:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:837:3: otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:841:3: (this_InterfaceElement_1= ruleInterfaceElement[$current] )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==38||LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAadlV3.g:842:4: this_InterfaceElement_1= ruleInterfaceElement[$current]
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
            	    pushFollow(FOLLOW_24);
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
            	    break loop16;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:866:1: ruleInterfaceElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleInterfaceElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_flows_1_0 = null;

        EObject lv_flows_2_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_propertyAssociations_4_0 = null;

        EObject lv_annexSubclause_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:872:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:873:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:873:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:874:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:874:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:875:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:875:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:876:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:894:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    {
                    // InternalAadlV3.g:894:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    // InternalAadlV3.g:895:4: (lv_flows_1_0= ruleFlowPath )
                    {
                    // InternalAadlV3.g:895:4: (lv_flows_1_0= ruleFlowPath )
                    // InternalAadlV3.g:896:5: lv_flows_1_0= ruleFlowPath
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
                    // InternalAadlV3.g:914:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    {
                    // InternalAadlV3.g:914:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    // InternalAadlV3.g:915:4: (lv_flows_2_0= ruleFlowSource )
                    {
                    // InternalAadlV3.g:915:4: (lv_flows_2_0= ruleFlowSource )
                    // InternalAadlV3.g:916:5: lv_flows_2_0= ruleFlowSource
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
                    // InternalAadlV3.g:934:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    {
                    // InternalAadlV3.g:934:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    // InternalAadlV3.g:935:4: (lv_flows_3_0= ruleFlowSink )
                    {
                    // InternalAadlV3.g:935:4: (lv_flows_3_0= ruleFlowSink )
                    // InternalAadlV3.g:936:5: lv_flows_3_0= ruleFlowSink
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
                    // InternalAadlV3.g:954:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:954:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:955:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:955:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:956:5: lv_propertyAssociations_4_0= rulePropertyAssociation
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
                    // InternalAadlV3.g:974:3: ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:974:3: ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:975:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:975:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:976:5: lv_annexSubclause_5_0= ruleAnnexSubclause
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
    // InternalAadlV3.g:997:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:997:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:998:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:1004:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' ) ;
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
            // InternalAadlV3.g:1010:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' ) )
            // InternalAadlV3.g:1011:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' )
            {
            // InternalAadlV3.g:1011:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' )
            // InternalAadlV3.g:1012:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';'
            {
            // InternalAadlV3.g:1012:3: ( (lv_private_0_0= 'private' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAadlV3.g:1013:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1013:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1014:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_25); if (state.failed) return current;
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

            // InternalAadlV3.g:1026:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1027:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1027:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:1028:5: lv_category_1_0= ruleComponentCategory
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

            // InternalAadlV3.g:1045:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1046:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1046:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1047:5: lv_name_2_0= ruleDottedName
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

            // InternalAadlV3.g:1064:3: (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:1065:4: otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
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

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentImplementationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_7);
            this_ImplementationBody_5=ruleImplementationBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImplementationBody_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1107:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1113:2: ( (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:1114:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:1114:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:1115:3: otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1119:3: (this_ImplementationElement_1= ruleImplementationElement[$current] )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==20||LA20_0==38||LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAadlV3.g:1120:4: this_ImplementationElement_1= ruleImplementationElement[$current]
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
            	    pushFollow(FOLLOW_26);
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
            	    break loop20;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1144:1: ruleImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_connections_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_components_2_0 = null;

        EObject lv_paths_3_0 = null;

        EObject lv_flowAssignments_4_0 = null;

        EObject lv_classifierAssignments_5_0 = null;

        EObject lv_classifierAssignments_6_0 = null;

        EObject lv_propertyAssociations_7_0 = null;

        EObject lv_annexSubclause_8_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1150:2: ( ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:1151:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:1151:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )
            int alt21=9;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalAadlV3.g:1152:3: ( (lv_connections_0_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:1152:3: ( (lv_connections_0_0= ruleConnection ) )
                    // InternalAadlV3.g:1153:4: (lv_connections_0_0= ruleConnection )
                    {
                    // InternalAadlV3.g:1153:4: (lv_connections_0_0= ruleConnection )
                    // InternalAadlV3.g:1154:5: lv_connections_0_0= ruleConnection
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
                    // InternalAadlV3.g:1172:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:1172:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:1173:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:1173:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:1174:5: lv_bindings_1_0= ruleBinding
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
                    // InternalAadlV3.g:1192:3: ( (lv_components_2_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:1192:3: ( (lv_components_2_0= ruleComponent ) )
                    // InternalAadlV3.g:1193:4: (lv_components_2_0= ruleComponent )
                    {
                    // InternalAadlV3.g:1193:4: (lv_components_2_0= ruleComponent )
                    // InternalAadlV3.g:1194:5: lv_components_2_0= ruleComponent
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
                    // InternalAadlV3.g:1212:3: ( (lv_paths_3_0= rulePath ) )
                    {
                    // InternalAadlV3.g:1212:3: ( (lv_paths_3_0= rulePath ) )
                    // InternalAadlV3.g:1213:4: (lv_paths_3_0= rulePath )
                    {
                    // InternalAadlV3.g:1213:4: (lv_paths_3_0= rulePath )
                    // InternalAadlV3.g:1214:5: lv_paths_3_0= rulePath
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
                    // InternalAadlV3.g:1232:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    {
                    // InternalAadlV3.g:1232:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    // InternalAadlV3.g:1233:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    {
                    // InternalAadlV3.g:1233:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    // InternalAadlV3.g:1234:5: lv_flowAssignments_4_0= ruleFlowAssignment
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
                    // InternalAadlV3.g:1252:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:1252:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:1253:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:1253:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:1254:5: lv_classifierAssignments_5_0= ruleClassifierAssignment
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
                    // InternalAadlV3.g:1272:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:1272:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:1273:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:1273:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:1274:5: lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern
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
                    // InternalAadlV3.g:1292:3: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1292:3: ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1293:4: (lv_propertyAssociations_7_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1293:4: (lv_propertyAssociations_7_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1294:5: lv_propertyAssociations_7_0= rulePropertyAssociation
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
                case 9 :
                    // InternalAadlV3.g:1312:3: ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:1312:3: ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:1313:4: (lv_annexSubclause_8_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:1313:4: (lv_annexSubclause_8_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:1314:5: lv_annexSubclause_8_0= ruleAnnexSubclause
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
    // InternalAadlV3.g:1335:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1335:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1336:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:1342:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:1348:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' ) )
            // InternalAadlV3.g:1349:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' )
            {
            // InternalAadlV3.g:1349:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' )
            // InternalAadlV3.g:1350:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';'
            {
            // InternalAadlV3.g:1350:3: ( (lv_private_0_0= 'private' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1351:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1351:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1352:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_27); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1368:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1369:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1369:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1370:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalAadlV3.g:1387:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1388:4: this_Parameters_3= ruleParameters[$current]
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
                    pushFollow(FOLLOW_28);
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

            // InternalAadlV3.g:1403:3: (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1404:4: otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
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
                    pushFollow(FOLLOW_28);
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
            pushFollow(FOLLOW_7);
            this_ConfigurationElementBlock_6=ruleConfigurationElementBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElementBlock_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1445:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1445:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1446:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:1452:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReference_4_0 = null;

        EObject lv_annexSubclause_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1458:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:1459:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:1459:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:1460:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:1460:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1461:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1461:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1462:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1482:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=60 && LA25_0<=63)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1483:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1483:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1484:5: lv_direction_2_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
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

            // InternalAadlV3.g:1501:3: ( (lv_category_3_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1502:4: (lv_category_3_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1502:4: (lv_category_3_0= ruleFeatureCategory )
            // InternalAadlV3.g:1503:5: lv_category_3_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:1520:3: ( (lv_typeReference_4_0= ruleReversableTypeReference ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1521:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    {
                    // InternalAadlV3.g:1521:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    // InternalAadlV3.g:1522:5: lv_typeReference_4_0= ruleReversableTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalAadlV3.g:1539:3: ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1540:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:1540:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:1541:5: lv_annexSubclause_5_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_annexSubclause_5_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
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
                    break;

            }

            // InternalAadlV3.g:1558:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1559:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleComponent"
    // InternalAadlV3.g:1582:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAadlV3.g:1582:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAadlV3.g:1583:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalAadlV3.g:1589:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? otherlv_5= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject lv_typeReferences_3_0 = null;

        EObject this_NestedComponentImplementationBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1595:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? otherlv_5= ';' ) )
            // InternalAadlV3.g:1596:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:1596:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? otherlv_5= ';' )
            // InternalAadlV3.g:1597:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_typeReferences_3_0= ruleTypeReference ) )? (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )? otherlv_5= ';'
            {
            // InternalAadlV3.g:1597:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1598:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1598:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1599:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1619:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1620:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1620:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1621:5: lv_category_2_0= ruleComponentCategory
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

            // InternalAadlV3.g:1638:3: ( (lv_typeReferences_3_0= ruleTypeReference ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1639:4: (lv_typeReferences_3_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:1639:4: (lv_typeReferences_3_0= ruleTypeReference )
                    // InternalAadlV3.g:1640:5: lv_typeReferences_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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

            // InternalAadlV3.g:1657:3: (this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1658:4: this_NestedComponentImplementationBlock_4= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalAadlV3.g:1681:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:1681:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:1682:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:1688:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) ;
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
            // InternalAadlV3.g:1694:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:1695:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:1695:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:1696:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:1696:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1697:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1697:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1698:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1718:3: ( (lv_associationType_2_0= ruleIsConnection ) )
            // InternalAadlV3.g:1719:4: (lv_associationType_2_0= ruleIsConnection )
            {
            // InternalAadlV3.g:1719:4: (lv_associationType_2_0= ruleIsConnection )
            // InternalAadlV3.g:1720:5: lv_associationType_2_0= ruleIsConnection
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

            // InternalAadlV3.g:1737:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1738:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1738:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:1739:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalAadlV3.g:1756:3: (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            else if ( (LA31_0==31) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1757:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1762:4: ( (lv_bidirectional_5_0= '<->' ) )
                    {
                    // InternalAadlV3.g:1762:4: ( (lv_bidirectional_5_0= '<->' ) )
                    // InternalAadlV3.g:1763:5: (lv_bidirectional_5_0= '<->' )
                    {
                    // InternalAadlV3.g:1763:5: (lv_bidirectional_5_0= '<->' )
                    // InternalAadlV3.g:1764:6: lv_bidirectional_5_0= '<->'
                    {
                    lv_bidirectional_5_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
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

            // InternalAadlV3.g:1777:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1778:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1778:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:1779:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalAadlV3.g:1796:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAadlV3.g:1797:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1820:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAadlV3.g:1820:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAadlV3.g:1821:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalAadlV3.g:1827:1: ruleBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) ;
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
            // InternalAadlV3.g:1833:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:1834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:1834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:1835:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:1835:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1836:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1836:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1837:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1857:3: ( ( ruleQualifiedName ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1858:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:1858:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:1859:5: ruleQualifiedName
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

                      					newCompositeNode(grammarAccess.getBindingAccess().getBindingTypeDataTypeCrossReference_2_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
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

            // InternalAadlV3.g:1876:3: ( (lv_associationType_3_0= ruleIsBinding ) )
            // InternalAadlV3.g:1877:4: (lv_associationType_3_0= ruleIsBinding )
            {
            // InternalAadlV3.g:1877:4: (lv_associationType_3_0= ruleIsBinding )
            // InternalAadlV3.g:1878:5: lv_associationType_3_0= ruleIsBinding
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

            // InternalAadlV3.g:1895:3: ( (lv_source_4_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1896:4: (lv_source_4_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1896:4: (lv_source_4_0= ruleModelElementReference )
            // InternalAadlV3.g:1897:5: lv_source_4_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_5=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:1918:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:1919:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:1919:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:1920:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalAadlV3.g:1937:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAadlV3.g:1938:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:1961:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:1961:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:1962:2: iv_ruleFlowPath= ruleFlowPath EOF
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
    // InternalAadlV3.g:1968:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:1974:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:1975:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:1975:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:1976:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:1976:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1977:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1977:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1978:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1998:3: ( (lv_associationType_2_0= ruleIsFlow ) )
            // InternalAadlV3.g:1999:4: (lv_associationType_2_0= ruleIsFlow )
            {
            // InternalAadlV3.g:1999:4: (lv_associationType_2_0= ruleIsFlow )
            // InternalAadlV3.g:2000:5: lv_associationType_2_0= ruleIsFlow
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

            // InternalAadlV3.g:2017:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2018:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2018:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2019:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2040:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2041:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2041:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:2042:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalAadlV3.g:2059:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:2060:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2090:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) ;
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
            // InternalAadlV3.g:2096:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2097:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2097:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            // InternalAadlV3.g:2098:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';'
            {
            // InternalAadlV3.g:2098:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2099:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2099:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2100:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2120:3: ( (lv_associationType_2_0= ruleIsFlowSource ) )
            // InternalAadlV3.g:2121:4: (lv_associationType_2_0= ruleIsFlowSource )
            {
            // InternalAadlV3.g:2121:4: (lv_associationType_2_0= ruleIsFlowSource )
            // InternalAadlV3.g:2122:5: lv_associationType_2_0= ruleIsFlowSource
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

            // InternalAadlV3.g:2139:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2140:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2140:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2141:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:2159:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2182:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:2182:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:2183:2: iv_ruleFlowSink= ruleFlowSink EOF
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
    // InternalAadlV3.g:2189:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) ;
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
            // InternalAadlV3.g:2195:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            // InternalAadlV3.g:2197:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';'
            {
            // InternalAadlV3.g:2197:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2198:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2198:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2199:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2219:3: ( (lv_associationType_2_0= ruleIsFlowSink ) )
            // InternalAadlV3.g:2220:4: (lv_associationType_2_0= ruleIsFlowSink )
            {
            // InternalAadlV3.g:2220:4: (lv_associationType_2_0= ruleIsFlowSink )
            // InternalAadlV3.g:2221:5: lv_associationType_2_0= ruleIsFlowSink
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

            // InternalAadlV3.g:2238:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2239:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2239:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2240:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalAadlV3.g:2257:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAadlV3.g:2258:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2282:1: ruleUseProps[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleUseProps(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2288:2: ( (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // InternalAadlV3.g:2289:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // InternalAadlV3.g:2289:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // InternalAadlV3.g:2290:3: otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:2298:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2299:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2299:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2300:5: ruleQualifiedName
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
            pushFollow(FOLLOW_40);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2317:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAadlV3.g:2318:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2322:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:2323:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:2323:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:2324:6: ruleQualifiedName
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
            	    pushFollow(FOLLOW_40);
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
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2350:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:2350:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:2351:2: iv_rulePath= rulePath EOF
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
    // InternalAadlV3.g:2357:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:2363:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:2364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:2364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:2365:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:2365:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2366:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2366:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2367:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPathAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2391:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2392:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2392:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2393:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalAadlV3.g:2410:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAadlV3.g:2411:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2415:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2416:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2416:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2417:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // InternalAadlV3.g:2435:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:2436:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2459:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2459:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2460:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2466:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2472:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2473:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2473:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2474:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2474:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2475:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2475:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2476:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2490:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==34) && (synpred60_InternalAadlV3())) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAadlV3.g:2491:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2502:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2503:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2503:5: ()
            	    // InternalAadlV3.g:2504:6: 
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

            	    otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2517:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2518:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2518:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2519:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAadlV3.g:2539:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2539:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2540:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:2546:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) ;
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
            // InternalAadlV3.g:2552:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2553:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2553:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalAadlV3.g:2554:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2558:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:2559:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:2559:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:2560:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:2560:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:2561:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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
                    // InternalAadlV3.g:2579:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:2579:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:2580:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2580:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:2581:6: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

            // InternalAadlV3.g:2599:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAadlV3.g:2600:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:2604:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalAadlV3.g:2605:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalAadlV3.g:2605:5: (lv_alias_4_0= RULE_ID )
                    // InternalAadlV3.g:2606:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2631:1: entryRuleClassifierAssignment returns [EObject current=null] : iv_ruleClassifierAssignment= ruleClassifierAssignment EOF ;
    public final EObject entryRuleClassifierAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignment = null;


        try {
            // InternalAadlV3.g:2631:61: (iv_ruleClassifierAssignment= ruleClassifierAssignment EOF )
            // InternalAadlV3.g:2632:2: iv_ruleClassifierAssignment= ruleClassifierAssignment EOF
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
    // InternalAadlV3.g:2638:1: ruleClassifierAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:2644:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:2645:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:2645:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:2646:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
            {
            // InternalAadlV3.g:2646:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2647:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2647:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2648:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            otherlv_1=(Token)match(input,37,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2669:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==24) ) {
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
                    // InternalAadlV3.g:2670:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2670:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2671:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2671:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2672:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2672:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2673:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_assignedClassifiers_2_0=ruleTypeReference();

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
                      								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:2690:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalAadlV3.g:2691:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2695:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2696:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2696:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2697:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_assignedClassifiers_4_0=ruleTypeReference();

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
                    	      									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
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

                    // InternalAadlV3.g:2715:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==24) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAadlV3.g:2716:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                            pushFollow(FOLLOW_7);
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
                    // InternalAadlV3.g:2733:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2756:1: entryRuleClassifierAssignmentPattern returns [EObject current=null] : iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF ;
    public final EObject entryRuleClassifierAssignmentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignmentPattern = null;


        try {
            // InternalAadlV3.g:2756:68: (iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF )
            // InternalAadlV3.g:2757:2: iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF
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
    // InternalAadlV3.g:2763:1: ruleClassifierAssignmentPattern returns [EObject current=null] : (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:2769:2: ( (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:2770:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:2770:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:2771:3: this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
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
            pushFollow(FOLLOW_44);
            this_QueryExpression_0=ruleQueryExpression(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_QueryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:2789:3: ( ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==24) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalAadlV3.g:2790:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:2790:4: ( ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:2791:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:2791:5: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:2792:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:2792:6: (lv_assignedClassifiers_2_0= ruleTypeReference )
                    // InternalAadlV3.g:2793:7: lv_assignedClassifiers_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_assignedClassifiers_2_0=ruleTypeReference();

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
                      								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:2810:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==21) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalAadlV3.g:2811:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:2815:6: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
                    	    // InternalAadlV3.g:2816:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    {
                    	    // InternalAadlV3.g:2816:7: (lv_assignedClassifiers_4_0= ruleTypeReference )
                    	    // InternalAadlV3.g:2817:8: lv_assignedClassifiers_4_0= ruleTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_assignedClassifiers_4_0=ruleTypeReference();

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
                    	      									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
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

                    // InternalAadlV3.g:2835:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==24) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAadlV3.g:2836:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                            pushFollow(FOLLOW_7);
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
                    // InternalAadlV3.g:2853:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
                    pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2877:1: ruleQueryExpression[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleQueryExpression(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2883:2: ( (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) )
            // InternalAadlV3.g:2884:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            {
            // InternalAadlV3.g:2884:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            // InternalAadlV3.g:2885:3: otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getAllKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAadlV3.g:2893:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:2894:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:2894:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:2895:5: ruleQualifiedTypesReference
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
            pushFollow(FOLLOW_13);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:2920:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:2920:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:2921:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:2927:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) ;
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
            // InternalAadlV3.g:2933:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) )
            // InternalAadlV3.g:2934:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            {
            // InternalAadlV3.g:2934:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            // InternalAadlV3.g:2935:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';'
            {
            // InternalAadlV3.g:2935:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2936:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2936:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:2937:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            otherlv_1=(Token)match(input,37,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2962:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2963:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2963:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2964:5: lv_elements_3_0= rulePathElement
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

            // InternalAadlV3.g:2981:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==30) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAadlV3.g:2982:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2986:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2987:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2987:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2988:6: lv_elements_5_0= rulePathElement
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
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulePropertyAssociation"
    // InternalAadlV3.g:3014:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:3014:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:3015:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:3021:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= rulePropertyValue ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyAssociationType_3_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3027:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= rulePropertyValue ) ) otherlv_5= ';' ) )
            // InternalAadlV3.g:3028:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= rulePropertyValue ) ) otherlv_5= ';' )
            {
            // InternalAadlV3.g:3028:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= rulePropertyValue ) ) otherlv_5= ';' )
            // InternalAadlV3.g:3029:3: ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= rulePropertyValue ) ) otherlv_5= ';'
            {
            // InternalAadlV3.g:3029:3: ( (lv_target_0_0= ruleModelElementReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAadlV3.g:3030:4: (lv_target_0_0= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:3030:4: (lv_target_0_0= ruleModelElementReference )
                    // InternalAadlV3.g:3031:5: lv_target_0_0= ruleModelElementReference
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

            otherlv_1=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3052:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3053:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3053:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3054:5: ruleQualifiedName
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
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3071:3: ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )
            // InternalAadlV3.g:3072:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            {
            // InternalAadlV3.g:3072:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            // InternalAadlV3.g:3073:5: lv_propertyAssociationType_3_0= rulePropertyAssociationType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_50);
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

            // InternalAadlV3.g:3090:3: ( (lv_value_4_0= rulePropertyValue ) )
            // InternalAadlV3.g:3091:4: (lv_value_4_0= rulePropertyValue )
            {
            // InternalAadlV3.g:3091:4: (lv_value_4_0= rulePropertyValue )
            // InternalAadlV3.g:3092:5: lv_value_4_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_value_4_0=rulePropertyValue();

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
              						"org.osate.xtext.aadlv3.AadlV3.PropertyValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulePropertyValue"
    // InternalAadlV3.g:3117:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalAadlV3.g:3117:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalAadlV3.g:3118:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalAadlV3.g:3124:1: rulePropertyValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3130:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:3131:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:3131:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )? )
            // InternalAadlV3.g:3132:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:3132:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalAadlV3.g:3133:4: (lv_value_0_0= RULE_INT )
            {
            // InternalAadlV3.g:3133:4: (lv_value_0_0= RULE_INT )
            // InternalAadlV3.g:3134:5: lv_value_0_0= RULE_INT
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

            // InternalAadlV3.g:3150:3: ( (lv_unit_1_0= RULE_ID ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAadlV3.g:3151:4: (lv_unit_1_0= RULE_ID )
                    {
                    // InternalAadlV3.g:3151:4: (lv_unit_1_0= RULE_ID )
                    // InternalAadlV3.g:3152:5: lv_unit_1_0= RULE_ID
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
    // InternalAadlV3.g:3172:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:3172:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:3173:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:3179:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3185:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:3186:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:3186:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:3187:3: ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:3187:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:3188:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:3188:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:3189:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:3203:3: ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==34) && (synpred72_InternalAadlV3())) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAadlV3.g:3204:4: ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:3205:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:3206:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:3206:5: ()
            	    // InternalAadlV3.g:3207:6: 
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

            	    otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:3220:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:3221:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:3221:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:3222:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAadlV3.g:3243:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3249:2: ( (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:3250:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:3250:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:3251:3: otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:3255:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||LA54_0==20||LA54_0==38||LA54_0==40) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAadlV3.g:3256:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
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
            	    pushFollow(FOLLOW_26);
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
            	    break loop54;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3280:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3286:2: ( (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:3287:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:3287:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:3288:3: otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3292:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||LA55_0==20||LA55_0==38||LA55_0==40) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:3293:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
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
            	    pushFollow(FOLLOW_53);
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
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3317:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_propertyAssociations_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_classifierAssignments_2_0 = null;

        EObject lv_classifierAssignments_3_0 = null;

        EObject lv_annexSubclause_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3323:2: ( ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:3324:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:3324:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            int alt56=5;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalAadlV3.g:3325:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3325:3: ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3326:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3326:4: (lv_propertyAssociations_0_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3327:5: lv_propertyAssociations_0_0= rulePropertyAssociation
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
                    // InternalAadlV3.g:3345:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3345:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:3346:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3346:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:3347:5: lv_bindings_1_0= ruleBinding
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
                    // InternalAadlV3.g:3365:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:3365:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:3366:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:3366:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:3367:5: lv_classifierAssignments_2_0= ruleClassifierAssignment
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
                    // InternalAadlV3.g:3385:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:3385:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:3386:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:3386:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:3387:5: lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern
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
                    // InternalAadlV3.g:3405:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:3405:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:3406:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:3406:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:3407:5: lv_annexSubclause_4_0= ruleAnnexSubclause
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
    // InternalAadlV3.g:3429:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3435:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3436:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3436:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3437:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3437:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3438:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3438:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3439:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,19,FOLLOW_54); if (state.failed) return current;
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

            // InternalAadlV3.g:3451:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3452:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3452:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3453:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3453:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3454:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalAadlV3.g:3471:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==21) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAadlV3.g:3472:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3476:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3477:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3477:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3478:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3505:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3505:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3506:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:3512:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3518:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3519:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3519:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3520:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3520:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3521:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3521:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3522:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:3542:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3543:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3543:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3544:5: ruleQualifiedName
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
    // InternalAadlV3.g:3565:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:3565:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:3566:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:3572:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3578:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3579:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3579:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3580:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3580:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAadlV3.g:3581:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3581:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3582:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
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

            // InternalAadlV3.g:3594:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3595:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3595:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3596:5: ruleQualifiedReference
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
    // InternalAadlV3.g:3617:1: entryRuleReversableTypeReference returns [EObject current=null] : iv_ruleReversableTypeReference= ruleReversableTypeReference EOF ;
    public final EObject entryRuleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableTypeReference = null;


        try {
            // InternalAadlV3.g:3617:64: (iv_ruleReversableTypeReference= ruleReversableTypeReference EOF )
            // InternalAadlV3.g:3618:2: iv_ruleReversableTypeReference= ruleReversableTypeReference EOF
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
    // InternalAadlV3.g:3624:1: ruleReversableTypeReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3630:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3631:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3631:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3632:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3632:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==39) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAadlV3.g:3633:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3633:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3634:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
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

            // InternalAadlV3.g:3646:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3647:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3647:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3648:5: ruleQualifiedReference
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
    // InternalAadlV3.g:3669:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3669:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3670:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:3676:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3682:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3683:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3683:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3684:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3684:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3685:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3685:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3686:5: ruleQualifiedTypesReference
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

              					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_55);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3703:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAadlV3.g:3704:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
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
    // InternalAadlV3.g:3723:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:3723:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:3724:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:3730:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3736:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:3737:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:3737:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:3738:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:3738:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:3739:4: ruleQualifiedDottedReference
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
    // InternalAadlV3.g:3759:1: entryRuleAnnexSubclause returns [EObject current=null] : iv_ruleAnnexSubclause= ruleAnnexSubclause EOF ;
    public final EObject entryRuleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexSubclause = null;


        try {
            // InternalAadlV3.g:3759:55: (iv_ruleAnnexSubclause= ruleAnnexSubclause EOF )
            // InternalAadlV3.g:3760:2: iv_ruleAnnexSubclause= ruleAnnexSubclause EOF
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
    // InternalAadlV3.g:3766:1: ruleAnnexSubclause returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{*' otherlv_3= '*}' ) ;
    public final EObject ruleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3772:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{*' otherlv_3= '*}' ) )
            // InternalAadlV3.g:3773:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{*' otherlv_3= '*}' )
            {
            // InternalAadlV3.g:3773:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{*' otherlv_3= '*}' )
            // InternalAadlV3.g:3774:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{*' otherlv_3= '*}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnexSubclauseAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:3778:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:3779:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:3779:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:3780:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnexSubclauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnnexSubclauseAccess().getLeftCurlyBracketAsteriskKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAnnexSubclauseAccess().getAsteriskRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "rulePropertiesBlock"
    // InternalAadlV3.g:3809:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_propertyAssociations_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3815:2: ( (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:3816:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:3816:2: (otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            // InternalAadlV3.g:3817:3: otherlv_0= '{' ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3821:3: ( (lv_propertyAssociations_1_0= rulePropertyAssociation ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID||LA62_0==38) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAadlV3.g:3822:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:3822:4: (lv_propertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:3823:5: lv_propertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3849:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NestedImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3855:2: ( (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:3856:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:3856:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:3857:3: otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3861:3: (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID||LA63_0==38) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalAadlV3.g:3862:4: this_NestedImplementationElement_1= ruleNestedImplementationElement[$current]
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
            	    pushFollow(FOLLOW_59);
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
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:3886:1: ruleNestedImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleNestedImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_bindings_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_propertyAssociations_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3892:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:3893:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:3893:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )
            int alt64=5;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:3894:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:3894:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:3895:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:3895:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:3896:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:3914:3: ( (lv_connections_1_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:3914:3: ( (lv_connections_1_0= ruleConnection ) )
                    // InternalAadlV3.g:3915:4: (lv_connections_1_0= ruleConnection )
                    {
                    // InternalAadlV3.g:3915:4: (lv_connections_1_0= ruleConnection )
                    // InternalAadlV3.g:3916:5: lv_connections_1_0= ruleConnection
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
                    // InternalAadlV3.g:3934:3: ( (lv_bindings_2_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3934:3: ( (lv_bindings_2_0= ruleBinding ) )
                    // InternalAadlV3.g:3935:4: (lv_bindings_2_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3935:4: (lv_bindings_2_0= ruleBinding )
                    // InternalAadlV3.g:3936:5: lv_bindings_2_0= ruleBinding
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
                    // InternalAadlV3.g:3954:3: ( (lv_components_3_0= ruleComponent ) )
                    {
                    // InternalAadlV3.g:3954:3: ( (lv_components_3_0= ruleComponent ) )
                    // InternalAadlV3.g:3955:4: (lv_components_3_0= ruleComponent )
                    {
                    // InternalAadlV3.g:3955:4: (lv_components_3_0= ruleComponent )
                    // InternalAadlV3.g:3956:5: lv_components_3_0= ruleComponent
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
                    // InternalAadlV3.g:3974:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3974:3: ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3975:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3975:4: (lv_propertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3976:5: lv_propertyAssociations_4_0= rulePropertyAssociation
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
    // InternalAadlV3.g:3998:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4004:2: ( ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:4005:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4005:2: ( ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:4006:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:4006:3: ( (lv_superClassifiers_0_0= ruleTypeReference ) )
            // InternalAadlV3.g:4007:4: (lv_superClassifiers_0_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4007:4: (lv_superClassifiers_0_0= ruleTypeReference )
            // InternalAadlV3.g:4008:5: lv_superClassifiers_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_superClassifiers_0_0=ruleTypeReference();

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
              						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4025:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==21) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAadlV3.g:4026:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4030:4: ( (lv_superClassifiers_2_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:4031:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:4031:5: (lv_superClassifiers_2_0= ruleTypeReference )
            	    // InternalAadlV3.g:4032:6: lv_superClassifiers_2_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_superClassifiers_2_0=ruleTypeReference();

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
            	      							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalAadlV3.g:4055:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4061:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:4062:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:4062:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:4063:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:4063:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:4064:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:4064:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:4065:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            // InternalAadlV3.g:4082:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==21) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalAadlV3.g:4083:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4087:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:4088:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:4088:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:4089:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop66;
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
    // InternalAadlV3.g:4112:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4118:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:4119:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:4119:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:4120:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:4120:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:4121:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:4121:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:4122:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            // InternalAadlV3.g:4139:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==21) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAadlV3.g:4140:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4144:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:4145:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:4145:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:4146:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop67;
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
    // InternalAadlV3.g:4169:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4175:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:4176:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:4176:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:4177:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:4181:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAadlV3.g:4182:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:4182:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:4183:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:4183:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:4184:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalAadlV3.g:4201:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==21) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalAadlV3.g:4202:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:4206:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:4207:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:4207:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:4208:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4235:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:4235:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:4236:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:4242:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4248:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* ) )
            // InternalAadlV3.g:4249:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4249:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )* )
            // InternalAadlV3.g:4250:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            {
            // InternalAadlV3.g:4250:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:4251:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:4251:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:4252:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:4270:3: ( (lv_assignedClassifiers_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:4271:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4271:4: (lv_assignedClassifiers_2_0= ruleTypeReference )
            // InternalAadlV3.g:4272:5: lv_assignedClassifiers_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            // InternalAadlV3.g:4289:3: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==21) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==RULE_ID) ) {
                        int LA70_3 = input.LA(3);

                        if ( (LA70_3==EOF||LA70_3==19||(LA70_3>=21 && LA70_3<=22)||LA70_3==34||LA70_3==45) ) {
                            alt70=1;
                        }


                    }


                }


                switch (alt70) {
            	case 1 :
            	    // InternalAadlV3.g:4290:4: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4294:4: ( (lv_assignedClassifiers_4_0= ruleTypeReference ) )
            	    // InternalAadlV3.g:4295:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    {
            	    // InternalAadlV3.g:4295:5: (lv_assignedClassifiers_4_0= ruleTypeReference )
            	    // InternalAadlV3.g:4296:6: lv_assignedClassifiers_4_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
    // $ANTLR end "ruleConfigurationActual"


    // $ANTLR start "entryRuleWorkingset"
    // InternalAadlV3.g:4318:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:4318:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:4319:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:4325:1: ruleWorkingset returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) )* otherlv_6= 'end' otherlv_7= ';' ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_UseProps_4 = null;

        EObject lv_rootComponents_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4331:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) )* otherlv_6= 'end' otherlv_7= ';' ) )
            // InternalAadlV3.g:4332:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) )* otherlv_6= 'end' otherlv_7= ';' )
            {
            // InternalAadlV3.g:4332:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) )* otherlv_6= 'end' otherlv_7= ';' )
            // InternalAadlV3.g:4333:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_rootComponents_5_0= ruleComponent ) )* otherlv_6= 'end' otherlv_7= ';'
            {
            // InternalAadlV3.g:4333:3: ( (lv_private_0_0= 'private' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==11) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAadlV3.g:4334:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:4334:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:4335:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,11,FOLLOW_61); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1());
              		
            }
            // InternalAadlV3.g:4351:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:4352:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:4352:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:4353:5: lv_name_2_0= ruleQualifiedName
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

            otherlv_3=(Token)match(input,13,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWorkingsetAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:4374:3: (this_UseProps_4= ruleUseProps[$current] )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==32) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAadlV3.g:4375:4: this_UseProps_4= ruleUseProps[$current]
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
                    pushFollow(FOLLOW_63);
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

            // InternalAadlV3.g:4390:3: ( (lv_rootComponents_5_0= ruleComponent ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAadlV3.g:4391:4: (lv_rootComponents_5_0= ruleComponent )
            	    {
            	    // InternalAadlV3.g:4391:4: (lv_rootComponents_5_0= ruleComponent )
            	    // InternalAadlV3.g:4392:5: lv_rootComponents_5_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWorkingsetAccess().getEndKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAadlV3.g:4421:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:4421:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:4422:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:4428:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4434:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:4435:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:4435:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:4436:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4455:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:4455:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:4456:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:4462:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4468:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4469:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4469:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4470:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4493:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:4493:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:4494:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:4500:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4506:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:4507:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:4507:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:4508:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:4515:3: (kw= '::' this_ID_2= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==45) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAadlV3.g:4516:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedTypesReference"
    // InternalAadlV3.g:4533:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:4533:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:4534:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
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
    // InternalAadlV3.g:4540:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4546:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:4547:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:4547:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:4548:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:4558:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==34) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAadlV3.g:4559:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4576:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:4576:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:4577:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
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
    // InternalAadlV3.g:4583:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4589:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:4590:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalAadlV3.g:4603:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:4603:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:4604:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
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
    // InternalAadlV3.g:4610:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4616:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:4617:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:4617:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:4618:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
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
    // InternalAadlV3.g:4644:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:4644:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:4645:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:4651:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:4657:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:4658:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:4658:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt76=16;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalAadlV3.g:4659:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4665:3: kw= 'bus'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4671:3: kw= 'data'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4677:3: kw= 'device'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4683:3: kw= 'memory'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4689:3: kw= 'process'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:4695:3: kw= 'processor'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:4701:3: kw= 'system'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:4707:3: kw= 'thread'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4713:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:4724:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:4735:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:4746:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:4757:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:4763:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:4774:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:4788:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:4788:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:4789:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:4795:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
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
            // InternalAadlV3.g:4801:2: ( (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:4802:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:4802:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt77=10;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalAadlV3.g:4803:3: kw= 'feature'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4809:3: kw= 'port'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4815:3: kw= 'parameter'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4821:3: this_DataAccessKeywords_3= ruleDataAccessKeywords
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
                    // InternalAadlV3.g:4832:3: this_BusAccessKeywords_4= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:4843:3: this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords
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
                    // InternalAadlV3.g:4854:3: this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords
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
                    // InternalAadlV3.g:4865:3: this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords
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
                    // InternalAadlV3.g:4876:3: kw= 'binding'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:4882:3: kw= 'interface'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:4891:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:4891:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:4892:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:4898:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:4904:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:4905:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:4905:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt78=11;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalAadlV3.g:4906:3: kw= 'in'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4912:3: kw= 'out'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4918:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:4929:3: kw= 'requires'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4935:3: kw= 'provides'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:4941:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:4952:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:4963:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:4974:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:4985:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:4996:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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
    // InternalAadlV3.g:5010:1: entryRuleAssociationType returns [String current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final String entryRuleAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationType = null;


        try {
            // InternalAadlV3.g:5010:55: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalAadlV3.g:5011:2: iv_ruleAssociationType= ruleAssociationType EOF
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
    // InternalAadlV3.g:5017:1: ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) ;
    public final AntlrDatatypeRuleToken ruleAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IsConnection_0 = null;

        AntlrDatatypeRuleToken this_IsBinding_1 = null;

        AntlrDatatypeRuleToken this_IsFlow_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5023:2: ( (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) )
            // InternalAadlV3.g:5024:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            {
            // InternalAadlV3.g:5024:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt79=1;
                }
                break;
            case 59:
                {
                alt79=2;
                }
                break;
            case 33:
                {
                alt79=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalAadlV3.g:5025:3: this_IsConnection_0= ruleIsConnection
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
                    // InternalAadlV3.g:5036:3: this_IsBinding_1= ruleIsBinding
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
                    // InternalAadlV3.g:5047:3: this_IsFlow_2= ruleIsFlow
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
    // InternalAadlV3.g:5061:1: entryRuleIsConnection returns [String current=null] : iv_ruleIsConnection= ruleIsConnection EOF ;
    public final String entryRuleIsConnection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsConnection = null;


        try {
            // InternalAadlV3.g:5061:52: (iv_ruleIsConnection= ruleIsConnection EOF )
            // InternalAadlV3.g:5062:2: iv_ruleIsConnection= ruleIsConnection EOF
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
    // InternalAadlV3.g:5068:1: ruleIsConnection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'connection' ;
    public final AntlrDatatypeRuleToken ruleIsConnection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5074:2: (kw= 'connection' )
            // InternalAadlV3.g:5075:2: kw= 'connection'
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5083:1: entryRuleIsBinding returns [String current=null] : iv_ruleIsBinding= ruleIsBinding EOF ;
    public final String entryRuleIsBinding() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsBinding = null;


        try {
            // InternalAadlV3.g:5083:49: (iv_ruleIsBinding= ruleIsBinding EOF )
            // InternalAadlV3.g:5084:2: iv_ruleIsBinding= ruleIsBinding EOF
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
    // InternalAadlV3.g:5090:1: ruleIsBinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'binding' ;
    public final AntlrDatatypeRuleToken ruleIsBinding() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5096:2: (kw= 'binding' )
            // InternalAadlV3.g:5097:2: kw= 'binding'
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5105:1: entryRuleIsFlowSource returns [String current=null] : iv_ruleIsFlowSource= ruleIsFlowSource EOF ;
    public final String entryRuleIsFlowSource() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlowSource = null;


        try {
            // InternalAadlV3.g:5105:52: (iv_ruleIsFlowSource= ruleIsFlowSource EOF )
            // InternalAadlV3.g:5106:2: iv_ruleIsFlowSource= ruleIsFlowSource EOF
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
    // InternalAadlV3.g:5112:1: ruleIsFlowSource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleIsFlowSource() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5118:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:5119:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
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
    // InternalAadlV3.g:5132:1: entryRuleIsFlowSink returns [String current=null] : iv_ruleIsFlowSink= ruleIsFlowSink EOF ;
    public final String entryRuleIsFlowSink() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlowSink = null;


        try {
            // InternalAadlV3.g:5132:50: (iv_ruleIsFlowSink= ruleIsFlowSink EOF )
            // InternalAadlV3.g:5133:2: iv_ruleIsFlowSink= ruleIsFlowSink EOF
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
    // InternalAadlV3.g:5139:1: ruleIsFlowSink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleIsFlowSink() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5145:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:5146:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
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
    // InternalAadlV3.g:5159:1: entryRuleIsFlow returns [String current=null] : iv_ruleIsFlow= ruleIsFlow EOF ;
    public final String entryRuleIsFlow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlow = null;


        try {
            // InternalAadlV3.g:5159:46: (iv_ruleIsFlow= ruleIsFlow EOF )
            // InternalAadlV3.g:5160:2: iv_ruleIsFlow= ruleIsFlow EOF
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
    // InternalAadlV3.g:5166:1: ruleIsFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'flow' ;
    public final AntlrDatatypeRuleToken ruleIsFlow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5172:2: (kw= 'flow' )
            // InternalAadlV3.g:5173:2: kw= 'flow'
            {
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulePropertyAssociationType"
    // InternalAadlV3.g:5181:1: entryRulePropertyAssociationType returns [String current=null] : iv_rulePropertyAssociationType= rulePropertyAssociationType EOF ;
    public final String entryRulePropertyAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAssociationType = null;


        try {
            // InternalAadlV3.g:5181:63: (iv_rulePropertyAssociationType= rulePropertyAssociationType EOF )
            // InternalAadlV3.g:5182:2: iv_rulePropertyAssociationType= rulePropertyAssociationType EOF
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
    // InternalAadlV3.g:5188:1: rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=>' | kw= '=' | kw= '*=>' ) ;
    public final AntlrDatatypeRuleToken rulePropertyAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5194:2: ( (kw= '=>' | kw= '=' | kw= '*=>' ) )
            // InternalAadlV3.g:5195:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            {
            // InternalAadlV3.g:5195:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt80=1;
                }
                break;
            case 65:
                {
                alt80=2;
                }
                break;
            case 66:
                {
                alt80=3;
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
                    // InternalAadlV3.g:5196:3: kw= '=>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5202:3: kw= '='
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5208:3: kw= '*=>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVirtualProcessorKeywords"
    // InternalAadlV3.g:5217:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:5217:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:5218:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:5224:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5230:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:5231:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:5231:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:5232:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,67,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5246:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:5246:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:5247:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:5253:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5259:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:5260:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:5260:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:5261:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,67,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5275:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:5275:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:5276:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:5282:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5288:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:5289:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:5289:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:5290:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,67,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5304:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:5304:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:5305:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:5311:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5317:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:5318:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:5318:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:5319:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,67,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5333:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:5333:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:5334:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:5340:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5346:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:5347:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:5347:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:5348:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,54,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5362:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:5362:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:5363:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:5369:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5375:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:5376:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:5376:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:5377:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,55,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5391:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:5391:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:5392:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
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
    // InternalAadlV3.g:5398:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5404:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:5405:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:5405:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:5406:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,33,FOLLOW_72); if (state.failed) return current;
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
    // InternalAadlV3.g:5420:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:5420:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:5421:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
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
    // InternalAadlV3.g:5427:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5433:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:5434:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:5434:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:5435:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,33,FOLLOW_73); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInOutKeywords"
    // InternalAadlV3.g:5449:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:5449:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:5450:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:5456:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5462:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5463:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5463:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5464:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5478:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:5478:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:5479:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:5485:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5491:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:5492:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:5492:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:5493:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,47,FOLLOW_75); if (state.failed) return current;
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
    // InternalAadlV3.g:5507:1: entryRuleVirtualBusAccessKeywords returns [String current=null] : iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF ;
    public final String entryRuleVirtualBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:5507:64: (iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF )
            // InternalAadlV3.g:5508:2: iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF
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
    // InternalAadlV3.g:5514:1: ruleVirtualBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5520:2: ( (kw= 'virtual' kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:5521:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:5521:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:5522:3: kw= 'virtual' kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,67,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,47,FOLLOW_75); if (state.failed) return current;
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
    // InternalAadlV3.g:5541:1: entryRuleDataAccessKeywords returns [String current=null] : iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF ;
    public final String entryRuleDataAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataAccessKeywords = null;


        try {
            // InternalAadlV3.g:5541:58: (iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF )
            // InternalAadlV3.g:5542:2: iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF
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
    // InternalAadlV3.g:5548:1: ruleDataAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'data' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleDataAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5554:2: ( (kw= 'data' kw= 'access' ) )
            // InternalAadlV3.g:5555:2: (kw= 'data' kw= 'access' )
            {
            // InternalAadlV3.g:5555:2: (kw= 'data' kw= 'access' )
            // InternalAadlV3.g:5556:3: kw= 'data' kw= 'access'
            {
            kw=(Token)match(input,48,FOLLOW_75); if (state.failed) return current;
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
    // InternalAadlV3.g:5570:1: entryRuleSubprogramAccessKeywords returns [String current=null] : iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF ;
    public final String entryRuleSubprogramAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramAccessKeywords = null;


        try {
            // InternalAadlV3.g:5570:64: (iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF )
            // InternalAadlV3.g:5571:2: iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF
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
    // InternalAadlV3.g:5577:1: ruleSubprogramAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5583:2: ( (kw= 'subprogram' kw= 'access' ) )
            // InternalAadlV3.g:5584:2: (kw= 'subprogram' kw= 'access' )
            {
            // InternalAadlV3.g:5584:2: (kw= 'subprogram' kw= 'access' )
            // InternalAadlV3.g:5585:3: kw= 'subprogram' kw= 'access'
            {
            kw=(Token)match(input,55,FOLLOW_75); if (state.failed) return current;
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
    // InternalAadlV3.g:5599:1: entryRuleSubprogramGroupAccessKeywords returns [String current=null] : iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF ;
    public final String entryRuleSubprogramGroupAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupAccessKeywords = null;


        try {
            // InternalAadlV3.g:5599:69: (iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF )
            // InternalAadlV3.g:5600:2: iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF
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
    // InternalAadlV3.g:5606:1: ruleSubprogramGroupAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5612:2: ( (kw= 'subprogram' kw= 'group' kw= 'access' ) )
            // InternalAadlV3.g:5613:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            {
            // InternalAadlV3.g:5613:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            // InternalAadlV3.g:5614:3: kw= 'subprogram' kw= 'group' kw= 'access'
            {
            kw=(Token)match(input,55,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_75); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProvidesReadKeywords"
    // InternalAadlV3.g:5633:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:5633:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:5634:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:5640:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5646:2: ( (kw= 'provides' kw= 'in' ) )
            // InternalAadlV3.g:5647:2: (kw= 'provides' kw= 'in' )
            {
            // InternalAadlV3.g:5647:2: (kw= 'provides' kw= 'in' )
            // InternalAadlV3.g:5648:3: kw= 'provides' kw= 'in'
            {
            kw=(Token)match(input,63,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5662:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:5662:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:5663:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:5669:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5675:2: ( (kw= 'requires' kw= 'in' ) )
            // InternalAadlV3.g:5676:2: (kw= 'requires' kw= 'in' )
            {
            // InternalAadlV3.g:5676:2: (kw= 'requires' kw= 'in' )
            // InternalAadlV3.g:5677:3: kw= 'requires' kw= 'in'
            {
            kw=(Token)match(input,62,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5691:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:5691:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:5692:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:5698:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5704:2: ( (kw= 'provides' kw= 'out' ) )
            // InternalAadlV3.g:5705:2: (kw= 'provides' kw= 'out' )
            {
            // InternalAadlV3.g:5705:2: (kw= 'provides' kw= 'out' )
            // InternalAadlV3.g:5706:3: kw= 'provides' kw= 'out'
            {
            kw=(Token)match(input,63,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5720:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:5720:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:5721:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:5727:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5733:2: ( (kw= 'requires' kw= 'out' ) )
            // InternalAadlV3.g:5734:2: (kw= 'requires' kw= 'out' )
            {
            // InternalAadlV3.g:5734:2: (kw= 'requires' kw= 'out' )
            // InternalAadlV3.g:5735:3: kw= 'requires' kw= 'out'
            {
            kw=(Token)match(input,62,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5749:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:5749:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:5750:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:5756:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5762:2: ( (kw= 'provides' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5763:2: (kw= 'provides' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5763:2: (kw= 'provides' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5764:3: kw= 'provides' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,63,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:5783:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:5783:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:5784:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:5790:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:5796:2: ( (kw= 'requires' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:5797:2: (kw= 'requires' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:5797:2: (kw= 'requires' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:5798:3: kw= 'requires' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,62,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred16_InternalAadlV3
    public final void synpred16_InternalAadlV3_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;


        // InternalAadlV3.g:483:3: ( ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) )
        // InternalAadlV3.g:483:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        {
        // InternalAadlV3.g:483:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        // InternalAadlV3.g:484:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        {
        // InternalAadlV3.g:484:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        // InternalAadlV3.g:485:5: lv_featureCategories_1_0= ruleFeatureCategory
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
    // $ANTLR end synpred16_InternalAadlV3

    // $ANTLR start synpred60_InternalAadlV3
    public final void synpred60_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2491:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2491:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2491:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2492:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2492:5: ()
        // InternalAadlV3.g:2493:5: 
        {
        }

        match(input,34,FOLLOW_4); if (state.failed) return ;
        // InternalAadlV3.g:2495:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2496:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2496:6: ( RULE_ID )
        // InternalAadlV3.g:2497:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred60_InternalAadlV3

    // $ANTLR start synpred72_InternalAadlV3
    public final void synpred72_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:3204:4: ( '.' )
        // InternalAadlV3.g:3204:5: '.'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalAadlV3

    // Delegated rules

    public final boolean synpred60_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalAadlV3_fragment(); // can never throw exception
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\13\1\14\2\uffff\11\4\1\57\1\4\6\uffff\6\4";
    static final String dfa_3s = "\2\103\2\uffff\10\33\1\104\1\64\1\104\6\uffff\6\33";
    static final String dfa_4s = "\2\uffff\1\1\1\2\13\uffff\1\3\1\5\1\6\1\7\1\10\1\4\6\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\3\uffff\1\21\6\uffff\1\22\2\uffff\1\3\1\17\1\uffff\1\20\15\uffff\1\23\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\13\uffff\1\15",
            "\1\2\3\uffff\1\21\6\uffff\1\22\2\uffff\1\3\1\17\1\uffff\1\20\15\uffff\1\23\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\13\uffff\1\15",
            "",
            "",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17\50\uffff\1\25",
            "\1\31\1\uffff\1\27\1\30\1\uffff\1\26",
            "\1\24\26\uffff\1\17\50\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17",
            "\1\24\26\uffff\1\17"
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
            return "205:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_DataType_1= ruleDataType | this_ComponentInterface_2= ruleComponentInterface | this_ComponentImplementation_3= ruleComponentImplementation | this_ComponentConfiguration_4= ruleComponentConfiguration | this_PropertyDefinition_5= rulePropertyDefinition | this_PropertySet_6= rulePropertySet | this_Workingset_7= ruleWorkingset )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\uffff\2\1\1\uffff\1\1\3\uffff\2\1";
    static final String dfa_9s = "\1\33\1\uffff\2\25\1\57\1\25\1\uffff\1\0\1\uffff\2\25";
    static final String dfa_10s = "\1\103\1\uffff\2\107\1\64\1\107\1\uffff\1\0\1\uffff\2\107";
    static final String dfa_11s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String dfa_12s = "\7\uffff\1\0\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\5\uffff\1\10\14\uffff\1\1\1\2\1\3\6\1\1\5\3\6\1\7\4\uffff\1\10\2\uffff\1\4",
            "",
            "\2\1\60\uffff\1\6",
            "\2\1\60\uffff\1\6",
            "\1\11\1\uffff\2\1\1\uffff\1\1",
            "\2\1\55\uffff\1\12\2\uffff\1\6",
            "",
            "\1\uffff",
            "",
            "\2\1\60\uffff\1\6",
            "\2\1\60\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "462:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalAadlV3()) ) {s = 6;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\4\1\21\2\uffff\1\33\1\4\4\uffff";
    static final String dfa_16s = "\1\50\1\46\2\uffff\1\103\1\106\4\uffff";
    static final String dfa_17s = "\2\uffff\1\5\1\6\2\uffff\1\1\1\4\1\3\1\2";
    static final String dfa_18s = "\12\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\41\uffff\1\2\1\uffff\1\3",
            "\1\4\20\uffff\1\2\3\uffff\1\2",
            "",
            "",
            "\1\6\5\uffff\1\5\15\uffff\2\6\6\uffff\11\6\3\uffff\1\6",
            "\1\11\100\uffff\1\10\1\7",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "873:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_20s = "\17\uffff";
    static final String dfa_21s = "\1\4\1\21\3\uffff\3\4\4\uffff\1\42\2\uffff";
    static final String dfa_22s = "\1\50\1\46\3\uffff\1\103\1\4\1\41\4\uffff\1\46\2\uffff";
    static final String dfa_23s = "\2\uffff\1\7\1\10\1\11\3\uffff\1\4\1\2\1\1\1\3\1\uffff\1\5\1\6";
    static final String dfa_24s = "\17\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\17\uffff\1\2\21\uffff\1\3\1\uffff\1\4",
            "\1\5\20\uffff\1\6\2\uffff\1\7\1\3",
            "",
            "",
            "",
            "\1\11\34\uffff\1\10\14\uffff\12\13\3\uffff\1\11\4\uffff\1\12\2\uffff\1\13",
            "\1\14",
            "\1\16\23\uffff\1\16\10\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\6\2\uffff\1\7\1\3",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1151:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleComponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_propertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_26s = "\6\uffff";
    static final String dfa_27s = "\1\4\1\17\1\4\2\uffff\1\17";
    static final String dfa_28s = "\1\4\1\55\1\4\2\uffff\1\55";
    static final String dfa_29s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_30s = "\6\uffff}>";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\4\24\uffff\1\4\7\uffff\1\3\1\2",
            "\1\5",
            "",
            "",
            "\1\4\24\uffff\1\4\7\uffff\1\3\1\2"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2558:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_32s = "\11\uffff";
    static final String dfa_33s = "\1\4\1\21\3\uffff\1\4\2\uffff\1\42";
    static final String dfa_34s = "\1\50\1\46\3\uffff\1\4\2\uffff\1\46";
    static final String dfa_35s = "\2\uffff\1\1\1\4\1\5\1\uffff\1\3\1\2\1\uffff";
    static final String dfa_36s = "\11\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\17\uffff\1\3\21\uffff\1\2\1\uffff\1\4",
            "\1\7\20\uffff\1\5\2\uffff\1\6\1\2",
            "",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\6\1\2"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3324:2: ( ( (lv_propertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_38s = "\20\uffff";
    static final String dfa_39s = "\1\4\1\21\1\uffff\1\4\1\uffff\2\4\1\57\1\4\1\uffff\1\4\2\uffff\2\4\1\17";
    static final String dfa_40s = "\2\46\1\uffff\1\103\1\uffff\2\107\1\64\1\107\1\uffff\1\50\2\uffff\2\107\1\55";
    static final String dfa_41s = "\2\uffff\1\5\1\uffff\1\4\4\uffff\1\1\1\uffff\1\2\1\3\3\uffff";
    static final String dfa_42s = "\20\uffff}>";
    static final String[] dfa_43s = {
            "\1\1\41\uffff\1\2",
            "\1\3\20\uffff\1\2\3\uffff\1\2",
            "",
            "\1\14\26\uffff\1\11\22\uffff\1\4\1\5\1\6\6\4\1\10\3\11\1\12\4\11\1\13\2\uffff\1\7",
            "",
            "\1\4\12\uffff\1\4\10\uffff\1\4\56\uffff\1\11",
            "\1\4\12\uffff\1\4\10\uffff\1\4\56\uffff\1\11",
            "\1\15\1\uffff\2\4\1\uffff\1\4",
            "\1\4\12\uffff\1\4\10\uffff\1\4\53\uffff\1\16\2\uffff\1\11",
            "",
            "\1\17\12\uffff\1\11\10\uffff\1\11\16\uffff\2\11",
            "",
            "",
            "\1\4\12\uffff\1\4\10\uffff\1\4\56\uffff\1\11",
            "\1\4\12\uffff\1\4\10\uffff\1\4\56\uffff\1\11",
            "\1\11\10\uffff\1\11\5\uffff\1\14\3\uffff\1\14\5\uffff\1\11\4\uffff\1\11"
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "3893:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleComponent ) ) | ( (lv_propertyAssociations_4_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_44s = "\24\uffff";
    static final String dfa_45s = "\11\uffff\1\15\1\uffff\1\23\10\uffff";
    static final String dfa_46s = "\1\56\10\uffff\1\4\1\57\1\4\10\uffff";
    static final String dfa_47s = "\1\103\10\uffff\1\104\1\64\1\104\10\uffff";
    static final String dfa_48s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\13\1\15\1\14\1\12\1\17\1\16";
    static final String dfa_49s = "\24\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\13\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\12\uffff\1\15\5\uffff\2\15\1\uffff\1\15\2\uffff\1\15\50\uffff\1\14",
            "\1\21\1\uffff\1\17\1\20\1\uffff\1\16",
            "\1\23\12\uffff\1\23\5\uffff\2\23\1\uffff\1\23\2\uffff\1\23\50\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "4658:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_51s = "\14\uffff";
    static final String dfa_52s = "\1\33\6\uffff\1\104\4\uffff";
    static final String dfa_53s = "\1\103\6\uffff\1\107\4\uffff";
    static final String dfa_54s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\10\1\7";
    static final String dfa_55s = "\14\uffff}>";
    static final String[] dfa_56s = {
            "\1\11\23\uffff\1\5\1\4\6\uffff\1\7\1\1\1\2\1\3\1\10\7\uffff\1\6",
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

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "4802:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )";
        }
    }
    static final String dfa_57s = "\21\uffff";
    static final String dfa_58s = "\1\uffff\1\6\1\uffff\1\7\1\14\4\uffff\1\16\1\20\6\uffff";
    static final String dfa_59s = "\1\74\1\33\1\uffff\2\33\4\uffff\2\33\6\uffff";
    static final String dfa_60s = "\1\77\1\103\1\uffff\2\103\4\uffff\2\103\6\uffff";
    static final String dfa_61s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\4\1\11\2\uffff\1\10\1\5\1\13\1\7\1\12\1\6";
    static final String dfa_62s = "\21\uffff}>";
    static final String[] dfa_63s = {
            "\1\1\1\2\1\3\1\4",
            "\1\6\23\uffff\2\6\6\uffff\5\6\1\uffff\1\5\5\uffff\1\6",
            "",
            "\1\7\23\uffff\2\7\6\uffff\5\7\1\11\1\10\5\uffff\1\7",
            "\1\14\23\uffff\2\14\6\uffff\5\14\1\12\1\13\5\uffff\1\14",
            "",
            "",
            "",
            "",
            "\1\16\23\uffff\2\16\6\uffff\5\16\1\uffff\1\15\5\uffff\1\16",
            "\1\20\23\uffff\2\20\6\uffff\5\20\1\uffff\1\17\5\uffff\1\20",
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

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_57;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_62;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "4905:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00FFC8082C815800L,0x0000000000000008L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0FFFC00208100000L,0x0000000000000009L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00FFC00008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000014000004010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00FFC00000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000014000104010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010082000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xFF81800008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0F81800008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001C001008010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000014001008010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000041008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001208010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000014000100010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000014002100010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000004002000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x1000000000000000L});

}