package timJava.controlFlow;

public class LoopCalculate {

	public static void main(String[] args) {

		for (double i = 1; i < 7; i +=1) { // init; termination; increment

			System.out.println(String.format("%.2f", calculateInterest(10000, i)));
		}

		int count = 0;
		for (int a = 1360; a < 1374; a++) {
			if (isPrime(a)) {
				count++;
				switch (count) {
				case 1:
				case 2:
				case 3:
					System.out.println(a + " is a prime number");
				case 4:
					break;
				}
			}
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
