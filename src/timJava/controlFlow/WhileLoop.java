package timJava.controlFlow;

public class WhileLoop {

	public static void main(String[] args) {

		System.out.println(isEvenNumber(208));
//		int count =0;
//		while(count!=5) {
//			System.out.println("value is :" + count);
//			count++;
//		}
//		int count =1;
//		while(true) {
//			if(count ==5) {
//				break;
//			}
//			System.out.println("value is :" + count);
//			count++;
//		}		
//		int count=6;
//		do {
//			System.out.println("value is :" + count);
//			count++;
//			if(count>100) {
//				break;
//			}
//		}while(count!=6);

		int number = 4;
		int finishNumber = 20;
		int evenNumberFound = 0;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;		// continue = bypass the remaining lines of code
			}
			System.out.println("Even number " + number);
			evenNumberFound++;
			if (evenNumberFound >= 5) {
				break;
			}
		}
		System.out.println("total even numbers found = :" + evenNumberFound);

	}

	// assignment:
	public static boolean isEvenNumber(int a) {

		if (a < 0) {
			return false;
		}
		if (a >= 0 && a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// challenge:

}
