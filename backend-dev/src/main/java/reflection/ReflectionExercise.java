package reflection;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import gson.Person;

public class ReflectionExercise {

	private static final Logger logger = Logger.getLogger(ReflectionExercise.class);
	
	private ReflectionExercise() {}
	
	// topic 2
	public static Field[] getPersonAttributes() {
		return Person.class.getDeclaredFields();
	}
	
	// topic 3
	public static void checkIfNameFieldIsNull(Person person) {
		try {
			Field privateStringName = Person.class.getDeclaredField("name");
			privateStringName.setAccessible(true);
			if (privateStringName.get(person) == null) {
				throw new IllegalArgumentException("Person's name field is null!");
			}
		} catch (NoSuchFieldException | IllegalAccessException e) {
			logger.error(e.getMessage());
		}
	}
	
	// topic 5
	public static void validatePersonFields(Person person) {
		for (Field field : Person.class.getDeclaredFields()) {
			field.setAccessible(true);
			try {
				if (field.get(person) == null) {
					NullFieldsMessages nullFieldsMessages = NullFieldsMessages.getNullFieldMessageThroughId(field.getName());
					throw new NullFieldException(new ErrorResponse(nullFieldsMessages));
				}
			} catch (IllegalArgumentException e) {
				logger.info(e.getMessage());
			} catch (IllegalAccessException e) {
				logger.info(e.getMessage());
			}
		}
	}
}