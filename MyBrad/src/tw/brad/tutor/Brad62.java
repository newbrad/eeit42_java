package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad62 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir2/coffee1.jpg");
			FileInputStream fin = new FileInputStream("dir1/coffee.jpg");
			
			byte[] buf = new byte[4*1024]; int len;
			
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("Finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
