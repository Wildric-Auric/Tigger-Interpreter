package ast;

import java.math.BigInteger;

import frontend.ValueException;

public class ASTgroupedExpression extends ASTexpression {

    private final ASTexpression expr;
    private final String expType;

    public ASTgroupedExpression (ASTexpression expr, String expType) {
        this.expr = expr;
        this.expType = expType;
    }

    public ASTexpression getValue() {
        return expr;
    }

    public String toString() {
        return "(" + expr.toString() + ")";
    }

    public Object eval() {

        Object val = expr.eval();

        // Cast if indicated
        if (expType != null) {
            if (val == null)
                throw new ValueException("Cannot cast '" + val + "' because it is null");
            try {
                switch (expType) {
                    case "int":
                        if (val instanceof BigInteger)
                            return val;
                        if (val instanceof Boolean)
                            return ((Boolean) val) ? 1 : 0;
                        if (val instanceof String) {
                            return BigInteger.valueOf(Integer.valueOf(val.toString()));
                        }
                        break;
                    case "bool":
                        if (val instanceof Boolean)
                            return val;
                        if (val instanceof BigInteger)
                            // true is > 0, false otherwise
                            return Boolean.valueOf(((BigInteger) val).compareTo(BigInteger.valueOf(0)) > 0);
                        if (val instanceof String) {
                            switch (val.toString().toLowerCase()) {
                                case "true":
                                case "t":
                                    return Boolean.valueOf(true);
                                case "false":
                                case "f":
                                    return Boolean.valueOf(false);
                            }
                        }
                        break;
                    case "str":
                        return val.toString();
                }
            }
            catch (NumberFormatException e) {}
            throw new ValueException(String.format("Cannot cast '%s' to %s", val, expType));
        }

        return val;
    }
}
