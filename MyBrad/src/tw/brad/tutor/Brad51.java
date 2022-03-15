package tw.brad.tutor;

import javax.xml.datatype.DatatypeConfigurationException;

public class Brad51 {

	public static void main(String[] args) {
		try {
			test1();
		}catch(Exception e) {
			
		}
		test2();
		
		try {
			test1();
		}catch(Exception e) {
			
		}
	}
	
	static void test1() throws DatatypeConfigurationException{
		try {
			throw new DatatypeConfigurationException();
		}catch (Exception e) {
			// 寫死了
		}
	}
	static void test2() throws RuntimeException {
		throw new RuntimeException();
	}
}
