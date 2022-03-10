package tw.brad.tutor;

import tw.brad.myclass.MyClass01;

public class Brad34 {

	public static void main(String[] args) {
		MyClass01 obj1 = new MyClass01();
		System.out.println(obj1.var1 + obj1.name);
		
		MyClass01 obj2 = new MyClass01(777);
		System.out.println(obj2.var1 + obj2.name);
	}

}
