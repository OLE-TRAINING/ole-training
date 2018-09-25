package reflection;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

public class ExecuteReflection {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExecuteReflection.class);
		
		// topic 2
		for (Field field : ReflectionExercise.getPersonAttributes()) {
			logger.info(field.getName());
		}
	}
}