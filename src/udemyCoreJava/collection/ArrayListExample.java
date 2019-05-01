package udemyCoreJava.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {


		ArrayList list = new ArrayList();		
		
		list.add(10);
		list.add("Test");
		list.add(12.25);
		list.add('c');
		list.add(true);
		list.add(false);
		list.add("Test");
		System.out.println(list);
		System.out.println(list.size());
//		list.remove(3);
		
		//how to fetch the value from a list:
//		System.out.println(list.get(0));
		Object data1 = list.get(1);		// this is an object, not an int !!!
		int data2 = (Integer) list.get(0);   // convert object value to an int
		System.out.println(data1);
		System.out.println(data2);
		
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		// another way of loop:
//		for(Object var:list) {
//			
//			System.out.println(var);
//		}
		
		// using iterator to fetch the object data:
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}

}
