package tw.brad.tutor;

public class Brad39 {

	public static void main(String[] args) {
		System.out.println("Hello, World".charAt(4));
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s1.equals(s4));
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj2;
		System.out.println(obj1.equals(obj2));
		
		String s5 = s1.concat("Chao");
		System.out.println(s1);
		System.out.println(s5);
		
		String s6 = "0123456789";
		System.out.println(s6.substring(1, 7));
		
	}

}
