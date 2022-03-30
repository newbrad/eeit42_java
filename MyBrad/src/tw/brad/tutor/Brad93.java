package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import tw.brad.myclass.BCrypt;

public class Brad93 {

	public static void main(String[] args) {
		// 2. Create Connection
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
			
			String account = "peter";
			String passwd = "123456";
			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT account,passwd FROM member WHERE account = ?");
			pstmt.setString(1, account);
			
			// 4. execute SQL statement
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String hashPasswd = rs.getString("passwd");
				if (BCrypt.checkpw(passwd, hashPasswd)) {
					// OK
					System.out.println("OK");
				}else {
					// error
					System.out.println("error1");
				}
			}else {
				// no data
				System.out.println("error2");
			}
			
			conn.close();
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
