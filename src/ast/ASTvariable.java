package ast;

public class ASTvariable extends ASTexpression {
    public ASTexpression value;
    public String id;

    public ASTvariable (String id , ASTexpression expr) {
        this.value = expr;
        this.id    = id;
    }

    public String getID() {
        return this.id;
    }

	public Object getValue() {
        return value.eval();
    }

    public String toString(){
        return "("+this.id + "=" + this.value.toString()+")";
    }

    public Object eval() {
        return value;
    }
}