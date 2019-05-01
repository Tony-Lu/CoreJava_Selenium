package udemyCoreJava;

public class SingletonTest {
	
	private static SingletonTest instance = new SingletonTest();
	
	private SingletonTest() {
		
		System.out.println("Creating object");
		
	}
	
	public static SingletonTest getInstance() {
		return instance;
		
	}

}
