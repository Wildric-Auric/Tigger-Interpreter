package ast;

import java.util.HashMap;

import frontend.FunctionCallException;
import memory.Memory;

public class ASTfunctionCall extends ASTexpression {
    private ASTfunction     func;
    private ASTexpression[] params;

    ASTfunctionCall(String funcID , ASTexpression[] params) {
        this.func        = Memory.getFunc(funcID);
        this.params      = params;
        String[] vars    = func.getVars();
        if (vars.length != params.length) 
            throw new FunctionCallException("Invalid number of parameters when calling: " + func.getID());
    }

    public String toString() {
        String[] str = new String[params.length];
        for (int i = 0; i < params.length; ++i) {
            str[i] = params[i].toString();
        }
        return func.getID() + '('+ String.join(",", str) +')';
    }

    public Object eval() {

        Memory.pushScope();
        for (int i = 0; i < params.length; ++i) {
            Memory.pushVarForce(func.getVars()[i], params[i].eval());
        }
        Object ret = func.eval();
        Memory.popScope();
        return ret;
    }
}
