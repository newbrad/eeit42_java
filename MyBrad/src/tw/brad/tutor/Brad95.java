package tw.brad.tutor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import tw.brad.myclass.Bike;
import tw.brad.myclass.Student;

public class Brad95 {

	public static void main(String[] args) {
		Student s1 = new Student("brad", 70, 43, 56);
		Bike b1 = s1.getBike(); b1.upSpeed(); b1.upSpeed();
		b1.upSpeed();
		System.out.println(s1+":"+s1.score() + ":" + s1.avg() + ":" + s1.getBike().getSpeed());
		
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		String sql = "UPDATE member SET student = ? WHERE id = ?";
		
		try(Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/iii", prop)) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, 16);
			
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			ObjectOutputStream oout = new ObjectOutputStream(bao);
			oout.writeObject(s1);
			byte[] s1Ary = bao.toByteArray();
			System.out.println(s1Ary.length);
			
			pstmt.setBinaryStream(1, new ByteArrayInputStream(s1Ary));
			int n = pstmt.executeUpdate();
			if (n > 0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Failure");
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
