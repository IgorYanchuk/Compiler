package grammar;// Generated from C:/Users/37544/Documents/����/Compiler/grammar\YanchukSetElementsGr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YanchukSetElementsGrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YanchukSetElementsGrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpression(YanchukSetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(YanchukSetElementsGrParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(YanchukSetElementsGrParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(YanchukSetElementsGrParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationElement(YanchukSetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(YanchukSetElementsGrParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSet(YanchukSetElementsGrParser.PrintSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(YanchukSetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(YanchukSetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(YanchukSetElementsGrParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFunction(YanchukSetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(YanchukSetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(YanchukSetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(YanchukSetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(YanchukSetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCompare(YanchukSetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(YanchukSetElementsGrParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCompare(YanchukSetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCompare(YanchukSetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(YanchukSetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(YanchukSetElementsGrParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(YanchukSetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(YanchukSetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(YanchukSetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOfExpression(YanchukSetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YanchukSetElementsGrParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YanchukSetElementsGrParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(YanchukSetElementsGrParser.ContentContext ctx);
}