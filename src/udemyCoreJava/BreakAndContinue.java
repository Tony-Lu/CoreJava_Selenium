package udemyCoreJava;

public class BreakAndContinue {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
//			System.out.println(i);
			if(i>=5 && i<=8)
				continue;		// to skip some numbers
			System.out.println(i);
		}
		
//		System.out.println("no loop");
		

	}

}
