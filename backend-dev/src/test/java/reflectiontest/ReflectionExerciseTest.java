package reflectiontest;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import gson.Person;
import reflection.NullFieldException;
import reflection.ReflectionExercise;

public class ReflectionExerciseTest {

	@Test
	public void testGetPersonAttributes() {
		assertThat(ReflectionExercise.getPersonAttributes()).isEqualTo(Person.class.getDeclaredFields());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckIfNameFieldIsNullSuccess() {
		try {
			ReflectionExercise.checkIfNameFieldIsNull(Person.class.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(expected = Test.None.class) // no exceptions expected 
	public void testCheckIfNameFieldIsNullFails() {
		try {
			Person person = Person.class.getConstructor(String.class, Integer.class, BigDecimal.class, LocalDate.class)
					.newInstance("Bruno", 1, new BigDecimal("1500"), LocalDate.now());
			ReflectionExercise.checkIfNameFieldIsNull(person);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = NullFieldException.class)
	public void testValidatePersonFields() {
		try {
			ReflectionExercise.validatePersonFields(Person.class.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(expected = Test.None.class) // no exceptions expected
	public void testValidatePersonFieldsNoException() {
		try {
			Person person = Person.class.getConstructor(String.class, Integer.class, BigDecimal.class, LocalDate.class)
					.newInstance("Bruno", 1, new BigDecimal("1500"), LocalDate.now());
			ReflectionExercise.validatePersonFields(person);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}