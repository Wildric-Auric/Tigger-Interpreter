package frontend;

@SuppressWarnings("serial")
public class ValueException extends RuntimeException {
    
    public ValueException (final Throwable cause) {
		super(cause);
	}

	public ValueException (final String message) {
		super(message);
	}
}
