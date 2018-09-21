package gson;

import org.apache.log4j.Logger;

public class JsonToJava {

	public static void main(String[] args) {
		// topic 3
		Logger logger = Logger.getLogger(JsonToJava.class);
		Person person = JavaJsonConvertions.convertJsonToJava(
				"{\"name\":\"Rafael\",\"id\":2,\"salary\":1500,\"registrationDate\":{\"year\":2017,\"month\":9,\"day\":21}}");
		logger.info(person);
	}
}
