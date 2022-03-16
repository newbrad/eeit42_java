package tw.brad.tutor;

import java.util.HashMap;
import java.util.Set;

public class Brad73 {

	public static void main(String[] args) {
		HashMap<String,Object> person = new HashMap<String, Object>();
		person.put("name", "Brad");
		person.put("gender", true);
		person.put("weight", 80.123);
		person.put("Height", 175);
		System.out.println(person);
		Set<String> keys = person.keySet();
		for (String key: keys) {
			System.out.println(key + ":" + person.get(key));
		}
		
		
	}

}
