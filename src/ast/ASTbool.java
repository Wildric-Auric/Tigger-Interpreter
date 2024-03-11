package ast;

public class ASTbool extends ASTexpression {
    
    private final String description;
    private final Boolean value;

    public ASTbool(String description) {
        this.description = description;
        if (description.equals("true") || description.equals("T"))
            value = true;
        else
            value = false;
    }

    public boolean getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public Object eval() {
        return value;
    }
}
