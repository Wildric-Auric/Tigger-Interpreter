package ast;
import java.math.BigInteger;

import frontend.ExpressionException;

public abstract class ASTexpression{

  public abstract String toString();
  public abstract Object eval();

  public boolean getBoolFromEval() {
    Object condEval = this.eval();
    boolean b = false;
    if (condEval instanceof Boolean) {
        b = (Boolean) condEval;
    }
    else if (condEval instanceof BigInteger) {
        b = ((BigInteger) condEval).intValue() > 0;
    }
    else {
        throw new ExpressionException("Invalid condition '" + condEval + "'");
    }
    return b;
  }
}
