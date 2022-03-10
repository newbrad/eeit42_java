package tw.brad.tutor;

import tw.brad.myclass.MyCalcV1;

public class Brad35 {

	public static void main(String[] args) {
		MyCalcV1 obj1 = new MyCalcV1();
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		System.out.println(obj1.add());
		System.out.println(obj1.minus());
		System.out.println(obj1.minus(true));
		System.out.println("---");
		MyCalcV1 obj2 = new MyCalcV1(10,3);
		System.out.println(obj2.getA());
		System.out.println(obj2.getB());
		System.out.println(obj2.add());

	}

}
