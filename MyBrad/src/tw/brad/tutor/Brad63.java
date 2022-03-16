package tw.brad.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad63 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File source = new File("dir1/coffee.jpg");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream("dir2/coffee3.jpg");
			fout.write(buf);
			fout.flush();
			fout.close();
			
			System.out.println("Finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
