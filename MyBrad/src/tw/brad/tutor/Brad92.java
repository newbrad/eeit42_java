package tw.brad.tutor;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import tw.brad.myclass.BCrypt;

public class Brad92 {

	public static void main(String[] args) {
		// 2. Create Connection
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
			
			FileInputStream fin = new FileInputStream("dir1/ball.png");
			String account = "mary";
			String passwd = "123456";
			String realname = "趙令文";
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO member (account,passwd,realname,obj)"
					+ " VALUES (?,?,?,?)");
			pstmt.setString(1, account);
			pstmt.setString(2, BCrypt.hashpw(passwd, BCrypt.gensalt()));
			pstmt.setString(3, realname);
			pstmt.setBinaryStream(4, fin);
			
			// 4. execute SQL statement
			pstmt.executeUpdate();
			
			conn.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
