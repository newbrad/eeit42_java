package tw.brad.tutor;

public class Brad50 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		int[] d = {1,2,3,4};

		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[1000000]);
		}catch (Exception e1) {
			System.out.println("error2");
		}
		System.out.println("Game Over");
	}

}
