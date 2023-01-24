package util;

public class Sum {
	
	private static double sumResult;
	
	public static double getSumResult() {
		
		return sumResult;
		
	}

	public static void setSumResult(int parameter) {
		
		sumResult += parameter;
		
	}

	public static void setSumResult(double[] vect, int parameter) {
		
		sumResult += vect[parameter];
		
	}
	
	public static void reset() {
		
		sumResult = 0.0;
		
	}
	
}
