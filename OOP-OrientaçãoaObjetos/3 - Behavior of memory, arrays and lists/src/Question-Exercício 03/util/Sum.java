package util;

public class Sum {
	
	private static double sumResult;
	private static double vectSumResult;
	
	public static double getSumResult() {
		
		return sumResult;
		
	}

	public static double getVectSumResult() {
		
		return vectSumResult;
		
	}

	public static void operation(int parameter) {
		
		sumResult += parameter;
		
	}

	public static void vectOperation(double[] vect, int parameter) {
		
		vectSumResult += vect[parameter];
		
	}
	
	public static void sumReset() {
		
		sumResult = 0.0;
		
	}
	
	public static void vectSumReset() {
		
		vectSumResult = 0.0;
		
	}
	
}
