package util;

public class EvenNumbers {

	private static int pairTotal;

	public static int getPairTotal() {
		
		return pairTotal;
		
	}

	public static void setPairTotal(int parameter) {
		
		if (parameter % 2 == 0) {
			
			System.out.print(parameter + " ");
			
			pairTotal++;
			
		}
		
	}
	
	public static void setPairTotal(int[] parameterA, int parameterB) {
		
		if (parameterA[parameterB] % 2 == 0) {
			
			System.out.print(parameterA[parameterB] + " ");
			
			pairTotal++;
			
		}
		
	}
	
	public static void reset() {
		
		pairTotal = 0;
		
	}
	
}
