package tw.brad.tutor;

import tw.brad.myclass.BCrypt;

public class Brad91 {

	public static void main(String[] args) {
		String pass = "123456";
		String hashPass = BCrypt.hashpw(pass, BCrypt.gensalt());
		System.out.println(hashPass);
		System.out.println(hashPass.length());
		if (BCrypt.checkpw("654321", hashPass)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
