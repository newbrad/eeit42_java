package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad58 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1");
			
//			int d1 = fin.read();
//			System.out.println((char)d1);
//			d1 = fin.read();
//			System.out.println((char)d1);
//			d1 = fin.read();
//			System.out.println((char)d1);
			
			int c;
			while ((c = fin.read()) != -1 ) {
				System.out.print((char)c);
			}
			
			fin.close();
			//System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
