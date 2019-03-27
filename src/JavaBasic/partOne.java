package JavaBasic;

public class partOne {
	
	public static void main(String[] args) {
		
		int[] arr= {23,34,5,78,12,15,24};
		
		int var = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<var) {
				var=arr[i];
			}
		}
		System.out.println(var);
		
		int a=2;
		int b=a--;//++a means : a=a+1 // this is pre decrement/increment
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		int d=2;
		int e=--d;//x++ means : x=x+1 // this is post decrement/increment
		
		System.out.println(d);
		System.out.println(e);
		
		// object array, Object is class
		Object ob[] = new Object[6];
		
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]="M";
		ob[5]="London";
		
		System.out.println(ob[5]);
		
		Object[] axx= {12,"Tom",12.33,"1/1/1990", "M","London"};
			System.out.println(axx[3]);
		
			System.out.println("**************************************");
			
		String x[][] = new String[3][5];
		System.out.println(x.length); //3
		System.out.println(x[0].length);//4
		
		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		x[0][3] = "d";
		x[0][4] = "e";
		
		x[1][0] = "a1";
		x[1][1] = "b1";
		x[1][2] = "c1";
		x[1][3] = "d1";
		x[1][4] = "e1";
		
		x[2][0] = "a2";
		x[2][1] = "b2";
		x[2][2] = "c2";
		x[2][3] = "d2";
		x[2][4] = "e2";
		
		System.out.println(x[1][2]);
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
			
			
		}
	}
	
	
	

