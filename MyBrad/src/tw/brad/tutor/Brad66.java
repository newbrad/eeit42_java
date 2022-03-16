package tw.brad.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.brad.myclass.Student;

public class Brad66 {
	public static void main(String[] args) {
		Student s1 = new Student("Brad", 90, 40, 50);
		System.out.println(s1.toString() + ":" + s1.avg());
		try {
			FileOutputStream fout = 
				new FileOutputStream("dir1/student.brad");
			ObjectOutputStream oout =
				new ObjectOutputStream(fout);
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
