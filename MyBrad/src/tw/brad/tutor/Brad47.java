package tw.brad.tutor;

public class Brad47 {
	public static void main(String[] args) {
		//Brad471 obj1 = new Brad471();
		Brad472 obj2 = new Brad472();
		obj2.m1(); obj2.m2();obj2.m3();
		Brad471 obj1 = new Brad472();
		obj1.m2();
	}	
}

abstract class Brad471 {
	Brad471(){System.out.println("Brad471()");}
	void m1() {System.out.println("Brad471:m1()");}
	abstract void m2();
}
class Brad472 extends Brad471 {
	Brad472(){System.out.println("Brad472()");}
	void m2() {System.out.println("Brad472:m2()");}
	void m3() {}
}


