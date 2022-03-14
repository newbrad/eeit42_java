package tw.brad.tutor;

public class Brad48 {
	public static void main(String[] args) {
		Brad481 obj1 = new Brad482();
		Brad481 obj2 = new Brad483();
		test(obj1);
		test(obj2);
		Brad484 obj3 = new Brad483();
		obj3.m5();
		
	}
	static void test(Brad481 obj) {
		obj.m1();
		obj.m2();
	}
}

interface Brad481 {
	void m1();
	void m2();
}
class Brad482 implements Brad481 {
	public void m1() {System.out.println("Brad482:m1()");}
	public void m2() {System.out.println("Brad482:m2()");}
	void m3() {}
}
class Brad483 implements Brad481, Brad484 {
	public void m1() {System.out.println("Brad483:m1()");}
	public void m2() {System.out.println("Brad483:m2()");}
	void m4() {}
	public void m5() {System.out.println("Brad483:m5()");}
}
interface Brad484 {
	void m5();
}

interface Brad485 extends Brad481, Brad484 {
	
}




