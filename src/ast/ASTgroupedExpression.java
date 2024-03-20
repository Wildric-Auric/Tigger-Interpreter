package ast;

public class ASTgroupedExpression extends ASTexpression {

    private final ASTexpression expr;
  
    public ASTgroupedExpression (ASTexpression expr) {
      this.expr = expr;
    }
  
    public ASTexpression getValue() {
      return expr;
    }
  
    public String toString() {
      return "(" + expr.toString() + ")";
    }
  
    public Object eval() {
      return expr.eval();
    }
  
}
