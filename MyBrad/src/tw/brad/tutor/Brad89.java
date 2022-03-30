package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad89 {

	public static void main(String[] args) {
		// 2. Create Connection
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
			
			// 3. SQL statement
//			PreparedStatement pstmt = conn.prepareStatement(
//					"UPDATE foods SET name = ?, tel = ? WHERE id = ?");
//			pstmt.setString(1, "小坑休閒農");
//			pstmt.setString(2, "321");
//			pstmt.setInt(3, 133);

			PreparedStatement pstmt = conn.prepareStatement(
					"DELETE FROM foods WHERE id = ?");
			pstmt.setInt(1, 133);
			
			// 4. execute SQL statement
			pstmt.executeUpdate();
			
			
			conn.close();
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
