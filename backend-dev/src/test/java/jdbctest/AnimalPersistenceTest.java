package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import gson.Person;
import jdbc.Animal;
import jdbc.AnimalPersistence;
import jdbc.MySQLAccess;

public class AnimalPersistenceTest {

	private Connection conn;
	private Statement stmt;

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
	public void testInsertAnimal() throws SQLException {
		Animal animal = new Animal(10, "Breado", "cat", 3);
		animal.setOwner(new Person());
		animal.getOwner().setId(3);
		AnimalPersistence.insertAnimal(animal, conn);
		
		ResultSet rs = stmt.executeQuery("select * from animal where id = 10");
		assertThat(rs.next()).isEqualTo(true);
	}
	
	@Test
	public void testUpdateAnimal() {
		String[] fields = { "name", "type" };
		Object[] values = { "Lilly", "cat" };
		int rowsAffected = AnimalPersistence.updateAnimal(1, fields, values, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testDeleteAnimal() {
		int rowsAffected = AnimalPersistence.deleteAnimal(1, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
}
