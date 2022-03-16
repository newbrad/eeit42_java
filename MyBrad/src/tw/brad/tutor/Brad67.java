package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.brad.myclass.Student;

public class Brad67 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/student.brad"));
			Object obj = oin.readObject();
			oin.close();
			
//			if (obj instanceof String) {
//				System.out.println("OK");
//			}else {
//				System.out.println("XX");
//			}

			Student s1 = (Student)obj;
			System.out.println(s1.toString());
			System.out.println(s1.score());
			System.out.println(s1.avg());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
