package reflection;

@SuppressWarnings("serial")
public class NullFieldException extends RuntimeException {

	private final ErrorResponse errorResponse;
	
	public NullFieldException(ErrorResponse errorResponse) {
		super(errorResponse.toString());
		this.errorResponse = errorResponse;
	}
	
	public ErrorResponse getErrorResponse() {
		return this.errorResponse;
	}
}
