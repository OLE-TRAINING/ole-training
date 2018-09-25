package reflection;

public enum NullFieldsMessages {
	NAME("name", "String value expected"),
	ID("id", "Integer value expected"),
	SALARY("salary", "BigDecimal value expected"),
	REGISTRATIONDATE("registrationDate", "LocalDate value expected");
	
	private final String id;
	private final String message;
	
	NullFieldsMessages(String id, String message) {
		this.id = id;
		this.message = message;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public static NullFieldsMessages getNullFieldMessageThroughId(String id) {
		for (NullFieldsMessages nullFieldMessage : NullFieldsMessages.values()) {
			if (nullFieldMessage.id.equals(id)) {
				return nullFieldMessage;
			}
		}
		return null;
	}
}