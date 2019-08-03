package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static Connection conn = null;
	private static String user = "sa";
	private static String password = "1234";
	private static String url = "jdbc:sqlserver://THANGTONY-PC\\SQLEXPRESS;databaseName=Product";
	
	public static Connection createConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

		return conn;
	}
	

}
