package grammar;// Generated from C:/Users/37544/Documents/����/Compiler/grammar\YanchukSetElementsGr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YanchukSetElementsGrParser}.
 */
public interface YanchukSetElementsGrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetExpression(YanchukSetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetExpression(YanchukSetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YanchukSetElementsGrParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YanchukSetElementsGrParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YanchukSetElementsGrParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YanchukSetElementsGrParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YanchukSetElementsGrParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YanchukSetElementsGrParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationElement(YanchukSetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationElement(YanchukSetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(YanchukSetElementsGrParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(YanchukSetElementsGrParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 */
	void enterPrintSet(YanchukSetElementsGrParser.PrintSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 */
	void exitPrintSet(YanchukSetElementsGrParser.PrintSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(YanchukSetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(YanchukSetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(YanchukSetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(YanchukSetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(YanchukSetElementsGrParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(YanchukSetElementsGrParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignatureFunction(YanchukSetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignatureFunction(YanchukSetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(YanchukSetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(YanchukSetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(YanchukSetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(YanchukSetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(YanchukSetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(YanchukSetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(YanchukSetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(YanchukSetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void enterEqualCompare(YanchukSetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void exitEqualCompare(YanchukSetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(YanchukSetElementsGrParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(YanchukSetElementsGrParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCompare(YanchukSetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCompare(YanchukSetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void enterNegationCompare(YanchukSetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void exitNegationCompare(YanchukSetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(YanchukSetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(YanchukSetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(YanchukSetElementsGrParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(YanchukSetElementsGrParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(YanchukSetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(YanchukSetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(YanchukSetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(YanchukSetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetExpression(YanchukSetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetExpression(YanchukSetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexOfExpression(YanchukSetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexOfExpression(YanchukSetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YanchukSetElementsGrParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YanchukSetElementsGrParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YanchukSetElementsGrParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(YanchukSetElementsGrParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YanchukSetElementsGrParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(YanchukSetElementsGrParser.ContentContext ctx);
}