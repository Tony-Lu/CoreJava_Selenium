package JavaBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;;

public class PracticeBasic {

	
	
	public static void main(String[] args) {


//		int arr[] = {12,2,4,55,53,67,98};
//		
//		int var = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>var) {
//				var=arr[i];
//			}
//		}
//		System.out.println(var);
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==55) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		
		int arr[] = {1,3,6,4,1,2};
//		int arr[] = {1,2,3};
//		int arr[] = {-1,-2,-3};
//		public int solution(int[] arr) {
		
		int num=1;
		HashSet<Integer> ht = new HashSet<Integer>();
		
		for(int k=0;k<arr.length;k++) {
			ht.add(arr[k]);
		}
		while(ht.contains(num)) {
			num++;
			System.out.println(num);
		}
//		System.out.println(num);
//		}
		
		double myDouble = 9.78;
		int myInt = (int) myDouble;
		System.out.println(myInt);
		 String a = "jdjjd";
		 String test = "22";

		
		
	}

}
