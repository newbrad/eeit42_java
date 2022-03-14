package tw.brad.tutor;

public class Brad44 {
	public static void main(String[] args) {
		Brad441 obj1 = new Brad441();
		Brad4412 obj2 = new Brad4412();
		Brad441 obj3 = new Brad4412();
		//Brad4412 obj4 = (Brad4412)new Brad441();
		obj1.m2(1);
		obj2.m2(1);
		obj3.m2(1);
		Brad441 obj5 = obj2;
		System.out.println(obj5 == obj2);
		
	}
}
class Brad441 {
	void m1() {System.out.println("Brad441:m1()");}
	void m2(int a) {System.out.println("Brad441:m2(int)");}
}
class Brad4412 extends Brad441{
	public void m2(int a) {
		System.out.println("Brad4412:m2(int)");
	}
	void m3() {System.out.println("Brad4412:m3()");}
}
