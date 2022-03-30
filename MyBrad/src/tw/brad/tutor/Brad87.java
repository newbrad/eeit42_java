package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad87 {

	public static void main(String[] args) {
		// 2. Create Connection
		try {
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii?user=root&password=root");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii", "root", "root");
			
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
			
			// 3. SQL statement
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO cust (name,tel,birthday) " +
					"VALUES (?,?,?)");
			pstmt.setString(1, "tony");
			pstmt.setString(2, "321");
			pstmt.setString(3, "1988-02-03");
			
			// 4. execute SQL statement
			pstmt.executeUpdate();
			
			
			conn.close();
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
