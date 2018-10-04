package jdbc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

import com.ibatis.common.jdbc.ScriptRunner;

public class SQLScript {

	private static String sqlFilePath = "dump/db-ole.sql";

	private SQLScript() {}
	
	public static void getScriptRunnerWithSQLFileLoaded(Connection conn) {
		ScriptRunner sr = new ScriptRunner(conn, false, false);
		try {
			Reader reader = new BufferedReader(new FileReader(sqlFilePath));
			sr.runScript(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}