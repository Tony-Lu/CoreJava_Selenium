package udemyCoreJava.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Constructor;



public class Home {

	public static void main(String[] args) {
		Test t = new Test();
		Class clazz = t.getClass();
		
		System.out.println(clazz.getSimpleName());
		
		//get constructor name:
		Constructor[] cons = clazz.getDeclaredConstructors();
		System.out.println(cons.length);
		
		for(Constructor con:cons) {
			System.out.println(con.getName());	// print out constructors names
		}
		
		
		Method[] arrayofMethods = clazz.getDeclaredMethods();	// reflect can access : private method in different class
		System.out.println(arrayofMethods.length);
		
		for(Method m: arrayofMethods) {
			System.out.println("Class name is:  " + m.getName()+" | return type is:  "+m.getReturnType());
			
			Parameter[] param = m.getParameters();
			
			for(Parameter para:param) {
				System.out.println(para.getName());
				
			}
		}
		
		// how to add testcase name in TestNG execution, into a log file:
//		@BeforeMethod
//		public void beforeMethod(Method m){
//		    (Test case expected is: m.getName())
//		}

	}

}
