package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static Connection conn = null;
	private static String user = "root";
	private static String password = "1234";
	private static String url = "jdbc:mysql://localhost:3306/lab2_1";
	public static Connection createConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

		return conn;
	}
	
}
