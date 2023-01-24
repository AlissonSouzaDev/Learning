package util;

public class EvenNumbers {

	private static int pairTotal;
	private static int vectPairTotal;

	public static int getPairTotal() {
		
		return pairTotal;
		
	}

	public static void setPairTotal(int parameter) {
		
		if (parameter % 2 == 0) {
			
			System.out.print(parameter + " ");
			
			pairTotal++;
			
		}
		
	}
	
	public static int getVectPairTotal() {
		
		return vectPairTotal;
		
	}
	
	public static void setVectPairTotal(int[] parameterA, int parameterB) {
		
		if (parameterA[parameterB] % 2 == 0) {
			
			System.out.print(parameterA[parameterB] + " ");
			
			vectPairTotal++;
			
		}
		
	}
	
	public static void resultReset() {
		
		pairTotal = 0;
		
	}
	
	public static void vectResultReset() {
		
		vectPairTotal = 0;
		
	}
	
}
