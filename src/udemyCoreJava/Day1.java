package udemyCoreJava;

public class Day1 {

	

	public static void main(String[] args) {

		int i = 1234567890;
		float f = 1.23256646465949f;
		long l = 12345678901234567l;
		double d = 1.23232456456456112312131;
		boolean b = true;
		char c = 'd';

		/*
		 * calculators: add, sub, mul, div 2. methods 2. return: int 3. parameters: 2
		 * int
		 * 
		 */

		Calculator cal = new Calculator();
		
		System.out.println(cal.add(3,5));
		System.out.println(cal.sub(8,3));
		System.out.println(cal.mul(3,7));
		System.out.println(cal.div(6,2));

		
		int num = (int)(Math.random()*100); // *100/5/10 can generate 
		System.out.println(num);
	}

}
