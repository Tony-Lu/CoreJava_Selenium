package udemyCoreJava;

public class EqualsExample {

	public static void main(String[] args) {


		String d1 = "TestExample";
		String d2 = "TestExample";	
		
		System.out.println(d1==d2);
		System.out.println(d1.contentEquals(d2));
		
		//  == conparison: object reference same, object address same
		// .equals:   content is same
		
		String n1 = new String("testData");
		String n2 = new String("testData");
		
		System.out.println(n1.equals(n2));		// true
		System.out.println(n1==n2);				// false
		
		SingletonTest s1 = SingletonTest.getInstance();
		SingletonTest s2 = SingletonTest.getInstance();	// here only 1 obj will be created, both reference are pointing the same obj

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);		// now will return: true
	}

}
