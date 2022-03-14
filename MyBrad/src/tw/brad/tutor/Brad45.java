package tw.brad.tutor;

public class Brad45 {
	public static void main(String[] args) {
		BadGuy1 b1 = new BadGuy1();
		BadGuy2 b2 = new BadGuy2();
		BadGuy3 b3 = new BadGuy3();
		attack(b1);
		attack(b2);
		attack(b3);
	}
	
	static void attack(BadGuy badguy) {
		if (badguy instanceof BadGuy1) {
			System.out.print("1: ");
		}else if (badguy instanceof BadGuy2) {
			System.out.print("2: ");
		}else if (badguy instanceof BadGuy3) {
			System.out.print("3: ");
		}
		badguy.shooting();
		System.out.println();
	}
}

class BadGuy {
	void shooting() {
		System.out.println("BadGuy:shooting()");
	}
}
class BadGuy1 extends BadGuy{
	void shooting() {
		System.out.println("BadGuy1:shooting()");
	}
}
class BadGuy2 extends BadGuy{
	void shooting() {
		System.out.println("BadGuy2:shooting()");
	}
}
class BadGuy3 extends BadGuy{
	void shooting() {
		System.out.println("BadGuy3:shooting()");
	}
}