package udemyCoreJava.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(null);
		
//		list.add(12.33);	// error due to not integer value
		
		int i = list.get(0);
		System.out.println(i);

	}

}
