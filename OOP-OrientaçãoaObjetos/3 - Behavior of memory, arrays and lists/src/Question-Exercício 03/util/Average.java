package util;

public class Average {
	
	private static double average = 0.0;
	
	public static double getAverage() {
		
		return average;
		
	}

	public static void setAverage(double sum, double value) {
		
		average = sum / value;
				
	}
	
	public static void belowAverageElements(double[] vect, int parameter) {
		
		if (vect[parameter] < average) {
			
			System.out.println(vect[parameter]);
			
		}
		
	}
	
	public static void reset() {
		
		average = 0;
		
	}
	
}
