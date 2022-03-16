package tw.brad.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Brad70 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Brad");
		set.add(123);	// auto-boxing
		set.add(12.3);	// 
		set.add("Brad");
		System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("---");
		for (Object obj : set) {
			System.out.println(obj);
		}
	}

}
