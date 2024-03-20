package frontend;
import ast.*;
import grammar.*;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Cette classe décrit à ANTRL comment construire un AST.
 * C'est un Listener : à chaque pas de l'analyse syntaxique, ANTRL
 * appelle cette classe, qui crée un ASTNode correspondant à ce qui
 * a été reconnu.
 * Un Listener ne peut pas renvoyer de valeur, nous utilisons donc des
 * champs du contexte ctx pour transferer l'information d'une règle
 * de grammaire à l'autre.
 *
 */
public class TigListener implements TiggrammarListener {

	/*
	 * La classe est paramétrée par une fabrique qui indique comment
	 * créer les instances concrètes d'AST.
	 */
	protected ASTfactory factory;

	public TigListener(ASTfactory factory) {
		super();
		this.factory = factory;
	}


	/*
	 * ANTLRGrammarBaseListener, automatiquement généré, fournit
	 * un squelette d'objet "Listener".
	 * Il suffit de redéinir les méthodes qui nous intéressent : celles de la
	 * forme "exit<règle>".
	 */

	@Override
	public void exitProg(TiggrammarParser.ProgContext ctx) {
		ctx.node = factory.newProgram(ctx.body.node);
	}

	@Override
	public void	exitConstInteger(
			TiggrammarParser.ConstIntegerContext ctx) {
		ctx.node = factory.newIntegerConstant(ctx.intConst.getText());
	}

	@Override
	public void exitUnary(TiggrammarParser.UnaryContext ctx) {
		ctx.node = factory.newUnaryOperation(ctx.op.getText(), ctx.arg.node);
	}

	@Override
	public void exitBinary(TiggrammarParser.BinaryContext ctx) {
		ctx.node = factory.newBinaryOperation(ctx.op.getText(), ctx.arg1.node, ctx.arg2.node);
	}

	@Override
	public void exitGroupedExpr(TiggrammarParser.GroupedExprContext ctx) {
		ctx.node = factory.newGroupedExpression(ctx.arg.node);
	}

	@Override
	public void exitConstBool(TiggrammarParser.ConstBoolContext ctx) {
		ctx.node = factory.newBoolConstant(ctx.boolConst.getText());
	}

	@Override
	public void exitPrint(TiggrammarParser.PrintContext ctx) {
		ctx.node = factory.newPrint(ctx.arg.node);
	}

	@Override
	public void exitSequence(TiggrammarParser.SequenceContext ctx) {
		ctx.node = factory.newSequence(ctx.arg.node);
	}

	@Override
	public void exitCondition(TiggrammarParser.ConditionContext ctx) {
		ctx.node = factory.newCondition(ctx.cond.node, ctx.argT.node, ctx.argF.node);
	}

	@Override	public void enterEveryRule(ParserRuleContext arg0) {}
	@Override	public void exitEveryRule(ParserRuleContext arg0) {}
	@Override	public void visitErrorNode(ErrorNode arg0) {}
	@Override	public void visitTerminal(TerminalNode arg0) {}
	@Override	public void enterProg(TiggrammarParser.ProgContext ctx) {}
	@Override	public void enterConstInteger(TiggrammarParser.ConstIntegerContext ctx) {}
	@Override	public void enterBinary(TiggrammarParser.BinaryContext ctx) {}
	@Override	public void enterUnary(TiggrammarParser.UnaryContext ctx) {}
	// New
	@Override	public void enterGroupedExpr(TiggrammarParser.GroupedExprContext ctx) {}
	@Override	public void enterConstBool(TiggrammarParser.ConstBoolContext ctx) {}
	@Override	public void enterPrint(TiggrammarParser.PrintContext ctx) {}
	@Override	public void enterSequence(TiggrammarParser.SequenceContext ctx) {}
	@Override	public void enterCondition(TiggrammarParser.ConditionContext ctx) {}
}
