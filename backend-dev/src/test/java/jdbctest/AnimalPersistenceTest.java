package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import gson.Person;
import jdbc.Animal;
import jdbc.AnimalPersistence;
import jdbc.MySQLAccess;
import jdbc.SQLScript;

public class AnimalPersistenceTest {

	private static Connection conn;
	private static Statement stmt;

	@BeforeClass
	public static void initialize() {
		try {
			conn = MySQLAccess.getConnection();
			stmt = conn.createStatement();
			SQLScript.getScriptRunnerWithSQLFileLoaded(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInsertAnimal() throws SQLException {
		Animal animal = new Animal(2, "Breado", "cat", 3);
		animal.setOwner(new Person());
		animal.getOwner().setId(3);
		AnimalPersistence.insertAnimal(animal, conn);
		
		ResultSet rs = stmt.executeQuery("select * from animal where id = 2");
		assertThat(rs.next()).isEqualTo(true);
		
		rs.close();
	}
	
	@Test
	public void testUpdateAnimal() {
		String[] fields = { "name", "type" };
		Object[] values = { "Breado", "kitten" };
		int rowsAffected = AnimalPersistence.updateAnimal(1, fields, values, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testDeleteAnimal() {
		int rowsAffected = AnimalPersistence.deleteAnimal(1, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@AfterClass
	public static void after() throws SQLException {
		stmt.close();
		conn.close();
	}
}
