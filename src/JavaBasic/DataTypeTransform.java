package JavaBasic;

public class DataTypeTransform {

	public static void main(String[] args) {

		String number = "123456";

        int num1 = Integer.parseInt(number);

        int num2 = new Integer(number);

        int num3 = Integer.valueOf(number).intValue();
	        System.out.println(num1);
	        System.out.println(num2);
	        System.out.println(num3);
	}

}
