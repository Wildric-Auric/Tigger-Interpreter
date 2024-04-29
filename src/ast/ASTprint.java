package ast;

public class ASTprint extends ASTexpression {

    private final ASTexpression expr;
  
    public ASTprint (ASTexpression expr) {
      this.expr = expr;
    }
  
    public ASTexpression getValue() {
      return expr;
    }
  
    public String toString(){
      return "$" + expr.toString();
    }
  
    public Object eval() {
      Object eval = expr.eval();
      System.out.println(expr.toString() + " => " + eval);
      return eval;
    }
  
}
