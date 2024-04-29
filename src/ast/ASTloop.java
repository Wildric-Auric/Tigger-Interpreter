package ast;

public class ASTloop extends ASTexpression {

    private ASTexpression cond;
    private ASTexpression task;

    public ASTloop(ASTexpression cond, ASTexpression task) {
        this.cond = cond;
        this.task = task;
    }

    @Override
    public String toString() {
        return String.format("while %s do %s", cond.toString(), task.toString());
    }

    @Override
    public Object eval() {
        while(cond.getBoolFromEval()) {
            task.eval();
        }
        return null;
    }
    
}
