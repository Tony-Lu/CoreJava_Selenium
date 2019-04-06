package JavaBasic;

public class PracticeBasic {

	public static void main(String[] args) {


		int arr[] = {12,2,4,55,53,67,98};
		
		int var = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>var) {
				var=arr[i];
			}
		}
		System.out.println(var);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==55) {
				System.out.println(i);
				break;
			}
		}
		
		
		
	}

}
