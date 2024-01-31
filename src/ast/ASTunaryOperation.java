package ast;
import java.math.BigInteger;

public class ASTunaryOperation extends ASTexpression {

  public ASTunaryOperation (String operator, ASTexpression operand) {
    this.operator = operator;
    this.operand = operand;
  }

  private final String operator;
  private final ASTexpression operand;

	public ASTexpression getOperand() {
    return operand;
  }

	public String getOperator() {
    return operator;
  }

 public String toString(){
    return operator + operand.toString();
 }

  public Object eval(){
    Object op = operand.eval();
    if (op instanceof BigInteger){
      BigInteger b = (BigInteger) op;
      switch (operator){
      case "-" : return BigInteger.ZERO.subtract(b);
      };
    }
    return null;
  }
}
