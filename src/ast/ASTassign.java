package ast;

import memory.Memory;

public class ASTassign extends ASTexpression {
    
    private ASTexpression expr;
    private String id;

    public ASTassign (String id, ASTexpression expr) {
        this.expr = expr;
        this.id    = id;
    }

    public String toString() {
        return this.id + " = " + this.expr.toString();
    }

    public Object eval() {
        Object eval = expr.eval();
        Memory.pushVar(id, eval);
        return eval;
    }
}