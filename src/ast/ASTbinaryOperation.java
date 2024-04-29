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
    // Process the operation, by evaluating both operand
    Object op1 = leftOperand.eval();
    Object op2 = rightOperand.eval();
    
    // INTEGERS

    if (op1 instanceof BigInteger && op2 instanceof BigInteger) {
      BigInteger b1 = (BigInteger) op1;
      BigInteger b2 = (BigInteger) op2;
      switch (operator) {
      case "+" : return b1.add(b2);
      case "-" : return b1.subtract(b2);
      case "*" : return b1.multiply(b2);
      case "/" : return b1.divide(b2);
      case "%" : return b1.mod(b2);
      case "**" : return b1.pow(b2.intValue());
      case "==" : return Boolean.valueOf(b1.compareTo(b2) == 0);
      case "!=" : return Boolean.valueOf(b1.compareTo(b2) != 0);
      case ">" : return Boolean.valueOf(b1.compareTo(b2) == 1);
      case ">=" : return Boolean.valueOf(b1.compareTo(b2) == 1 || b1.compareTo(b2) == 0);
      case "<" : return Boolean.valueOf(b1.compareTo(b2) == -1);
      case "<=" : return Boolean.valueOf(b1.compareTo(b2) == -1 || b1.compareTo(b2) == 0);
      };
    }

    // BOOLEANS

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

    // int annulation ; Can be at any side
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
      if (operator.equals("*"))
        return opBool ? opInt : BigInteger.ZERO;
    }

    // string annulation ; Can be at any side
    else if ((op1 instanceof Boolean && op2 instanceof String) ||
    (op1 instanceof String && op2 instanceof Boolean)) {
      Boolean opBool;
      String opStr;
      if (op1 instanceof Boolean) {
        opBool = (Boolean) op1;
        opStr = (String) op2;
      }
      else {
        opBool = (Boolean) op2;
        opStr = (String) op1;
      }
      if (operator.equals("*"))
        return opBool ? opStr : "";
    }

    // STRINGS

    // String duplication, integer can be at any side
    else if ((op1 instanceof String && op2 instanceof BigInteger) ||
      (op2 instanceof String && op1 instanceof BigInteger)) {
      String opStr;
      BigInteger opInt;
      if (op1 instanceof String) {
        opStr = op1.toString();
        opInt = (BigInteger) op2;
      }
      else {
        opStr = op2.toString();
        opInt = (BigInteger) op1;
      }
      switch (operator) {
        case "*":
          String s = ""; 
          for (int i=0; i < opInt.intValue(); i++) {
            s+=opStr;
          }
          return s;
      }
    }
    
    // Other operations with string can be done with anyting, so any String in the binary operation will do
    if (op1 instanceof String || op2 instanceof String) {

      // If the operator is an expression, it evaluates it, otherwise it directly converts it to a string
      String s1 = op1.toString();
      String s2 = op2.toString();

      switch (operator) {
        case "+": return s1 + s2;
        case "-":
          if (s1.endsWith(s2))
            return s1.substring(0, s1.length() - s2.length());
          return s1;
        case "==": return s1.equals(s2);
        case "!=": return !s1.equals(s2);
      }
    }

    throw new ExpressionException(String.format("Illegal binary operation : '%s' between %s and %s",
      operator, op1.getClass(), op2.getClass()));
  }
}
