package timJava;

public class DataTypes {

	public static void main(String[] args) {

		// below is for primitive 8 data types: byte, short, int, long:+ float, double, char boolean
		
		
		int d1=2_147_483_647;								// width: 32
		byte b1=127;	// range -128 - 127, more efficient		// width: 8
		byte new1=(byte) (d1/2);  // cast byte, then java will treat it as byte		
		short s1=32767;		// width: 16 		
		long l1=9_234_345_345_234l;  // width: 64
		
		// assignment:
		//1. create a byte, short, int, variable and set it to any valid byte number:
		byte b2 = 10;
		short s2 = 20;
		int i1 = 50;
		
		// 2. create a variable of type of long, and make it equal to 50000 + 10 times sum of the byte, 
		//    plus the short plus the int
		long l2 = 50000+10*(b2+s2+i1);
//		System.out.println(l2);
		short sTotal = (short)(1000+10*(b2+s2+i1));  // short vs long !!
//		System.out.println(sTotal);
		
		// below is for primitive data types:  Float and Double:
		int ii=5/3;
		float f1 = 5f/3f;		// 8 decimals
		double dd=5d/3d;		// 16 decimals
		
		// assignment:
		// 1. create a variable to store the number of pounds
		// 2. calculate the number of kilograms for the number above and store in a variable
		// 3. print out the result
		// notes: 1 pound = 0.45359237 kilograms.
		
		double pounds = 200d;
		double kilograms = pounds * 0.45359237d;
//		System.out.println(kilograms);
		
		// below is primitive : Char and Boolean:
		
		char chr = '\u00A9';	// width: 16 = 2 bytes
		// https://unicode-table.com/en/#basic-latin
//		System.out.println(chr);
		char chr2 = '\u00AE';	
//		System.out.println(chr2);
//		
		// non-primitive: String
		
		String aa = "\u00AE 2015";
//		System.out.println(aa);
		
		// operator:
		int result = 5 % 3;		// remainder: 
		result +=2;		// = result +2
		result *=10;	// = result * 10
		result -=10;	// = result - 10
		result /=10;	// = result / 10
//		System.out.println(result);
		
		boolean isCar = false;
		if(isCar) 
			System.out.println("It is not an alien");
		
		boolean wasCar = isCar ? true : false;
		if(isCar)
		System.out.println("isCar is true");
		
		// assignment: 
		double dd3=20d;
		double dd4=80d;
		double newRes = (dd3 + dd4) * 25;
		System.out.println(newRes);
		double secondRes = newRes % 40;
		System.out.println(secondRes);
		if(secondRes<= 20)
			System.out.println("Total was over the limit : ");
			
		
		
		
	}

}
