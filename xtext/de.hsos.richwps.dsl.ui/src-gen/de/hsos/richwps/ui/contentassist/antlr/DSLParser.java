/*
* generated by Xtext
*/
package de.hsos.richwps.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.hsos.richwps.services.DSLGrammarAccess;

public class DSLParser extends AbstractContentAssistParser {
	
	@Inject
	private DSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.hsos.richwps.ui.contentassist.antlr.internal.InternalDSLParser createParser() {
		de.hsos.richwps.ui.contentassist.antlr.internal.InternalDSLParser result = new de.hsos.richwps.ui.contentassist.antlr.internal.InternalDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getExecInputAccess().getAlternatives(), "rule__ExecInput__Alternatives");
					put(grammarAccess.getExecOutputAccess().getAlternatives(), "rule__ExecOutput__Alternatives");
					put(grammarAccess.getAssignmentAccess().getAlternatives(), "rule__Assignment__Alternatives");
					put(grammarAccess.getLocalBindingAccess().getGroup(), "rule__LocalBinding__Group__0");
					put(grammarAccess.getRemoteBindingAccess().getGroup(), "rule__RemoteBinding__Group__0");
					put(grammarAccess.getExecuteStatementAccess().getGroup(), "rule__ExecuteStatement__Group__0");
					put(grammarAccess.getExecInputAccess().getGroup_0(), "rule__ExecInput__Group_0__0");
					put(grammarAccess.getExecInputAccess().getGroup_1(), "rule__ExecInput__Group_1__0");
					put(grammarAccess.getExecOutputAccess().getGroup_0(), "rule__ExecOutput__Group_0__0");
					put(grammarAccess.getExecOutputAccess().getGroup_1(), "rule__ExecOutput__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup_0(), "rule__Assignment__Group_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup_2(), "rule__Assignment__Group_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup_3(), "rule__Assignment__Group_3__0");
					put(grammarAccess.getIN_REFERENCEAccess().getGroup(), "rule__IN_REFERENCE__Group__0");
					put(grammarAccess.getOUT_REFERENCEAccess().getGroup(), "rule__OUT_REFERENCE__Group__0");
					put(grammarAccess.getVAR_REFERENCEAccess().getGroup(), "rule__VAR_REFERENCE__Group__0");
					put(grammarAccess.getQUALIFIEDNAMEAccess().getGroup(), "rule__QUALIFIEDNAME__Group__0");
					put(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1(), "rule__QUALIFIEDNAME__Group_1__0");
					put(grammarAccess.getQUALIFIEDIDAccess().getGroup(), "rule__QUALIFIEDID__Group__0");
					put(grammarAccess.getQUALIFIEDIDAccess().getGroup_1(), "rule__QUALIFIEDID__Group_1__0");
					put(grammarAccess.getURIAccess().getGroup(), "rule__URI__Group__0");
					put(grammarAccess.getWorksequenceAccess().getOperationsAssignment(), "rule__Worksequence__OperationsAssignment");
					put(grammarAccess.getLocalBindingAccess().getProcessidAssignment_2(), "rule__LocalBinding__ProcessidAssignment_2");
					put(grammarAccess.getLocalBindingAccess().getHandleAssignment_4(), "rule__LocalBinding__HandleAssignment_4");
					put(grammarAccess.getRemoteBindingAccess().getProtocolAssignment_2(), "rule__RemoteBinding__ProtocolAssignment_2");
					put(grammarAccess.getRemoteBindingAccess().getHostAssignment_3(), "rule__RemoteBinding__HostAssignment_3");
					put(grammarAccess.getRemoteBindingAccess().getPortAssignment_4(), "rule__RemoteBinding__PortAssignment_4");
					put(grammarAccess.getRemoteBindingAccess().getPathAssignment_5(), "rule__RemoteBinding__PathAssignment_5");
					put(grammarAccess.getRemoteBindingAccess().getProcessidAssignment_6(), "rule__RemoteBinding__ProcessidAssignment_6");
					put(grammarAccess.getRemoteBindingAccess().getHandleAssignment_8(), "rule__RemoteBinding__HandleAssignment_8");
					put(grammarAccess.getExecuteStatementAccess().getHandleAssignment_1(), "rule__ExecuteStatement__HandleAssignment_1");
					put(grammarAccess.getExecuteStatementAccess().getExecinputsAssignment_3(), "rule__ExecuteStatement__ExecinputsAssignment_3");
					put(grammarAccess.getExecuteStatementAccess().getExecoutputsAssignment_5(), "rule__ExecuteStatement__ExecoutputsAssignment_5");
					put(grammarAccess.getExecInputAccess().getReferenceAssignment_0_0(), "rule__ExecInput__ReferenceAssignment_0_0");
					put(grammarAccess.getExecInputAccess().getWpsidAssignment_0_2(), "rule__ExecInput__WpsidAssignment_0_2");
					put(grammarAccess.getExecInputAccess().getReferenceAssignment_1_0(), "rule__ExecInput__ReferenceAssignment_1_0");
					put(grammarAccess.getExecInputAccess().getWpsidAssignment_1_2(), "rule__ExecInput__WpsidAssignment_1_2");
					put(grammarAccess.getExecOutputAccess().getWpsidAssignment_0_0(), "rule__ExecOutput__WpsidAssignment_0_0");
					put(grammarAccess.getExecOutputAccess().getReferenceAssignment_0_2(), "rule__ExecOutput__ReferenceAssignment_0_2");
					put(grammarAccess.getExecOutputAccess().getWpsidAssignment_1_0(), "rule__ExecOutput__WpsidAssignment_1_0");
					put(grammarAccess.getExecOutputAccess().getReferenceAssignment_1_2(), "rule__ExecOutput__ReferenceAssignment_1_2");
					put(grammarAccess.getAssignmentAccess().getLefthandAssignment_0_0(), "rule__Assignment__LefthandAssignment_0_0");
					put(grammarAccess.getAssignmentAccess().getRighthandAssignment_0_2(), "rule__Assignment__RighthandAssignment_0_2");
					put(grammarAccess.getAssignmentAccess().getLefthandAssignment_1_0(), "rule__Assignment__LefthandAssignment_1_0");
					put(grammarAccess.getAssignmentAccess().getRighthandAssignment_1_2(), "rule__Assignment__RighthandAssignment_1_2");
					put(grammarAccess.getAssignmentAccess().getLefthandAssignment_2_0(), "rule__Assignment__LefthandAssignment_2_0");
					put(grammarAccess.getAssignmentAccess().getVal_sAssignment_2_2(), "rule__Assignment__Val_sAssignment_2_2");
					put(grammarAccess.getAssignmentAccess().getLefthandAssignment_3_0(), "rule__Assignment__LefthandAssignment_3_0");
					put(grammarAccess.getAssignmentAccess().getVal_iAssignment_3_2(), "rule__Assignment__Val_iAssignment_3_2");
					put(grammarAccess.getIN_REFERENCEAccess().getRefnameAssignment_1(), "rule__IN_REFERENCE__RefnameAssignment_1");
					put(grammarAccess.getOUT_REFERENCEAccess().getRefnameAssignment_1(), "rule__OUT_REFERENCE__RefnameAssignment_1");
					put(grammarAccess.getVAR_REFERENCEAccess().getRefnameAssignment_1(), "rule__VAR_REFERENCE__RefnameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.hsos.richwps.ui.contentassist.antlr.internal.InternalDSLParser typedParser = (de.hsos.richwps.ui.contentassist.antlr.internal.InternalDSLParser) parser;
			typedParser.entryRuleWorksequence();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
