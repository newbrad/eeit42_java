package tw.brad.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Brad65 {

	public static void main(String[] args) {
		try {
//			FileInputStream fin = new FileInputStream("dir1/maskdata.csv");
//			InputStreamReader ir = new InputStreamReader(fin, StandardCharsets.UTF_8);
//			BufferedReader br = new BufferedReader(ir);
			
			BufferedReader br = 
					new BufferedReader(
						new InputStreamReader(
							new FileInputStream("dir1/maskdata.csv")));
			
			
			String line;
			while ( (line = br.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println(data[1] + " : " + data[4] +" : " + data[5] );
			}
			br.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
