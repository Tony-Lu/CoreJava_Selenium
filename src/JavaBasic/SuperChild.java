package JavaBasic;

public class SuperChild extends SuperParent {

	String name = "SuperTest";
	
	public SuperChild() {
		super();
		System.out.println("child class constructor");
	}
	
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData() {
		super.getData();
		System.out.println("this is in child");
	}
	
	public static void main(String[] args) {

		SuperChild cd = new SuperChild();
		
		cd.getStringData();
		cd.getData();

	}

}
