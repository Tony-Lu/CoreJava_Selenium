package timJava.codingExercise;

public class SpeedConverter {

	public static void main(String[] args) {

		printConversion(0);

	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
			return -1;
		} else if (kilometersPerHour > 0) {
			return Math.round(kilometersPerHour / 1.609);
		}

		return 0;
	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour >= 0) {
			long milesPerHour = Math.round(kilometersPerHour / 1.609);
			System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
		}else if (kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}
			
	}

}
