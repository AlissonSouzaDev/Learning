package util;

public class Counter {
	
	private static int quantity;

	public static int getQuantity() {
		
		return quantity;
		
	}

	public static void setMGenderQuantity(String[] vect, int parameterA) {
		
		String parameterB = vect[parameterA];
		
		if (parameterB.substring(0,1).toUpperCase().equals("M")) {
			
			quantity++;
			
		}
		
	}
	
	public static void setFGenderQuantity(String[] vectA, double[] vectB, int parameterA) {
		
		String parameterB = vectA[parameterA];
		
		if (parameterB.substring(0,1).toUpperCase().equals("F")) {
			
			Sum.setSumResult(vectB, parameterA);
			Average.setAverage();
			
		}
		
	}
	
	public static void reset() {
		
		quantity = 0;
		
	}

}
