package util;

public class Sum {
	
	private static int sumResult;
	
	public static int getSumResult() {
		
		return sumResult;
		
	}

	public static void setSumResult(int parameter) {
		
		sumResult += parameter;
		
	}

	public static void setSumResult(double[] vect, int parameter) {
		
		sumResult += vect[parameter];
		
	}

	public static void setSumResult(int[] vectA, int[] vectB, int parameter) {
		
		sumResult = vectA[parameter] + vectB[parameter];
		
	}
	
	public static void reset() {
		
		sumResult = 0;
		
	}
	
}
