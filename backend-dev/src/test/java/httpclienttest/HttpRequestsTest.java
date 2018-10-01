package httpclienttest;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import gson.Person;
import httpclient.CheckHttpCodeStatusExceptions;
import httpclient.HttpStatusCode;
import httpclient.UnirestConfig;
import httpclient.exceptions.UnauthenticationException;

public class HttpRequestsTest {

	@Before
	public void initialize() {
		Unirest.setObjectMapper(UnirestConfig.getObjectMapperConfigurated());
	}

	@Test
	public void testSinglePersonFromJsonToPersonClass()
			throws JsonGenerationException, JsonMappingException, IOException, UnirestException {
		HttpResponse<Person> personResponse = Unirest.get("http://www.mocky.io/v2/5babbe6d31000055006544f2")
				.asObject(Person.class);
		Person personObject = personResponse.getBody();
		Person expected = new Person("Bruno", 1, new BigDecimal("20"), LocalDate.parse("2018-09-26"));
		assertThat(personObject).isEqualTo(expected);
	}

	// topic 4
	@Test
	public void testThreePeopleFromJsonToPersonClass() throws UnirestException {
		HttpResponse<Person[]> httpResponse = Unirest.get("http://www.mocky.io/v2/5babc27b3100005500654505")
				.asObject(Person[].class);
		Person[] arrayOfPeople = httpResponse.getBody();

		Person[] people = { new Person("Bruno", 1, new BigDecimal("20"), LocalDate.parse("2018-09-26")),
				new Person("Rafael", 2, new BigDecimal("120"), LocalDate.parse("2019-09-26")),
				new Person("Rogerio", 3, new BigDecimal("250"), LocalDate.parse("2018-10-15")) };
		assertThat(arrayOfPeople).isEqualTo(people);
	}

	// topic 5
	@Test
	public void testSavePersonAndGetHttpStatus() throws UnirestException, JsonProcessingException {
		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		Person person = new Person("Bruno", 1, new BigDecimal("20"), LocalDate.parse("2018-09-26"));
		String json = objectMapper.writeValueAsString(person);

		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://www.mocky.io/v2/5a9ce7663100006800ab515d").body(json)
				.asJson();

		assertThat(jsonResponse.getStatus()).isEqualTo(201);
	}

	// topic 6
	@Test
	public void testUpdateWholePerson() throws UnirestException, JsonProcessingException {
		HttpResponse<Person> httpResponse = Unirest.get("http://www.mocky.io/v2/5babbe6d31000055006544f2?id=1")
				.asObject(Person.class);

		Person person = httpResponse.getBody();
		person.setName("OutroNome");
		person.setRegistrationDate(LocalDate.now());
		person.setSalary(new BigDecimal("5000"));

		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		String json = objectMapper.writeValueAsString(person);

		HttpResponse<JsonNode> jsonResponse = Unirest.put("http://www.mocky.io/v2/5babc27b3100005500654505").body(json)
				.asJson();

		assertThat(jsonResponse.getStatus()).isEqualTo(200);
	}

	// topic 7
	@Test
	public void testUpdateSomeInformationFromPerson() throws UnirestException, JsonProcessingException {
		HttpResponse<Person> httpResponse = Unirest.get("http://www.mocky.io/v2/5babbe6d31000055006544f2?id=1")
				.asObject(Person.class);

		Person person = httpResponse.getBody();
		person.setName("OutroNome");

		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		String json = objectMapper.writeValueAsString(person);

		HttpResponse<JsonNode> jsonResponse = Unirest.patch("http://www.mocky.io/v2/5babc27b3100005500654505")
				.body(json).asJson();

		assertThat(jsonResponse.getStatus()).isEqualTo(200);
	}

	// topic 8
	@Test
	public void testDeletePerson() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("http://www.mocky.io/v2/5babc27b3100005500654505?id=1")
				.asJson();

		assertThat(jsonResponse.getStatus()).isEqualTo(200);
	}

	// topic 9
	@Test
	public void testThrowingUnauthenticationException() throws Exception {
		UnauthenticationException e = null;
		
		HttpResponse<JsonNode> httpResponse = Unirest.get("http://www.mocky.io/v2/5bace7b43300005e000eb427").asJson();
		
		try {
			CheckHttpCodeStatusExceptions.checkHttpResponse(httpResponse);
		} catch (UnauthenticationException e1) {
			e = e1;
		}
		assertThat(e.getMessage()).isEqualTo(HttpStatusCode.UNAUTHORIZED.getException().getMessage());
	}
}