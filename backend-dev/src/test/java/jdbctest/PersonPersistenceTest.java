package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import gson.Person;
import jdbc.MySQLAccess;
import jdbc.PersonPersistence;
import jdbc.SQLScript;

public class PersonPersistenceTest {

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
	public void testInsertPerson() throws SQLException {
		Person person = new Person("Alexandre", 7, new BigDecimal("1500"), LocalDate.now());
		PersonPersistence.insertPerson(person, conn);

		ResultSet rs = stmt.executeQuery("select * from person where id = 7");
		assertThat(rs.next()).isEqualTo(true);
		
		rs.close();
	}

	@Test
	public void testUpdatePerson() throws SQLException {
		String[] fields = { "name", "address_id" };
		Object[] values = { "Ricardo", 2 };
		int rowsAffected = PersonPersistence.updatePerson(2, fields, values, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testUpdatePersonFailsIdDoesNotExist() {
		String[] fields = { "name", "address_id" };
		Object[] values = { "Ricardo", 2 };
		int rowsAffected = PersonPersistence.updatePerson(55, fields, values, conn); // id 55 doesn't exist
		assertThat(rowsAffected).isEqualTo(0);
	}
	
	@Test
	public void testDeletePerson() {
		int rowsAffected = PersonPersistence.deletePerson(1, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@AfterClass
	public static void after() throws SQLException {
		stmt.close();
		conn.close();
	}
}