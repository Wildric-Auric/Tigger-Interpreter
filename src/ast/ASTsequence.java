package ast;

public class ASTsequence extends ASTexpression {

  private final ASTexpression expr;
  
  public ASTsequence (ASTexpression expr) {
    this.expr = expr;
  }

  public ASTexpression getValue() {
    return expr;
  }

  public String toString() {
    return expr.toString() + ";";
  }

  public Object eval() {
    return expr.eval();
  }
}
