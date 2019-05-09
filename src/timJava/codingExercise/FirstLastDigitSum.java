package timJava.codingExercise;

public class FirstLastDigitSum {

	public static void main(String[] args) {

//		System.out.println(printFactors(6));
//		int a = 12589;
//		int b = a%10;
//		System.out.println(b);
		
		
		printFactors(10);

	}

	public static int sumFirstAndLastDigit(int number) {

		int lastDigit;
		int sum = 0;
		int reverse = 0;
		int finalLastDigit = number % 10;
		int firstDigit = 0;
		while (number > 0) {
			firstDigit = number % 10;
			number = number / 10;
		}
		sum = firstDigit + finalLastDigit;
		if (number < 0) {
			return -1;
		} else {
			return sum;
		}
	}

	//
	// Even digit sum

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		int eachDigit = 0;
		while (number != 0) {
			eachDigit = number % 10;
			if (eachDigit % 2 == 0) {
				sum = sum + eachDigit;
			}
			number = number / 10;
		}
		return sum;
	}

	// shared Digit

	public static boolean hasSharedDigit(int aa, int bb) {

		if ((aa < 10 || aa > 99) || (bb < 10 || bb > 99)) {
			return false;
		}

		int aaLastDigit = aa % 10;
		int aaFirstDigit = aa / 10;
		int bbLastDigit = bb % 10;
		int bbFirstDigit = bb / 10;

		if ((aaLastDigit == bbLastDigit) || (aaLastDigit == bbFirstDigit) || (aaFirstDigit == bbLastDigit)
				|| (aaFirstDigit == bbFirstDigit)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasSameLastDigit(int a, int b, int c) {

		if ((isValid(a) == false) || (isValid(b) == false) || (isValid(c) == false)) {
			return false;
		}

		int lastDigit_a = a % 10;
		int lastDigit_b = b % 10;
		int lastDigit_c = c % 10;

		if ((lastDigit_a == lastDigit_b) || (lastDigit_a == lastDigit_c) || (lastDigit_b == lastDigit_c)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isValid(int x) {

		if (x < 10 || x > 1000) {
			return false;
		} else {
			return true;
		}

	}

	// greatest common divisor
	public static int getGreatestCommonDivisor(int first, int second) {

		if (first < 10 || second < 10) {
			return -1;
		}

		if(first==second) {
			return first;
		}
		int gcd=0;
		int minimum=0;
		if(first<second) {
			minimum=first;
		}else {
			minimum=second;
		}
		
		for(int i=1;i<=minimum;i++) {
			if(first%i==0 && second%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static void printFactors(int number) {		
		if(number<1) {
			System.out.println("Invalid Value");
		}
		int eachFactor;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				eachFactor=i;
				System.out.println(eachFactor);
			}			
		}		
	}

}
