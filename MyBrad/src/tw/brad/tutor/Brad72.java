package tw.brad.tutor;

import java.util.LinkedList;

public class Brad72 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i=0; i<10; i++) {
			list.add(0,i);
		}
		System.out.println(list);
	}

}
