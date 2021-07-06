package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAccess {
    
	private static String url = "jdbc:mysql://192.168.99.100:3306/db-ole?useSSL=false";
	private static String user = "root";
	private static String password = "123456";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
}