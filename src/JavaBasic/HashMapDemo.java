package JavaBasic;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {


//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); // same result as HashMap
		// difference:
		//1. HashMap: non-sync during multi-execution
		//   Hashtable: Thread safe.  sync until one thread finished, all other thread have wait for access 
		//2. Hashtable: not allowed null keys / null values
		//3. Hashtable: iterator interface not available
		//				enumerator to do iterate in Hashtable
		
		hm.put(0, "hello");
		hm.put(1, "morning");
		hm.put(12, "noon");
		hm.put(3, "afternoon");
		hm.put(4, "evening");
		hm.put(5, "");
//		System.out.println(hm.get(12));
//		hm.remove(12);
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry) it.next();			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		

	}

}
