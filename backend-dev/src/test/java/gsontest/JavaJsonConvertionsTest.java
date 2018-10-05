package gsontest;

import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Test;
import gson.JavaJsonConvertions;
import gson.Person;

public class JavaJsonConvertionsTest {

	@Test
	public void testConvertJavaToJson() {
		assertThat(JavaJsonConvertions.convertJavaToJson(new Person("Bruno", 1, new BigDecimal("1200"), LocalDate.parse("2018-09-21"))))
			.isEqualTo("{\"name\":\"Bruno\",\"id\":1,\"salary\":1200,\"registrationDate\":{\"year\":2018,\"month\":9,\"day\":21},\"animals\":[]}");
	}

	@Test
	public void testConvertJsonToJava() {
		Person person = new Person("Bruno", 1, new BigDecimal("1200"), LocalDate.parse("2018-09-21")); 
		String json = JavaJsonConvertions.convertJavaToJson(person);
		assertThat(JavaJsonConvertions.convertJsonToJava(json)).isEqualTo(person);
	}

	@Test
	public void testConvertJavaToJsonWithoutExcludedFields() {
		Person person = new Person("Bruno", 1, new BigDecimal("1200"), LocalDate.parse("2018-09-21"));
		person.setAnimals(null);
		assertThat(JavaJsonConvertions.convertJavaToJsonWithoutExcludedFields(person)).
			isEqualTo("{\"name\":\"Bruno\",\"salary\":1200,\"registrationDate\":{\"year\":2018,\"month\":9,\"day\":21}}");
	}

	@Test
	public void testConvertJsonToJavaWithoutExcludedFields() {
		Person person = new Person("Bruno", 1, new BigDecimal("1200"), LocalDate.parse("2018-09-21")); 
		// easier than insert the whole string
		String json = JavaJsonConvertions.convertJavaToJsonWithoutExcludedFields(person);
		person.setId(null); // id becomes null with this method
		assertThat(JavaJsonConvertions.convertJsonToJavaWithoutExcludedFields(json)).isEqualTo(person);
	}
}