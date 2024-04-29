package ast;

import memory.Memory;

public class ASTfunction {
  private String        id;
  private ASTexpression block;
  private String[]      vars;

  public ASTfunction(String id, String[] vars, ASTexpression block) {
      this.id    = id;
      this.vars  = vars;
      this.block = block;
      Memory.pushFunc(this);
  }

  public String[] getVars() {
    return vars;
  }

  public String getID() { return id;}

	public ASTexpression getBlock() {
    return this.block;
  }

  public String toString() {
    return this.block.toString();
  }

  public Object eval() {
    Object ret = this.block.eval();
    return ret;
  }
}
