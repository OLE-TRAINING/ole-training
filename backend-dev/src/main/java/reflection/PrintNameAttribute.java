package reflection;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import gson.Person;

public class PrintNameAttribute {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(PrintNameAttribute.class);
		
		Person person;
		try {
			person = Person.class.newInstance();
			ReflectionExercise.checkIfNameFieldIsNull(person);
			Field name = Person.class.getDeclaredField("name");
			name.setAccessible(true);
			
			logger.info("Person's name: " + name.get(person));
		} catch (IllegalArgumentException | InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			logger.error(e.getMessage());
		} 
	}
}