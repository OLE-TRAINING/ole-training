package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import jdbc.Address;
import jdbc.Animal;
import jdbc.ExercisesQueries;
import jdbc.MySQLAccess;
import jdbc.Persistence;

public class ExercisesQueriesTest {

	private Connection conn;
	private Statement stmt;

	@Spy
	private Persistence persistenceUnit;

	@Before
	public void initialize() {
		try {
			conn = MySQLAccess.getConnection();
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetPersonAddress() throws SQLException {
		Address address = new Address();
		address.setId(2);
		Address personsAddress = ExercisesQueries.getPersonAddress(3, stmt);
		assertThat(personsAddress).isEqualTo(address);
	}

	@Test
	public void testGetPersonAddressEmptyResultSet() {
		SQLException e = null;
		try {
			ExercisesQueries.getPersonAddress(5, stmt); // person with id 5 doesn't exist
		} catch (SQLException e1) {
			e = e1;
		}
		assertThat(e.getMessage()).isEqualTo("Illegal operation on empty result set.");
	}

	@Test
	public void testGetPersonsListOfAnimals() throws SQLException {
		List<Animal> animals = new ArrayList<>();
		Animal animal = new Animal();
		animal.setId(1);
		animals.add(animal);

		animal = new Animal();
		animal.setId(10);
		animals.add(animal);

		List<Animal> personsAnimals = ExercisesQueries.getPersonsListOfAnimals(3, stmt);
		assertThat(personsAnimals).isEqualTo(animals);
	}

	@Test
	public void testAnimalBelongsToPersonTrue() throws SQLException {
		boolean animalBelongsToPerson = ExercisesQueries.animalBelongsToPerson(1, 3, stmt);
		assertThat(animalBelongsToPerson).isEqualTo(true);
	}

	@Test
	public void testAnimalBelongsToPersonFalse() throws SQLException {
		boolean animalBelongsToPerson = ExercisesQueries.animalBelongsToPerson(2, 3, stmt);
		assertThat(animalBelongsToPerson).isEqualTo(false);
	}

	@Test
	public void testDeletePersonAndAllItemsTheyOwn() throws SQLException {
		int rowsAffected = ExercisesQueries.deletePersonAndAllItemsTheyOwn(10, stmt);
		assertThat(rowsAffected).isEqualTo(0);
	}

	@Test
	public void testDeletePersonAndAllItemsTheyOwnEmptyResultSet() {
		SQLException e = null;
		try {
			ExercisesQueries.deletePersonAndAllItemsTheyOwn(10, stmt);
		} catch (SQLException e1) {
			e = e1;
		}
		assertThat(e.getMessage()).isEqualTo("Illegal operation on empty result set.");
	}

	@Test
	public void testAssociateAnimalFromOnePersonToAnother() throws SQLException {
		int rowsAffected = ExercisesQueries.associateAnimalFromOnePersonToAnother(1, 1, stmt);
		assertThat(rowsAffected).isEqualTo(1);
	}
}