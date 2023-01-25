package util;

public class Sum {
	
	private static double sumResult;
	
	public static double getSumResult() {
		
		return sumResult;
		
	}

	public static void setSumResult(int parameter) {
		
		sumResult += parameter;
		
	}

	public static void setSumResult(int[] vect, int parameter) {
		
		sumResult += vect[parameter];
		
	}
	
	public static void setSumResult(double[] vect, int parameter) {
		
		sumResult += vect[parameter];
		
	}

	public static void setSumResult(int[] vectA, int[] vectB, int parameter) {
		
		sumResult = vectA[parameter] + vectB[parameter];
		
	}
	
	public static double setSumResult(double[] vectA, double[] vectB, int parameter) {
		
		sumResult = (vectA[parameter] + vectB[parameter]) / 2.0;
		
		return sumResult;
		
	}
	
	public static void reset() {
		
		sumResult = 0;
		
	}
	
}
