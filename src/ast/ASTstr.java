package ast;

public class ASTstr extends ASTexpression {
    
    public final String value;

    public ASTstr(String description) {
        this.value = description;
    }

    @Override
    public String toString() {
        return '"' + value + '"';
    }

    @Override
    public Object eval() {
        return value;
    }
}
