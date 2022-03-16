package tw.brad.tutor;

import java.util.HashSet;

public class Brad69 {

	public static void main(String[] args) {
		HashSet<Integer> lottery = new HashSet<>();
		while (lottery.size()<6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery.toString());
	}

}
