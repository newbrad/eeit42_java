package tw.brad.myclass;

public class MyCalcV1 {
	private int a, b;
	public MyCalcV1() {
		a = (int)(Math.random()*49+1);
		b = (int)(Math.random()*49+1);
	}
	public MyCalcV1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int add() {
		return a + b;
	}
	public int minus() {
		return a - b;
	}
	public int minus(boolean isReverse) {
		if (isReverse) {
			return b - a;
		}else {
			return a - b;
		}
	}
	public int multiple() {
		return a * b;
	}
	public int div() {
		return a / b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
}
