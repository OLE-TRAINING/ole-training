package reflection;

@SuppressWarnings("serial")
public class NullFieldException extends RuntimeException {

	public NullFieldException(ErrorResponse errorResponse) {
		super(errorResponse.toString());
	}
}
