package ast;
public class ASTprogram {
  public ASTprogram(ASTexpression expression) {
    this.body = expression;
  }

  protected ASTexpression body;

	public ASTexpression getBody() {
    return this.body;
  }

  public String toString() {
    return this.body.toString();
  }

  public Object eval() {
    return this.body.eval();
  }
}
