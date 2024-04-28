package ast;

import memory.Memory;

public class ASTvariable extends ASTexpression {
    public Object value;
    public String id;

    public ASTvariable (String id , ASTexpression expr) {
        this.setValue(expr);
        this.id    = id;
        //Ouss. I would avoid complex logic in constructor though
        Memory.pushVar(this);
    }

    public String getID() {
        return this.id;
    }

	public Object getValue() {
        return value;
    }

    public String toString(){
        return "("+this.id + "=" + this.value.toString()+")";
    }

    public void setValue(ASTexpression expr) {
        this.value = expr.eval();
    }

    public Object eval() {
        return value;
    }
}