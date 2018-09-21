package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JavaJsonConvertions {
	
	private JavaJsonConvertions() {}

	// topic 2
	public static String convertJavaToJson(Person person) {
		return new Gson().toJson(person);
	}
	
	// topic 3
	public static Person convertJsonToJava(String personAsJson) {
		return new Gson().fromJson(personAsJson, Person.class);
	}
	
	// topic 4
	public static String convertJavaToJsonWithoutExcludedFields(Person person) {
		return new GsonBuilder().addSerializationExclusionStrategy(new IdExclusion()).create().toJson(person);
	}
	
	// method to see the other way around
	public static Person convertJsonToJavaWithoutExcludedFields(String personAsJson) {
		return new GsonBuilder().addDeserializationExclusionStrategy
				(new IdExclusion()).create().fromJson(personAsJson, Person.class);
	}
}
