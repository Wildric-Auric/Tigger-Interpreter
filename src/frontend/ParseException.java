package frontend;
@SuppressWarnings("serial")
public class ParseException extends Exception {
	public ParseException (final Throwable cause) {
		super(cause);
	}

	public ParseException (final String message) {
		super(message);
	}
}
