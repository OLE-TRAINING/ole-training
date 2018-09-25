package reflection;

// topic 4
public class ErrorResponse {

	private String id;
	private String message;
	
	public ErrorResponse(String id, String message) {
		this.id = id;
		this.message = message;
	}
	
	public ErrorResponse(NullFieldsMessages nullFieldsMessages) {
		this.id = nullFieldsMessages.getId();
		this.message = nullFieldsMessages.getMessage();
	}

	public String getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return "Id: " + this.id + ", " + this.message;
	}
}