package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import gson.Person;
import jdbc.Address;
import jdbc.MySQLAccess;
import jdbc.PersonPersistence;

public class PersonPersistenceTest {

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

	// it will cause an exception after the first time the data was inserted, but that only means it worked.
	@Test
	public void testInsertPerson() throws SQLException {
		Person person = new Person("Alexandre", 8, new BigDecimal("1500"), LocalDate.now());
		person.setAddress(new Address());
		person.getAddress().setId(1);
		PersonPersistence.insertPerson(person, conn);

		ResultSet rs = stmt.executeQuery("select * from person where id = 8");
		assertThat(rs.next()).isEqualTo(true);
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
		int rowsAffected = PersonPersistence.deletePerson(2, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
}