package tw.brad.tutor;

import java.io.FileInputStream;

public class Brad59 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1");
			byte[] b = new byte[3];
			int len;
			while ( (len = fin.read(b)) != -1) {
				System.out.print(new String(b,0,len));
			}
			fin.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
