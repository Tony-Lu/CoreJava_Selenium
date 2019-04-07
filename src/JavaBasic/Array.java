package JavaBasic;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		int a[]=new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=5;
		a[3]=7;
		a[4]=78;
		int sum=a[0];
		int d[]={2,4,5,7,78};
		for(int i=0;i<a.length;i++) {
			if(sum>a[i]) {
				sum=a[i];
			}
		}
		System.out.println("First Test result is: "+sum);
		
		// multidemensional array:		data matrix:
		int b[][]=new int[2][3];

		b[0][0]=2;
		b[0][1]=4;
		b[0][2]=5;
		b[1][0]=7;
		b[1][1]=56;
		b[1][2]=78;
		int min=b[0][0];
		
		int c[][]={{2,4,5},{7,56,78}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
//				System.out.println(b[i][j]);
				if(min<b[i][j]) {
					min=b[i][j];
				}
			}
		}
		System.out.println("Second Test result is: "+min);
		
		ArrayList<String> arrNew = new ArrayList<String>();
		arrNew.add("abc");
		arrNew.add("java");
		arrNew.add("tank");
		System.out.println(arrNew.get(2));
		System.out.println(arrNew.contains("test"));
		System.out.println(arrNew.indexOf("tank"));
		arrNew.size();
		arrNew.isEmpty();
		arrNew.set(2, "test");
		System.out.println(arrNew);
		

	}

}
