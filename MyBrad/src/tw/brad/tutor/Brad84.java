package tw.brad.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad84 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			BufferedReader reader = 
				new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
