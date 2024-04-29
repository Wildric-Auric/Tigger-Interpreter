package ast;
import java.math.BigInteger;

public class ASTinteger extends ASTexpression {

  private final BigInteger value;

  public ASTinteger (String description) {
    this.value=new BigInteger(description);
  }

	public BigInteger getValue() {
    return value;
  }

  public String toString(){
    return value.toString();
  }

  public Object eval(){
    return value;
  }


}
