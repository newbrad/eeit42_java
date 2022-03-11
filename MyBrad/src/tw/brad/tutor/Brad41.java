package tw.brad.tutor;

import tw.brad.myclass.TWId;

public class Brad41 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		System.out.println(id1.getId());
		TWId id2 = new TWId(true);
		System.out.println(id2.getId());
		TWId id3 = new TWId(2);
		System.out.println(id3.getId());
		TWId id4 = new TWId(2, false);
		System.out.println(id4.getId());
		TWId id5 = TWId.createTWId("Y120239845");
		TWId id6 = TWId.createTWId("Y120239847");
		//TWId id7 = new TWId("Brad");
		System.out.println(id5);
		System.out.println(id6);
		//System.out.println(id7);
	}

}
