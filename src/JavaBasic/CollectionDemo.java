package JavaBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

		
		// print out unique number: 
		
		int a[]={2,4,5,7,7,5,4,2,44,51,44,52,77,7,78};		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
//				System.out.println(a[i]);
//				System.out.println(k);
				if(k==1) {
//					System.out.println(a[i]+" | is a unique number.");
					//or, as per below scripts: 
					HashSet<Integer> hs = new HashSet<Integer>();
					hs.add(a[i]);
					Iterator<Integer> it = hs.iterator();
					System.out.println(it.next()+" | is a unique number.");
				}
				
			}
		}
		
	}

}
