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
}