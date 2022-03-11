package tw.brad.tutor;

public class Brad42 {
	public static void main(String[] args) {
		Brad422.m3();
	}
}

class Brad421 {
	static {
		System.out.println("static Brad421{}");
	}
	{
		System.out.println("Brad421{}");
	}
	Brad421(){
		System.out.println("Brad421()");
	}
	void m1() {
		System.out.println("Brad421:m1()");
	}
	static void m2() {
		System.out.println("Brad421:static m2()");
	}
}
class Brad422 extends Brad421 {
	static void m3() {
		System.out.println("Brad422: static m3()");
	}
}
