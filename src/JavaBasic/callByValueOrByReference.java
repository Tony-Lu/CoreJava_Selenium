package JavaBasic;

public class callByValueOrByReference {
	
	
	int p;
	int q;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callByValueOrByReference obj = new callByValueOrByReference();
		int x = 10;
		int y=20;
		int m=obj.testSum(x, y); // call by value or pass by value
		
		System.out.println(m);
		
		obj.p = 50;
		obj.q =60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c = a+b;
		return c;
		
	}
	
	// call by reference in java, by calling object reference, passing object reference to reference
	public void swap(callByValueOrByReference t) {
		
		int temp;
		temp = t.p;	// temp=50
		t.p = t.q; // t.p =60
		t.q = temp; // t.q =50
	}

}
