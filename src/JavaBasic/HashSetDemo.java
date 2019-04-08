package JavaBasic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		//HashSet, TreeSet, LinkedHashSet
		//does not accept duplicate values;
		// data inside in random order;
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("text1");
		hs.add("test2");
		hs.add("test3");
		hs.add("test4");
		hs.add("test5");
		hs.add("test5");
		hs.add("test5");
		
		Iterator<String> it = hs.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}
