package timJava.codingExercise;

public class MinutesYearsAndDaysCalculator {

	public static void main(String[] args) {

		printYearsAndDays(1440);

	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}
		if (minutes >= 0) {
			int year = (int) (minutes / (365*24*60));
			int dayRemaining = (int) (minutes / (24*60)) % 365;			
			String result = minutes + " min = " + year + " y and " + dayRemaining + " d";
			System.out.println(result);
		}
	}

}
