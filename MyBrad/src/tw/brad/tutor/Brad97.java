package tw.brad.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class Brad97 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");prop.put("password", "root");
		
		String sql = "SELECT * FROM foods ORDER BY id LIMIT 4";
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/iii", prop)) {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				
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
