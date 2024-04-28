package ast;

import memory.Memory;

public class ASTsequence extends ASTexpression {

  private final ASTexpression[] exprs;
  
  public ASTsequence (ASTexpression[] exprs) {
    this.exprs = exprs;
  }

  public String toString() {
    
    StringBuilder builder = new StringBuilder();
    for (ASTexpression expr : exprs) {
      builder.append(expr.toString());
      builder.append(";");
    }
    return builder.toString();
  }

  public Object eval() {

    Object lastVal = null;
    Memory.pushScope();
    for (ASTexpression expr : exprs) {
      lastVal = expr.eval();
    }
    Memory.popScope();
    return lastVal;
  }
}
