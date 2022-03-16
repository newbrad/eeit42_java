package tw.brad.tutor;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Brad60 {

	public static void main(String[] args) {
		String data = "Hello, World\n1234567\n7654321";
		byte[] b = data.getBytes(StandardCharsets.UTF_8);
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2");
			fout.write(b);
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
