package frontend;

@SuppressWarnings("serial")
public class ExpressionException extends RuntimeException {
    
    public ExpressionException (final Throwable cause) {
		super(cause);
	}

	public ExpressionException (final String message) {
		super(message);
	}
}
