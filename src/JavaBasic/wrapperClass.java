package JavaBasic;

public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		
		System.out.println(x+20);
		
		//data convert : String to int
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		
		// Integer, Double,  Boolean
		
		//String to: double
		String y = "12.33";
		double d = Double.parseDouble(y);
		
		//String to boolean
		String k = "true";
		boolean b=Boolean.parseBoolean(k);
		
		//int to String
		int j = 200;
		String.valueOf(j);
		
		String u = "100A";
		
		//Integer.parseInt(u);	// this will popup exception in thread: NumberFormatException
		// below is to get by subString:
		String uVal = u.substring(0,3);	// 	the end index should be not included 
		String uValNew = u.substring(0, u.lastIndexOf("A"));
		System.out.println(uVal);
		System.out.println(uValNew);
//		String str = "53285964@qq.com";
//		String[] strs = str.split("@");
//		for(int r=0;r<strs.length;r++){
//		    System.out.println(strs[r].toString());
//		}
		
	}

}
