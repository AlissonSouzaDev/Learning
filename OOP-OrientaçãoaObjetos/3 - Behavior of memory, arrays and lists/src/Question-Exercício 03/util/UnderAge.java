package util;

public class UnderAge {

	public static final int ageLimit = 16;
	public static int underAge;
	
	public static void numberOfMinors(int parameter) {
		
		if (parameter < ageLimit) {
			
			underAge++;
			
		}
		
	}
	
	public static void vectNumberOfMinors(int[] parameterA, int parameterB) {
		
		if (parameterA[parameterB] < ageLimit) {
			
			underAge++;
			
		}
		
	}
	
	public static double likelihoodOfMinors(double parameterA) {
		
		double parameterB = 0.0;
		
		if (underAge > 0) {
			
			parameterB = (underAge / parameterA) * 100.0;
			
		}
		
		return parameterB;
		
	}
	
	public static void printerForMinors(int parameterA, String parameterB) {
		
		if (parameterA < ageLimit) {
			
			System.out.println(parameterB);
			
		}
		
	}
	
	public static void vectPrinterForMinors(int[] parameterA, String[] parameterB, int parameterC) {
		
		if (parameterA[parameterC] < ageLimit) {
			
			System.out.println(parameterB[parameterC]);
			
		}
		
	}
	
	public static void reset() {
		
		underAge = 0;
		
	}
}
