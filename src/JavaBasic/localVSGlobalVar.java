package JavaBasic;

public class localVSGlobalVar {
	
	// global vars:
	String name = "Tom";
	int age = 25;
	
	
	
	public static void main(String[] args) {
		
		int i =10; // local var
		System.out.println(i);
		
		localVSGlobalVar obj = new localVSGlobalVar();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}
	
	public void sum() {			// local var too
		int i=22;
		int j=20;		
		
		
		
	}

}
