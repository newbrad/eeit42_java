package tw.brad.tutor;

import tw.brad.myclass.TWId;

public class Brad41 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		if (TWId.isValid("A123456789")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
