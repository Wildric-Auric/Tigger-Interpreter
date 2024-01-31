package ast;

import java.math.BigInteger;

public class ASTbinaryOperation extends ASTexpression {

  public ASTbinaryOperation (String operator,
                             ASTexpression leftOperand,
                             ASTexpression rightOperand ) {
    this.operator = operator;
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }

  private final String operator;
  private final ASTexpression leftOperand;
  private final ASTexpression rightOperand;

	public String getOperator() {
    return operator;
  }

	public ASTexpression getLeftOperand() {
    return leftOperand;
  }

	public ASTexpression getRightOperand() {
    return rightOperand;
  }

  public String toString(){
    // fixme: fill here
    return null;
  }

  public Object eval(){
    // fixme: fill here
    return null;
  }
}
