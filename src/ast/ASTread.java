package ast;

import memory.Memory;

public class ASTread extends ASTexpression {
    
    private String id;

    public ASTread (String id) {
        this.id = id;
    }

    public String toString() {
        return this.id;
    }

    public Object eval() {
        return Memory.getVar(id);
    }
}