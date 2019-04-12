package org.osate.xtext.emv3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.osate.xtext.emv3.services.Emv3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmv3Parser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Emv3GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePackageEMV3"
    // InternalEmv3.g:53:1: entryRulePackageEMV3 : rulePackageEMV3 EOF ;
    public final void entryRulePackageEMV3() throws RecognitionException {
        try {
            // InternalEmv3.g:54:1: ( rulePackageEMV3 EOF )
            // InternalEmv3.g:55:1: rulePackageEMV3 EOF
            {
             before(grammarAccess.getPackageEMV3Rule()); 
            pushFollow(FOLLOW_1);
            rulePackageEMV3();

            state._fsp--;

             after(grammarAccess.getPackageEMV3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageEMV3"


    // $ANTLR start "rulePackageEMV3"
    // InternalEmv3.g:62:1: rulePackageEMV3 : ( ( rule__PackageEMV3__Group__0 ) ) ;
    public final void rulePackageEMV3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:66:2: ( ( ( rule__PackageEMV3__Group__0 ) ) )
            // InternalEmv3.g:67:2: ( ( rule__PackageEMV3__Group__0 ) )
            {
            // InternalEmv3.g:67:2: ( ( rule__PackageEMV3__Group__0 ) )
            // InternalEmv3.g:68:3: ( rule__PackageEMV3__Group__0 )
            {
             before(grammarAccess.getPackageEMV3Access().getGroup()); 
            // InternalEmv3.g:69:3: ( rule__PackageEMV3__Group__0 )
            // InternalEmv3.g:69:4: rule__PackageEMV3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageEMV3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageEMV3"


    // $ANTLR start "entryRuleErrorType"
    // InternalEmv3.g:78:1: entryRuleErrorType : ruleErrorType EOF ;
    public final void entryRuleErrorType() throws RecognitionException {
        try {
            // InternalEmv3.g:79:1: ( ruleErrorType EOF )
            // InternalEmv3.g:80:1: ruleErrorType EOF
            {
             before(grammarAccess.getErrorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorType();

            state._fsp--;

             after(grammarAccess.getErrorTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErrorType"


    // $ANTLR start "ruleErrorType"
    // InternalEmv3.g:87:1: ruleErrorType : ( ( rule__ErrorType__Group__0 ) ) ;
    public final void ruleErrorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:91:2: ( ( ( rule__ErrorType__Group__0 ) ) )
            // InternalEmv3.g:92:2: ( ( rule__ErrorType__Group__0 ) )
            {
            // InternalEmv3.g:92:2: ( ( rule__ErrorType__Group__0 ) )
            // InternalEmv3.g:93:3: ( rule__ErrorType__Group__0 )
            {
             before(grammarAccess.getErrorTypeAccess().getGroup()); 
            // InternalEmv3.g:94:3: ( rule__ErrorType__Group__0 )
            // InternalEmv3.g:94:4: rule__ErrorType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorType"


    // $ANTLR start "entryRuleSubclause"
    // InternalEmv3.g:103:1: entryRuleSubclause : ruleSubclause EOF ;
    public final void entryRuleSubclause() throws RecognitionException {
        try {
            // InternalEmv3.g:104:1: ( ruleSubclause EOF )
            // InternalEmv3.g:105:1: ruleSubclause EOF
            {
             before(grammarAccess.getSubclauseRule()); 
            pushFollow(FOLLOW_1);
            ruleSubclause();

            state._fsp--;

             after(grammarAccess.getSubclauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubclause"


    // $ANTLR start "ruleSubclause"
    // InternalEmv3.g:112:1: ruleSubclause : ( ( rule__Subclause__Group__0 ) ) ;
    public final void ruleSubclause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:116:2: ( ( ( rule__Subclause__Group__0 ) ) )
            // InternalEmv3.g:117:2: ( ( rule__Subclause__Group__0 ) )
            {
            // InternalEmv3.g:117:2: ( ( rule__Subclause__Group__0 ) )
            // InternalEmv3.g:118:3: ( rule__Subclause__Group__0 )
            {
             before(grammarAccess.getSubclauseAccess().getGroup()); 
            // InternalEmv3.g:119:3: ( rule__Subclause__Group__0 )
            // InternalEmv3.g:119:4: rule__Subclause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subclause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubclauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubclause"


    // $ANTLR start "entryRuleErrorPropagation"
    // InternalEmv3.g:128:1: entryRuleErrorPropagation : ruleErrorPropagation EOF ;
    public final void entryRuleErrorPropagation() throws RecognitionException {
        try {
            // InternalEmv3.g:129:1: ( ruleErrorPropagation EOF )
            // InternalEmv3.g:130:1: ruleErrorPropagation EOF
            {
             before(grammarAccess.getErrorPropagationRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorPropagation();

            state._fsp--;

             after(grammarAccess.getErrorPropagationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErrorPropagation"


    // $ANTLR start "ruleErrorPropagation"
    // InternalEmv3.g:137:1: ruleErrorPropagation : ( ( rule__ErrorPropagation__Group__0 ) ) ;
    public final void ruleErrorPropagation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:141:2: ( ( ( rule__ErrorPropagation__Group__0 ) ) )
            // InternalEmv3.g:142:2: ( ( rule__ErrorPropagation__Group__0 ) )
            {
            // InternalEmv3.g:142:2: ( ( rule__ErrorPropagation__Group__0 ) )
            // InternalEmv3.g:143:3: ( rule__ErrorPropagation__Group__0 )
            {
             before(grammarAccess.getErrorPropagationAccess().getGroup()); 
            // InternalEmv3.g:144:3: ( rule__ErrorPropagation__Group__0 )
            // InternalEmv3.g:144:4: rule__ErrorPropagation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorPropagationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorPropagation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEmv3.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEmv3.g:154:1: ( ruleQualifiedName EOF )
            // InternalEmv3.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEmv3.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEmv3.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEmv3.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEmv3.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalEmv3.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalEmv3.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleClassifierName"
    // InternalEmv3.g:178:1: entryRuleClassifierName : ruleClassifierName EOF ;
    public final void entryRuleClassifierName() throws RecognitionException {
        try {
            // InternalEmv3.g:179:1: ( ruleClassifierName EOF )
            // InternalEmv3.g:180:1: ruleClassifierName EOF
            {
             before(grammarAccess.getClassifierNameRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifierName();

            state._fsp--;

             after(grammarAccess.getClassifierNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassifierName"


    // $ANTLR start "ruleClassifierName"
    // InternalEmv3.g:187:1: ruleClassifierName : ( ( rule__ClassifierName__Group__0 ) ) ;
    public final void ruleClassifierName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:191:2: ( ( ( rule__ClassifierName__Group__0 ) ) )
            // InternalEmv3.g:192:2: ( ( rule__ClassifierName__Group__0 ) )
            {
            // InternalEmv3.g:192:2: ( ( rule__ClassifierName__Group__0 ) )
            // InternalEmv3.g:193:3: ( rule__ClassifierName__Group__0 )
            {
             before(grammarAccess.getClassifierNameAccess().getGroup()); 
            // InternalEmv3.g:194:3: ( rule__ClassifierName__Group__0 )
            // InternalEmv3.g:194:4: rule__ClassifierName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassifierNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifierName"


    // $ANTLR start "rule__PackageEMV3__Alternatives_3"
    // InternalEmv3.g:202:1: rule__PackageEMV3__Alternatives_3 : ( ( ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* ) ) | ( ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* ) ) );
    public final void rule__PackageEMV3__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:206:1: ( ( ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* ) ) | ( ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* ) ) )
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
                    // InternalEmv3.g:207:2: ( ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* ) )
                    {
                    // InternalEmv3.g:207:2: ( ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* ) )
                    // InternalEmv3.g:208:3: ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* )
                    {
                    // InternalEmv3.g:208:3: ( ( rule__PackageEMV3__ElementsAssignment_3_0 ) )
                    // InternalEmv3.g:209:4: ( rule__PackageEMV3__ElementsAssignment_3_0 )
                    {
                     before(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_0()); 
                    // InternalEmv3.g:210:4: ( rule__PackageEMV3__ElementsAssignment_3_0 )
                    // InternalEmv3.g:210:5: rule__PackageEMV3__ElementsAssignment_3_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__PackageEMV3__ElementsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_0()); 

                    }

                    // InternalEmv3.g:213:3: ( ( rule__PackageEMV3__ElementsAssignment_3_0 )* )
                    // InternalEmv3.g:214:4: ( rule__PackageEMV3__ElementsAssignment_3_0 )*
                    {
                     before(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_0()); 
                    // InternalEmv3.g:215:4: ( rule__PackageEMV3__ElementsAssignment_3_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEmv3.g:215:5: rule__PackageEMV3__ElementsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__PackageEMV3__ElementsAssignment_3_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEmv3.g:220:2: ( ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* ) )
                    {
                    // InternalEmv3.g:220:2: ( ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* ) )
                    // InternalEmv3.g:221:3: ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) ) ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* )
                    {
                    // InternalEmv3.g:221:3: ( ( rule__PackageEMV3__ElementsAssignment_3_1 ) )
                    // InternalEmv3.g:222:4: ( rule__PackageEMV3__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_1()); 
                    // InternalEmv3.g:223:4: ( rule__PackageEMV3__ElementsAssignment_3_1 )
                    // InternalEmv3.g:223:5: rule__PackageEMV3__ElementsAssignment_3_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__PackageEMV3__ElementsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_1()); 

                    }

                    // InternalEmv3.g:226:3: ( ( rule__PackageEMV3__ElementsAssignment_3_1 )* )
                    // InternalEmv3.g:227:4: ( rule__PackageEMV3__ElementsAssignment_3_1 )*
                    {
                     before(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_1()); 
                    // InternalEmv3.g:228:4: ( rule__PackageEMV3__ElementsAssignment_3_1 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalEmv3.g:228:5: rule__PackageEMV3__ElementsAssignment_3_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__PackageEMV3__ElementsAssignment_3_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Alternatives_3"


    // $ANTLR start "rule__PackageEMV3__Group__0"
    // InternalEmv3.g:237:1: rule__PackageEMV3__Group__0 : rule__PackageEMV3__Group__0__Impl rule__PackageEMV3__Group__1 ;
    public final void rule__PackageEMV3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:241:1: ( rule__PackageEMV3__Group__0__Impl rule__PackageEMV3__Group__1 )
            // InternalEmv3.g:242:2: rule__PackageEMV3__Group__0__Impl rule__PackageEMV3__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PackageEMV3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__0"


    // $ANTLR start "rule__PackageEMV3__Group__0__Impl"
    // InternalEmv3.g:249:1: rule__PackageEMV3__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageEMV3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:253:1: ( ( 'package' ) )
            // InternalEmv3.g:254:1: ( 'package' )
            {
            // InternalEmv3.g:254:1: ( 'package' )
            // InternalEmv3.g:255:2: 'package'
            {
             before(grammarAccess.getPackageEMV3Access().getPackageKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageEMV3Access().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__0__Impl"


    // $ANTLR start "rule__PackageEMV3__Group__1"
    // InternalEmv3.g:264:1: rule__PackageEMV3__Group__1 : rule__PackageEMV3__Group__1__Impl rule__PackageEMV3__Group__2 ;
    public final void rule__PackageEMV3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:268:1: ( rule__PackageEMV3__Group__1__Impl rule__PackageEMV3__Group__2 )
            // InternalEmv3.g:269:2: rule__PackageEMV3__Group__1__Impl rule__PackageEMV3__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PackageEMV3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__1"


    // $ANTLR start "rule__PackageEMV3__Group__1__Impl"
    // InternalEmv3.g:276:1: rule__PackageEMV3__Group__1__Impl : ( ( rule__PackageEMV3__NameAssignment_1 ) ) ;
    public final void rule__PackageEMV3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:280:1: ( ( ( rule__PackageEMV3__NameAssignment_1 ) ) )
            // InternalEmv3.g:281:1: ( ( rule__PackageEMV3__NameAssignment_1 ) )
            {
            // InternalEmv3.g:281:1: ( ( rule__PackageEMV3__NameAssignment_1 ) )
            // InternalEmv3.g:282:2: ( rule__PackageEMV3__NameAssignment_1 )
            {
             before(grammarAccess.getPackageEMV3Access().getNameAssignment_1()); 
            // InternalEmv3.g:283:2: ( rule__PackageEMV3__NameAssignment_1 )
            // InternalEmv3.g:283:3: rule__PackageEMV3__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageEMV3__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageEMV3Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__1__Impl"


    // $ANTLR start "rule__PackageEMV3__Group__2"
    // InternalEmv3.g:291:1: rule__PackageEMV3__Group__2 : rule__PackageEMV3__Group__2__Impl rule__PackageEMV3__Group__3 ;
    public final void rule__PackageEMV3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:295:1: ( rule__PackageEMV3__Group__2__Impl rule__PackageEMV3__Group__3 )
            // InternalEmv3.g:296:2: rule__PackageEMV3__Group__2__Impl rule__PackageEMV3__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__PackageEMV3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__2"


    // $ANTLR start "rule__PackageEMV3__Group__2__Impl"
    // InternalEmv3.g:303:1: rule__PackageEMV3__Group__2__Impl : ( 'emv3' ) ;
    public final void rule__PackageEMV3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:307:1: ( ( 'emv3' ) )
            // InternalEmv3.g:308:1: ( 'emv3' )
            {
            // InternalEmv3.g:308:1: ( 'emv3' )
            // InternalEmv3.g:309:2: 'emv3'
            {
             before(grammarAccess.getPackageEMV3Access().getEmv3Keyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageEMV3Access().getEmv3Keyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__2__Impl"


    // $ANTLR start "rule__PackageEMV3__Group__3"
    // InternalEmv3.g:318:1: rule__PackageEMV3__Group__3 : rule__PackageEMV3__Group__3__Impl ;
    public final void rule__PackageEMV3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:322:1: ( rule__PackageEMV3__Group__3__Impl )
            // InternalEmv3.g:323:2: rule__PackageEMV3__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__3"


    // $ANTLR start "rule__PackageEMV3__Group__3__Impl"
    // InternalEmv3.g:329:1: rule__PackageEMV3__Group__3__Impl : ( ( rule__PackageEMV3__Alternatives_3 ) ) ;
    public final void rule__PackageEMV3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:333:1: ( ( ( rule__PackageEMV3__Alternatives_3 ) ) )
            // InternalEmv3.g:334:1: ( ( rule__PackageEMV3__Alternatives_3 ) )
            {
            // InternalEmv3.g:334:1: ( ( rule__PackageEMV3__Alternatives_3 ) )
            // InternalEmv3.g:335:2: ( rule__PackageEMV3__Alternatives_3 )
            {
             before(grammarAccess.getPackageEMV3Access().getAlternatives_3()); 
            // InternalEmv3.g:336:2: ( rule__PackageEMV3__Alternatives_3 )
            // InternalEmv3.g:336:3: rule__PackageEMV3__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__PackageEMV3__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageEMV3Access().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__Group__3__Impl"


    // $ANTLR start "rule__ErrorType__Group__0"
    // InternalEmv3.g:345:1: rule__ErrorType__Group__0 : rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 ;
    public final void rule__ErrorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:349:1: ( rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1 )
            // InternalEmv3.g:350:2: rule__ErrorType__Group__0__Impl rule__ErrorType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ErrorType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__0"


    // $ANTLR start "rule__ErrorType__Group__0__Impl"
    // InternalEmv3.g:357:1: rule__ErrorType__Group__0__Impl : ( () ) ;
    public final void rule__ErrorType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:361:1: ( ( () ) )
            // InternalEmv3.g:362:1: ( () )
            {
            // InternalEmv3.g:362:1: ( () )
            // InternalEmv3.g:363:2: ()
            {
             before(grammarAccess.getErrorTypeAccess().getErrorTypeAction_0()); 
            // InternalEmv3.g:364:2: ()
            // InternalEmv3.g:364:3: 
            {
            }

             after(grammarAccess.getErrorTypeAccess().getErrorTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__0__Impl"


    // $ANTLR start "rule__ErrorType__Group__1"
    // InternalEmv3.g:372:1: rule__ErrorType__Group__1 : rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 ;
    public final void rule__ErrorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:376:1: ( rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2 )
            // InternalEmv3.g:377:2: rule__ErrorType__Group__1__Impl rule__ErrorType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ErrorType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__1"


    // $ANTLR start "rule__ErrorType__Group__1__Impl"
    // InternalEmv3.g:384:1: rule__ErrorType__Group__1__Impl : ( 'Type' ) ;
    public final void rule__ErrorType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:388:1: ( ( 'Type' ) )
            // InternalEmv3.g:389:1: ( 'Type' )
            {
            // InternalEmv3.g:389:1: ( 'Type' )
            // InternalEmv3.g:390:2: 'Type'
            {
             before(grammarAccess.getErrorTypeAccess().getTypeKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getErrorTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__1__Impl"


    // $ANTLR start "rule__ErrorType__Group__2"
    // InternalEmv3.g:399:1: rule__ErrorType__Group__2 : rule__ErrorType__Group__2__Impl ;
    public final void rule__ErrorType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:403:1: ( rule__ErrorType__Group__2__Impl )
            // InternalEmv3.g:404:2: rule__ErrorType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__2"


    // $ANTLR start "rule__ErrorType__Group__2__Impl"
    // InternalEmv3.g:410:1: rule__ErrorType__Group__2__Impl : ( ( rule__ErrorType__NameAssignment_2 ) ) ;
    public final void rule__ErrorType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:414:1: ( ( ( rule__ErrorType__NameAssignment_2 ) ) )
            // InternalEmv3.g:415:1: ( ( rule__ErrorType__NameAssignment_2 ) )
            {
            // InternalEmv3.g:415:1: ( ( rule__ErrorType__NameAssignment_2 ) )
            // InternalEmv3.g:416:2: ( rule__ErrorType__NameAssignment_2 )
            {
             before(grammarAccess.getErrorTypeAccess().getNameAssignment_2()); 
            // InternalEmv3.g:417:2: ( rule__ErrorType__NameAssignment_2 )
            // InternalEmv3.g:417:3: rule__ErrorType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ErrorType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getErrorTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__Group__2__Impl"


    // $ANTLR start "rule__Subclause__Group__0"
    // InternalEmv3.g:426:1: rule__Subclause__Group__0 : rule__Subclause__Group__0__Impl rule__Subclause__Group__1 ;
    public final void rule__Subclause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:430:1: ( rule__Subclause__Group__0__Impl rule__Subclause__Group__1 )
            // InternalEmv3.g:431:2: rule__Subclause__Group__0__Impl rule__Subclause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Subclause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subclause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__0"


    // $ANTLR start "rule__Subclause__Group__0__Impl"
    // InternalEmv3.g:438:1: rule__Subclause__Group__0__Impl : ( () ) ;
    public final void rule__Subclause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:442:1: ( ( () ) )
            // InternalEmv3.g:443:1: ( () )
            {
            // InternalEmv3.g:443:1: ( () )
            // InternalEmv3.g:444:2: ()
            {
             before(grammarAccess.getSubclauseAccess().getEmv3SubclauseAction_0()); 
            // InternalEmv3.g:445:2: ()
            // InternalEmv3.g:445:3: 
            {
            }

             after(grammarAccess.getSubclauseAccess().getEmv3SubclauseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__0__Impl"


    // $ANTLR start "rule__Subclause__Group__1"
    // InternalEmv3.g:453:1: rule__Subclause__Group__1 : rule__Subclause__Group__1__Impl rule__Subclause__Group__2 ;
    public final void rule__Subclause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:457:1: ( rule__Subclause__Group__1__Impl rule__Subclause__Group__2 )
            // InternalEmv3.g:458:2: rule__Subclause__Group__1__Impl rule__Subclause__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Subclause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subclause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__1"


    // $ANTLR start "rule__Subclause__Group__1__Impl"
    // InternalEmv3.g:465:1: rule__Subclause__Group__1__Impl : ( 'for' ) ;
    public final void rule__Subclause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:469:1: ( ( 'for' ) )
            // InternalEmv3.g:470:1: ( 'for' )
            {
            // InternalEmv3.g:470:1: ( 'for' )
            // InternalEmv3.g:471:2: 'for'
            {
             before(grammarAccess.getSubclauseAccess().getForKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubclauseAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__1__Impl"


    // $ANTLR start "rule__Subclause__Group__2"
    // InternalEmv3.g:480:1: rule__Subclause__Group__2 : rule__Subclause__Group__2__Impl rule__Subclause__Group__3 ;
    public final void rule__Subclause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:484:1: ( rule__Subclause__Group__2__Impl rule__Subclause__Group__3 )
            // InternalEmv3.g:485:2: rule__Subclause__Group__2__Impl rule__Subclause__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Subclause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subclause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__2"


    // $ANTLR start "rule__Subclause__Group__2__Impl"
    // InternalEmv3.g:492:1: rule__Subclause__Group__2__Impl : ( ( rule__Subclause__NameAssignment_2 ) ) ;
    public final void rule__Subclause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:496:1: ( ( ( rule__Subclause__NameAssignment_2 ) ) )
            // InternalEmv3.g:497:1: ( ( rule__Subclause__NameAssignment_2 ) )
            {
            // InternalEmv3.g:497:1: ( ( rule__Subclause__NameAssignment_2 ) )
            // InternalEmv3.g:498:2: ( rule__Subclause__NameAssignment_2 )
            {
             before(grammarAccess.getSubclauseAccess().getNameAssignment_2()); 
            // InternalEmv3.g:499:2: ( rule__Subclause__NameAssignment_2 )
            // InternalEmv3.g:499:3: rule__Subclause__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Subclause__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubclauseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__2__Impl"


    // $ANTLR start "rule__Subclause__Group__3"
    // InternalEmv3.g:507:1: rule__Subclause__Group__3 : rule__Subclause__Group__3__Impl rule__Subclause__Group__4 ;
    public final void rule__Subclause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:511:1: ( rule__Subclause__Group__3__Impl rule__Subclause__Group__4 )
            // InternalEmv3.g:512:2: rule__Subclause__Group__3__Impl rule__Subclause__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Subclause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subclause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__3"


    // $ANTLR start "rule__Subclause__Group__3__Impl"
    // InternalEmv3.g:519:1: rule__Subclause__Group__3__Impl : ( '{' ) ;
    public final void rule__Subclause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:523:1: ( ( '{' ) )
            // InternalEmv3.g:524:1: ( '{' )
            {
            // InternalEmv3.g:524:1: ( '{' )
            // InternalEmv3.g:525:2: '{'
            {
             before(grammarAccess.getSubclauseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubclauseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__3__Impl"


    // $ANTLR start "rule__Subclause__Group__4"
    // InternalEmv3.g:534:1: rule__Subclause__Group__4 : rule__Subclause__Group__4__Impl rule__Subclause__Group__5 ;
    public final void rule__Subclause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:538:1: ( rule__Subclause__Group__4__Impl rule__Subclause__Group__5 )
            // InternalEmv3.g:539:2: rule__Subclause__Group__4__Impl rule__Subclause__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Subclause__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subclause__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__4"


    // $ANTLR start "rule__Subclause__Group__4__Impl"
    // InternalEmv3.g:546:1: rule__Subclause__Group__4__Impl : ( ( rule__Subclause__Emv3statementAssignment_4 ) ) ;
    public final void rule__Subclause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:550:1: ( ( ( rule__Subclause__Emv3statementAssignment_4 ) ) )
            // InternalEmv3.g:551:1: ( ( rule__Subclause__Emv3statementAssignment_4 ) )
            {
            // InternalEmv3.g:551:1: ( ( rule__Subclause__Emv3statementAssignment_4 ) )
            // InternalEmv3.g:552:2: ( rule__Subclause__Emv3statementAssignment_4 )
            {
             before(grammarAccess.getSubclauseAccess().getEmv3statementAssignment_4()); 
            // InternalEmv3.g:553:2: ( rule__Subclause__Emv3statementAssignment_4 )
            // InternalEmv3.g:553:3: rule__Subclause__Emv3statementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Subclause__Emv3statementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubclauseAccess().getEmv3statementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__4__Impl"


    // $ANTLR start "rule__Subclause__Group__5"
    // InternalEmv3.g:561:1: rule__Subclause__Group__5 : rule__Subclause__Group__5__Impl ;
    public final void rule__Subclause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:565:1: ( rule__Subclause__Group__5__Impl )
            // InternalEmv3.g:566:2: rule__Subclause__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subclause__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__5"


    // $ANTLR start "rule__Subclause__Group__5__Impl"
    // InternalEmv3.g:572:1: rule__Subclause__Group__5__Impl : ( '}' ) ;
    public final void rule__Subclause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:576:1: ( ( '}' ) )
            // InternalEmv3.g:577:1: ( '}' )
            {
            // InternalEmv3.g:577:1: ( '}' )
            // InternalEmv3.g:578:2: '}'
            {
             before(grammarAccess.getSubclauseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubclauseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Group__5__Impl"


    // $ANTLR start "rule__ErrorPropagation__Group__0"
    // InternalEmv3.g:588:1: rule__ErrorPropagation__Group__0 : rule__ErrorPropagation__Group__0__Impl rule__ErrorPropagation__Group__1 ;
    public final void rule__ErrorPropagation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:592:1: ( rule__ErrorPropagation__Group__0__Impl rule__ErrorPropagation__Group__1 )
            // InternalEmv3.g:593:2: rule__ErrorPropagation__Group__0__Impl rule__ErrorPropagation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ErrorPropagation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__0"


    // $ANTLR start "rule__ErrorPropagation__Group__0__Impl"
    // InternalEmv3.g:600:1: rule__ErrorPropagation__Group__0__Impl : ( ( rule__ErrorPropagation__NameAssignment_0 ) ) ;
    public final void rule__ErrorPropagation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:604:1: ( ( ( rule__ErrorPropagation__NameAssignment_0 ) ) )
            // InternalEmv3.g:605:1: ( ( rule__ErrorPropagation__NameAssignment_0 ) )
            {
            // InternalEmv3.g:605:1: ( ( rule__ErrorPropagation__NameAssignment_0 ) )
            // InternalEmv3.g:606:2: ( rule__ErrorPropagation__NameAssignment_0 )
            {
             before(grammarAccess.getErrorPropagationAccess().getNameAssignment_0()); 
            // InternalEmv3.g:607:2: ( rule__ErrorPropagation__NameAssignment_0 )
            // InternalEmv3.g:607:3: rule__ErrorPropagation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getErrorPropagationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__0__Impl"


    // $ANTLR start "rule__ErrorPropagation__Group__1"
    // InternalEmv3.g:615:1: rule__ErrorPropagation__Group__1 : rule__ErrorPropagation__Group__1__Impl rule__ErrorPropagation__Group__2 ;
    public final void rule__ErrorPropagation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:619:1: ( rule__ErrorPropagation__Group__1__Impl rule__ErrorPropagation__Group__2 )
            // InternalEmv3.g:620:2: rule__ErrorPropagation__Group__1__Impl rule__ErrorPropagation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ErrorPropagation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__1"


    // $ANTLR start "rule__ErrorPropagation__Group__1__Impl"
    // InternalEmv3.g:627:1: rule__ErrorPropagation__Group__1__Impl : ( 'propagation' ) ;
    public final void rule__ErrorPropagation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:631:1: ( ( 'propagation' ) )
            // InternalEmv3.g:632:1: ( 'propagation' )
            {
            // InternalEmv3.g:632:1: ( 'propagation' )
            // InternalEmv3.g:633:2: 'propagation'
            {
             before(grammarAccess.getErrorPropagationAccess().getPropagationKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getErrorPropagationAccess().getPropagationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__1__Impl"


    // $ANTLR start "rule__ErrorPropagation__Group__2"
    // InternalEmv3.g:642:1: rule__ErrorPropagation__Group__2 : rule__ErrorPropagation__Group__2__Impl ;
    public final void rule__ErrorPropagation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:646:1: ( rule__ErrorPropagation__Group__2__Impl )
            // InternalEmv3.g:647:2: rule__ErrorPropagation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__2"


    // $ANTLR start "rule__ErrorPropagation__Group__2__Impl"
    // InternalEmv3.g:653:1: rule__ErrorPropagation__Group__2__Impl : ( ( rule__ErrorPropagation__TypeAssignment_2 ) ) ;
    public final void rule__ErrorPropagation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:657:1: ( ( ( rule__ErrorPropagation__TypeAssignment_2 ) ) )
            // InternalEmv3.g:658:1: ( ( rule__ErrorPropagation__TypeAssignment_2 ) )
            {
            // InternalEmv3.g:658:1: ( ( rule__ErrorPropagation__TypeAssignment_2 ) )
            // InternalEmv3.g:659:2: ( rule__ErrorPropagation__TypeAssignment_2 )
            {
             before(grammarAccess.getErrorPropagationAccess().getTypeAssignment_2()); 
            // InternalEmv3.g:660:2: ( rule__ErrorPropagation__TypeAssignment_2 )
            // InternalEmv3.g:660:3: rule__ErrorPropagation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPropagation__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getErrorPropagationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEmv3.g:669:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:673:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEmv3.g:674:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalEmv3.g:681:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:685:1: ( ( RULE_ID ) )
            // InternalEmv3.g:686:1: ( RULE_ID )
            {
            // InternalEmv3.g:686:1: ( RULE_ID )
            // InternalEmv3.g:687:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalEmv3.g:696:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:700:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEmv3.g:701:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalEmv3.g:707:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:711:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEmv3.g:712:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEmv3.g:712:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEmv3.g:713:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalEmv3.g:714:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEmv3.g:714:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalEmv3.g:723:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:727:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEmv3.g:728:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalEmv3.g:735:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:739:1: ( ( '::' ) )
            // InternalEmv3.g:740:1: ( '::' )
            {
            // InternalEmv3.g:740:1: ( '::' )
            // InternalEmv3.g:741:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalEmv3.g:750:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:754:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEmv3.g:755:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalEmv3.g:761:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:765:1: ( ( RULE_ID ) )
            // InternalEmv3.g:766:1: ( RULE_ID )
            {
            // InternalEmv3.g:766:1: ( RULE_ID )
            // InternalEmv3.g:767:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ClassifierName__Group__0"
    // InternalEmv3.g:777:1: rule__ClassifierName__Group__0 : rule__ClassifierName__Group__0__Impl rule__ClassifierName__Group__1 ;
    public final void rule__ClassifierName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:781:1: ( rule__ClassifierName__Group__0__Impl rule__ClassifierName__Group__1 )
            // InternalEmv3.g:782:2: rule__ClassifierName__Group__0__Impl rule__ClassifierName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ClassifierName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassifierName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group__0"


    // $ANTLR start "rule__ClassifierName__Group__0__Impl"
    // InternalEmv3.g:789:1: rule__ClassifierName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ClassifierName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:793:1: ( ( RULE_ID ) )
            // InternalEmv3.g:794:1: ( RULE_ID )
            {
            // InternalEmv3.g:794:1: ( RULE_ID )
            // InternalEmv3.g:795:2: RULE_ID
            {
             before(grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group__0__Impl"


    // $ANTLR start "rule__ClassifierName__Group__1"
    // InternalEmv3.g:804:1: rule__ClassifierName__Group__1 : rule__ClassifierName__Group__1__Impl ;
    public final void rule__ClassifierName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:808:1: ( rule__ClassifierName__Group__1__Impl )
            // InternalEmv3.g:809:2: rule__ClassifierName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group__1"


    // $ANTLR start "rule__ClassifierName__Group__1__Impl"
    // InternalEmv3.g:815:1: rule__ClassifierName__Group__1__Impl : ( ( rule__ClassifierName__Group_1__0 )? ) ;
    public final void rule__ClassifierName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:819:1: ( ( ( rule__ClassifierName__Group_1__0 )? ) )
            // InternalEmv3.g:820:1: ( ( rule__ClassifierName__Group_1__0 )? )
            {
            // InternalEmv3.g:820:1: ( ( rule__ClassifierName__Group_1__0 )? )
            // InternalEmv3.g:821:2: ( rule__ClassifierName__Group_1__0 )?
            {
             before(grammarAccess.getClassifierNameAccess().getGroup_1()); 
            // InternalEmv3.g:822:2: ( rule__ClassifierName__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEmv3.g:822:3: rule__ClassifierName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassifierName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassifierNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group__1__Impl"


    // $ANTLR start "rule__ClassifierName__Group_1__0"
    // InternalEmv3.g:831:1: rule__ClassifierName__Group_1__0 : rule__ClassifierName__Group_1__0__Impl rule__ClassifierName__Group_1__1 ;
    public final void rule__ClassifierName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:835:1: ( rule__ClassifierName__Group_1__0__Impl rule__ClassifierName__Group_1__1 )
            // InternalEmv3.g:836:2: rule__ClassifierName__Group_1__0__Impl rule__ClassifierName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassifierName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassifierName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group_1__0"


    // $ANTLR start "rule__ClassifierName__Group_1__0__Impl"
    // InternalEmv3.g:843:1: rule__ClassifierName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ClassifierName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:847:1: ( ( '.' ) )
            // InternalEmv3.g:848:1: ( '.' )
            {
            // InternalEmv3.g:848:1: ( '.' )
            // InternalEmv3.g:849:2: '.'
            {
             before(grammarAccess.getClassifierNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassifierNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group_1__0__Impl"


    // $ANTLR start "rule__ClassifierName__Group_1__1"
    // InternalEmv3.g:858:1: rule__ClassifierName__Group_1__1 : rule__ClassifierName__Group_1__1__Impl ;
    public final void rule__ClassifierName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:862:1: ( rule__ClassifierName__Group_1__1__Impl )
            // InternalEmv3.g:863:2: rule__ClassifierName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group_1__1"


    // $ANTLR start "rule__ClassifierName__Group_1__1__Impl"
    // InternalEmv3.g:869:1: rule__ClassifierName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ClassifierName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:873:1: ( ( RULE_ID ) )
            // InternalEmv3.g:874:1: ( RULE_ID )
            {
            // InternalEmv3.g:874:1: ( RULE_ID )
            // InternalEmv3.g:875:2: RULE_ID
            {
             before(grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierName__Group_1__1__Impl"


    // $ANTLR start "rule__PackageEMV3__NameAssignment_1"
    // InternalEmv3.g:885:1: rule__PackageEMV3__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageEMV3__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:889:1: ( ( ruleQualifiedName ) )
            // InternalEmv3.g:890:2: ( ruleQualifiedName )
            {
            // InternalEmv3.g:890:2: ( ruleQualifiedName )
            // InternalEmv3.g:891:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageEMV3Access().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageEMV3Access().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__NameAssignment_1"


    // $ANTLR start "rule__PackageEMV3__ElementsAssignment_3_0"
    // InternalEmv3.g:900:1: rule__PackageEMV3__ElementsAssignment_3_0 : ( ruleSubclause ) ;
    public final void rule__PackageEMV3__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:904:1: ( ( ruleSubclause ) )
            // InternalEmv3.g:905:2: ( ruleSubclause )
            {
            // InternalEmv3.g:905:2: ( ruleSubclause )
            // InternalEmv3.g:906:3: ruleSubclause
            {
             before(grammarAccess.getPackageEMV3Access().getElementsSubclauseParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubclause();

            state._fsp--;

             after(grammarAccess.getPackageEMV3Access().getElementsSubclauseParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__ElementsAssignment_3_0"


    // $ANTLR start "rule__PackageEMV3__ElementsAssignment_3_1"
    // InternalEmv3.g:915:1: rule__PackageEMV3__ElementsAssignment_3_1 : ( ruleErrorType ) ;
    public final void rule__PackageEMV3__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:919:1: ( ( ruleErrorType ) )
            // InternalEmv3.g:920:2: ( ruleErrorType )
            {
            // InternalEmv3.g:920:2: ( ruleErrorType )
            // InternalEmv3.g:921:3: ruleErrorType
            {
             before(grammarAccess.getPackageEMV3Access().getElementsErrorTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorType();

            state._fsp--;

             after(grammarAccess.getPackageEMV3Access().getElementsErrorTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageEMV3__ElementsAssignment_3_1"


    // $ANTLR start "rule__ErrorType__NameAssignment_2"
    // InternalEmv3.g:930:1: rule__ErrorType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ErrorType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:934:1: ( ( RULE_ID ) )
            // InternalEmv3.g:935:2: ( RULE_ID )
            {
            // InternalEmv3.g:935:2: ( RULE_ID )
            // InternalEmv3.g:936:3: RULE_ID
            {
             before(grammarAccess.getErrorTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getErrorTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorType__NameAssignment_2"


    // $ANTLR start "rule__Subclause__NameAssignment_2"
    // InternalEmv3.g:945:1: rule__Subclause__NameAssignment_2 : ( ruleClassifierName ) ;
    public final void rule__Subclause__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:949:1: ( ( ruleClassifierName ) )
            // InternalEmv3.g:950:2: ( ruleClassifierName )
            {
            // InternalEmv3.g:950:2: ( ruleClassifierName )
            // InternalEmv3.g:951:3: ruleClassifierName
            {
             before(grammarAccess.getSubclauseAccess().getNameClassifierNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierName();

            state._fsp--;

             after(grammarAccess.getSubclauseAccess().getNameClassifierNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__NameAssignment_2"


    // $ANTLR start "rule__Subclause__Emv3statementAssignment_4"
    // InternalEmv3.g:960:1: rule__Subclause__Emv3statementAssignment_4 : ( ruleErrorPropagation ) ;
    public final void rule__Subclause__Emv3statementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:964:1: ( ( ruleErrorPropagation ) )
            // InternalEmv3.g:965:2: ( ruleErrorPropagation )
            {
            // InternalEmv3.g:965:2: ( ruleErrorPropagation )
            // InternalEmv3.g:966:3: ruleErrorPropagation
            {
             before(grammarAccess.getSubclauseAccess().getEmv3statementErrorPropagationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorPropagation();

            state._fsp--;

             after(grammarAccess.getSubclauseAccess().getEmv3statementErrorPropagationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subclause__Emv3statementAssignment_4"


    // $ANTLR start "rule__ErrorPropagation__NameAssignment_0"
    // InternalEmv3.g:975:1: rule__ErrorPropagation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ErrorPropagation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:979:1: ( ( RULE_ID ) )
            // InternalEmv3.g:980:2: ( RULE_ID )
            {
            // InternalEmv3.g:980:2: ( RULE_ID )
            // InternalEmv3.g:981:3: RULE_ID
            {
             before(grammarAccess.getErrorPropagationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getErrorPropagationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__NameAssignment_0"


    // $ANTLR start "rule__ErrorPropagation__TypeAssignment_2"
    // InternalEmv3.g:990:1: rule__ErrorPropagation__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ErrorPropagation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmv3.g:994:1: ( ( ( RULE_ID ) ) )
            // InternalEmv3.g:995:2: ( ( RULE_ID ) )
            {
            // InternalEmv3.g:995:2: ( ( RULE_ID ) )
            // InternalEmv3.g:996:3: ( RULE_ID )
            {
             before(grammarAccess.getErrorPropagationAccess().getTypeErrorTypeCrossReference_2_0()); 
            // InternalEmv3.g:997:3: ( RULE_ID )
            // InternalEmv3.g:998:4: RULE_ID
            {
             before(grammarAccess.getErrorPropagationAccess().getTypeErrorTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getErrorPropagationAccess().getTypeErrorTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getErrorPropagationAccess().getTypeErrorTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPropagation__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}