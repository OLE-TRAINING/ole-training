package reflection;

// topic 4
public class ErrorResponse {

	private String id;
	private String message;
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorResponse other = (ErrorResponse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}
}