package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
			Statement stmt = conn.createStatement();
			
			// 4. execute SQL statement
			int n = stmt.executeUpdate(
				"INSERT INTO cust (name,tel,birthday) " + 
					"VALUES ('brad1','123','1999-01-02')," +
					" ('brad2','123','1999-01-02')," +
					" ('brad3','123','1999-01-02')"
						);
			System.out.println(n);
			conn.close();
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
