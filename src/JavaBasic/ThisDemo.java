package JavaBasic;

public class ThisDemo {
	
	int a=2;
	
	public void getData() {
		
		int a=3;
		System.out.println(a);
		// this refer to current object, object scope lies in class level
		System.out.println(this.a+a);
	}

	public static void main(String[] args) {

		ThisDemo td = new ThisDemo();
		td.getData();



	}

}
