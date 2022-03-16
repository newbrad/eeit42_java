package tw.brad.tutor;

import java.util.LinkedList;

public class Brad71 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);list.add(1);list.add(2);list.add(3);list.add(1);
		System.out.println(list.size());
		System.out.println(list);
		list.add(3, 7);
		System.out.println(list);
		list.set(3, 4);
		System.out.println(list);
		//list.add(10, 8);
	}

}
