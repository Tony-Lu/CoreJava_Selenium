package timJava.codingExercise;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(12321));
		

	}
	
	public static boolean isPalindrome(int number) {
		
		int reverse = 0;		
		int originNumber = number;
		while(number!=0) {
			int lastDigit = number%10;	// get the last digit 			
			reverse = reverse * 10;
			reverse = reverse + lastDigit;
			number=number/10;			
		}
		if(reverse==originNumber) {
			return true;
		}else {
			return false;
		}
	}

}
