package JavaBasic;

public class staticNonStatic {
	
	String name = "Tom";	// non-static global var
	static int age = 25;	// static global var
	
	
	public static void main(String[] args) {
		

		//how to call static methods and vars?
		//1. call directly;
		sum();
		// call by class name:
		staticNonStatic.sum(); 
		
		System.out.println(age);
		System.out.println(staticNonStatic.age);

		
		//how to call non-static methods and vars?
		staticNonStatic obj = new staticNonStatic();	// here: obj , does not include "static" methods !!!
		obj.sendMain();
		System.out.println(obj.name);
		
		// can I access static methods by using object reference ?  ++ Yes
		obj.sum();	// warning will be given, BUT this is un-necessary,  !!!!
		
		
		
	}
	
	public void sendMain() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
		
	}
	

}
