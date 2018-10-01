package httpclient.exceptions;

@SuppressWarnings("serial")
public class TooManyRequestsException extends Exception {

	public TooManyRequestsException(String message) {
		super(message);
	}
}
