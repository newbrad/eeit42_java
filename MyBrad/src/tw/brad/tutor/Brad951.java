package tw.brad.tutor;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.myclass.Student;

public class Brad951 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		String sql = "SELECT * FROM member WHERE id = ?";
		
		try(Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/iii", prop)) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 16);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				InputStream in = rs.getBinaryStream("student");
				ObjectInputStream oin = new ObjectInputStream(in);
				Object obj = oin.readObject();
				oin.close();
				
				if (obj instanceof Student) {
					System.out.println("I am student");
					Student s1 = (Student)obj;
					System.out.println(s1);
					System.out.println(s1.score());
					System.out.println(s1.avg());
					System.out.println(s1.getBike().getSpeed());
				}
				
			}else {
				System.out.println("data not exist");
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
