package gson;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.apache.log4j.Logger;

public class JavaToJsonWithoutId {

	public static void main(String[] args) {
		// topic 4
		Person person = new Person("Ricardo", 10, new BigDecimal("2000"), LocalDate.now());
		Logger logger = Logger.getLogger(JavaToJsonWithoutId.class);
		logger.info(JavaJsonConvertions.convertJavaToJsonWithoutExcludedFields(person));
	}
}