package tw.brad.myclass;

public class MyClass01 {
	public int var1;
	public String name;
	
	public MyClass01() {
		System.out.println("MyClass01()");
		var1 = 123;
		name = "Brad";
	}
	
	public MyClass01(int a) {
		System.out.println("MyClass01(int)");
		var1 = a;
		name = "OK";
	}
	
	public void m1() {
		System.out.println("MyClass:m1()");
	}
	
	public void m2() {
		System.out.println("MyClass:m2()");
	}
	
}
