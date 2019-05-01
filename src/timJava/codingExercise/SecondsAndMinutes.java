package timJava.codingExercise;

public class SecondsAndMinutes {

	public static void main(String[] args) {

		System.out.println(getDurationString(61, 0));
		
		getDurationString(500);

	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes<0 || (seconds<0 && seconds>59)) {
			System.out.println("Invalid value");
		}		
		int hourResult = minutes / 60;
		int remainingMinutes = minutes % 60;
		String result = hourResult + "h " + remainingMinutes + "m " + seconds + "s";
		System.out.println(result);
		return result;		
	}
	
	public static String getDurationString(int seconds) {
		if(seconds<0) {
			System.out.println("Invalid value");
		}		
		int minutesResult = seconds / 60;
		int remainingSeconds = seconds % 60;
		String result = minutesResult + "m " + seconds + "s";
		System.out.println(result);
		return getDurationString(minutesResult, remainingSeconds);		
	}

}
