package ast;
public class ASTfactory {

  public ASTprogram newProgram(ASTexpression body) {
    return new ASTprogram(body);
  }

  public ASTunaryOperation newUnaryOperation(String operator,
                                             ASTexpression operand) {
    return new ASTunaryOperation(operator, operand);
  }

	public ASTbinaryOperation newBinaryOperation(String operator,
                                               ASTexpression leftOperand, ASTexpression rightOperand) {
    return new ASTbinaryOperation(operator, leftOperand, rightOperand);
  }

	public ASTinteger newIntegerConstant(String value) {
    return new ASTinteger(value);
  }

}
