package reflectiontest;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import gson.Person;
import jdbc.Address;
import reflection.ErrorResponse;
import reflection.NullFieldException;
import reflection.NullFieldsMessages;
import reflection.ReflectionExercise;

public class ReflectionExerciseTest {

	@Test
	public void testGetPersonAttributes() {
		assertThat(ReflectionExercise.getPersonAttributes()).isEqualTo(Person.class.getDeclaredFields());
	}

	// since the only way this exception is going to trigger is through my own throwing, it's not necessary do dig deeper into it.
	// only knowing it triggers is enough for this particular test.
	@Test(expected = IllegalArgumentException.class)
	public void testCheckIfNameFieldIsNullSuccess() throws InstantiationException, IllegalAccessException {
		ReflectionExercise.checkIfNameFieldIsNull(Person.class.newInstance()); 
	}
	
	@Test(expected = Test.None.class) // no exceptions expected 
	public void testCheckIfNameFieldIsNullFails() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Constructor<Person> personConstructor = Person.class.getConstructor(String.class, Integer.class, BigDecimal.class, LocalDate.class);
		Person person = personConstructor.newInstance("Bruno", 1, new BigDecimal("1500"), LocalDate.now());
		ReflectionExercise.checkIfNameFieldIsNull(person);
	}
	
	@Test
	public void testValidatePersonFieldsSalaryFieldNull() throws InstantiationException, IllegalAccessException {
		ErrorResponse errorResponse = null;
		Person person = new Person();
		person.setId(10);
		person.setName("Nome");
		person.setRegistrationDate(LocalDate.now());
		
		try {
			ReflectionExercise.validatePersonFields(person);
		} catch (NullFieldException e) {
			errorResponse = e.getErrorResponse();
		}
		NullFieldsMessages nullFieldsMessages = NullFieldsMessages.getNullFieldMessageThroughId("salary");
		assertThat(errorResponse).isEqualTo(new ErrorResponse(nullFieldsMessages));
	}
	
	@Test(expected = Test.None.class) // no exceptions expected
	public void testValidatePersonFieldsNoException() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Person> personConstructor = Person.class.getConstructor(String.class, Integer.class, BigDecimal.class, LocalDate.class);
		Person person = personConstructor.newInstance("Bruno", 1, new BigDecimal("1500"), LocalDate.now());
		person.setAddress(new Address());
		ReflectionExercise.validatePersonFields(person);
	}
}