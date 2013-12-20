/*
* generated by Xtext
*/
package de.hsos.richwps.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class WDGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class WorksequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Worksequence");
		private final Assignment cOperationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperationsOperationParserRuleCall_0 = (RuleCall)cOperationsAssignment.eContents().get(0);
		
		////	(
		////	(bindings+=(LocalBinding | RemoteBinding)*)+ //1..n
		////	| (assignments+=Assignment)* //0..n
		////	| (executes+=ExecuteStatement)* //1.n
		////	)*
		//Worksequence:
		//	operations+=Operation*;
		public ParserRule getRule() { return rule; }

		//operations+=Operation*
		public Assignment getOperationsAssignment() { return cOperationsAssignment; }

		//Operation
		public RuleCall getOperationsOperationParserRuleCall_0() { return cOperationsOperationParserRuleCall_0; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLocalBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRemoteBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAssignmentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cExecuteStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Operation:
		//	LocalBinding | RemoteBinding | Assignment | ExecuteStatement;
		public ParserRule getRule() { return rule; }

		//LocalBinding | RemoteBinding | Assignment | ExecuteStatement
		public Alternatives getAlternatives() { return cAlternatives; }

		//LocalBinding
		public RuleCall getLocalBindingParserRuleCall_0() { return cLocalBindingParserRuleCall_0; }

		//RemoteBinding
		public RuleCall getRemoteBindingParserRuleCall_1() { return cRemoteBindingParserRuleCall_1; }

		//Assignment
		public RuleCall getAssignmentParserRuleCall_2() { return cAssignmentParserRuleCall_2; }

		//ExecuteStatement
		public RuleCall getExecuteStatementParserRuleCall_3() { return cExecuteStatementParserRuleCall_3; }
	}

	public class LocalBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LocalBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cProcessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProcessidAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProcessidQUALIFIEDNAMEParserRuleCall_2_0 = (RuleCall)cProcessidAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cHandleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHandleQUALIFIEDIDParserRuleCall_4_0 = (RuleCall)cHandleAssignment_4.eContents().get(0);
		
		//// e.g. bind process de.hsos.processname to hsos/proc1
		//LocalBinding:
		//	"bind" "process" processid=QUALIFIEDNAME "to" handle=QUALIFIEDID;
		public ParserRule getRule() { return rule; }

		//"bind" "process" processid=QUALIFIEDNAME "to" handle=QUALIFIEDID
		public Group getGroup() { return cGroup; }

		//"bind"
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }

		//"process"
		public Keyword getProcessKeyword_1() { return cProcessKeyword_1; }

		//processid=QUALIFIEDNAME
		public Assignment getProcessidAssignment_2() { return cProcessidAssignment_2; }

		//QUALIFIEDNAME
		public RuleCall getProcessidQUALIFIEDNAMEParserRuleCall_2_0() { return cProcessidQUALIFIEDNAMEParserRuleCall_2_0; }

		//"to"
		public Keyword getToKeyword_3() { return cToKeyword_3; }

		//handle=QUALIFIEDID
		public Assignment getHandleAssignment_4() { return cHandleAssignment_4; }

		//QUALIFIEDID
		public RuleCall getHandleQUALIFIEDIDParserRuleCall_4_0() { return cHandleQUALIFIEDIDParserRuleCall_4_0; }
	}

	public class RemoteBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RemoteBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cProcessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProtocolAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProtocolPROTOCOLTerminalRuleCall_2_0 = (RuleCall)cProtocolAssignment_2.eContents().get(0);
		private final Assignment cHostAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHostQUALIFIEDNAMEParserRuleCall_3_0 = (RuleCall)cHostAssignment_3.eContents().get(0);
		private final Assignment cPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPortINTTerminalRuleCall_4_0 = (RuleCall)cPortAssignment_4.eContents().get(0);
		private final Assignment cPathAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPathURIParserRuleCall_5_0 = (RuleCall)cPathAssignment_5.eContents().get(0);
		private final Assignment cProcessidAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cProcessidQUALIFIEDNAMEParserRuleCall_6_0 = (RuleCall)cProcessidAssignment_6.eContents().get(0);
		private final Keyword cToKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cHandleAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cHandleQUALIFIEDIDParserRuleCall_8_0 = (RuleCall)cHandleAssignment_8.eContents().get(0);
		
		//// e.g. bind process http test.de 80 /wps/WebProcessingService de.hsos.testprocess to hsos/proc2
		//RemoteBinding:
		//	"bind" "process" protocol=PROTOCOL host=QUALIFIEDNAME port=INT path=URI processid=QUALIFIEDNAME "to"
		//	handle=QUALIFIEDID;
		public ParserRule getRule() { return rule; }

		//"bind" "process" protocol=PROTOCOL host=QUALIFIEDNAME port=INT path=URI processid=QUALIFIEDNAME "to" handle=QUALIFIEDID
		public Group getGroup() { return cGroup; }

		//"bind"
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }

		//"process"
		public Keyword getProcessKeyword_1() { return cProcessKeyword_1; }

		//protocol=PROTOCOL
		public Assignment getProtocolAssignment_2() { return cProtocolAssignment_2; }

		//PROTOCOL
		public RuleCall getProtocolPROTOCOLTerminalRuleCall_2_0() { return cProtocolPROTOCOLTerminalRuleCall_2_0; }

		//host=QUALIFIEDNAME
		public Assignment getHostAssignment_3() { return cHostAssignment_3; }

		//QUALIFIEDNAME
		public RuleCall getHostQUALIFIEDNAMEParserRuleCall_3_0() { return cHostQUALIFIEDNAMEParserRuleCall_3_0; }

		//port=INT
		public Assignment getPortAssignment_4() { return cPortAssignment_4; }

		//INT
		public RuleCall getPortINTTerminalRuleCall_4_0() { return cPortINTTerminalRuleCall_4_0; }

		//path=URI
		public Assignment getPathAssignment_5() { return cPathAssignment_5; }

		//URI
		public RuleCall getPathURIParserRuleCall_5_0() { return cPathURIParserRuleCall_5_0; }

		//processid=QUALIFIEDNAME
		public Assignment getProcessidAssignment_6() { return cProcessidAssignment_6; }

		//QUALIFIEDNAME
		public RuleCall getProcessidQUALIFIEDNAMEParserRuleCall_6_0() { return cProcessidQUALIFIEDNAMEParserRuleCall_6_0; }

		//"to"
		public Keyword getToKeyword_7() { return cToKeyword_7; }

		//handle=QUALIFIEDID
		public Assignment getHandleAssignment_8() { return cHandleAssignment_8; }

		//QUALIFIEDID
		public RuleCall getHandleQUALIFIEDIDParserRuleCall_8_0() { return cHandleQUALIFIEDIDParserRuleCall_8_0; }
	}

	public class ExecuteStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExecuteStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExecuteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cHandleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cHandleQUALIFIEDIDParserRuleCall_1_0 = (RuleCall)cHandleAssignment_1.eContents().get(0);
		private final Keyword cWithKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExecinputsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExecinputsExecInputParserRuleCall_3_0 = (RuleCall)cExecinputsAssignment_3.eContents().get(0);
		private final Keyword cStoreKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExecoutputsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExecoutputsExecOutputParserRuleCall_5_0 = (RuleCall)cExecoutputsAssignment_5.eContents().get(0);
		
		//ExecuteStatement:
		//	"execute" handle=QUALIFIEDID "with" execinputs+=ExecInput* "store" execoutputs+=ExecOutput*;
		public ParserRule getRule() { return rule; }

		//"execute" handle=QUALIFIEDID "with" execinputs+=ExecInput* "store" execoutputs+=ExecOutput*
		public Group getGroup() { return cGroup; }

		//"execute"
		public Keyword getExecuteKeyword_0() { return cExecuteKeyword_0; }

		//handle=QUALIFIEDID
		public Assignment getHandleAssignment_1() { return cHandleAssignment_1; }

		//QUALIFIEDID
		public RuleCall getHandleQUALIFIEDIDParserRuleCall_1_0() { return cHandleQUALIFIEDIDParserRuleCall_1_0; }

		//"with"
		public Keyword getWithKeyword_2() { return cWithKeyword_2; }

		//execinputs+=ExecInput*
		public Assignment getExecinputsAssignment_3() { return cExecinputsAssignment_3; }

		//ExecInput
		public RuleCall getExecinputsExecInputParserRuleCall_3_0() { return cExecinputsExecInputParserRuleCall_3_0; }

		//"store"
		public Keyword getStoreKeyword_4() { return cStoreKeyword_4; }

		//execoutputs+=ExecOutput*
		public Assignment getExecoutputsAssignment_5() { return cExecoutputsAssignment_5; }

		//ExecOutput
		public RuleCall getExecoutputsExecOutputParserRuleCall_5_0() { return cExecoutputsExecOutputParserRuleCall_5_0; }
	}

	public class ExecInputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExecInput");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cReferenceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cReferenceIN_REFERENCEParserRuleCall_0_0_0 = (RuleCall)cReferenceAssignment_0_0.eContents().get(0);
		private final Keyword cAsKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cWpsidAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cWpsidIDTerminalRuleCall_0_2_0 = (RuleCall)cWpsidAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cReferenceAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cReferenceVAR_REFERENCEParserRuleCall_1_0_0 = (RuleCall)cReferenceAssignment_1_0.eContents().get(0);
		private final Keyword cAsKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cWpsidAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cWpsidIDTerminalRuleCall_1_2_0 = (RuleCall)cWpsidAssignment_1_2.eContents().get(0);
		
		//ExecInput:
		//	reference=IN_REFERENCE "as" wpsid=ID | reference=VAR_REFERENCE "as" wpsid=ID;
		public ParserRule getRule() { return rule; }

		//reference=IN_REFERENCE "as" wpsid=ID | reference=VAR_REFERENCE "as" wpsid=ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//reference=IN_REFERENCE "as" wpsid=ID
		public Group getGroup_0() { return cGroup_0; }

		//reference=IN_REFERENCE
		public Assignment getReferenceAssignment_0_0() { return cReferenceAssignment_0_0; }

		//IN_REFERENCE
		public RuleCall getReferenceIN_REFERENCEParserRuleCall_0_0_0() { return cReferenceIN_REFERENCEParserRuleCall_0_0_0; }

		//"as"
		public Keyword getAsKeyword_0_1() { return cAsKeyword_0_1; }

		//wpsid=ID
		public Assignment getWpsidAssignment_0_2() { return cWpsidAssignment_0_2; }

		//ID
		public RuleCall getWpsidIDTerminalRuleCall_0_2_0() { return cWpsidIDTerminalRuleCall_0_2_0; }

		//reference=VAR_REFERENCE "as" wpsid=ID
		public Group getGroup_1() { return cGroup_1; }

		//reference=VAR_REFERENCE
		public Assignment getReferenceAssignment_1_0() { return cReferenceAssignment_1_0; }

		//VAR_REFERENCE
		public RuleCall getReferenceVAR_REFERENCEParserRuleCall_1_0_0() { return cReferenceVAR_REFERENCEParserRuleCall_1_0_0; }

		//"as"
		public Keyword getAsKeyword_1_1() { return cAsKeyword_1_1; }

		//wpsid=ID
		public Assignment getWpsidAssignment_1_2() { return cWpsidAssignment_1_2; }

		//ID
		public RuleCall getWpsidIDTerminalRuleCall_1_2_0() { return cWpsidIDTerminalRuleCall_1_2_0; }
	}

	public class ExecOutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExecOutput");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cWpsidAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cWpsidIDTerminalRuleCall_0_0_0 = (RuleCall)cWpsidAssignment_0_0.eContents().get(0);
		private final Keyword cAsKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cReferenceAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cReferenceOUT_REFERENCEParserRuleCall_0_2_0 = (RuleCall)cReferenceAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cWpsideAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cWpsideIDTerminalRuleCall_1_0_0 = (RuleCall)cWpsideAssignment_1_0.eContents().get(0);
		private final Keyword cAsKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cReferenceAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cReferenceVAR_REFERENCEParserRuleCall_1_2_0 = (RuleCall)cReferenceAssignment_1_2.eContents().get(0);
		
		//ExecOutput:
		//	wpsid=ID "as" reference=OUT_REFERENCE | wpside=ID "as" reference=VAR_REFERENCE;
		public ParserRule getRule() { return rule; }

		//wpsid=ID "as" reference=OUT_REFERENCE | wpside=ID "as" reference=VAR_REFERENCE
		public Alternatives getAlternatives() { return cAlternatives; }

		//wpsid=ID "as" reference=OUT_REFERENCE
		public Group getGroup_0() { return cGroup_0; }

		//wpsid=ID
		public Assignment getWpsidAssignment_0_0() { return cWpsidAssignment_0_0; }

		//ID
		public RuleCall getWpsidIDTerminalRuleCall_0_0_0() { return cWpsidIDTerminalRuleCall_0_0_0; }

		//"as"
		public Keyword getAsKeyword_0_1() { return cAsKeyword_0_1; }

		//reference=OUT_REFERENCE
		public Assignment getReferenceAssignment_0_2() { return cReferenceAssignment_0_2; }

		//OUT_REFERENCE
		public RuleCall getReferenceOUT_REFERENCEParserRuleCall_0_2_0() { return cReferenceOUT_REFERENCEParserRuleCall_0_2_0; }

		//wpside=ID "as" reference=VAR_REFERENCE
		public Group getGroup_1() { return cGroup_1; }

		//wpside=ID
		public Assignment getWpsideAssignment_1_0() { return cWpsideAssignment_1_0; }

		//ID
		public RuleCall getWpsideIDTerminalRuleCall_1_0_0() { return cWpsideIDTerminalRuleCall_1_0_0; }

		//"as"
		public Keyword getAsKeyword_1_1() { return cAsKeyword_1_1; }

		//reference=VAR_REFERENCE
		public Assignment getReferenceAssignment_1_2() { return cReferenceAssignment_1_2; }

		//VAR_REFERENCE
		public RuleCall getReferenceVAR_REFERENCEParserRuleCall_1_2_0() { return cReferenceVAR_REFERENCEParserRuleCall_1_2_0; }
	}

	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Assignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cLefthandAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cLefthandOUT_REFERENCEParserRuleCall_0_0_0 = (RuleCall)cLefthandAssignment_0_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cRighthandAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cRighthandIN_REFERENCEParserRuleCall_0_2_0 = (RuleCall)cRighthandAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cLefthandAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cLefthandOUT_REFERENCEParserRuleCall_1_0_0 = (RuleCall)cLefthandAssignment_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRighthandAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRighthandVAR_REFERENCEParserRuleCall_1_2_0 = (RuleCall)cRighthandAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cLefthandAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cLefthandVAR_REFERENCEParserRuleCall_2_0_0 = (RuleCall)cLefthandAssignment_2_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cVal_sAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cVal_sSTRINGTerminalRuleCall_2_2_0 = (RuleCall)cVal_sAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cLefthandAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cLefthandVAR_REFERENCEParserRuleCall_3_0_0 = (RuleCall)cLefthandAssignment_3_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cVal_iAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cVal_iINTTerminalRuleCall_3_2_0 = (RuleCall)cVal_iAssignment_3_2.eContents().get(0);
		
		//Assignment:
		//	lefthand=OUT_REFERENCE "=" righthand=IN_REFERENCE //literaldata
		//	| lefthand=OUT_REFERENCE "=" righthand=VAR_REFERENCE | lefthand=VAR_REFERENCE "=" val_s=STRING | lefthand=VAR_REFERENCE
		//	"=" val_i=INT;
		public ParserRule getRule() { return rule; }

		//lefthand=OUT_REFERENCE "=" righthand=IN_REFERENCE //literaldata
		//| lefthand=OUT_REFERENCE "=" righthand=VAR_REFERENCE | lefthand=VAR_REFERENCE "=" val_s=STRING | lefthand=VAR_REFERENCE
		//"=" val_i=INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//lefthand=OUT_REFERENCE "=" righthand=IN_REFERENCE
		public Group getGroup_0() { return cGroup_0; }

		//lefthand=OUT_REFERENCE
		public Assignment getLefthandAssignment_0_0() { return cLefthandAssignment_0_0; }

		//OUT_REFERENCE
		public RuleCall getLefthandOUT_REFERENCEParserRuleCall_0_0_0() { return cLefthandOUT_REFERENCEParserRuleCall_0_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_1() { return cEqualsSignKeyword_0_1; }

		//righthand=IN_REFERENCE
		public Assignment getRighthandAssignment_0_2() { return cRighthandAssignment_0_2; }

		//IN_REFERENCE
		public RuleCall getRighthandIN_REFERENCEParserRuleCall_0_2_0() { return cRighthandIN_REFERENCEParserRuleCall_0_2_0; }

		//lefthand=OUT_REFERENCE "=" righthand=VAR_REFERENCE
		public Group getGroup_1() { return cGroup_1; }

		//lefthand=OUT_REFERENCE
		public Assignment getLefthandAssignment_1_0() { return cLefthandAssignment_1_0; }

		//OUT_REFERENCE
		public RuleCall getLefthandOUT_REFERENCEParserRuleCall_1_0_0() { return cLefthandOUT_REFERENCEParserRuleCall_1_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }

		//righthand=VAR_REFERENCE
		public Assignment getRighthandAssignment_1_2() { return cRighthandAssignment_1_2; }

		//VAR_REFERENCE
		public RuleCall getRighthandVAR_REFERENCEParserRuleCall_1_2_0() { return cRighthandVAR_REFERENCEParserRuleCall_1_2_0; }

		//lefthand=VAR_REFERENCE "=" val_s=STRING
		public Group getGroup_2() { return cGroup_2; }

		//lefthand=VAR_REFERENCE
		public Assignment getLefthandAssignment_2_0() { return cLefthandAssignment_2_0; }

		//VAR_REFERENCE
		public RuleCall getLefthandVAR_REFERENCEParserRuleCall_2_0_0() { return cLefthandVAR_REFERENCEParserRuleCall_2_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_2_1() { return cEqualsSignKeyword_2_1; }

		//val_s=STRING
		public Assignment getVal_sAssignment_2_2() { return cVal_sAssignment_2_2; }

		//STRING
		public RuleCall getVal_sSTRINGTerminalRuleCall_2_2_0() { return cVal_sSTRINGTerminalRuleCall_2_2_0; }

		//lefthand=VAR_REFERENCE "=" val_i=INT
		public Group getGroup_3() { return cGroup_3; }

		//lefthand=VAR_REFERENCE
		public Assignment getLefthandAssignment_3_0() { return cLefthandAssignment_3_0; }

		//VAR_REFERENCE
		public RuleCall getLefthandVAR_REFERENCEParserRuleCall_3_0_0() { return cLefthandVAR_REFERENCEParserRuleCall_3_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//val_i=INT
		public Assignment getVal_iAssignment_3_2() { return cVal_iAssignment_3_2; }

		//INT
		public RuleCall getVal_iINTTerminalRuleCall_3_2_0() { return cVal_iINTTerminalRuleCall_3_2_0; }
	}

	public class IN_REFERENCEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IN_REFERENCE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//IN_REFERENCE:
		//	"in." ID;
		public ParserRule getRule() { return rule; }

		//"in." ID
		public Group getGroup() { return cGroup; }

		//"in."
		public Keyword getInKeyword_0() { return cInKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class OUT_REFERENCEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OUT_REFERENCE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//OUT_REFERENCE:
		//	"out." ID;
		public ParserRule getRule() { return rule; }

		//"out." ID
		public Group getGroup() { return cGroup; }

		//"out."
		public Keyword getOutKeyword_0() { return cOutKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class VAR_REFERENCEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VAR_REFERENCE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//VAR_REFERENCE:
		//	"var." ID;
		public ParserRule getRule() { return rule; }

		//"var." ID
		public Group getGroup() { return cGroup; }

		//"var."
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class QUALIFIEDNAMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QUALIFIEDNAME");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QUALIFIEDNAME:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QUALIFIEDIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QUALIFIEDID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QUALIFIEDID:
		//	ID ("/" ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("/" ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("/" ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"/"
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class URIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSolidusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//URI:
		//	("/" ID)*;
		public ParserRule getRule() { return rule; }

		//("/" ID)*
		public Group getGroup() { return cGroup; }

		//"/"
		public Keyword getSolidusKeyword_0() { return cSolidusKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private WorksequenceElements pWorksequence;
	private OperationElements pOperation;
	private LocalBindingElements pLocalBinding;
	private RemoteBindingElements pRemoteBinding;
	private ExecuteStatementElements pExecuteStatement;
	private ExecInputElements pExecInput;
	private ExecOutputElements pExecOutput;
	private AssignmentElements pAssignment;
	private IN_REFERENCEElements pIN_REFERENCE;
	private OUT_REFERENCEElements pOUT_REFERENCE;
	private VAR_REFERENCEElements pVAR_REFERENCE;
	private QUALIFIEDNAMEElements pQUALIFIEDNAME;
	private QUALIFIEDIDElements pQUALIFIEDID;
	private URIElements pURI;
	private TerminalRule tPROTOCOL;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public WDGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.hsos.richwps.WD".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////	(
	////	(bindings+=(LocalBinding | RemoteBinding)*)+ //1..n
	////	| (assignments+=Assignment)* //0..n
	////	| (executes+=ExecuteStatement)* //1.n
	////	)*
	//Worksequence:
	//	operations+=Operation*;
	public WorksequenceElements getWorksequenceAccess() {
		return (pWorksequence != null) ? pWorksequence : (pWorksequence = new WorksequenceElements());
	}
	
	public ParserRule getWorksequenceRule() {
		return getWorksequenceAccess().getRule();
	}

	//Operation:
	//	LocalBinding | RemoteBinding | Assignment | ExecuteStatement;
	public OperationElements getOperationAccess() {
		return (pOperation != null) ? pOperation : (pOperation = new OperationElements());
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//// e.g. bind process de.hsos.processname to hsos/proc1
	//LocalBinding:
	//	"bind" "process" processid=QUALIFIEDNAME "to" handle=QUALIFIEDID;
	public LocalBindingElements getLocalBindingAccess() {
		return (pLocalBinding != null) ? pLocalBinding : (pLocalBinding = new LocalBindingElements());
	}
	
	public ParserRule getLocalBindingRule() {
		return getLocalBindingAccess().getRule();
	}

	//// e.g. bind process http test.de 80 /wps/WebProcessingService de.hsos.testprocess to hsos/proc2
	//RemoteBinding:
	//	"bind" "process" protocol=PROTOCOL host=QUALIFIEDNAME port=INT path=URI processid=QUALIFIEDNAME "to"
	//	handle=QUALIFIEDID;
	public RemoteBindingElements getRemoteBindingAccess() {
		return (pRemoteBinding != null) ? pRemoteBinding : (pRemoteBinding = new RemoteBindingElements());
	}
	
	public ParserRule getRemoteBindingRule() {
		return getRemoteBindingAccess().getRule();
	}

	//ExecuteStatement:
	//	"execute" handle=QUALIFIEDID "with" execinputs+=ExecInput* "store" execoutputs+=ExecOutput*;
	public ExecuteStatementElements getExecuteStatementAccess() {
		return (pExecuteStatement != null) ? pExecuteStatement : (pExecuteStatement = new ExecuteStatementElements());
	}
	
	public ParserRule getExecuteStatementRule() {
		return getExecuteStatementAccess().getRule();
	}

	//ExecInput:
	//	reference=IN_REFERENCE "as" wpsid=ID | reference=VAR_REFERENCE "as" wpsid=ID;
	public ExecInputElements getExecInputAccess() {
		return (pExecInput != null) ? pExecInput : (pExecInput = new ExecInputElements());
	}
	
	public ParserRule getExecInputRule() {
		return getExecInputAccess().getRule();
	}

	//ExecOutput:
	//	wpsid=ID "as" reference=OUT_REFERENCE | wpside=ID "as" reference=VAR_REFERENCE;
	public ExecOutputElements getExecOutputAccess() {
		return (pExecOutput != null) ? pExecOutput : (pExecOutput = new ExecOutputElements());
	}
	
	public ParserRule getExecOutputRule() {
		return getExecOutputAccess().getRule();
	}

	//Assignment:
	//	lefthand=OUT_REFERENCE "=" righthand=IN_REFERENCE //literaldata
	//	| lefthand=OUT_REFERENCE "=" righthand=VAR_REFERENCE | lefthand=VAR_REFERENCE "=" val_s=STRING | lefthand=VAR_REFERENCE
	//	"=" val_i=INT;
	public AssignmentElements getAssignmentAccess() {
		return (pAssignment != null) ? pAssignment : (pAssignment = new AssignmentElements());
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}

	//IN_REFERENCE:
	//	"in." ID;
	public IN_REFERENCEElements getIN_REFERENCEAccess() {
		return (pIN_REFERENCE != null) ? pIN_REFERENCE : (pIN_REFERENCE = new IN_REFERENCEElements());
	}
	
	public ParserRule getIN_REFERENCERule() {
		return getIN_REFERENCEAccess().getRule();
	}

	//OUT_REFERENCE:
	//	"out." ID;
	public OUT_REFERENCEElements getOUT_REFERENCEAccess() {
		return (pOUT_REFERENCE != null) ? pOUT_REFERENCE : (pOUT_REFERENCE = new OUT_REFERENCEElements());
	}
	
	public ParserRule getOUT_REFERENCERule() {
		return getOUT_REFERENCEAccess().getRule();
	}

	//VAR_REFERENCE:
	//	"var." ID;
	public VAR_REFERENCEElements getVAR_REFERENCEAccess() {
		return (pVAR_REFERENCE != null) ? pVAR_REFERENCE : (pVAR_REFERENCE = new VAR_REFERENCEElements());
	}
	
	public ParserRule getVAR_REFERENCERule() {
		return getVAR_REFERENCEAccess().getRule();
	}

	//QUALIFIEDNAME:
	//	ID ("." ID)*;
	public QUALIFIEDNAMEElements getQUALIFIEDNAMEAccess() {
		return (pQUALIFIEDNAME != null) ? pQUALIFIEDNAME : (pQUALIFIEDNAME = new QUALIFIEDNAMEElements());
	}
	
	public ParserRule getQUALIFIEDNAMERule() {
		return getQUALIFIEDNAMEAccess().getRule();
	}

	//QUALIFIEDID:
	//	ID ("/" ID)*;
	public QUALIFIEDIDElements getQUALIFIEDIDAccess() {
		return (pQUALIFIEDID != null) ? pQUALIFIEDID : (pQUALIFIEDID = new QUALIFIEDIDElements());
	}
	
	public ParserRule getQUALIFIEDIDRule() {
		return getQUALIFIEDIDAccess().getRule();
	}

	//URI:
	//	("/" ID)*;
	public URIElements getURIAccess() {
		return (pURI != null) ? pURI : (pURI = new URIElements());
	}
	
	public ParserRule getURIRule() {
		return getURIAccess().getRule();
	}

	//terminal PROTOCOL:
	//	"http" | "https";
	public TerminalRule getPROTOCOLRule() {
		return (tPROTOCOL != null) ? tPROTOCOL : (tPROTOCOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PROTOCOL"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
