package timJava.codingExercise;

public class SumChallenge {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
//				System.out.println("Number " + i + " match the requirement");
				sum += i; // sum=sum+i;
				count++;
			}
			if (count == 5) {
				break;
			}
		}
		System.out.println(sum);

		System.out.println(sumOdd(100,1000));
		
		System.out.println("===================================");
		
		
	}

	public static boolean isOdd(int number) {
		if (number <= 0) {
			return false;
		}
		if (number > 0 && number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int sumOdd(int start, int end) {
		if (end < start || (start < 0 && end < 0)) {
			return -1;
		}
		int sum = 0;	
		if((end >= start) && (start>0 && end>0)) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum += i;
				}								
			}
			return sum;
		}else {
			return -1;
		}
	}
	
	
}
