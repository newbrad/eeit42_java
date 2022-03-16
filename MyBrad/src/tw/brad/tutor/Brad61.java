package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad61 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try (FileOutputStream fout = new FileOutputStream("dir2/coffee.jpg");
				FileInputStream fin = new FileInputStream("dir1/coffee.jpg")){
			
			int d;
			while ( (d = fin.read()) != -1) {
				fout.write(d);
			}
			fout.flush();
			System.out.println("Finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
