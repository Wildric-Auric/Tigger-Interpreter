// Generated from src/grammar/Tiggrammar.g4 by ANTLR 4.13.1

    package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TiggrammarParser}.
 */
public interface TiggrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TiggrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TiggrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiggrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TiggrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TiggrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TiggrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TiggrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TiggrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(TiggrammarParser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(TiggrammarParser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstBool}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstBool(TiggrammarParser.ConstBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstBool}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstBool(TiggrammarParser.ConstBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(TiggrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(TiggrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(TiggrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(TiggrammarParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(TiggrammarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(TiggrammarParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstStr(TiggrammarParser.ConstStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstStr(TiggrammarParser.ConstStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(TiggrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(TiggrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(TiggrammarParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link TiggrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(TiggrammarParser.GroupedExprContext ctx);
}