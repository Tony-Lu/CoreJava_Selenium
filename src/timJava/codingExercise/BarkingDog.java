package timJava.codingExercise;

public class BarkingDog {

	public static void main(String[] args) {	
		
		shouldWakeUp(true, 0);

	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if(barking == true && hourOfDay >=0 && hourOfDay<8 || hourOfDay>22 && hourOfDay<24 ) {
			System.out.println("true");
			return true;
		}else if(barking == true && hourOfDay<0 || hourOfDay>23) {
			System.out.println("false");
			return false;
		}else if(barking == false) {
			System.out.println("false");
			return false;
		}		
		System.out.println("false");
		return false;
	}

}
