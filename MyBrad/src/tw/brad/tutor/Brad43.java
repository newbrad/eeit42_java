package tw.brad.tutor;
public class Brad43 {
	public static void main(String[] args) {
		Brad431 obj1 = new Brad431();
		obj1.m1((byte)1);
		obj1.m1(1.2F);
		//obj1.m1((byte)1, (byte)1);
		//obj1.m1((Brad4312)(Brad4311)new Brad4313());
	}
}
class Brad4311 {}
class Brad4312 extends Brad4311 {}
class Brad4313 extends Brad4311 {}
class Brad43121 extends Brad4312{}

class Brad431 {
	void m1() {System.out.println("Brad431:m1()");}
	void m1(byte a) {System.out.println("Brad431:m1(byte)");}
	void m1(int a){System.out.println("Brad431:m1(int)");}
	void m1(float a){System.out.println("Brad431:m1(float)");}
	void m1(double a){System.out.println("Brad431:m1(double)");}
	void m1(byte a, int b) {System.out.println("Brad431:m1(byte,int)");}
	void m1(int a, byte b) {System.out.println("Brad431:m1(int,byte)");}
	void m1(Brad4312 a) {System.out.println("1");}
}

