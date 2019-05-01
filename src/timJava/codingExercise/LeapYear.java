package timJava.codingExercise;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println(isLeapYear(1924));

	}

	public static boolean isLeapYear(int year) {

		int div4 = year % 4;
		int div100 = year % 100;
		int div400 = year % 400;

		if (year < 1 || year > 9999) {
			return false;
		}
		if (year > 1 && year < 9999) {
			if (div4 == 0 && div100!=0 || div400==0) {
				return true;
			}
		}
		return false; 
		     
	}	

}
