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
	        
	        String ss = "jkdjflkdsf";
	        System.out.println(ss.indexOf(3));
	        // print out reverse:
	        String reverse = new StringBuffer(ss).reverse().toString();
	        System.out.println("before reverse: "+ss);
	        System.out.println("after reverse: "+reverse);
	        
	        
	        String xx ="jdkfdjslflfls";
//	        String re=new StringBuffer(xx).reverse().toString();
//	        System.out.println(re);
	        String t="";
	        for(int i=xx.length()-1;i>=0;i--) {
//	        	System.out.print(xx.charAt(i));
	        	t=t+xx.charAt(i);
	        }
	        System.out.println(t);
	        
	        
	}

}
