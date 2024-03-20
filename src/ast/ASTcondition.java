package ast;

import java.math.BigInteger;

import frontend.ExpressionException;

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
        return String.format("if %s then %s else %s", cond.toString(), exprT.toString(), exprF.toString());
    }
  
    public Object eval() {
        Object condEval = cond.eval();
        boolean valid = false;
        if (condEval instanceof Boolean) {
            valid = (Boolean) condEval;
        }
        else if (condEval instanceof BigInteger) {
            valid = ((BigInteger) condEval).intValue() == 0;
        }
        else {
            throw new ExpressionException("Invalid condition '" + condEval + "'");
        }
        if (valid)
            return exprT.eval();
        return exprF.eval();
    }
}