package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistence {

	private Persistence() {
	}
	
	private static String buildInsertQuery(String tableName, String[] objectFieldsNames) {
		StringBuilder stringBuilder = new StringBuilder("insert into " + tableName + " (");
		for (int i = 0; i < objectFieldsNames.length; i++) {
			stringBuilder.append(objectFieldsNames[i]);
			if (i != (objectFieldsNames.length - 1)) {
				stringBuilder.append(", ");
			}
		}
		stringBuilder.append(") values(");
		for (int i = 0; i < objectFieldsNames.length; i++) {
			stringBuilder.append("?");
			if (i != (objectFieldsNames.length - 1)) {
				stringBuilder.append(", ");
			}
		}
		stringBuilder.append(")");
		return String.valueOf(stringBuilder);
	}

	public static <T> void insertObject(String tableName, String[] objectFieldsNames, T[] fieldsValues, Connection conn) {
		String sql = buildInsertQuery(tableName, objectFieldsNames);
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			for (int i = 0; i < fieldsValues.length; i++) {
				stmt.setObject(i + 1, fieldsValues[i]);
			}
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static String buildUpdateQuery(String tableName, String objectIdName, String[] fieldsToUpdate) {
		StringBuilder stringBuilder = new StringBuilder().append("update " + tableName + " set ");
		for (int i = 0; i < fieldsToUpdate.length; i++) {
			stringBuilder.append(fieldsToUpdate[i] + " = ?");
			if (i != (fieldsToUpdate.length - 1)) {
				stringBuilder.append(", ");
			}
		}
		stringBuilder.append(" where " + objectIdName + " = ?");
		return String.valueOf(stringBuilder);
	}

	public static <T> int updateObject(String tableName, String objectIdName, Object id, String[] fieldsToUpdate,
			T[] valuesToUpdateWith, Connection conn) {
		String updateQuery = buildUpdateQuery(tableName, objectIdName, fieldsToUpdate);
		try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
			int i;
			for (i = 0; i < valuesToUpdateWith.length; i++) {
				stmt.setObject(i + 1, valuesToUpdateWith[i]);
			}
			stmt.setObject(i + 1, id);
			return stmt.executeUpdate(); // return how many rows were affected, should always be 1
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0; // 0 rows affected
	}
	
	private static String buildDeleteQuery(String tableName, String objectDeleteIdName) {
		return "delete from " + tableName + " where " + objectDeleteIdName + " = ?";
	}
	
	public static int deleteObject(String tableName, String objectIdName, Object id, Connection conn) {
		String sql = buildDeleteQuery(tableName, objectIdName);
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setObject(1, id);
			return stmt.executeUpdate(); // same as update
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static ResultSet executeQuery(Statement stmt, String query) {
		try {
			return stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}