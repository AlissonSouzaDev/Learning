package util;

public class Sum {
	
	public static double sumResult;
	public static double vectSumResult;
	
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
