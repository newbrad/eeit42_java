package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Brad96 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/iii", prop)) {
			String sql1 = "UPDATE member SET money = money - ? WHERE id = ?";
			String sql2 = "UPDATE member SET money = money + ? WHERE id = ?";
			
			conn.setAutoCommit(false);
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10);
			pstmt1.setInt(2, 2);
			int n1 = pstmt1.executeUpdate();
			
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10);
			pstmt2.setInt(2, 17);
			int n2 = pstmt2.executeUpdate();
			
			if (n1 > 0 && n2 > 0) {
				conn.commit();
				System.out.println("Finish");
			}else {
				System.out.println("Ooop!");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
