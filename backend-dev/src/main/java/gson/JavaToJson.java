package gson;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.apache.log4j.Logger;

public class JavaToJson {

	public static void main(String[] args) {
		// topic 2
		Person person = new Person("Bruno", 1, new BigDecimal("1200"), LocalDate.now());
		Logger logger = Logger.getLogger(JavaToJson.class);
		logger.info(JavaJsonConvertions.convertJavaToJson(person));
	}
}