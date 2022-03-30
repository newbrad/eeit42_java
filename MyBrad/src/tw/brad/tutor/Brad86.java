package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Brad86 {

	public static void main(String[] args) {
		// 1. Load Driver => x
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		// 2. Create Connection
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii?user=root&password=root");
			// 3. SQL statement
			// 4. execute SQL statement
			
			conn.close();
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
