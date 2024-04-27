package ast;

public class ASTcondition extends ASTexpression {

    private final ASTexpression cond;
    private final ASTexpression exprT;
    private final ASTexpression exprF;

    public ASTcondition (ASTexpression cond, ASTexpression exprT, ASTexpression exprF) {
        this.cond = cond;
        this.exprT = exprT;
        this.exprF = exprF;
    }

    public String toString() {
        if (exprF == null)
            return String.format("if %s then %s", cond.toString(), exprT.toString());
        return String.format("if %s then %s else %s", cond.toString(), exprT.toString(), exprF.toString());
    }

    public Object eval() {
        if (cond.getBoolFromEval())
            return exprT.eval();
        if (exprF != null)
            return exprF.eval();
        return null;
    }
}