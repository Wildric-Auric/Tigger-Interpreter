package ast;

import java.math.BigInteger;

import frontend.ExpressionException;

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
    // NEW : Process the operation, by evaluating both operand
    Object op1 = leftOperand.eval();
    Object op2 = rightOperand.eval();
    if (op1 instanceof BigInteger && op2 instanceof BigInteger) {
      BigInteger b1 = (BigInteger) op1;
      BigInteger b2 = (BigInteger) op2;
      switch (operator) {
      case "+" : return b1.add(b2);
      case "-" : return b1.subtract(b2);
      case "*" : return b1.multiply(b2);
      case "/" : return b1.divide(b2);
      case "%" : return b1.mod(b2);
      case "==" : return Boolean.valueOf(b1.compareTo(b2) == 0);
      case "!=" : return Boolean.valueOf(b1.compareTo(b2) != 0);
      case ">" : return Boolean.valueOf(b1.compareTo(b2) == 1);
      case ">=" : return Boolean.valueOf(b1.compareTo(b2) == 1 || b1.compareTo(b2) == 0);
      case "<" : return Boolean.valueOf(b1.compareTo(b2) == -1);
      case "<=" : return Boolean.valueOf(b1.compareTo(b2) == -1 || b1.compareTo(b2) == 0);
      };
    }
    else if (op1 instanceof Boolean && op2 instanceof Boolean) {
      Boolean b1 = (Boolean) op1;
      Boolean b2 = (Boolean) op2;
      switch (operator) {
        case "+": return Boolean.valueOf(b1 || b2);
        case "*": return Boolean.valueOf(b1 && b2);
        case "==" : return Boolean.valueOf(b1 == b2);
        case "!=" : return Boolean.valueOf(b1 != b2);
      }
    }
    else if ((op1 instanceof Boolean && op2 instanceof BigInteger) ||
      (op1 instanceof BigInteger && op2 instanceof Boolean)) {
        Boolean opBool;
        BigInteger opInt;
        if (op1 instanceof Boolean) {
          opBool = (Boolean) op1;
          opInt = (BigInteger) op2;
        }
        else {
          opBool = (Boolean) op2;
          opInt = (BigInteger) op1;
        }
        switch (operator) {
          case "*": return opBool ? opInt : BigInteger.ZERO;
        }
      }
    throw new ExpressionException(String.format("Illegal binary operation : '%s' between %s and %s",
      operator, op1.getClass(), op2.getClass()));
  }
}
