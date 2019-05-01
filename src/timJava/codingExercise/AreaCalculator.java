package timJava.codingExercise;

public class AreaCalculator {

	public static void main(String[] args) {

		System.out.println(area(-1));
		System.out.println(area(-1.0,4.0));

	}
	
	public static double area(double radius) {		
		if(radius<0) {
			return -1;
		}
		double areaResult = radius * radius * Math.PI;
		return areaResult;
	}
	
	public static double area(double x, double y) {		
		if(x<0 || y<0) {
			return -1.0;
		}
		double rectangleResult = x * y;
		return rectangleResult;
	}

}
