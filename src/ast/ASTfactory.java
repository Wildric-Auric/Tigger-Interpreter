package ast;

import java.util.List;

import grammar.TiggrammarParser;
import memory.Memory;

public class ASTfactory {

  public ASTprogram newProgram(ASTexpression body) {
    return new ASTprogram(body);
  }

  public ASTunaryOperation newUnaryOperation(String operator,
                                             ASTexpression operand) {
    return new ASTunaryOperation(operator, operand);
  }

	public ASTbinaryOperation newBinaryOperation(String operator,
                                               ASTexpression leftOperand, ASTexpression rightOperand) {
    return new ASTbinaryOperation(operator, leftOperand, rightOperand);
  }

	public ASTinteger newIntegerConstant(String value) {
    return new ASTinteger(value);
  }

  // New

  public ASTgroupedExpression newGroupedExpression(ASTexpression expr, String expType) {
    return new ASTgroupedExpression(expr, expType);
  }

  public ASTbool newBoolConstant(String value) {
    return new ASTbool(value);
  }

  public ASTstr newStrConstant(String value) {
    return new ASTstr(value);
  }
  
   public ASTprint newPrint(ASTexpression expr) {
    return new ASTprint(expr);
  }

  public ASTsequence newSequence(ASTexpression[] exprs) {
    return new ASTsequence(exprs);
  }

  public ASTcondition newCondition(ASTexpression cond, ASTexpression exprT, ASTexpression exprF) {
    return new ASTcondition(cond, exprT, exprF);
  }

  public ASTloop newLoop(ASTexpression cond, ASTexpression task) {
    return new ASTloop(cond, task);
  }
  
  public ASTassign newAssign(String id, ASTexpression expr) {
    return new ASTassign(id, expr);
  }

  public ASTread newRead(String id) {
    return new ASTread(id);
  }

  public ASTfunction newFunction(String id, String[] vars, ASTexpression block) {
    return new ASTfunction(id, vars, block);
  }
  
  public ASTfunctionCall newFunctionCall(String id, ASTexpression[] params) {
    return new ASTfunctionCall(id, params);
  }
  
  public ASTexpression[] toExpressions(List<TiggrammarParser.ExprContext> ctxs) {
    if (ctxs == null) return new ASTexpression[0];
    ASTexpression[] r = new ASTexpression[ctxs.size()];
    int pos = 0;
    for (TiggrammarParser.ExprContext e : ctxs) {
      r[pos++] = e.node;
    }
    return r;
  }
}
