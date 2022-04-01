package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.myclass.BCrypt;

public class Brad98 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root"); prop.put("password", "root");
		
		String sql = "SELECT * FROM member";
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/iii", prop)){
			
			PreparedStatement pstmt = conn.prepareStatement(
					sql,
					ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE
					);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			System.out.println(rs.getString("account"));
			
			rs.updateString("account", "newbrad2");
			rs.updateString("realname", "brad2");
			rs.updateRow();
			System.out.println(rs.getString("account"));

			System.out.println("---");
			rs.next();
			System.out.println(rs.getString("account"));
			rs.deleteRow();
			
			System.out.println(rs.getString("account"));
			
			rs.moveToInsertRow();
			rs.updateString("account", "iii");
			rs.updateString("realname", "III");
			rs.updateString("passwd", 
				BCrypt.hashpw("123456", BCrypt.gensalt()));
			rs.insertRow();
			
			System.out.println(rs.getString("account"));
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
