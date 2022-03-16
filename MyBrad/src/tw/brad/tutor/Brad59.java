package tw.brad.tutor;

import java.io.File;
import java.io.FileInputStream;

public class Brad59 {

	public static void main(String[] args) {
		try {
			File f1 = new File("dir1/file1");
			FileInputStream fin = new FileInputStream(f1);
			byte[] b = new byte[(int)f1.length()];
			fin.read(b);
			System.out.println(new String(b));
			fin.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
