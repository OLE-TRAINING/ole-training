package jdbctest;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import jdbc.MySQLAccess;
import jdbc.Persistence;
import jdbc.SQLScript;

public class PersistenceTest {

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
	public void testBuildUpdateQuery() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String[] fields = { "type", "name" };
		Method method = Persistence.class.getDeclaredMethod("buildUpdateQuery", String.class, String.class, String[].class);
		method.setAccessible(true);
		String result = (String) method.invoke(null, "animal", "id", fields);

		assertThat(result).isEqualTo("update animal set type = ?, name = ? where id = ?");
	}
	
	@Test
	public void testUpdateObject() {
		String[] fields = { "type", "name" };
		String[] fieldValues = {"cat", "Bobby"};
		int rowsAffected = Persistence.updateObject("animal", "id", 10, fields, fieldValues, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testBuildInsertQuery() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String[] fields = { "id", "name", "type", "age", "owner_id" };
		Method method = Persistence.class.getDeclaredMethod("buildInsertQuery", String.class, String[].class);
		method.setAccessible(true);
		String result = (String) method.invoke(null, "animal", fields);

		assertThat(result).isEqualTo("insert into animal (id, name, type, age, owner_id) values(?, ?, ?, ?, ?)");
	}
	
	@Test
	public void testInsertObject() throws SQLException {
		String[] fields = { "id", "name", "type", "age", "owner_id" };
		Object[] fieldsValues = {20, "Jade", "cat", 4, 2};
		Persistence.insertObject("animal", fields, fieldsValues, conn);
		
		ResultSet rs = stmt.executeQuery("select * from animal where id = 20");
		assertThat(rs.next()).isEqualTo(true);
		
		rs.close();
	}
	
	@Test
	public void testBuildDeleteQuery() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = Persistence.class.getDeclaredMethod("buildDeleteQuery", String.class, String.class);
		method.setAccessible(true);
		String result = (String) method.invoke(null, "animal", "id");
		
		assertThat(result).isEqualTo("delete from animal where id = ?");
	}
	
	@Test
	public void testDeleteObject() {
		int rowsAffected = Persistence.deleteObject("animal", "id", 1, conn);
		assertThat(rowsAffected).isEqualTo(1);
	}
	
	@Test
	public void testExecuteQuery() throws SQLException {
		ResultSet rs = Persistence.executeQuery(stmt, "select * from person");
		assertThat(rs.next()).isEqualTo(true);
	}
	
	@Test
	public void testExecuteQueryPersonDoesNotExist() throws SQLException {
		ResultSet rs = Persistence.executeQuery(stmt, "select * from person where id = 22");
		assertThat(rs.next()).isEqualTo(false);
	}
	
	@AfterClass
	public static void after() throws SQLException {
		stmt.close();
		conn.close();
	}
}