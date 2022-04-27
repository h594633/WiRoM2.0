/*
 * generated by Xtext 2.25.0
 */
package org.gunnarkleiven.robotgenerator.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RobotgeneratorGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.Model");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//Model:
		//    commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommandTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommandTypeCommandTypeParserRuleCall_0_0 = (RuleCall)cCommandTypeAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRobotTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRobotTypeRobotTypeEnumRuleCall_2_0 = (RuleCall)cRobotTypeAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRobotNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRobotNameRobotNameParserRuleCall_4_0 = (RuleCall)cRobotNameAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cXValueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cXValuePositionValueParserRuleCall_6_0 = (RuleCall)cXValueAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cYValueAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cYValuePositionValueParserRuleCall_8_0 = (RuleCall)cYValueAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Command:
		////    {Command} commandType=CommandType '(' (robotType=RobotType(',' parameters+=Parameter)*)? ')' ';'
		//    commandType=CommandType '(' robotType=RobotType ',' robotName=RobotName? ',' xValue=PositionValue? ',' yValue=PositionValue? ')' ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////    {Command} commandType=CommandType '(' (robotType=RobotType(',' parameters+=Parameter)*)? ')' ';'
		//    commandType=CommandType '(' robotType=RobotType ',' robotName=RobotName? ',' xValue=PositionValue? ',' yValue=PositionValue? ')' ';'
		public Group getGroup() { return cGroup; }
		
		////    {Command} commandType=CommandType '(' (robotType=RobotType(',' parameters+=Parameter)*)? ')' ';'
		//    commandType=CommandType
		public Assignment getCommandTypeAssignment_0() { return cCommandTypeAssignment_0; }
		
		//CommandType
		public RuleCall getCommandTypeCommandTypeParserRuleCall_0_0() { return cCommandTypeCommandTypeParserRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//robotType=RobotType
		public Assignment getRobotTypeAssignment_2() { return cRobotTypeAssignment_2; }
		
		//RobotType
		public RuleCall getRobotTypeRobotTypeEnumRuleCall_2_0() { return cRobotTypeRobotTypeEnumRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//robotName=RobotName?
		public Assignment getRobotNameAssignment_4() { return cRobotNameAssignment_4; }
		
		//RobotName
		public RuleCall getRobotNameRobotNameParserRuleCall_4_0() { return cRobotNameRobotNameParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//xValue=PositionValue?
		public Assignment getXValueAssignment_6() { return cXValueAssignment_6; }
		
		//PositionValue
		public RuleCall getXValuePositionValueParserRuleCall_6_0() { return cXValuePositionValueParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//yValue=PositionValue?
		public Assignment getYValueAssignment_8() { return cYValueAssignment_8; }
		
		//PositionValue
		public RuleCall getYValuePositionValueParserRuleCall_8_0() { return cYValuePositionValueParserRuleCall_8_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class RobotNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.RobotName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRobotNameAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//RobotName:
		//    {RobotName} value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{RobotName} value=STRING
		public Group getGroup() { return cGroup; }
		
		//{RobotName}
		public Action getRobotNameAction_0() { return cRobotNameAction_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class PositionValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.PositionValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPositionValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//// TODO bad practice to name it like this?
		//PositionValue:
		//    {PositionValue} value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{PositionValue} value=INT
		public Group getGroup() { return cGroup; }
		
		//{PositionValue}
		public Action getPositionValueAction_0() { return cPositionValueAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class CommandTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.CommandType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cAddRobotAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cValueAddRobotKeyword_0_1_0 = (Keyword)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cRemoveRobotAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cValueRemoveRobotKeyword_1_1_0 = (Keyword)cValueAssignment_1_1.eContents().get(0);
		
		//CommandType:
		//    {AddRobot} value="addRobot" |
		//    {RemoveRobot} value="removeRobot"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{AddRobot} value="addRobot" |
		//{RemoveRobot} value="removeRobot"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{AddRobot} value="addRobot"
		public Group getGroup_0() { return cGroup_0; }
		
		//{AddRobot}
		public Action getAddRobotAction_0_0() { return cAddRobotAction_0_0; }
		
		//value="addRobot"
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//"addRobot"
		public Keyword getValueAddRobotKeyword_0_1_0() { return cValueAddRobotKeyword_0_1_0; }
		
		//{RemoveRobot} value="removeRobot"
		public Group getGroup_1() { return cGroup_1; }
		
		//{RemoveRobot}
		public Action getRemoveRobotAction_1_0() { return cRemoveRobotAction_1_0; }
		
		//value="removeRobot"
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//"removeRobot"
		public Keyword getValueRemoveRobotKeyword_1_1_0() { return cValueRemoveRobotKeyword_1_1_0; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.Parameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Parameter:
		//    STRING | INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class RobotTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.gunnarkleiven.robotgenerator.Robotgenerator.RobotType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMOOSEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMOOSEMooseKeyword_0_0 = (Keyword)cMOOSEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMAVIC2PROEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMAVIC2PROMavic2proKeyword_1_0 = (Keyword)cMAVIC2PROEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOP2EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOP2Op2Keyword_2_0 = (Keyword)cOP2EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBB8EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBB8Bb8Keyword_3_0 = (Keyword)cBB8EnumLiteralDeclaration_3.eContents().get(0);
		
		//enum RobotType:
		//    MOOSE="moose" |
		//    MAVIC2PRO="mavic2pro" |
		//    OP2="op2" |
		//    BB8="bb8"
		//;
		public EnumRule getRule() { return rule; }
		
		//MOOSE="moose" |
		//MAVIC2PRO="mavic2pro" |
		//OP2="op2" |
		//BB8="bb8"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MOOSE="moose"
		public EnumLiteralDeclaration getMOOSEEnumLiteralDeclaration_0() { return cMOOSEEnumLiteralDeclaration_0; }
		
		//"moose"
		public Keyword getMOOSEMooseKeyword_0_0() { return cMOOSEMooseKeyword_0_0; }
		
		//MAVIC2PRO="mavic2pro"
		public EnumLiteralDeclaration getMAVIC2PROEnumLiteralDeclaration_1() { return cMAVIC2PROEnumLiteralDeclaration_1; }
		
		//"mavic2pro"
		public Keyword getMAVIC2PROMavic2proKeyword_1_0() { return cMAVIC2PROMavic2proKeyword_1_0; }
		
		//OP2="op2"
		public EnumLiteralDeclaration getOP2EnumLiteralDeclaration_2() { return cOP2EnumLiteralDeclaration_2; }
		
		//"op2"
		public Keyword getOP2Op2Keyword_2_0() { return cOP2Op2Keyword_2_0; }
		
		//BB8="bb8"
		public EnumLiteralDeclaration getBB8EnumLiteralDeclaration_3() { return cBB8EnumLiteralDeclaration_3; }
		
		//"bb8"
		public Keyword getBB8Bb8Keyword_3_0() { return cBB8Bb8Keyword_3_0; }
	}
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final RobotNameElements pRobotName;
	private final PositionValueElements pPositionValue;
	private final CommandTypeElements pCommandType;
	private final RobotTypeElements eRobotType;
	private final ParameterElements pParameter;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RobotgeneratorGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pRobotName = new RobotNameElements();
		this.pPositionValue = new PositionValueElements();
		this.pCommandType = new CommandTypeElements();
		this.eRobotType = new RobotTypeElements();
		this.pParameter = new ParameterElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.gunnarkleiven.robotgenerator.Robotgenerator".equals(grammar.getName())) {
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
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    commands+=Command*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	////    {Command} commandType=CommandType '(' (robotType=RobotType(',' parameters+=Parameter)*)? ')' ';'
	//    commandType=CommandType '(' robotType=RobotType ',' robotName=RobotName? ',' xValue=PositionValue? ',' yValue=PositionValue? ')' ';'
	//;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//RobotName:
	//    {RobotName} value=STRING
	//;
	public RobotNameElements getRobotNameAccess() {
		return pRobotName;
	}
	
	public ParserRule getRobotNameRule() {
		return getRobotNameAccess().getRule();
	}
	
	//// TODO bad practice to name it like this?
	//PositionValue:
	//    {PositionValue} value=INT
	//;
	public PositionValueElements getPositionValueAccess() {
		return pPositionValue;
	}
	
	public ParserRule getPositionValueRule() {
		return getPositionValueAccess().getRule();
	}
	
	//CommandType:
	//    {AddRobot} value="addRobot" |
	//    {RemoveRobot} value="removeRobot"
	//;
	public CommandTypeElements getCommandTypeAccess() {
		return pCommandType;
	}
	
	public ParserRule getCommandTypeRule() {
		return getCommandTypeAccess().getRule();
	}
	
	//enum RobotType:
	//    MOOSE="moose" |
	//    MAVIC2PRO="mavic2pro" |
	//    OP2="op2" |
	//    BB8="bb8"
	//;
	public RobotTypeElements getRobotTypeAccess() {
		return eRobotType;
	}
	
	public EnumRule getRobotTypeRule() {
		return getRobotTypeAccess().getRule();
	}
	
	//Parameter:
	//    STRING | INT
	//;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
