package de.hsos.richwps.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.hsos.richwps.services.WDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWDParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PROTOCOL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bind'", "'process'", "'to'", "'execute'", "'with'", "'store'", "'as'", "'='", "'in.'", "'out.'", "'var.'", "'.'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int RULE_PROTOCOL=5;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalWDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWDParser.tokenNames; }
    public String getGrammarFileName() { return "../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g"; }


     
     	private WDGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WDGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleWorksequence"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:60:1: entryRuleWorksequence : ruleWorksequence EOF ;
    public final void entryRuleWorksequence() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:61:1: ( ruleWorksequence EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:62:1: ruleWorksequence EOF
            {
             before(grammarAccess.getWorksequenceRule()); 
            pushFollow(FOLLOW_ruleWorksequence_in_entryRuleWorksequence61);
            ruleWorksequence();

            state._fsp--;

             after(grammarAccess.getWorksequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorksequence68); 

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
    // $ANTLR end "entryRuleWorksequence"


    // $ANTLR start "ruleWorksequence"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:69:1: ruleWorksequence : ( ( rule__Worksequence__OperationsAssignment )* ) ;
    public final void ruleWorksequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:73:2: ( ( ( rule__Worksequence__OperationsAssignment )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:74:1: ( ( rule__Worksequence__OperationsAssignment )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:74:1: ( ( rule__Worksequence__OperationsAssignment )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:75:1: ( rule__Worksequence__OperationsAssignment )*
            {
             before(grammarAccess.getWorksequenceAccess().getOperationsAssignment()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:76:1: ( rule__Worksequence__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15||(LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:76:2: rule__Worksequence__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Worksequence__OperationsAssignment_in_ruleWorksequence94);
            	    rule__Worksequence__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWorksequenceAccess().getOperationsAssignment()); 

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
    // $ANTLR end "ruleWorksequence"


    // $ANTLR start "entryRuleOperation"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:88:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:89:1: ( ruleOperation EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:90:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation122);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation129); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:97:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:101:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:102:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:102:1: ( ( rule__Operation__Alternatives ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:103:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:104:1: ( rule__Operation__Alternatives )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:104:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation155);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleLocalBinding"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:116:1: entryRuleLocalBinding : ruleLocalBinding EOF ;
    public final void entryRuleLocalBinding() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:117:1: ( ruleLocalBinding EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:118:1: ruleLocalBinding EOF
            {
             before(grammarAccess.getLocalBindingRule()); 
            pushFollow(FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding182);
            ruleLocalBinding();

            state._fsp--;

             after(grammarAccess.getLocalBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalBinding189); 

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
    // $ANTLR end "entryRuleLocalBinding"


    // $ANTLR start "ruleLocalBinding"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:125:1: ruleLocalBinding : ( ( rule__LocalBinding__Group__0 ) ) ;
    public final void ruleLocalBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:129:2: ( ( ( rule__LocalBinding__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:130:1: ( ( rule__LocalBinding__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:130:1: ( ( rule__LocalBinding__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:131:1: ( rule__LocalBinding__Group__0 )
            {
             before(grammarAccess.getLocalBindingAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:132:1: ( rule__LocalBinding__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:132:2: rule__LocalBinding__Group__0
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__0_in_ruleLocalBinding215);
            rule__LocalBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalBinding"


    // $ANTLR start "entryRuleRemoteBinding"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:144:1: entryRuleRemoteBinding : ruleRemoteBinding EOF ;
    public final void entryRuleRemoteBinding() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:145:1: ( ruleRemoteBinding EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:146:1: ruleRemoteBinding EOF
            {
             before(grammarAccess.getRemoteBindingRule()); 
            pushFollow(FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding242);
            ruleRemoteBinding();

            state._fsp--;

             after(grammarAccess.getRemoteBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemoteBinding249); 

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
    // $ANTLR end "entryRuleRemoteBinding"


    // $ANTLR start "ruleRemoteBinding"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:153:1: ruleRemoteBinding : ( ( rule__RemoteBinding__Group__0 ) ) ;
    public final void ruleRemoteBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:157:2: ( ( ( rule__RemoteBinding__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:158:1: ( ( rule__RemoteBinding__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:158:1: ( ( rule__RemoteBinding__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:159:1: ( rule__RemoteBinding__Group__0 )
            {
             before(grammarAccess.getRemoteBindingAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:160:1: ( rule__RemoteBinding__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:160:2: rule__RemoteBinding__Group__0
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__0_in_ruleRemoteBinding275);
            rule__RemoteBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleRemoteBinding"


    // $ANTLR start "entryRuleExecuteStatement"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:172:1: entryRuleExecuteStatement : ruleExecuteStatement EOF ;
    public final void entryRuleExecuteStatement() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:173:1: ( ruleExecuteStatement EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:174:1: ruleExecuteStatement EOF
            {
             before(grammarAccess.getExecuteStatementRule()); 
            pushFollow(FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement302);
            ruleExecuteStatement();

            state._fsp--;

             after(grammarAccess.getExecuteStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteStatement309); 

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
    // $ANTLR end "entryRuleExecuteStatement"


    // $ANTLR start "ruleExecuteStatement"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:181:1: ruleExecuteStatement : ( ( rule__ExecuteStatement__Group__0 ) ) ;
    public final void ruleExecuteStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:185:2: ( ( ( rule__ExecuteStatement__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:186:1: ( ( rule__ExecuteStatement__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:186:1: ( ( rule__ExecuteStatement__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:187:1: ( rule__ExecuteStatement__Group__0 )
            {
             before(grammarAccess.getExecuteStatementAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:188:1: ( rule__ExecuteStatement__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:188:2: rule__ExecuteStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__0_in_ruleExecuteStatement335);
            rule__ExecuteStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecuteStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleExecuteStatement"


    // $ANTLR start "entryRuleExecInput"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:200:1: entryRuleExecInput : ruleExecInput EOF ;
    public final void entryRuleExecInput() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:201:1: ( ruleExecInput EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:202:1: ruleExecInput EOF
            {
             before(grammarAccess.getExecInputRule()); 
            pushFollow(FOLLOW_ruleExecInput_in_entryRuleExecInput362);
            ruleExecInput();

            state._fsp--;

             after(grammarAccess.getExecInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecInput369); 

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
    // $ANTLR end "entryRuleExecInput"


    // $ANTLR start "ruleExecInput"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:209:1: ruleExecInput : ( ( rule__ExecInput__Alternatives ) ) ;
    public final void ruleExecInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:213:2: ( ( ( rule__ExecInput__Alternatives ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:214:1: ( ( rule__ExecInput__Alternatives ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:214:1: ( ( rule__ExecInput__Alternatives ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:215:1: ( rule__ExecInput__Alternatives )
            {
             before(grammarAccess.getExecInputAccess().getAlternatives()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:216:1: ( rule__ExecInput__Alternatives )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:216:2: rule__ExecInput__Alternatives
            {
            pushFollow(FOLLOW_rule__ExecInput__Alternatives_in_ruleExecInput395);
            rule__ExecInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExecInput"


    // $ANTLR start "entryRuleExecOutput"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:228:1: entryRuleExecOutput : ruleExecOutput EOF ;
    public final void entryRuleExecOutput() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:229:1: ( ruleExecOutput EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:230:1: ruleExecOutput EOF
            {
             before(grammarAccess.getExecOutputRule()); 
            pushFollow(FOLLOW_ruleExecOutput_in_entryRuleExecOutput422);
            ruleExecOutput();

            state._fsp--;

             after(grammarAccess.getExecOutputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecOutput429); 

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
    // $ANTLR end "entryRuleExecOutput"


    // $ANTLR start "ruleExecOutput"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:237:1: ruleExecOutput : ( ( rule__ExecOutput__Alternatives ) ) ;
    public final void ruleExecOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:241:2: ( ( ( rule__ExecOutput__Alternatives ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:242:1: ( ( rule__ExecOutput__Alternatives ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:242:1: ( ( rule__ExecOutput__Alternatives ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:243:1: ( rule__ExecOutput__Alternatives )
            {
             before(grammarAccess.getExecOutputAccess().getAlternatives()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:244:1: ( rule__ExecOutput__Alternatives )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:244:2: rule__ExecOutput__Alternatives
            {
            pushFollow(FOLLOW_rule__ExecOutput__Alternatives_in_ruleExecOutput455);
            rule__ExecOutput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExecOutput"


    // $ANTLR start "entryRuleAssignment"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:256:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:257:1: ( ruleAssignment EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:258:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment482);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment489); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:265:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:269:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:270:1: ( ( rule__Assignment__Alternatives ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:270:1: ( ( rule__Assignment__Alternatives ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:271:1: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:272:1: ( rule__Assignment__Alternatives )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:272:2: rule__Assignment__Alternatives
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment515);
            rule__Assignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleIN_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:284:1: entryRuleIN_REFERENCE : ruleIN_REFERENCE EOF ;
    public final void entryRuleIN_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:285:1: ( ruleIN_REFERENCE EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:286:1: ruleIN_REFERENCE EOF
            {
             before(grammarAccess.getIN_REFERENCERule()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE542);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIN_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIN_REFERENCE549); 

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
    // $ANTLR end "entryRuleIN_REFERENCE"


    // $ANTLR start "ruleIN_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:293:1: ruleIN_REFERENCE : ( ( rule__IN_REFERENCE__Group__0 ) ) ;
    public final void ruleIN_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:297:2: ( ( ( rule__IN_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:298:1: ( ( rule__IN_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:298:1: ( ( rule__IN_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:299:1: ( rule__IN_REFERENCE__Group__0 )
            {
             before(grammarAccess.getIN_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:300:1: ( rule__IN_REFERENCE__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:300:2: rule__IN_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__0_in_ruleIN_REFERENCE575);
            rule__IN_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIN_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleIN_REFERENCE"


    // $ANTLR start "entryRuleOUT_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:312:1: entryRuleOUT_REFERENCE : ruleOUT_REFERENCE EOF ;
    public final void entryRuleOUT_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:313:1: ( ruleOUT_REFERENCE EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:314:1: ruleOUT_REFERENCE EOF
            {
             before(grammarAccess.getOUT_REFERENCERule()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE602);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getOUT_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUT_REFERENCE609); 

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
    // $ANTLR end "entryRuleOUT_REFERENCE"


    // $ANTLR start "ruleOUT_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:321:1: ruleOUT_REFERENCE : ( ( rule__OUT_REFERENCE__Group__0 ) ) ;
    public final void ruleOUT_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:325:2: ( ( ( rule__OUT_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:326:1: ( ( rule__OUT_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:326:1: ( ( rule__OUT_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:327:1: ( rule__OUT_REFERENCE__Group__0 )
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:328:1: ( rule__OUT_REFERENCE__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:328:2: rule__OUT_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__0_in_ruleOUT_REFERENCE635);
            rule__OUT_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOUT_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleOUT_REFERENCE"


    // $ANTLR start "entryRuleVAR_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:340:1: entryRuleVAR_REFERENCE : ruleVAR_REFERENCE EOF ;
    public final void entryRuleVAR_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:341:1: ( ruleVAR_REFERENCE EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:342:1: ruleVAR_REFERENCE EOF
            {
             before(grammarAccess.getVAR_REFERENCERule()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE662);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getVAR_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_REFERENCE669); 

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
    // $ANTLR end "entryRuleVAR_REFERENCE"


    // $ANTLR start "ruleVAR_REFERENCE"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:349:1: ruleVAR_REFERENCE : ( ( rule__VAR_REFERENCE__Group__0 ) ) ;
    public final void ruleVAR_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:353:2: ( ( ( rule__VAR_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:354:1: ( ( rule__VAR_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:354:1: ( ( rule__VAR_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:355:1: ( rule__VAR_REFERENCE__Group__0 )
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:356:1: ( rule__VAR_REFERENCE__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:356:2: rule__VAR_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__0_in_ruleVAR_REFERENCE695);
            rule__VAR_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVAR_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleVAR_REFERENCE"


    // $ANTLR start "entryRuleQUALIFIEDNAME"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:368:1: entryRuleQUALIFIEDNAME : ruleQUALIFIEDNAME EOF ;
    public final void entryRuleQUALIFIEDNAME() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:369:1: ( ruleQUALIFIEDNAME EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:370:1: ruleQUALIFIEDNAME EOF
            {
             before(grammarAccess.getQUALIFIEDNAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME722);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDNAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDNAME729); 

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
    // $ANTLR end "entryRuleQUALIFIEDNAME"


    // $ANTLR start "ruleQUALIFIEDNAME"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:377:1: ruleQUALIFIEDNAME : ( ( rule__QUALIFIEDNAME__Group__0 ) ) ;
    public final void ruleQUALIFIEDNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:381:2: ( ( ( rule__QUALIFIEDNAME__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:382:1: ( ( rule__QUALIFIEDNAME__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:382:1: ( ( rule__QUALIFIEDNAME__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:383:1: ( rule__QUALIFIEDNAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:384:1: ( rule__QUALIFIEDNAME__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:384:2: rule__QUALIFIEDNAME__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__0_in_ruleQUALIFIEDNAME755);
            rule__QUALIFIEDNAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIEDNAMEAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIEDNAME"


    // $ANTLR start "entryRuleQUALIFIEDID"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:396:1: entryRuleQUALIFIEDID : ruleQUALIFIEDID EOF ;
    public final void entryRuleQUALIFIEDID() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:397:1: ( ruleQUALIFIEDID EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:398:1: ruleQUALIFIEDID EOF
            {
             before(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID782);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID789); 

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
    // $ANTLR end "entryRuleQUALIFIEDID"


    // $ANTLR start "ruleQUALIFIEDID"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:405:1: ruleQUALIFIEDID : ( ( rule__QUALIFIEDID__Group__0 ) ) ;
    public final void ruleQUALIFIEDID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:409:2: ( ( ( rule__QUALIFIEDID__Group__0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:410:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:410:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:411:1: ( rule__QUALIFIEDID__Group__0 )
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:412:1: ( rule__QUALIFIEDID__Group__0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:412:2: rule__QUALIFIEDID__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID815);
            rule__QUALIFIEDID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIEDID"


    // $ANTLR start "entryRuleURI"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:424:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:425:1: ( ruleURI EOF )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:426:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI842);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI849); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:433:1: ruleURI : ( ( rule__URI__Group__0 )* ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:437:2: ( ( ( rule__URI__Group__0 )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:438:1: ( ( rule__URI__Group__0 )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:438:1: ( ( rule__URI__Group__0 )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:439:1: ( rule__URI__Group__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:440:1: ( rule__URI__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:440:2: rule__URI__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI875);
            	    rule__URI__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup()); 

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:452:1: rule__Operation__Alternatives : ( ( ruleLocalBinding ) | ( ruleRemoteBinding ) | ( ruleAssignment ) | ( ruleExecuteStatement ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:456:1: ( ( ruleLocalBinding ) | ( ruleRemoteBinding ) | ( ruleAssignment ) | ( ruleExecuteStatement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_PROTOCOL) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 22:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:457:1: ( ruleLocalBinding )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:457:1: ( ruleLocalBinding )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:458:1: ruleLocalBinding
                    {
                     before(grammarAccess.getOperationAccess().getLocalBindingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLocalBinding_in_rule__Operation__Alternatives912);
                    ruleLocalBinding();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getLocalBindingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:463:6: ( ruleRemoteBinding )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:463:6: ( ruleRemoteBinding )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:464:1: ruleRemoteBinding
                    {
                     before(grammarAccess.getOperationAccess().getRemoteBindingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRemoteBinding_in_rule__Operation__Alternatives929);
                    ruleRemoteBinding();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getRemoteBindingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:469:6: ( ruleAssignment )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:469:6: ( ruleAssignment )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:470:1: ruleAssignment
                    {
                     before(grammarAccess.getOperationAccess().getAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Operation__Alternatives946);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:475:6: ( ruleExecuteStatement )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:475:6: ( ruleExecuteStatement )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:476:1: ruleExecuteStatement
                    {
                     before(grammarAccess.getOperationAccess().getExecuteStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExecuteStatement_in_rule__Operation__Alternatives963);
                    ruleExecuteStatement();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getExecuteStatementParserRuleCall_3()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__ExecInput__Alternatives"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:486:1: rule__ExecInput__Alternatives : ( ( ( rule__ExecInput__Group_0__0 ) ) | ( ( rule__ExecInput__Group_1__0 ) ) );
    public final void rule__ExecInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:490:1: ( ( ( rule__ExecInput__Group_0__0 ) ) | ( ( rule__ExecInput__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:491:1: ( ( rule__ExecInput__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:491:1: ( ( rule__ExecInput__Group_0__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:492:1: ( rule__ExecInput__Group_0__0 )
                    {
                     before(grammarAccess.getExecInputAccess().getGroup_0()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:493:1: ( rule__ExecInput__Group_0__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:493:2: rule__ExecInput__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExecInput__Group_0__0_in_rule__ExecInput__Alternatives995);
                    rule__ExecInput__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecInputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:497:6: ( ( rule__ExecInput__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:497:6: ( ( rule__ExecInput__Group_1__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:498:1: ( rule__ExecInput__Group_1__0 )
                    {
                     before(grammarAccess.getExecInputAccess().getGroup_1()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:499:1: ( rule__ExecInput__Group_1__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:499:2: rule__ExecInput__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExecInput__Group_1__0_in_rule__ExecInput__Alternatives1013);
                    rule__ExecInput__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecInputAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExecInput__Alternatives"


    // $ANTLR start "rule__ExecOutput__Alternatives"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:508:1: rule__ExecOutput__Alternatives : ( ( ( rule__ExecOutput__Group_0__0 ) ) | ( ( rule__ExecOutput__Group_1__0 ) ) );
    public final void rule__ExecOutput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:512:1: ( ( ( rule__ExecOutput__Group_0__0 ) ) | ( ( rule__ExecOutput__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==22) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:513:1: ( ( rule__ExecOutput__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:513:1: ( ( rule__ExecOutput__Group_0__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:514:1: ( rule__ExecOutput__Group_0__0 )
                    {
                     before(grammarAccess.getExecOutputAccess().getGroup_0()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:515:1: ( rule__ExecOutput__Group_0__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:515:2: rule__ExecOutput__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExecOutput__Group_0__0_in_rule__ExecOutput__Alternatives1046);
                    rule__ExecOutput__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecOutputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:519:6: ( ( rule__ExecOutput__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:519:6: ( ( rule__ExecOutput__Group_1__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:520:1: ( rule__ExecOutput__Group_1__0 )
                    {
                     before(grammarAccess.getExecOutputAccess().getGroup_1()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:521:1: ( rule__ExecOutput__Group_1__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:521:2: rule__ExecOutput__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExecOutput__Group_1__0_in_rule__ExecOutput__Alternatives1064);
                    rule__ExecOutput__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecOutputAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExecOutput__Alternatives"


    // $ANTLR start "rule__Assignment__Alternatives"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:530:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:534:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:535:1: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:535:1: ( ( rule__Assignment__Group_0__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:536:1: ( rule__Assignment__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:537:1: ( rule__Assignment__Group_0__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:537:2: rule__Assignment__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Alternatives1097);
                    rule__Assignment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:541:6: ( ( rule__Assignment__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:541:6: ( ( rule__Assignment__Group_1__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:542:1: ( rule__Assignment__Group_1__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:543:1: ( rule__Assignment__Group_1__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:543:2: rule__Assignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Alternatives1115);
                    rule__Assignment__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:547:6: ( ( rule__Assignment__Group_2__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:547:6: ( ( rule__Assignment__Group_2__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:548:1: ( rule__Assignment__Group_2__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_2()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:549:1: ( rule__Assignment__Group_2__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:549:2: rule__Assignment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Alternatives1133);
                    rule__Assignment__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:553:6: ( ( rule__Assignment__Group_3__0 ) )
                    {
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:553:6: ( ( rule__Assignment__Group_3__0 ) )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:554:1: ( rule__Assignment__Group_3__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_3()); 
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:555:1: ( rule__Assignment__Group_3__0 )
                    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:555:2: rule__Assignment__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_3__0_in_rule__Assignment__Alternatives1151);
                    rule__Assignment__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Assignment__Alternatives"


    // $ANTLR start "rule__LocalBinding__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:566:1: rule__LocalBinding__Group__0 : rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1 ;
    public final void rule__LocalBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:570:1: ( rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:571:2: rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__0__Impl_in_rule__LocalBinding__Group__01182);
            rule__LocalBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__1_in_rule__LocalBinding__Group__01185);
            rule__LocalBinding__Group__1();

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
    // $ANTLR end "rule__LocalBinding__Group__0"


    // $ANTLR start "rule__LocalBinding__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:578:1: rule__LocalBinding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__LocalBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:582:1: ( ( 'bind' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:583:1: ( 'bind' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:583:1: ( 'bind' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:584:1: 'bind'
            {
             before(grammarAccess.getLocalBindingAccess().getBindKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__LocalBinding__Group__0__Impl1213); 
             after(grammarAccess.getLocalBindingAccess().getBindKeyword_0()); 

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
    // $ANTLR end "rule__LocalBinding__Group__0__Impl"


    // $ANTLR start "rule__LocalBinding__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:597:1: rule__LocalBinding__Group__1 : rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2 ;
    public final void rule__LocalBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:601:1: ( rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:602:2: rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__1__Impl_in_rule__LocalBinding__Group__11244);
            rule__LocalBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__2_in_rule__LocalBinding__Group__11247);
            rule__LocalBinding__Group__2();

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
    // $ANTLR end "rule__LocalBinding__Group__1"


    // $ANTLR start "rule__LocalBinding__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:609:1: rule__LocalBinding__Group__1__Impl : ( 'process' ) ;
    public final void rule__LocalBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:613:1: ( ( 'process' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:614:1: ( 'process' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:614:1: ( 'process' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:615:1: 'process'
            {
             before(grammarAccess.getLocalBindingAccess().getProcessKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__LocalBinding__Group__1__Impl1275); 
             after(grammarAccess.getLocalBindingAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__LocalBinding__Group__1__Impl"


    // $ANTLR start "rule__LocalBinding__Group__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:628:1: rule__LocalBinding__Group__2 : rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3 ;
    public final void rule__LocalBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:632:1: ( rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:633:2: rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__2__Impl_in_rule__LocalBinding__Group__21306);
            rule__LocalBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__3_in_rule__LocalBinding__Group__21309);
            rule__LocalBinding__Group__3();

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
    // $ANTLR end "rule__LocalBinding__Group__2"


    // $ANTLR start "rule__LocalBinding__Group__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:640:1: rule__LocalBinding__Group__2__Impl : ( ( rule__LocalBinding__ProcessidAssignment_2 ) ) ;
    public final void rule__LocalBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:644:1: ( ( ( rule__LocalBinding__ProcessidAssignment_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:645:1: ( ( rule__LocalBinding__ProcessidAssignment_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:645:1: ( ( rule__LocalBinding__ProcessidAssignment_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:646:1: ( rule__LocalBinding__ProcessidAssignment_2 )
            {
             before(grammarAccess.getLocalBindingAccess().getProcessidAssignment_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:647:1: ( rule__LocalBinding__ProcessidAssignment_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:647:2: rule__LocalBinding__ProcessidAssignment_2
            {
            pushFollow(FOLLOW_rule__LocalBinding__ProcessidAssignment_2_in_rule__LocalBinding__Group__2__Impl1336);
            rule__LocalBinding__ProcessidAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getProcessidAssignment_2()); 

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
    // $ANTLR end "rule__LocalBinding__Group__2__Impl"


    // $ANTLR start "rule__LocalBinding__Group__3"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:657:1: rule__LocalBinding__Group__3 : rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4 ;
    public final void rule__LocalBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:661:1: ( rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:662:2: rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__3__Impl_in_rule__LocalBinding__Group__31366);
            rule__LocalBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__4_in_rule__LocalBinding__Group__31369);
            rule__LocalBinding__Group__4();

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
    // $ANTLR end "rule__LocalBinding__Group__3"


    // $ANTLR start "rule__LocalBinding__Group__3__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:669:1: rule__LocalBinding__Group__3__Impl : ( 'to' ) ;
    public final void rule__LocalBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:673:1: ( ( 'to' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:674:1: ( 'to' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:674:1: ( 'to' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:675:1: 'to'
            {
             before(grammarAccess.getLocalBindingAccess().getToKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__LocalBinding__Group__3__Impl1397); 
             after(grammarAccess.getLocalBindingAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__LocalBinding__Group__3__Impl"


    // $ANTLR start "rule__LocalBinding__Group__4"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:688:1: rule__LocalBinding__Group__4 : rule__LocalBinding__Group__4__Impl ;
    public final void rule__LocalBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:692:1: ( rule__LocalBinding__Group__4__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:693:2: rule__LocalBinding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__4__Impl_in_rule__LocalBinding__Group__41428);
            rule__LocalBinding__Group__4__Impl();

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
    // $ANTLR end "rule__LocalBinding__Group__4"


    // $ANTLR start "rule__LocalBinding__Group__4__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:699:1: rule__LocalBinding__Group__4__Impl : ( ( rule__LocalBinding__HandleAssignment_4 ) ) ;
    public final void rule__LocalBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:703:1: ( ( ( rule__LocalBinding__HandleAssignment_4 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:704:1: ( ( rule__LocalBinding__HandleAssignment_4 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:704:1: ( ( rule__LocalBinding__HandleAssignment_4 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:705:1: ( rule__LocalBinding__HandleAssignment_4 )
            {
             before(grammarAccess.getLocalBindingAccess().getHandleAssignment_4()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:706:1: ( rule__LocalBinding__HandleAssignment_4 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:706:2: rule__LocalBinding__HandleAssignment_4
            {
            pushFollow(FOLLOW_rule__LocalBinding__HandleAssignment_4_in_rule__LocalBinding__Group__4__Impl1455);
            rule__LocalBinding__HandleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getHandleAssignment_4()); 

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
    // $ANTLR end "rule__LocalBinding__Group__4__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:726:1: rule__RemoteBinding__Group__0 : rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1 ;
    public final void rule__RemoteBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:730:1: ( rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:731:2: rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__0__Impl_in_rule__RemoteBinding__Group__01495);
            rule__RemoteBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__1_in_rule__RemoteBinding__Group__01498);
            rule__RemoteBinding__Group__1();

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
    // $ANTLR end "rule__RemoteBinding__Group__0"


    // $ANTLR start "rule__RemoteBinding__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:738:1: rule__RemoteBinding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__RemoteBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:742:1: ( ( 'bind' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:743:1: ( 'bind' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:743:1: ( 'bind' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:744:1: 'bind'
            {
             before(grammarAccess.getRemoteBindingAccess().getBindKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__RemoteBinding__Group__0__Impl1526); 
             after(grammarAccess.getRemoteBindingAccess().getBindKeyword_0()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__0__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:757:1: rule__RemoteBinding__Group__1 : rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2 ;
    public final void rule__RemoteBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:761:1: ( rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:762:2: rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__1__Impl_in_rule__RemoteBinding__Group__11557);
            rule__RemoteBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__2_in_rule__RemoteBinding__Group__11560);
            rule__RemoteBinding__Group__2();

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
    // $ANTLR end "rule__RemoteBinding__Group__1"


    // $ANTLR start "rule__RemoteBinding__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:769:1: rule__RemoteBinding__Group__1__Impl : ( 'process' ) ;
    public final void rule__RemoteBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:773:1: ( ( 'process' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:774:1: ( 'process' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:774:1: ( 'process' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:775:1: 'process'
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__RemoteBinding__Group__1__Impl1588); 
             after(grammarAccess.getRemoteBindingAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__1__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:788:1: rule__RemoteBinding__Group__2 : rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3 ;
    public final void rule__RemoteBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:792:1: ( rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:793:2: rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__2__Impl_in_rule__RemoteBinding__Group__21619);
            rule__RemoteBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__3_in_rule__RemoteBinding__Group__21622);
            rule__RemoteBinding__Group__3();

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
    // $ANTLR end "rule__RemoteBinding__Group__2"


    // $ANTLR start "rule__RemoteBinding__Group__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:800:1: rule__RemoteBinding__Group__2__Impl : ( ( rule__RemoteBinding__ProtocolAssignment_2 ) ) ;
    public final void rule__RemoteBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:804:1: ( ( ( rule__RemoteBinding__ProtocolAssignment_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:805:1: ( ( rule__RemoteBinding__ProtocolAssignment_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:805:1: ( ( rule__RemoteBinding__ProtocolAssignment_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:806:1: ( rule__RemoteBinding__ProtocolAssignment_2 )
            {
             before(grammarAccess.getRemoteBindingAccess().getProtocolAssignment_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:807:1: ( rule__RemoteBinding__ProtocolAssignment_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:807:2: rule__RemoteBinding__ProtocolAssignment_2
            {
            pushFollow(FOLLOW_rule__RemoteBinding__ProtocolAssignment_2_in_rule__RemoteBinding__Group__2__Impl1649);
            rule__RemoteBinding__ProtocolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getProtocolAssignment_2()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__2__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__3"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:817:1: rule__RemoteBinding__Group__3 : rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4 ;
    public final void rule__RemoteBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:821:1: ( rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:822:2: rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__3__Impl_in_rule__RemoteBinding__Group__31679);
            rule__RemoteBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__4_in_rule__RemoteBinding__Group__31682);
            rule__RemoteBinding__Group__4();

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
    // $ANTLR end "rule__RemoteBinding__Group__3"


    // $ANTLR start "rule__RemoteBinding__Group__3__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:829:1: rule__RemoteBinding__Group__3__Impl : ( ( rule__RemoteBinding__HostAssignment_3 ) ) ;
    public final void rule__RemoteBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:833:1: ( ( ( rule__RemoteBinding__HostAssignment_3 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:834:1: ( ( rule__RemoteBinding__HostAssignment_3 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:834:1: ( ( rule__RemoteBinding__HostAssignment_3 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:835:1: ( rule__RemoteBinding__HostAssignment_3 )
            {
             before(grammarAccess.getRemoteBindingAccess().getHostAssignment_3()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:836:1: ( rule__RemoteBinding__HostAssignment_3 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:836:2: rule__RemoteBinding__HostAssignment_3
            {
            pushFollow(FOLLOW_rule__RemoteBinding__HostAssignment_3_in_rule__RemoteBinding__Group__3__Impl1709);
            rule__RemoteBinding__HostAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getHostAssignment_3()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__3__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__4"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:846:1: rule__RemoteBinding__Group__4 : rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5 ;
    public final void rule__RemoteBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:850:1: ( rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:851:2: rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__4__Impl_in_rule__RemoteBinding__Group__41739);
            rule__RemoteBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__5_in_rule__RemoteBinding__Group__41742);
            rule__RemoteBinding__Group__5();

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
    // $ANTLR end "rule__RemoteBinding__Group__4"


    // $ANTLR start "rule__RemoteBinding__Group__4__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:858:1: rule__RemoteBinding__Group__4__Impl : ( ( rule__RemoteBinding__PortAssignment_4 ) ) ;
    public final void rule__RemoteBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:862:1: ( ( ( rule__RemoteBinding__PortAssignment_4 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:863:1: ( ( rule__RemoteBinding__PortAssignment_4 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:863:1: ( ( rule__RemoteBinding__PortAssignment_4 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:864:1: ( rule__RemoteBinding__PortAssignment_4 )
            {
             before(grammarAccess.getRemoteBindingAccess().getPortAssignment_4()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:865:1: ( rule__RemoteBinding__PortAssignment_4 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:865:2: rule__RemoteBinding__PortAssignment_4
            {
            pushFollow(FOLLOW_rule__RemoteBinding__PortAssignment_4_in_rule__RemoteBinding__Group__4__Impl1769);
            rule__RemoteBinding__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getPortAssignment_4()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__4__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__5"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:875:1: rule__RemoteBinding__Group__5 : rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6 ;
    public final void rule__RemoteBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:879:1: ( rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:880:2: rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__5__Impl_in_rule__RemoteBinding__Group__51799);
            rule__RemoteBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__6_in_rule__RemoteBinding__Group__51802);
            rule__RemoteBinding__Group__6();

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
    // $ANTLR end "rule__RemoteBinding__Group__5"


    // $ANTLR start "rule__RemoteBinding__Group__5__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:887:1: rule__RemoteBinding__Group__5__Impl : ( ( rule__RemoteBinding__PathAssignment_5 ) ) ;
    public final void rule__RemoteBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:891:1: ( ( ( rule__RemoteBinding__PathAssignment_5 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:892:1: ( ( rule__RemoteBinding__PathAssignment_5 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:892:1: ( ( rule__RemoteBinding__PathAssignment_5 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:893:1: ( rule__RemoteBinding__PathAssignment_5 )
            {
             before(grammarAccess.getRemoteBindingAccess().getPathAssignment_5()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:894:1: ( rule__RemoteBinding__PathAssignment_5 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:894:2: rule__RemoteBinding__PathAssignment_5
            {
            pushFollow(FOLLOW_rule__RemoteBinding__PathAssignment_5_in_rule__RemoteBinding__Group__5__Impl1829);
            rule__RemoteBinding__PathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getPathAssignment_5()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__5__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__6"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:904:1: rule__RemoteBinding__Group__6 : rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7 ;
    public final void rule__RemoteBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:908:1: ( rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:909:2: rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__6__Impl_in_rule__RemoteBinding__Group__61859);
            rule__RemoteBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__7_in_rule__RemoteBinding__Group__61862);
            rule__RemoteBinding__Group__7();

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
    // $ANTLR end "rule__RemoteBinding__Group__6"


    // $ANTLR start "rule__RemoteBinding__Group__6__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:916:1: rule__RemoteBinding__Group__6__Impl : ( ( rule__RemoteBinding__ProcessidAssignment_6 ) ) ;
    public final void rule__RemoteBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:920:1: ( ( ( rule__RemoteBinding__ProcessidAssignment_6 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:921:1: ( ( rule__RemoteBinding__ProcessidAssignment_6 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:921:1: ( ( rule__RemoteBinding__ProcessidAssignment_6 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:922:1: ( rule__RemoteBinding__ProcessidAssignment_6 )
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessidAssignment_6()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:923:1: ( rule__RemoteBinding__ProcessidAssignment_6 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:923:2: rule__RemoteBinding__ProcessidAssignment_6
            {
            pushFollow(FOLLOW_rule__RemoteBinding__ProcessidAssignment_6_in_rule__RemoteBinding__Group__6__Impl1889);
            rule__RemoteBinding__ProcessidAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getProcessidAssignment_6()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__6__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__7"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:933:1: rule__RemoteBinding__Group__7 : rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8 ;
    public final void rule__RemoteBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:937:1: ( rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:938:2: rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__7__Impl_in_rule__RemoteBinding__Group__71919);
            rule__RemoteBinding__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__8_in_rule__RemoteBinding__Group__71922);
            rule__RemoteBinding__Group__8();

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
    // $ANTLR end "rule__RemoteBinding__Group__7"


    // $ANTLR start "rule__RemoteBinding__Group__7__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:945:1: rule__RemoteBinding__Group__7__Impl : ( 'to' ) ;
    public final void rule__RemoteBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:949:1: ( ( 'to' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:950:1: ( 'to' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:950:1: ( 'to' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:951:1: 'to'
            {
             before(grammarAccess.getRemoteBindingAccess().getToKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__RemoteBinding__Group__7__Impl1950); 
             after(grammarAccess.getRemoteBindingAccess().getToKeyword_7()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__7__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__8"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:964:1: rule__RemoteBinding__Group__8 : rule__RemoteBinding__Group__8__Impl ;
    public final void rule__RemoteBinding__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:968:1: ( rule__RemoteBinding__Group__8__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:969:2: rule__RemoteBinding__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__8__Impl_in_rule__RemoteBinding__Group__81981);
            rule__RemoteBinding__Group__8__Impl();

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
    // $ANTLR end "rule__RemoteBinding__Group__8"


    // $ANTLR start "rule__RemoteBinding__Group__8__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:975:1: rule__RemoteBinding__Group__8__Impl : ( ( rule__RemoteBinding__HandleAssignment_8 ) ) ;
    public final void rule__RemoteBinding__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:979:1: ( ( ( rule__RemoteBinding__HandleAssignment_8 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:980:1: ( ( rule__RemoteBinding__HandleAssignment_8 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:980:1: ( ( rule__RemoteBinding__HandleAssignment_8 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:981:1: ( rule__RemoteBinding__HandleAssignment_8 )
            {
             before(grammarAccess.getRemoteBindingAccess().getHandleAssignment_8()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:982:1: ( rule__RemoteBinding__HandleAssignment_8 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:982:2: rule__RemoteBinding__HandleAssignment_8
            {
            pushFollow(FOLLOW_rule__RemoteBinding__HandleAssignment_8_in_rule__RemoteBinding__Group__8__Impl2008);
            rule__RemoteBinding__HandleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getHandleAssignment_8()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__8__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1010:1: rule__ExecuteStatement__Group__0 : rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1 ;
    public final void rule__ExecuteStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1014:1: ( rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1015:2: rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__0__Impl_in_rule__ExecuteStatement__Group__02056);
            rule__ExecuteStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__1_in_rule__ExecuteStatement__Group__02059);
            rule__ExecuteStatement__Group__1();

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
    // $ANTLR end "rule__ExecuteStatement__Group__0"


    // $ANTLR start "rule__ExecuteStatement__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1022:1: rule__ExecuteStatement__Group__0__Impl : ( 'execute' ) ;
    public final void rule__ExecuteStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1026:1: ( ( 'execute' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1027:1: ( 'execute' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1027:1: ( 'execute' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1028:1: 'execute'
            {
             before(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ExecuteStatement__Group__0__Impl2087); 
             after(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__0__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1041:1: rule__ExecuteStatement__Group__1 : rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2 ;
    public final void rule__ExecuteStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1045:1: ( rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1046:2: rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__1__Impl_in_rule__ExecuteStatement__Group__12118);
            rule__ExecuteStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__2_in_rule__ExecuteStatement__Group__12121);
            rule__ExecuteStatement__Group__2();

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
    // $ANTLR end "rule__ExecuteStatement__Group__1"


    // $ANTLR start "rule__ExecuteStatement__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1053:1: rule__ExecuteStatement__Group__1__Impl : ( ( rule__ExecuteStatement__HandleAssignment_1 ) ) ;
    public final void rule__ExecuteStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1057:1: ( ( ( rule__ExecuteStatement__HandleAssignment_1 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1058:1: ( ( rule__ExecuteStatement__HandleAssignment_1 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1058:1: ( ( rule__ExecuteStatement__HandleAssignment_1 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1059:1: ( rule__ExecuteStatement__HandleAssignment_1 )
            {
             before(grammarAccess.getExecuteStatementAccess().getHandleAssignment_1()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1060:1: ( rule__ExecuteStatement__HandleAssignment_1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1060:2: rule__ExecuteStatement__HandleAssignment_1
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__HandleAssignment_1_in_rule__ExecuteStatement__Group__1__Impl2148);
            rule__ExecuteStatement__HandleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExecuteStatementAccess().getHandleAssignment_1()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__1__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1070:1: rule__ExecuteStatement__Group__2 : rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3 ;
    public final void rule__ExecuteStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1074:1: ( rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1075:2: rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__2__Impl_in_rule__ExecuteStatement__Group__22178);
            rule__ExecuteStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__3_in_rule__ExecuteStatement__Group__22181);
            rule__ExecuteStatement__Group__3();

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
    // $ANTLR end "rule__ExecuteStatement__Group__2"


    // $ANTLR start "rule__ExecuteStatement__Group__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1082:1: rule__ExecuteStatement__Group__2__Impl : ( 'with' ) ;
    public final void rule__ExecuteStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1086:1: ( ( 'with' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1087:1: ( 'with' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1087:1: ( 'with' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1088:1: 'with'
            {
             before(grammarAccess.getExecuteStatementAccess().getWithKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ExecuteStatement__Group__2__Impl2209); 
             after(grammarAccess.getExecuteStatementAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__2__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__3"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1101:1: rule__ExecuteStatement__Group__3 : rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4 ;
    public final void rule__ExecuteStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1105:1: ( rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1106:2: rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__3__Impl_in_rule__ExecuteStatement__Group__32240);
            rule__ExecuteStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__4_in_rule__ExecuteStatement__Group__32243);
            rule__ExecuteStatement__Group__4();

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
    // $ANTLR end "rule__ExecuteStatement__Group__3"


    // $ANTLR start "rule__ExecuteStatement__Group__3__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1113:1: rule__ExecuteStatement__Group__3__Impl : ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* ) ;
    public final void rule__ExecuteStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1117:1: ( ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1118:1: ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1118:1: ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1119:1: ( rule__ExecuteStatement__ExecinputsAssignment_3 )*
            {
             before(grammarAccess.getExecuteStatementAccess().getExecinputsAssignment_3()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1120:1: ( rule__ExecuteStatement__ExecinputsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1120:2: rule__ExecuteStatement__ExecinputsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ExecuteStatement__ExecinputsAssignment_3_in_rule__ExecuteStatement__Group__3__Impl2270);
            	    rule__ExecuteStatement__ExecinputsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExecuteStatementAccess().getExecinputsAssignment_3()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__3__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__4"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1130:1: rule__ExecuteStatement__Group__4 : rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5 ;
    public final void rule__ExecuteStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1134:1: ( rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1135:2: rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__4__Impl_in_rule__ExecuteStatement__Group__42301);
            rule__ExecuteStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__5_in_rule__ExecuteStatement__Group__42304);
            rule__ExecuteStatement__Group__5();

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
    // $ANTLR end "rule__ExecuteStatement__Group__4"


    // $ANTLR start "rule__ExecuteStatement__Group__4__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1142:1: rule__ExecuteStatement__Group__4__Impl : ( 'store' ) ;
    public final void rule__ExecuteStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1146:1: ( ( 'store' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1147:1: ( 'store' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1147:1: ( 'store' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1148:1: 'store'
            {
             before(grammarAccess.getExecuteStatementAccess().getStoreKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ExecuteStatement__Group__4__Impl2332); 
             after(grammarAccess.getExecuteStatementAccess().getStoreKeyword_4()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__4__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__5"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1161:1: rule__ExecuteStatement__Group__5 : rule__ExecuteStatement__Group__5__Impl ;
    public final void rule__ExecuteStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1165:1: ( rule__ExecuteStatement__Group__5__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1166:2: rule__ExecuteStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__5__Impl_in_rule__ExecuteStatement__Group__52363);
            rule__ExecuteStatement__Group__5__Impl();

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
    // $ANTLR end "rule__ExecuteStatement__Group__5"


    // $ANTLR start "rule__ExecuteStatement__Group__5__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1172:1: rule__ExecuteStatement__Group__5__Impl : ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* ) ;
    public final void rule__ExecuteStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1176:1: ( ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1177:1: ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1177:1: ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1178:1: ( rule__ExecuteStatement__ExecoutputsAssignment_5 )*
            {
             before(grammarAccess.getExecuteStatementAccess().getExecoutputsAssignment_5()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1179:1: ( rule__ExecuteStatement__ExecoutputsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1179:2: rule__ExecuteStatement__ExecoutputsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ExecuteStatement__ExecoutputsAssignment_5_in_rule__ExecuteStatement__Group__5__Impl2390);
            	    rule__ExecuteStatement__ExecoutputsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExecuteStatementAccess().getExecoutputsAssignment_5()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__5__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1201:1: rule__ExecInput__Group_0__0 : rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1 ;
    public final void rule__ExecInput__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1205:1: ( rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1206:2: rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__0__Impl_in_rule__ExecInput__Group_0__02433);
            rule__ExecInput__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_0__1_in_rule__ExecInput__Group_0__02436);
            rule__ExecInput__Group_0__1();

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
    // $ANTLR end "rule__ExecInput__Group_0__0"


    // $ANTLR start "rule__ExecInput__Group_0__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1213:1: rule__ExecInput__Group_0__0__Impl : ( ( rule__ExecInput__ReferenceAssignment_0_0 ) ) ;
    public final void rule__ExecInput__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1217:1: ( ( ( rule__ExecInput__ReferenceAssignment_0_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1218:1: ( ( rule__ExecInput__ReferenceAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1218:1: ( ( rule__ExecInput__ReferenceAssignment_0_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1219:1: ( rule__ExecInput__ReferenceAssignment_0_0 )
            {
             before(grammarAccess.getExecInputAccess().getReferenceAssignment_0_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1220:1: ( rule__ExecInput__ReferenceAssignment_0_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1220:2: rule__ExecInput__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ExecInput__ReferenceAssignment_0_0_in_rule__ExecInput__Group_0__0__Impl2463);
            rule__ExecInput__ReferenceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getReferenceAssignment_0_0()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__0__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1230:1: rule__ExecInput__Group_0__1 : rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2 ;
    public final void rule__ExecInput__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1234:1: ( rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1235:2: rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__1__Impl_in_rule__ExecInput__Group_0__12493);
            rule__ExecInput__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_0__2_in_rule__ExecInput__Group_0__12496);
            rule__ExecInput__Group_0__2();

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
    // $ANTLR end "rule__ExecInput__Group_0__1"


    // $ANTLR start "rule__ExecInput__Group_0__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1242:1: rule__ExecInput__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__ExecInput__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1246:1: ( ( 'as' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1247:1: ( 'as' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1247:1: ( 'as' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1248:1: 'as'
            {
             before(grammarAccess.getExecInputAccess().getAsKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__ExecInput__Group_0__1__Impl2524); 
             after(grammarAccess.getExecInputAccess().getAsKeyword_0_1()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__1__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1261:1: rule__ExecInput__Group_0__2 : rule__ExecInput__Group_0__2__Impl ;
    public final void rule__ExecInput__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1265:1: ( rule__ExecInput__Group_0__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1266:2: rule__ExecInput__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__2__Impl_in_rule__ExecInput__Group_0__22555);
            rule__ExecInput__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExecInput__Group_0__2"


    // $ANTLR start "rule__ExecInput__Group_0__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1272:1: rule__ExecInput__Group_0__2__Impl : ( ( rule__ExecInput__WpsidAssignment_0_2 ) ) ;
    public final void rule__ExecInput__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1276:1: ( ( ( rule__ExecInput__WpsidAssignment_0_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1277:1: ( ( rule__ExecInput__WpsidAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1277:1: ( ( rule__ExecInput__WpsidAssignment_0_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1278:1: ( rule__ExecInput__WpsidAssignment_0_2 )
            {
             before(grammarAccess.getExecInputAccess().getWpsidAssignment_0_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1279:1: ( rule__ExecInput__WpsidAssignment_0_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1279:2: rule__ExecInput__WpsidAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ExecInput__WpsidAssignment_0_2_in_rule__ExecInput__Group_0__2__Impl2582);
            rule__ExecInput__WpsidAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getWpsidAssignment_0_2()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__2__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1295:1: rule__ExecInput__Group_1__0 : rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1 ;
    public final void rule__ExecInput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1299:1: ( rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1300:2: rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__0__Impl_in_rule__ExecInput__Group_1__02618);
            rule__ExecInput__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_1__1_in_rule__ExecInput__Group_1__02621);
            rule__ExecInput__Group_1__1();

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
    // $ANTLR end "rule__ExecInput__Group_1__0"


    // $ANTLR start "rule__ExecInput__Group_1__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1307:1: rule__ExecInput__Group_1__0__Impl : ( ( rule__ExecInput__ReferenceAssignment_1_0 ) ) ;
    public final void rule__ExecInput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1311:1: ( ( ( rule__ExecInput__ReferenceAssignment_1_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1312:1: ( ( rule__ExecInput__ReferenceAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1312:1: ( ( rule__ExecInput__ReferenceAssignment_1_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1313:1: ( rule__ExecInput__ReferenceAssignment_1_0 )
            {
             before(grammarAccess.getExecInputAccess().getReferenceAssignment_1_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1314:1: ( rule__ExecInput__ReferenceAssignment_1_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1314:2: rule__ExecInput__ReferenceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExecInput__ReferenceAssignment_1_0_in_rule__ExecInput__Group_1__0__Impl2648);
            rule__ExecInput__ReferenceAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getReferenceAssignment_1_0()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__0__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1324:1: rule__ExecInput__Group_1__1 : rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2 ;
    public final void rule__ExecInput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1328:1: ( rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1329:2: rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__1__Impl_in_rule__ExecInput__Group_1__12678);
            rule__ExecInput__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_1__2_in_rule__ExecInput__Group_1__12681);
            rule__ExecInput__Group_1__2();

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
    // $ANTLR end "rule__ExecInput__Group_1__1"


    // $ANTLR start "rule__ExecInput__Group_1__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1336:1: rule__ExecInput__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__ExecInput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1340:1: ( ( 'as' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1341:1: ( 'as' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1341:1: ( 'as' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1342:1: 'as'
            {
             before(grammarAccess.getExecInputAccess().getAsKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__ExecInput__Group_1__1__Impl2709); 
             after(grammarAccess.getExecInputAccess().getAsKeyword_1_1()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__1__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1355:1: rule__ExecInput__Group_1__2 : rule__ExecInput__Group_1__2__Impl ;
    public final void rule__ExecInput__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1359:1: ( rule__ExecInput__Group_1__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1360:2: rule__ExecInput__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__2__Impl_in_rule__ExecInput__Group_1__22740);
            rule__ExecInput__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExecInput__Group_1__2"


    // $ANTLR start "rule__ExecInput__Group_1__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1366:1: rule__ExecInput__Group_1__2__Impl : ( ( rule__ExecInput__WpsidAssignment_1_2 ) ) ;
    public final void rule__ExecInput__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1370:1: ( ( ( rule__ExecInput__WpsidAssignment_1_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1371:1: ( ( rule__ExecInput__WpsidAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1371:1: ( ( rule__ExecInput__WpsidAssignment_1_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1372:1: ( rule__ExecInput__WpsidAssignment_1_2 )
            {
             before(grammarAccess.getExecInputAccess().getWpsidAssignment_1_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1373:1: ( rule__ExecInput__WpsidAssignment_1_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1373:2: rule__ExecInput__WpsidAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExecInput__WpsidAssignment_1_2_in_rule__ExecInput__Group_1__2__Impl2767);
            rule__ExecInput__WpsidAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getWpsidAssignment_1_2()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__2__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1389:1: rule__ExecOutput__Group_0__0 : rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1 ;
    public final void rule__ExecOutput__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1393:1: ( rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1394:2: rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__0__Impl_in_rule__ExecOutput__Group_0__02803);
            rule__ExecOutput__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_0__1_in_rule__ExecOutput__Group_0__02806);
            rule__ExecOutput__Group_0__1();

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
    // $ANTLR end "rule__ExecOutput__Group_0__0"


    // $ANTLR start "rule__ExecOutput__Group_0__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1401:1: rule__ExecOutput__Group_0__0__Impl : ( ( rule__ExecOutput__WpsidAssignment_0_0 ) ) ;
    public final void rule__ExecOutput__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1405:1: ( ( ( rule__ExecOutput__WpsidAssignment_0_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1406:1: ( ( rule__ExecOutput__WpsidAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1406:1: ( ( rule__ExecOutput__WpsidAssignment_0_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1407:1: ( rule__ExecOutput__WpsidAssignment_0_0 )
            {
             before(grammarAccess.getExecOutputAccess().getWpsidAssignment_0_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1408:1: ( rule__ExecOutput__WpsidAssignment_0_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1408:2: rule__ExecOutput__WpsidAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ExecOutput__WpsidAssignment_0_0_in_rule__ExecOutput__Group_0__0__Impl2833);
            rule__ExecOutput__WpsidAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getWpsidAssignment_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__0__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1418:1: rule__ExecOutput__Group_0__1 : rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2 ;
    public final void rule__ExecOutput__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1422:1: ( rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1423:2: rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__1__Impl_in_rule__ExecOutput__Group_0__12863);
            rule__ExecOutput__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_0__2_in_rule__ExecOutput__Group_0__12866);
            rule__ExecOutput__Group_0__2();

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
    // $ANTLR end "rule__ExecOutput__Group_0__1"


    // $ANTLR start "rule__ExecOutput__Group_0__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1430:1: rule__ExecOutput__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__ExecOutput__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1434:1: ( ( 'as' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1435:1: ( 'as' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1435:1: ( 'as' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1436:1: 'as'
            {
             before(grammarAccess.getExecOutputAccess().getAsKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__ExecOutput__Group_0__1__Impl2894); 
             after(grammarAccess.getExecOutputAccess().getAsKeyword_0_1()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__1__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1449:1: rule__ExecOutput__Group_0__2 : rule__ExecOutput__Group_0__2__Impl ;
    public final void rule__ExecOutput__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1453:1: ( rule__ExecOutput__Group_0__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1454:2: rule__ExecOutput__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__2__Impl_in_rule__ExecOutput__Group_0__22925);
            rule__ExecOutput__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExecOutput__Group_0__2"


    // $ANTLR start "rule__ExecOutput__Group_0__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1460:1: rule__ExecOutput__Group_0__2__Impl : ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) ) ;
    public final void rule__ExecOutput__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1464:1: ( ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1465:1: ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1465:1: ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1466:1: ( rule__ExecOutput__ReferenceAssignment_0_2 )
            {
             before(grammarAccess.getExecOutputAccess().getReferenceAssignment_0_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1467:1: ( rule__ExecOutput__ReferenceAssignment_0_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1467:2: rule__ExecOutput__ReferenceAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ExecOutput__ReferenceAssignment_0_2_in_rule__ExecOutput__Group_0__2__Impl2952);
            rule__ExecOutput__ReferenceAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getReferenceAssignment_0_2()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__2__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1483:1: rule__ExecOutput__Group_1__0 : rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1 ;
    public final void rule__ExecOutput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1487:1: ( rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1488:2: rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__0__Impl_in_rule__ExecOutput__Group_1__02988);
            rule__ExecOutput__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_1__1_in_rule__ExecOutput__Group_1__02991);
            rule__ExecOutput__Group_1__1();

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
    // $ANTLR end "rule__ExecOutput__Group_1__0"


    // $ANTLR start "rule__ExecOutput__Group_1__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1495:1: rule__ExecOutput__Group_1__0__Impl : ( ( rule__ExecOutput__WpsideAssignment_1_0 ) ) ;
    public final void rule__ExecOutput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1499:1: ( ( ( rule__ExecOutput__WpsideAssignment_1_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1500:1: ( ( rule__ExecOutput__WpsideAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1500:1: ( ( rule__ExecOutput__WpsideAssignment_1_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1501:1: ( rule__ExecOutput__WpsideAssignment_1_0 )
            {
             before(grammarAccess.getExecOutputAccess().getWpsideAssignment_1_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1502:1: ( rule__ExecOutput__WpsideAssignment_1_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1502:2: rule__ExecOutput__WpsideAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExecOutput__WpsideAssignment_1_0_in_rule__ExecOutput__Group_1__0__Impl3018);
            rule__ExecOutput__WpsideAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getWpsideAssignment_1_0()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__0__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1512:1: rule__ExecOutput__Group_1__1 : rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2 ;
    public final void rule__ExecOutput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1516:1: ( rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1517:2: rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__1__Impl_in_rule__ExecOutput__Group_1__13048);
            rule__ExecOutput__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_1__2_in_rule__ExecOutput__Group_1__13051);
            rule__ExecOutput__Group_1__2();

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
    // $ANTLR end "rule__ExecOutput__Group_1__1"


    // $ANTLR start "rule__ExecOutput__Group_1__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1524:1: rule__ExecOutput__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__ExecOutput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1528:1: ( ( 'as' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1529:1: ( 'as' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1529:1: ( 'as' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1530:1: 'as'
            {
             before(grammarAccess.getExecOutputAccess().getAsKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__ExecOutput__Group_1__1__Impl3079); 
             after(grammarAccess.getExecOutputAccess().getAsKeyword_1_1()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__1__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1543:1: rule__ExecOutput__Group_1__2 : rule__ExecOutput__Group_1__2__Impl ;
    public final void rule__ExecOutput__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1547:1: ( rule__ExecOutput__Group_1__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1548:2: rule__ExecOutput__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__2__Impl_in_rule__ExecOutput__Group_1__23110);
            rule__ExecOutput__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExecOutput__Group_1__2"


    // $ANTLR start "rule__ExecOutput__Group_1__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1554:1: rule__ExecOutput__Group_1__2__Impl : ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) ) ;
    public final void rule__ExecOutput__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1558:1: ( ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1559:1: ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1559:1: ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1560:1: ( rule__ExecOutput__ReferenceAssignment_1_2 )
            {
             before(grammarAccess.getExecOutputAccess().getReferenceAssignment_1_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1561:1: ( rule__ExecOutput__ReferenceAssignment_1_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1561:2: rule__ExecOutput__ReferenceAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExecOutput__ReferenceAssignment_1_2_in_rule__ExecOutput__Group_1__2__Impl3137);
            rule__ExecOutput__ReferenceAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getReferenceAssignment_1_2()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__2__Impl"


    // $ANTLR start "rule__Assignment__Group_0__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1577:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1581:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1582:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__03173);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__03176);
            rule__Assignment__Group_0__1();

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
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1589:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__LefthandAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1593:1: ( ( ( rule__Assignment__LefthandAssignment_0_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1594:1: ( ( rule__Assignment__LefthandAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1594:1: ( ( rule__Assignment__LefthandAssignment_0_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1595:1: ( rule__Assignment__LefthandAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_0_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1596:1: ( rule__Assignment__LefthandAssignment_0_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1596:2: rule__Assignment__LefthandAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_0_0_in_rule__Assignment__Group_0__0__Impl3203);
            rule__Assignment__LefthandAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_0_0()); 

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
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1606:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1610:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1611:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__13233);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_0__2_in_rule__Assignment__Group_0__13236);
            rule__Assignment__Group_0__2();

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
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1618:1: rule__Assignment__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1622:1: ( ( '=' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1623:1: ( '=' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1623:1: ( '=' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1624:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 
            match(input,19,FOLLOW_19_in_rule__Assignment__Group_0__1__Impl3264); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1637:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1641:1: ( rule__Assignment__Group_0__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1642:2: rule__Assignment__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__2__Impl_in_rule__Assignment__Group_0__23295);
            rule__Assignment__Group_0__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_0__2"


    // $ANTLR start "rule__Assignment__Group_0__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1648:1: rule__Assignment__Group_0__2__Impl : ( ( rule__Assignment__RighthandAssignment_0_2 ) ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1652:1: ( ( ( rule__Assignment__RighthandAssignment_0_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1653:1: ( ( rule__Assignment__RighthandAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1653:1: ( ( rule__Assignment__RighthandAssignment_0_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1654:1: ( rule__Assignment__RighthandAssignment_0_2 )
            {
             before(grammarAccess.getAssignmentAccess().getRighthandAssignment_0_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1655:1: ( rule__Assignment__RighthandAssignment_0_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1655:2: rule__Assignment__RighthandAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Assignment__RighthandAssignment_0_2_in_rule__Assignment__Group_0__2__Impl3322);
            rule__Assignment__RighthandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRighthandAssignment_0_2()); 

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
    // $ANTLR end "rule__Assignment__Group_0__2__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1671:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1675:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1676:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__03358);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__03361);
            rule__Assignment__Group_1__1();

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
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1683:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__LefthandAssignment_1_0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1687:1: ( ( ( rule__Assignment__LefthandAssignment_1_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1688:1: ( ( rule__Assignment__LefthandAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1688:1: ( ( rule__Assignment__LefthandAssignment_1_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1689:1: ( rule__Assignment__LefthandAssignment_1_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_1_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1690:1: ( rule__Assignment__LefthandAssignment_1_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1690:2: rule__Assignment__LefthandAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_1_0_in_rule__Assignment__Group_1__0__Impl3388);
            rule__Assignment__LefthandAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_1_0()); 

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
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1700:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1704:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1705:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__13418);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__13421);
            rule__Assignment__Group_1__2();

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
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1712:1: rule__Assignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1716:1: ( ( '=' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1717:1: ( '=' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1717:1: ( '=' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1718:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__Assignment__Group_1__1__Impl3449); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1731:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1735:1: ( rule__Assignment__Group_1__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1736:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__23480);
            rule__Assignment__Group_1__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_1__2"


    // $ANTLR start "rule__Assignment__Group_1__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1742:1: rule__Assignment__Group_1__2__Impl : ( ( rule__Assignment__RighthandAssignment_1_2 ) ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1746:1: ( ( ( rule__Assignment__RighthandAssignment_1_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1747:1: ( ( rule__Assignment__RighthandAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1747:1: ( ( rule__Assignment__RighthandAssignment_1_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1748:1: ( rule__Assignment__RighthandAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentAccess().getRighthandAssignment_1_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1749:1: ( rule__Assignment__RighthandAssignment_1_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1749:2: rule__Assignment__RighthandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Assignment__RighthandAssignment_1_2_in_rule__Assignment__Group_1__2__Impl3507);
            rule__Assignment__RighthandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRighthandAssignment_1_2()); 

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
    // $ANTLR end "rule__Assignment__Group_1__2__Impl"


    // $ANTLR start "rule__Assignment__Group_2__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1765:1: rule__Assignment__Group_2__0 : rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 ;
    public final void rule__Assignment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1769:1: ( rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1770:2: rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__03543);
            rule__Assignment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__03546);
            rule__Assignment__Group_2__1();

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
    // $ANTLR end "rule__Assignment__Group_2__0"


    // $ANTLR start "rule__Assignment__Group_2__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1777:1: rule__Assignment__Group_2__0__Impl : ( ( rule__Assignment__LefthandAssignment_2_0 ) ) ;
    public final void rule__Assignment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1781:1: ( ( ( rule__Assignment__LefthandAssignment_2_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1782:1: ( ( rule__Assignment__LefthandAssignment_2_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1782:1: ( ( rule__Assignment__LefthandAssignment_2_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1783:1: ( rule__Assignment__LefthandAssignment_2_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_2_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1784:1: ( rule__Assignment__LefthandAssignment_2_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1784:2: rule__Assignment__LefthandAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_2_0_in_rule__Assignment__Group_2__0__Impl3573);
            rule__Assignment__LefthandAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_2_0()); 

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
    // $ANTLR end "rule__Assignment__Group_2__0__Impl"


    // $ANTLR start "rule__Assignment__Group_2__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1794:1: rule__Assignment__Group_2__1 : rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 ;
    public final void rule__Assignment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1798:1: ( rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1799:2: rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__13603);
            rule__Assignment__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_2__2_in_rule__Assignment__Group_2__13606);
            rule__Assignment__Group_2__2();

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
    // $ANTLR end "rule__Assignment__Group_2__1"


    // $ANTLR start "rule__Assignment__Group_2__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1806:1: rule__Assignment__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1810:1: ( ( '=' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1811:1: ( '=' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1811:1: ( '=' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1812:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1()); 
            match(input,19,FOLLOW_19_in_rule__Assignment__Group_2__1__Impl3634); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Assignment__Group_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group_2__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1825:1: rule__Assignment__Group_2__2 : rule__Assignment__Group_2__2__Impl ;
    public final void rule__Assignment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1829:1: ( rule__Assignment__Group_2__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1830:2: rule__Assignment__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__2__Impl_in_rule__Assignment__Group_2__23665);
            rule__Assignment__Group_2__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_2__2"


    // $ANTLR start "rule__Assignment__Group_2__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1836:1: rule__Assignment__Group_2__2__Impl : ( ( rule__Assignment__Val_sAssignment_2_2 ) ) ;
    public final void rule__Assignment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1840:1: ( ( ( rule__Assignment__Val_sAssignment_2_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1841:1: ( ( rule__Assignment__Val_sAssignment_2_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1841:1: ( ( rule__Assignment__Val_sAssignment_2_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1842:1: ( rule__Assignment__Val_sAssignment_2_2 )
            {
             before(grammarAccess.getAssignmentAccess().getVal_sAssignment_2_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1843:1: ( rule__Assignment__Val_sAssignment_2_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1843:2: rule__Assignment__Val_sAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Assignment__Val_sAssignment_2_2_in_rule__Assignment__Group_2__2__Impl3692);
            rule__Assignment__Val_sAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVal_sAssignment_2_2()); 

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
    // $ANTLR end "rule__Assignment__Group_2__2__Impl"


    // $ANTLR start "rule__Assignment__Group_3__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1859:1: rule__Assignment__Group_3__0 : rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1 ;
    public final void rule__Assignment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1863:1: ( rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1864:2: rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__0__Impl_in_rule__Assignment__Group_3__03728);
            rule__Assignment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_3__1_in_rule__Assignment__Group_3__03731);
            rule__Assignment__Group_3__1();

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
    // $ANTLR end "rule__Assignment__Group_3__0"


    // $ANTLR start "rule__Assignment__Group_3__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1871:1: rule__Assignment__Group_3__0__Impl : ( ( rule__Assignment__LefthandAssignment_3_0 ) ) ;
    public final void rule__Assignment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1875:1: ( ( ( rule__Assignment__LefthandAssignment_3_0 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1876:1: ( ( rule__Assignment__LefthandAssignment_3_0 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1876:1: ( ( rule__Assignment__LefthandAssignment_3_0 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1877:1: ( rule__Assignment__LefthandAssignment_3_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_3_0()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1878:1: ( rule__Assignment__LefthandAssignment_3_0 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1878:2: rule__Assignment__LefthandAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_3_0_in_rule__Assignment__Group_3__0__Impl3758);
            rule__Assignment__LefthandAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_3_0()); 

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
    // $ANTLR end "rule__Assignment__Group_3__0__Impl"


    // $ANTLR start "rule__Assignment__Group_3__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1888:1: rule__Assignment__Group_3__1 : rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2 ;
    public final void rule__Assignment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1892:1: ( rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1893:2: rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__1__Impl_in_rule__Assignment__Group_3__13788);
            rule__Assignment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_3__2_in_rule__Assignment__Group_3__13791);
            rule__Assignment__Group_3__2();

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
    // $ANTLR end "rule__Assignment__Group_3__1"


    // $ANTLR start "rule__Assignment__Group_3__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1900:1: rule__Assignment__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1904:1: ( ( '=' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1905:1: ( '=' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1905:1: ( '=' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1906:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__Assignment__Group_3__1__Impl3819); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Assignment__Group_3__1__Impl"


    // $ANTLR start "rule__Assignment__Group_3__2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1919:1: rule__Assignment__Group_3__2 : rule__Assignment__Group_3__2__Impl ;
    public final void rule__Assignment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1923:1: ( rule__Assignment__Group_3__2__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1924:2: rule__Assignment__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__2__Impl_in_rule__Assignment__Group_3__23850);
            rule__Assignment__Group_3__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_3__2"


    // $ANTLR start "rule__Assignment__Group_3__2__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1930:1: rule__Assignment__Group_3__2__Impl : ( ( rule__Assignment__Val_iAssignment_3_2 ) ) ;
    public final void rule__Assignment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1934:1: ( ( ( rule__Assignment__Val_iAssignment_3_2 ) ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1935:1: ( ( rule__Assignment__Val_iAssignment_3_2 ) )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1935:1: ( ( rule__Assignment__Val_iAssignment_3_2 ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1936:1: ( rule__Assignment__Val_iAssignment_3_2 )
            {
             before(grammarAccess.getAssignmentAccess().getVal_iAssignment_3_2()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1937:1: ( rule__Assignment__Val_iAssignment_3_2 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1937:2: rule__Assignment__Val_iAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Assignment__Val_iAssignment_3_2_in_rule__Assignment__Group_3__2__Impl3877);
            rule__Assignment__Val_iAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVal_iAssignment_3_2()); 

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
    // $ANTLR end "rule__Assignment__Group_3__2__Impl"


    // $ANTLR start "rule__IN_REFERENCE__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1953:1: rule__IN_REFERENCE__Group__0 : rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1 ;
    public final void rule__IN_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1957:1: ( rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1958:2: rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__0__Impl_in_rule__IN_REFERENCE__Group__03913);
            rule__IN_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__1_in_rule__IN_REFERENCE__Group__03916);
            rule__IN_REFERENCE__Group__1();

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
    // $ANTLR end "rule__IN_REFERENCE__Group__0"


    // $ANTLR start "rule__IN_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1965:1: rule__IN_REFERENCE__Group__0__Impl : ( 'in.' ) ;
    public final void rule__IN_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1969:1: ( ( 'in.' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1970:1: ( 'in.' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1970:1: ( 'in.' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1971:1: 'in.'
            {
             before(grammarAccess.getIN_REFERENCEAccess().getInKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__IN_REFERENCE__Group__0__Impl3944); 
             after(grammarAccess.getIN_REFERENCEAccess().getInKeyword_0()); 

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
    // $ANTLR end "rule__IN_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__IN_REFERENCE__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1984:1: rule__IN_REFERENCE__Group__1 : rule__IN_REFERENCE__Group__1__Impl ;
    public final void rule__IN_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1988:1: ( rule__IN_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1989:2: rule__IN_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__1__Impl_in_rule__IN_REFERENCE__Group__13975);
            rule__IN_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__IN_REFERENCE__Group__1"


    // $ANTLR start "rule__IN_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1995:1: rule__IN_REFERENCE__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__IN_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:1999:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2000:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2000:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2001:1: RULE_ID
            {
             before(grammarAccess.getIN_REFERENCEAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IN_REFERENCE__Group__1__Impl4002); 
             after(grammarAccess.getIN_REFERENCEAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__IN_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__OUT_REFERENCE__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2016:1: rule__OUT_REFERENCE__Group__0 : rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1 ;
    public final void rule__OUT_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2020:1: ( rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2021:2: rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__0__Impl_in_rule__OUT_REFERENCE__Group__04035);
            rule__OUT_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__1_in_rule__OUT_REFERENCE__Group__04038);
            rule__OUT_REFERENCE__Group__1();

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__0"


    // $ANTLR start "rule__OUT_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2028:1: rule__OUT_REFERENCE__Group__0__Impl : ( 'out.' ) ;
    public final void rule__OUT_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2032:1: ( ( 'out.' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2033:1: ( 'out.' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2033:1: ( 'out.' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2034:1: 'out.'
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getOutKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__OUT_REFERENCE__Group__0__Impl4066); 
             after(grammarAccess.getOUT_REFERENCEAccess().getOutKeyword_0()); 

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__OUT_REFERENCE__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2047:1: rule__OUT_REFERENCE__Group__1 : rule__OUT_REFERENCE__Group__1__Impl ;
    public final void rule__OUT_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2051:1: ( rule__OUT_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2052:2: rule__OUT_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__1__Impl_in_rule__OUT_REFERENCE__Group__14097);
            rule__OUT_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__1"


    // $ANTLR start "rule__OUT_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2058:1: rule__OUT_REFERENCE__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__OUT_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2062:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2063:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2063:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2064:1: RULE_ID
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OUT_REFERENCE__Group__1__Impl4124); 
             after(grammarAccess.getOUT_REFERENCEAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__VAR_REFERENCE__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2079:1: rule__VAR_REFERENCE__Group__0 : rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1 ;
    public final void rule__VAR_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2083:1: ( rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2084:2: rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__0__Impl_in_rule__VAR_REFERENCE__Group__04157);
            rule__VAR_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__1_in_rule__VAR_REFERENCE__Group__04160);
            rule__VAR_REFERENCE__Group__1();

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__0"


    // $ANTLR start "rule__VAR_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2091:1: rule__VAR_REFERENCE__Group__0__Impl : ( 'var.' ) ;
    public final void rule__VAR_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2095:1: ( ( 'var.' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2096:1: ( 'var.' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2096:1: ( 'var.' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2097:1: 'var.'
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getVarKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__VAR_REFERENCE__Group__0__Impl4188); 
             after(grammarAccess.getVAR_REFERENCEAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__VAR_REFERENCE__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2110:1: rule__VAR_REFERENCE__Group__1 : rule__VAR_REFERENCE__Group__1__Impl ;
    public final void rule__VAR_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2114:1: ( rule__VAR_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2115:2: rule__VAR_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__1__Impl_in_rule__VAR_REFERENCE__Group__14219);
            rule__VAR_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__1"


    // $ANTLR start "rule__VAR_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2121:1: rule__VAR_REFERENCE__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VAR_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2125:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2126:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2126:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2127:1: RULE_ID
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VAR_REFERENCE__Group__1__Impl4246); 
             after(grammarAccess.getVAR_REFERENCEAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2142:1: rule__QUALIFIEDNAME__Group__0 : rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1 ;
    public final void rule__QUALIFIEDNAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2146:1: ( rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2147:2: rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__0__Impl_in_rule__QUALIFIEDNAME__Group__04279);
            rule__QUALIFIEDNAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__1_in_rule__QUALIFIEDNAME__Group__04282);
            rule__QUALIFIEDNAME__Group__1();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__0"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2154:1: rule__QUALIFIEDNAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDNAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2158:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2159:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2159:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2160:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group__0__Impl4309); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2171:1: rule__QUALIFIEDNAME__Group__1 : rule__QUALIFIEDNAME__Group__1__Impl ;
    public final void rule__QUALIFIEDNAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2175:1: ( rule__QUALIFIEDNAME__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2176:2: rule__QUALIFIEDNAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__1__Impl_in_rule__QUALIFIEDNAME__Group__14338);
            rule__QUALIFIEDNAME__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__1"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2182:1: rule__QUALIFIEDNAME__Group__1__Impl : ( ( rule__QUALIFIEDNAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIEDNAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2186:1: ( ( ( rule__QUALIFIEDNAME__Group_1__0 )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2187:1: ( ( rule__QUALIFIEDNAME__Group_1__0 )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2187:1: ( ( rule__QUALIFIEDNAME__Group_1__0 )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2188:1: ( rule__QUALIFIEDNAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2189:1: ( rule__QUALIFIEDNAME__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2189:2: rule__QUALIFIEDNAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__0_in_rule__QUALIFIEDNAME__Group__1__Impl4365);
            	    rule__QUALIFIEDNAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2203:1: rule__QUALIFIEDNAME__Group_1__0 : rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1 ;
    public final void rule__QUALIFIEDNAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2207:1: ( rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2208:2: rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__0__Impl_in_rule__QUALIFIEDNAME__Group_1__04400);
            rule__QUALIFIEDNAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__1_in_rule__QUALIFIEDNAME__Group_1__04403);
            rule__QUALIFIEDNAME__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__0"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2215:1: rule__QUALIFIEDNAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIEDNAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2219:1: ( ( '.' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2220:1: ( '.' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2220:1: ( '.' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2221:1: '.'
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__QUALIFIEDNAME__Group_1__0__Impl4431); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2234:1: rule__QUALIFIEDNAME__Group_1__1 : rule__QUALIFIEDNAME__Group_1__1__Impl ;
    public final void rule__QUALIFIEDNAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2238:1: ( rule__QUALIFIEDNAME__Group_1__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2239:2: rule__QUALIFIEDNAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__1__Impl_in_rule__QUALIFIEDNAME__Group_1__14462);
            rule__QUALIFIEDNAME__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__1"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2245:1: rule__QUALIFIEDNAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDNAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2249:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2250:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2250:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2251:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group_1__1__Impl4489); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2266:1: rule__QUALIFIEDID__Group__0 : rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 ;
    public final void rule__QUALIFIEDID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2270:1: ( rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2271:2: rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__04522);
            rule__QUALIFIEDID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__04525);
            rule__QUALIFIEDID__Group__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__0"


    // $ANTLR start "rule__QUALIFIEDID__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2278:1: rule__QUALIFIEDID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2282:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2283:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2283:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2284:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl4552); 
             after(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2295:1: rule__QUALIFIEDID__Group__1 : rule__QUALIFIEDID__Group__1__Impl ;
    public final void rule__QUALIFIEDID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2299:1: ( rule__QUALIFIEDID__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2300:2: rule__QUALIFIEDID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__14581);
            rule__QUALIFIEDID__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__1"


    // $ANTLR start "rule__QUALIFIEDID__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2306:1: rule__QUALIFIEDID__Group__1__Impl : ( ( rule__QUALIFIEDID__Group_1__0 )* ) ;
    public final void rule__QUALIFIEDID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2310:1: ( ( ( rule__QUALIFIEDID__Group_1__0 )* ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2311:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2311:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2312:1: ( rule__QUALIFIEDID__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2313:1: ( rule__QUALIFIEDID__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2313:2: rule__QUALIFIEDID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl4608);
            	    rule__QUALIFIEDID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2327:1: rule__QUALIFIEDID__Group_1__0 : rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 ;
    public final void rule__QUALIFIEDID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2331:1: ( rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2332:2: rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__04643);
            rule__QUALIFIEDID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__04646);
            rule__QUALIFIEDID__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2339:1: rule__QUALIFIEDID__Group_1__0__Impl : ( '/' ) ;
    public final void rule__QUALIFIEDID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2343:1: ( ( '/' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2344:1: ( '/' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2344:1: ( '/' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2345:1: '/'
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__QUALIFIEDID__Group_1__0__Impl4674); 
             after(grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2358:1: rule__QUALIFIEDID__Group_1__1 : rule__QUALIFIEDID__Group_1__1__Impl ;
    public final void rule__QUALIFIEDID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2362:1: ( rule__QUALIFIEDID__Group_1__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2363:2: rule__QUALIFIEDID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__14705);
            rule__QUALIFIEDID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2369:1: rule__QUALIFIEDID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2373:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2374:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2374:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2375:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group_1__1__Impl4732); 
             after(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2390:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2394:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2395:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__04765);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__04768);
            rule__URI__Group__1();

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
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2402:1: rule__URI__Group__0__Impl : ( '/' ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2406:1: ( ( '/' ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2407:1: ( '/' )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2407:1: ( '/' )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2408:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__URI__Group__0__Impl4796); 
             after(grammarAccess.getURIAccess().getSolidusKeyword_0()); 

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
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2421:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2425:1: ( rule__URI__Group__1__Impl )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2426:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__14827);
            rule__URI__Group__1__Impl();

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
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2432:1: rule__URI__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2436:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2437:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2437:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2438:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group__1__Impl4854); 
             after(grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__Worksequence__OperationsAssignment"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2454:1: rule__Worksequence__OperationsAssignment : ( ruleOperation ) ;
    public final void rule__Worksequence__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2458:1: ( ( ruleOperation ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2459:1: ( ruleOperation )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2459:1: ( ruleOperation )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2460:1: ruleOperation
            {
             before(grammarAccess.getWorksequenceAccess().getOperationsOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Worksequence__OperationsAssignment4892);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getWorksequenceAccess().getOperationsOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Worksequence__OperationsAssignment"


    // $ANTLR start "rule__LocalBinding__ProcessidAssignment_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2469:1: rule__LocalBinding__ProcessidAssignment_2 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__LocalBinding__ProcessidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2473:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2474:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2474:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2475:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__LocalBinding__ProcessidAssignment_24923);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LocalBinding__ProcessidAssignment_2"


    // $ANTLR start "rule__LocalBinding__HandleAssignment_4"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2484:1: rule__LocalBinding__HandleAssignment_4 : ( ruleQUALIFIEDID ) ;
    public final void rule__LocalBinding__HandleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2488:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2489:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2489:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2490:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__LocalBinding__HandleAssignment_44954);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LocalBinding__HandleAssignment_4"


    // $ANTLR start "rule__RemoteBinding__ProtocolAssignment_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2499:1: rule__RemoteBinding__ProtocolAssignment_2 : ( RULE_PROTOCOL ) ;
    public final void rule__RemoteBinding__ProtocolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2503:1: ( ( RULE_PROTOCOL ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2504:1: ( RULE_PROTOCOL )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2504:1: ( RULE_PROTOCOL )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2505:1: RULE_PROTOCOL
            {
             before(grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0()); 
            match(input,RULE_PROTOCOL,FOLLOW_RULE_PROTOCOL_in_rule__RemoteBinding__ProtocolAssignment_24985); 
             after(grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RemoteBinding__ProtocolAssignment_2"


    // $ANTLR start "rule__RemoteBinding__HostAssignment_3"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2514:1: rule__RemoteBinding__HostAssignment_3 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__RemoteBinding__HostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2518:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2519:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2519:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2520:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__HostAssignment_35016);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RemoteBinding__HostAssignment_3"


    // $ANTLR start "rule__RemoteBinding__PortAssignment_4"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2529:1: rule__RemoteBinding__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__RemoteBinding__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2533:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2534:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2534:1: ( RULE_INT )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2535:1: RULE_INT
            {
             before(grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RemoteBinding__PortAssignment_45047); 
             after(grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RemoteBinding__PortAssignment_4"


    // $ANTLR start "rule__RemoteBinding__PathAssignment_5"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2544:1: rule__RemoteBinding__PathAssignment_5 : ( ruleURI ) ;
    public final void rule__RemoteBinding__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2548:1: ( ( ruleURI ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2549:1: ( ruleURI )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2549:1: ( ruleURI )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2550:1: ruleURI
            {
             before(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__RemoteBinding__PathAssignment_55078);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RemoteBinding__PathAssignment_5"


    // $ANTLR start "rule__RemoteBinding__ProcessidAssignment_6"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2559:1: rule__RemoteBinding__ProcessidAssignment_6 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__RemoteBinding__ProcessidAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2563:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2564:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2564:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2565:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__ProcessidAssignment_65109);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RemoteBinding__ProcessidAssignment_6"


    // $ANTLR start "rule__RemoteBinding__HandleAssignment_8"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2574:1: rule__RemoteBinding__HandleAssignment_8 : ( ruleQUALIFIEDID ) ;
    public final void rule__RemoteBinding__HandleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2578:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2579:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2579:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2580:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__RemoteBinding__HandleAssignment_85140);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__RemoteBinding__HandleAssignment_8"


    // $ANTLR start "rule__ExecuteStatement__HandleAssignment_1"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2589:1: rule__ExecuteStatement__HandleAssignment_1 : ( ruleQUALIFIEDID ) ;
    public final void rule__ExecuteStatement__HandleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2593:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2594:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2594:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2595:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__ExecuteStatement__HandleAssignment_15171);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__HandleAssignment_1"


    // $ANTLR start "rule__ExecuteStatement__ExecinputsAssignment_3"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2604:1: rule__ExecuteStatement__ExecinputsAssignment_3 : ( ruleExecInput ) ;
    public final void rule__ExecuteStatement__ExecinputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2608:1: ( ( ruleExecInput ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2609:1: ( ruleExecInput )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2609:1: ( ruleExecInput )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2610:1: ruleExecInput
            {
             before(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExecInput_in_rule__ExecuteStatement__ExecinputsAssignment_35202);
            ruleExecInput();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__ExecinputsAssignment_3"


    // $ANTLR start "rule__ExecuteStatement__ExecoutputsAssignment_5"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2619:1: rule__ExecuteStatement__ExecoutputsAssignment_5 : ( ruleExecOutput ) ;
    public final void rule__ExecuteStatement__ExecoutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2623:1: ( ( ruleExecOutput ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2624:1: ( ruleExecOutput )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2624:1: ( ruleExecOutput )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2625:1: ruleExecOutput
            {
             before(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExecOutput_in_rule__ExecuteStatement__ExecoutputsAssignment_55233);
            ruleExecOutput();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__ExecoutputsAssignment_5"


    // $ANTLR start "rule__ExecInput__ReferenceAssignment_0_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2634:1: rule__ExecInput__ReferenceAssignment_0_0 : ( ruleIN_REFERENCE ) ;
    public final void rule__ExecInput__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2638:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2639:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2639:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2640:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__ExecInput__ReferenceAssignment_0_05264);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__ExecInput__ReferenceAssignment_0_0"


    // $ANTLR start "rule__ExecInput__WpsidAssignment_0_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2649:1: rule__ExecInput__WpsidAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__ExecInput__WpsidAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2653:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2654:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2654:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2655:1: RULE_ID
            {
             before(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_0_25295); 
             after(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ExecInput__WpsidAssignment_0_2"


    // $ANTLR start "rule__ExecInput__ReferenceAssignment_1_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2664:1: rule__ExecInput__ReferenceAssignment_1_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__ExecInput__ReferenceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2668:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2669:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2669:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2670:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__ExecInput__ReferenceAssignment_1_05326);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExecInput__ReferenceAssignment_1_0"


    // $ANTLR start "rule__ExecInput__WpsidAssignment_1_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2679:1: rule__ExecInput__WpsidAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__ExecInput__WpsidAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2683:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2684:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2684:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2685:1: RULE_ID
            {
             before(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_1_25357); 
             after(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExecInput__WpsidAssignment_1_2"


    // $ANTLR start "rule__ExecOutput__WpsidAssignment_0_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2694:1: rule__ExecOutput__WpsidAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ExecOutput__WpsidAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2698:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2699:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2699:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2700:1: RULE_ID
            {
             before(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_0_05388); 
             after(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__WpsidAssignment_0_0"


    // $ANTLR start "rule__ExecOutput__ReferenceAssignment_0_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2709:1: rule__ExecOutput__ReferenceAssignment_0_2 : ( ruleOUT_REFERENCE ) ;
    public final void rule__ExecOutput__ReferenceAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2713:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2714:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2714:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2715:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_0_25419);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ExecOutput__ReferenceAssignment_0_2"


    // $ANTLR start "rule__ExecOutput__WpsideAssignment_1_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2724:1: rule__ExecOutput__WpsideAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ExecOutput__WpsideAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2728:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2729:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2729:1: ( RULE_ID )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2730:1: RULE_ID
            {
             before(grammarAccess.getExecOutputAccess().getWpsideIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecOutput__WpsideAssignment_1_05450); 
             after(grammarAccess.getExecOutputAccess().getWpsideIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__WpsideAssignment_1_0"


    // $ANTLR start "rule__ExecOutput__ReferenceAssignment_1_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2739:1: rule__ExecOutput__ReferenceAssignment_1_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__ExecOutput__ReferenceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2743:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2744:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2744:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2745:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_1_25481);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExecOutput__ReferenceAssignment_1_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_0_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2754:1: rule__Assignment__LefthandAssignment_0_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2758:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2759:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2759:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2760:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_0_05512);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_0_0"


    // $ANTLR start "rule__Assignment__RighthandAssignment_0_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2769:1: rule__Assignment__RighthandAssignment_0_2 : ( ruleIN_REFERENCE ) ;
    public final void rule__Assignment__RighthandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2773:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2774:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2774:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2775:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__Assignment__RighthandAssignment_0_25543);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Assignment__RighthandAssignment_0_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_1_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2784:1: rule__Assignment__LefthandAssignment_1_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2788:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2789:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2789:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2790:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_1_05574);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_1_0"


    // $ANTLR start "rule__Assignment__RighthandAssignment_1_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2799:1: rule__Assignment__RighthandAssignment_1_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__RighthandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2803:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2804:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2804:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2805:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__RighthandAssignment_1_25605);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Assignment__RighthandAssignment_1_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_2_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2814:1: rule__Assignment__LefthandAssignment_2_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2818:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2819:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2819:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2820:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_2_05636);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_2_0"


    // $ANTLR start "rule__Assignment__Val_sAssignment_2_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2829:1: rule__Assignment__Val_sAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Assignment__Val_sAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2833:1: ( ( RULE_STRING ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2834:1: ( RULE_STRING )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2834:1: ( RULE_STRING )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2835:1: RULE_STRING
            {
             before(grammarAccess.getAssignmentAccess().getVal_sSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__Val_sAssignment_2_25667); 
             after(grammarAccess.getAssignmentAccess().getVal_sSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Assignment__Val_sAssignment_2_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_3_0"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2844:1: rule__Assignment__LefthandAssignment_3_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2848:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2849:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2849:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2850:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_3_05698);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_3_0"


    // $ANTLR start "rule__Assignment__Val_iAssignment_3_2"
    // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2859:1: rule__Assignment__Val_iAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__Assignment__Val_iAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2863:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2864:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2864:1: ( RULE_INT )
            // ../de.hsos.richwps.wd.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalWD.g:2865:1: RULE_INT
            {
             before(grammarAccess.getAssignmentAccess().getVal_iINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Assignment__Val_iAssignment_3_25729); 
             after(grammarAccess.getAssignmentAccess().getVal_iINTTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Assignment__Val_iAssignment_3_2"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\25\2\4\2\23\1\24\1\6\4\uffff";
    static final String DFA6_maxS =
        "\1\26\2\4\2\23\1\26\1\7\4\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\2\1\1\1\3\1\4";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7",
            "\1\12\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "530:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleWorksequence_in_entryRuleWorksequence61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorksequence68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Worksequence__OperationsAssignment_in_ruleWorksequence94 = new BitSet(new long[]{0x0000000000609002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalBinding189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__0_in_ruleLocalBinding215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemoteBinding249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__0_in_ruleRemoteBinding275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteStatement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__0_in_ruleExecuteStatement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecInput_in_entryRuleExecInput362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecInput369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Alternatives_in_ruleExecInput395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_entryRuleExecOutput422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecOutput429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Alternatives_in_ruleExecOutput455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIN_REFERENCE549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__0_in_ruleIN_REFERENCE575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUT_REFERENCE609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__0_in_ruleOUT_REFERENCE635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_REFERENCE669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__0_in_ruleVAR_REFERENCE695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDNAME729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__0_in_ruleQUALIFIEDNAME755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI875 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_rule__Operation__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_rule__Operation__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_rule__Operation__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__0_in_rule__ExecInput__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__0_in_rule__ExecInput__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__0_in_rule__ExecOutput__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__0_in_rule__ExecOutput__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__0_in_rule__Assignment__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__0__Impl_in_rule__LocalBinding__Group__01182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__1_in_rule__LocalBinding__Group__01185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__LocalBinding__Group__0__Impl1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__1__Impl_in_rule__LocalBinding__Group__11244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__2_in_rule__LocalBinding__Group__11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__LocalBinding__Group__1__Impl1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__2__Impl_in_rule__LocalBinding__Group__21306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__3_in_rule__LocalBinding__Group__21309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__ProcessidAssignment_2_in_rule__LocalBinding__Group__2__Impl1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__3__Impl_in_rule__LocalBinding__Group__31366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__4_in_rule__LocalBinding__Group__31369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__LocalBinding__Group__3__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__4__Impl_in_rule__LocalBinding__Group__41428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__HandleAssignment_4_in_rule__LocalBinding__Group__4__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__0__Impl_in_rule__RemoteBinding__Group__01495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__1_in_rule__RemoteBinding__Group__01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RemoteBinding__Group__0__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__1__Impl_in_rule__RemoteBinding__Group__11557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__2_in_rule__RemoteBinding__Group__11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RemoteBinding__Group__1__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__2__Impl_in_rule__RemoteBinding__Group__21619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__3_in_rule__RemoteBinding__Group__21622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__ProtocolAssignment_2_in_rule__RemoteBinding__Group__2__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__3__Impl_in_rule__RemoteBinding__Group__31679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__4_in_rule__RemoteBinding__Group__31682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__HostAssignment_3_in_rule__RemoteBinding__Group__3__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__4__Impl_in_rule__RemoteBinding__Group__41739 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__5_in_rule__RemoteBinding__Group__41742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__PortAssignment_4_in_rule__RemoteBinding__Group__4__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__5__Impl_in_rule__RemoteBinding__Group__51799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__6_in_rule__RemoteBinding__Group__51802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__PathAssignment_5_in_rule__RemoteBinding__Group__5__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__6__Impl_in_rule__RemoteBinding__Group__61859 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__7_in_rule__RemoteBinding__Group__61862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__ProcessidAssignment_6_in_rule__RemoteBinding__Group__6__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__7__Impl_in_rule__RemoteBinding__Group__71919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__8_in_rule__RemoteBinding__Group__71922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RemoteBinding__Group__7__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__8__Impl_in_rule__RemoteBinding__Group__81981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__HandleAssignment_8_in_rule__RemoteBinding__Group__8__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__0__Impl_in_rule__ExecuteStatement__Group__02056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__1_in_rule__ExecuteStatement__Group__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExecuteStatement__Group__0__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__1__Impl_in_rule__ExecuteStatement__Group__12118 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__2_in_rule__ExecuteStatement__Group__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__HandleAssignment_1_in_rule__ExecuteStatement__Group__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__2__Impl_in_rule__ExecuteStatement__Group__22178 = new BitSet(new long[]{0x0000000000520000L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__3_in_rule__ExecuteStatement__Group__22181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExecuteStatement__Group__2__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__3__Impl_in_rule__ExecuteStatement__Group__32240 = new BitSet(new long[]{0x0000000000520000L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__4_in_rule__ExecuteStatement__Group__32243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__ExecinputsAssignment_3_in_rule__ExecuteStatement__Group__3__Impl2270 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__4__Impl_in_rule__ExecuteStatement__Group__42301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__5_in_rule__ExecuteStatement__Group__42304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExecuteStatement__Group__4__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__5__Impl_in_rule__ExecuteStatement__Group__52363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__ExecoutputsAssignment_5_in_rule__ExecuteStatement__Group__5__Impl2390 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__0__Impl_in_rule__ExecInput__Group_0__02433 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__1_in_rule__ExecInput__Group_0__02436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__ReferenceAssignment_0_0_in_rule__ExecInput__Group_0__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__1__Impl_in_rule__ExecInput__Group_0__12493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__2_in_rule__ExecInput__Group_0__12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExecInput__Group_0__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__2__Impl_in_rule__ExecInput__Group_0__22555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__WpsidAssignment_0_2_in_rule__ExecInput__Group_0__2__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__0__Impl_in_rule__ExecInput__Group_1__02618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__1_in_rule__ExecInput__Group_1__02621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__ReferenceAssignment_1_0_in_rule__ExecInput__Group_1__0__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__1__Impl_in_rule__ExecInput__Group_1__12678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__2_in_rule__ExecInput__Group_1__12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExecInput__Group_1__1__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__2__Impl_in_rule__ExecInput__Group_1__22740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__WpsidAssignment_1_2_in_rule__ExecInput__Group_1__2__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__0__Impl_in_rule__ExecOutput__Group_0__02803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__1_in_rule__ExecOutput__Group_0__02806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__WpsidAssignment_0_0_in_rule__ExecOutput__Group_0__0__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__1__Impl_in_rule__ExecOutput__Group_0__12863 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__2_in_rule__ExecOutput__Group_0__12866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExecOutput__Group_0__1__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__2__Impl_in_rule__ExecOutput__Group_0__22925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__ReferenceAssignment_0_2_in_rule__ExecOutput__Group_0__2__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__0__Impl_in_rule__ExecOutput__Group_1__02988 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__1_in_rule__ExecOutput__Group_1__02991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__WpsideAssignment_1_0_in_rule__ExecOutput__Group_1__0__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__1__Impl_in_rule__ExecOutput__Group_1__13048 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__2_in_rule__ExecOutput__Group_1__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExecOutput__Group_1__1__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__2__Impl_in_rule__ExecOutput__Group_1__23110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__ReferenceAssignment_1_2_in_rule__ExecOutput__Group_1__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__03173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_0_0_in_rule__Assignment__Group_0__0__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__13233 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__2_in_rule__Assignment__Group_0__13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Group_0__1__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__2__Impl_in_rule__Assignment__Group_0__23295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__RighthandAssignment_0_2_in_rule__Assignment__Group_0__2__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__03358 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__03361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_1_0_in_rule__Assignment__Group_1__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__13418 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Group_1__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__RighthandAssignment_1_2_in_rule__Assignment__Group_1__2__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__03543 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__03546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_2_0_in_rule__Assignment__Group_2__0__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__13603 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__2_in_rule__Assignment__Group_2__13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Group_2__1__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__2__Impl_in_rule__Assignment__Group_2__23665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Val_sAssignment_2_2_in_rule__Assignment__Group_2__2__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__0__Impl_in_rule__Assignment__Group_3__03728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__1_in_rule__Assignment__Group_3__03731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_3_0_in_rule__Assignment__Group_3__0__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__1__Impl_in_rule__Assignment__Group_3__13788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__2_in_rule__Assignment__Group_3__13791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assignment__Group_3__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__2__Impl_in_rule__Assignment__Group_3__23850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Val_iAssignment_3_2_in_rule__Assignment__Group_3__2__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__0__Impl_in_rule__IN_REFERENCE__Group__03913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__1_in_rule__IN_REFERENCE__Group__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IN_REFERENCE__Group__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__1__Impl_in_rule__IN_REFERENCE__Group__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IN_REFERENCE__Group__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__0__Impl_in_rule__OUT_REFERENCE__Group__04035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__1_in_rule__OUT_REFERENCE__Group__04038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OUT_REFERENCE__Group__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__1__Impl_in_rule__OUT_REFERENCE__Group__14097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OUT_REFERENCE__Group__1__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__0__Impl_in_rule__VAR_REFERENCE__Group__04157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__1_in_rule__VAR_REFERENCE__Group__04160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VAR_REFERENCE__Group__0__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__1__Impl_in_rule__VAR_REFERENCE__Group__14219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VAR_REFERENCE__Group__1__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__0__Impl_in_rule__QUALIFIEDNAME__Group__04279 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__1_in_rule__QUALIFIEDNAME__Group__04282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group__0__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__1__Impl_in_rule__QUALIFIEDNAME__Group__14338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__0_in_rule__QUALIFIEDNAME__Group__1__Impl4365 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__0__Impl_in_rule__QUALIFIEDNAME__Group_1__04400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__1_in_rule__QUALIFIEDNAME__Group_1__04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QUALIFIEDNAME__Group_1__0__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__1__Impl_in_rule__QUALIFIEDNAME__Group_1__14462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group_1__1__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__04522 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__04525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__14581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl4608 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__04643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QUALIFIEDID__Group_1__0__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group_1__1__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__04765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__04768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__URI__Group__0__Impl4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__14827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group__1__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Worksequence__OperationsAssignment4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__LocalBinding__ProcessidAssignment_24923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__LocalBinding__HandleAssignment_44954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROTOCOL_in_rule__RemoteBinding__ProtocolAssignment_24985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__HostAssignment_35016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RemoteBinding__PortAssignment_45047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__RemoteBinding__PathAssignment_55078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__ProcessidAssignment_65109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__RemoteBinding__HandleAssignment_85140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__ExecuteStatement__HandleAssignment_15171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecInput_in_rule__ExecuteStatement__ExecinputsAssignment_35202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_rule__ExecuteStatement__ExecoutputsAssignment_55233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__ExecInput__ReferenceAssignment_0_05264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_0_25295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__ExecInput__ReferenceAssignment_1_05326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_1_25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_0_05388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_0_25419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecOutput__WpsideAssignment_1_05450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_1_25481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_0_05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__Assignment__RighthandAssignment_0_25543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_1_05574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__RighthandAssignment_1_25605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_2_05636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__Val_sAssignment_2_25667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_3_05698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Assignment__Val_iAssignment_3_25729 = new BitSet(new long[]{0x0000000000000002L});

}