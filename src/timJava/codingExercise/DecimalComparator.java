package timJava.codingExercise;

public class DecimalComparator {

	public static void main(String[] args) {

		areEqualByThreeDecimalPlaces(3.1756,3.175);
		//-3.1756,-3.175
		//3.175,3.176
		//3.0,3.0
		//-3.123,3.123
		
			
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double aa, double bb) {
		
		int aaResult = (int) (aa * 1000);
		int bbResult = (int) (bb * 1000);
		
		if(aaResult == bbResult) {
			return true;
		}else
			return false;
	}

}
