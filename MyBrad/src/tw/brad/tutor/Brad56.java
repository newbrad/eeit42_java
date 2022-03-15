package tw.brad.tutor;

import java.io.File;
import java.io.IOException;

public class Brad56 {

	public static void main(String[] args) {
		File f1 = new File("d:/brad/test3");
		if (f1.exists()) {
			System.out.println("OK");
		}else {
//			try {
//				f1.createNewFile();
//			}catch(IOException e) {
//				System.out.println(e.toString());
//			}
			
			f1.mkdir();
			
			System.out.println("XX");
		}
	}

}
