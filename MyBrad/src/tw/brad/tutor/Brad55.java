package tw.brad.tutor;

import java.lang.instrument.IllegalClassFormatException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;

public class Brad55 {
	public static void main(String[] args) throws Exception{

	}
}
class Brad551 {
	void m1() throws ExecutionException, GeneralSecurityException {}
}
class Brad552 extends Brad551 {
	//void m1() throws IllegalClassFormatException {}
}
class Brad553 extends Brad552 {
	void m1() {}
}
