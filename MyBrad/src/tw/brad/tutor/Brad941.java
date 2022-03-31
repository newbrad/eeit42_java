package tw.brad.tutor;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Brad941 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		String sql = "SELECT * FROM member WHERE id = ?";
		try (Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/iii", prop)){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 16);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				Blob blob = rs.getBlob("icon");
				
				FileOutputStream fout = 
					new FileOutputStream("dir2/icon.png");
				BufferedInputStream bin = 
					new BufferedInputStream(blob.getBinaryStream());
				byte[] buf = new byte[4*1024]; int len;
				while ((len = bin.read(buf)) != -1) {
					fout.write(buf, 0, len);
				}
				bin.close();
				fout.flush();
				fout.close();
				System.out.println("Fetch OK");
			}else {
				System.out.println("data not exist");
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
