package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad68 {
	public static void main(String[] args) {
		Brad683 obj = new Brad683();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/b683.brad"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("------");
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("dir1/b683.brad"));
			Brad683 obj1 = (Brad683)oin.readObject();
			oin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Brad681 {
	Brad681(){System.out.println("Brad681()");}
}
class Brad682 extends Brad681 implements Serializable{
	Brad682(){System.out.println("Brad682()");}
}
class Brad683 extends Brad682 {
	private Brad684 b684;
	Brad683(){b684 = new Brad684(); System.out.println("Brad683()");}
}
class Brad684 implements Serializable{}
