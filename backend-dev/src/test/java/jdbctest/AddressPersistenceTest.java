package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import jdbc.Address;
import jdbc.AddressPersistence;
import jdbc.MySQLAccess;
import jdbc.SQLScript;

public class AddressPersistenceTest {

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
	public void testInsertAddress() throws SQLException {
		Address address = new Address("pb10", 3, "30", "pc24", "city777", "state121", "nb00");
		AddressPersistence.insertAddress(address, 3, conn);
		
		ResultSet rs = stmt.executeQuery("select * from address where id = 3");
		assertThat(rs.next()).isEqualTo(true);
		
		rs.close();
	}
	
	@Test
	public void testUpdateAddress() {
		String[] fields = { "public_place", "id" };
		Object[] values = { "pbNew", "13" };
		int rowsAffected = AddressPersistence.updateAddress(2, fields, values, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testDeleteAddress() {
		int rowsAffected = AddressPersistence.deleteAddress(1, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@AfterClass
	public static void after() throws SQLException {
		stmt.close();
		conn.close();
	}
}