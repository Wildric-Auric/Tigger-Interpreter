package frontend;

@SuppressWarnings("serial")
public class FunctionCallException extends RuntimeException {
    
    public FunctionCallException (final Throwable cause) {
		super(cause);
	}

	public FunctionCallException(final String message) {
		super(message);
	}
}
