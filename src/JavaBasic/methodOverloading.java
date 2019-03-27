package JavaBasic;

public class methodOverloading {
	
	public static void main(String[] args) {
		
		methodOverloading obj = new methodOverloading();
		
		obj.sum();
		obj.sum(3);
		obj.sum(2, 4);
		
		
	}
	
	// duplicate methods: same method name with same args, not allowed
	//can not create a method inside a method
	
	// **** we can create multiple "main" methods,
	// can we overload "main" methods ?, answer: yes, we can,
	// +++++  as long as, input data dype,  is DIFFERENT , and differenet args/input params !!!!!!! ++++++++++++++++++++
	
	//method overloading: when the method name is same with different args or input param within the same class
	public void sum() {		// 0 input param
		System.out.println("sum method");
	}
	
	public void sum(int i) {	// 1 input param
		System.out.println("sum method");
	}
	
	public void sum(int k, int l) {		//2 input param
		System.out.println("sum method with 2 inputs");
		System.out.println(k+l);
	}

}
