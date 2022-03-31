package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class Brad97 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Page: ");
		int page = scanner.nextInt();
		int rpp = 10; // ROW PER Page
		int start = (page -1) * rpp;
		
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		String presql = "SELECT * FROM foods ORDER BY id LIMIT %d ,%d";
		String sql = String.format(presql, start, rpp);
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/iii", prop)) {
			PreparedStatement ps = conn.prepareStatement(
					sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			
			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			
			ResultSet rs = ps.executeQuery();
			rs.last(); int rowCount = rs.getRow(); System.out.println(rowCount);
			
			rs.beforeFirst();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				
				System.out.println(id + " : " + name);
				
				jw.object();
				jw.key("id"); jw.value(id);
				jw.key("name"); jw.value(name);
				jw.key("addr"); jw.value(addr);
				jw.key("tel"); jw.value(tel);
				jw.endObject();
			}
			
			jw.endArray();
			System.out.println(jw.toString());
			
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
