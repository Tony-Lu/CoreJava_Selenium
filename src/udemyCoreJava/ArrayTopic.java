package udemyCoreJava;

public class ArrayTopic {

	public static void main(String[] args) {

		int salary[]=new int[10];
		
		
		int rows=3;
		int cols =3;
		
		int table[][] = new int[rows][cols];
		
		table[0][0]=10;
		
		try {
			int div = 10/2;
			System.out.println(div);
		} catch (Throwable t) {		// Throwable, Exception, Error 
			System.out.println("error occurred");
			t.printStackTrace();
		}
		
		

	}

}
