package tw.brad.tutor;

import java.io.FileReader;

public class Brad64 {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("dir1/file1")){
			int c;
			while ( (c = reader.read()) != -1 ) {
				System.out.println((char)c);
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
