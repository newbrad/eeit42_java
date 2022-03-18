package tw.brad.tutor;

public class Brad75 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		mt1.start();
		mt2.start();
		System.out.println("Brad");
	}
}
class MyThread extends Thread {
	private String name;
	public MyThread(String name) {this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
		}
	}
}
