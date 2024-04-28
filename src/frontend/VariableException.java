package frontend;

@SuppressWarnings("serial")
public class VariableException extends RuntimeException {
    
    public VariableException (final Throwable cause) {
		super(cause);
	}

	public VariableException (final String message) {
		super(message);
	}
}
