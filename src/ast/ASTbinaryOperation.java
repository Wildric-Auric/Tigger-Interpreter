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

  public String toString() {
    // NEW  : Returns string for display
    return String.format("%s %s %s", leftOperand.toString(), operator, rightOperand.toString());
  }

  public Object eval() {
    // NEW : Process the operation, by evaluating both operand then if they are 
    Object op1 = leftOperand.eval();
    Object op2 = rightOperand.eval();
    if (op1 instanceof BigInteger && op2 instanceof BigInteger){
      BigInteger b1 = (BigInteger) op1;
      BigInteger b2 = (BigInteger) op2;
      switch (operator){
      case "+" : return b1.add(b2);
      case "-" : return b1.subtract(b2);
      case "*" : return b1.multiply(b2);
      case "/" : return b1.divide(b2);
      case "%" : return b1.mod(b2);
      };
    }
    return null;
  }
}
