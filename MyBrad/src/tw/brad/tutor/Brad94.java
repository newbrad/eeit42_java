package tw.brad.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Brad94 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root"); prop.put("password", "root");
		String sql = "UPDATE member SET icon = ? WHERE id = ?";
		
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/iii", prop)){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			File file = new File("dir1/ball.png");
			if (file.length() <= 60*1000) {
				pstmt.setBlob(1, new FileInputStream(file));
				pstmt.setInt(2, 16);
				int n = pstmt.executeUpdate();
				if (n > 0) {
					System.out.println("Update Success");
				}else {
					System.out.println("Update Failure");
				}
			}else {
				System.out.println("File too big");
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
