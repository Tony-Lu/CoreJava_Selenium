package udemyCoreJava.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {


		Map<String,String> map = new HashMap<String,String>();
		map.put("firstname", "Tony");
		map.put("lastname", "Test");
		map.put("test", "Sub");
		map.put("Select","test");
		System.out.println(map);
		
		System.out.println(map.get("firstname"));
		
		Set<String> keys = map.keySet();
		// how to retrieve data from hashmap:
		for(String key:keys) {
			System.out.println("Key ---> "+key+" value is -->"+map.get(key));
		}
		
		//how to store a list of data under one variable ?
		Map<String,List<String>> map1=new HashMap<String,List<String>>();
		
		List<String> listEmails = new ArrayList<String>();
		listEmails.add("Test1.de@gmail.com");
		listEmails.add("Test2.de@gmail.com");
		listEmails.add("Test3.de@gmail.com");
		listEmails.add("Test4.de@gmail.com");
		
		map1.put("email", listEmails);
		
		System.out.println(map1.get("email"));
		
		
		
		

	}

}
