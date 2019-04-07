package JavaBasic;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "morning");
		hm.put(12, "noon");
		hm.put(3, "afternoon");
		hm.put(4, "evening");
		System.out.println(hm.get(12));
		
		
		

	}

}
