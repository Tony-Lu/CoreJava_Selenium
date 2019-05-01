package timJava.codingExercise;

public class MegaBytesConverter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(5000);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if(kiloBytes>=0) {
			
			int mbResult = kiloBytes / 1024;
			int remainderResult = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + mbResult + " MB and " + remainderResult + " KB");
			
			
		}else if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}
		
	}

}
