package timJava.codingExercise;

public class FlourPackProblem {

	public static void main(String[] args) {

//		int a = 20;
//		int b = a % 5;
//		System.out.println(b);

		System.out.println(canPack(5, 3, 24));

	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		int r1 = bigCount * 5 + smallCount;
		int r2 = bigCount * 5;
		int r3 = goal - r2;
		int r4 = goal % 5;
		int r44= goal - r4;
		int r5 = r2 - goal;

		if (r1 == goal) {
			return true;
		} 
		if(r1>goal) {
			if(r4==0) {
				return true;
			}
			if(r4>0 && smallCount>0) {
				if(r5>0 && (goal-r44)%5<=smallCount) {
					return true;
				}
				if(r3>0 && r3<=smallCount) {
					return true;
				}
			}
		}
		if(r1<goal) {
			if(r4==0) {
				if(r3>0 && r3<=smallCount) {
					return true;
				}				
			}
			if(r4>0) {
				if(r3>0 && r3<=smallCount) {
					return true;
				}				
			}
		}		
		return false;
	}

}
