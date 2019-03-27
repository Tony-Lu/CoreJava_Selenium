package JavaBasic;

public class partTwo {
	
	// class vars:
//	int mod;
//	int wheel;	
	
	
	// main method:  --- starting point of execution
	// why main method is "void": because never returns a value
	public static void main(String[] args) {
		
		// new partTwo() ---  this is the object of partTwo class; a is object reference variables
//		partTwo a = new partTwo();
//		partTwo b = new partTwo();
//		partTwo c = new partTwo();
//		
//		a.mod = 2015;
//		a.wheel = 4;
//		
//		b.mod = 2014;
//		b.wheel = 4;
//		
//		c.mod =2013;
//		c.wheel =4;
//		
//		
//		System.out.println(a.mod);
//		
//		a=b;
//		b=c;
//		c=a;    // a is representing b, 
//		
//		a.mod=10;
//		System.out.println(a.mod);
//		c.mod=20;
//		System.out.println(a.mod);		
		
		// obj is the name of the object:new partTwo(), also obj is the representative of "new partTwo()"
		//after creating the object, the copy of all non-static methods will be given to this object
		partTwo obj = new partTwo();
		
		obj.noInputTest();
		int m=obj.pqr();
		System.out.println(m);
		String o=obj.qa();
		System.out.println(o);
		int n = obj.division(6, 3);
		System.out.println(n);
		
		
		
		
		
		
	}
	
	// non static methods
	//3 types of functions/methods:
	//1. no input, 2, only input, 3. input + output
	
	//void ---  does not return any value
	//return type = void
	public void noInputTest() {
		System.out.println("test method");
				
	}
	
	// return type = int
	public int pqr() {		// no input, some output
		
		System.out.println("pqr method");
		
		int a =10;
		int b =20;
		int c = a+b;
		
		return c;
	}
	
	//return type: String
	public String qa() {	// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	//x, y --? input parameters/arguments
	//return type: int
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
		
		
	}
	
	

}
