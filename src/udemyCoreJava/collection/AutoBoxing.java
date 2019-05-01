package udemyCoreJava.collection;

public class AutoBoxing {

	public static void main(String[] args) {
		int var = 10;
		
		Integer obj = new Integer(var); // this is called: wrapping --->: autoboxing
		System.out.println(obj);
		
		int i = obj;  // unwrapping:  --> unboxing

	}

}
