package util;

public class PersonData {
	
	public static final int ageLimit = 16;
	public static double sumHeight = 0.0;
	public static int underAge = 0;

	public static double sum(double sum, double value) {
		
		return sum + value;
		
	}

	public static double avg(double sum, double value) {
		
		return sum / value;
				
	}
	
	public static void increaser(int parameter) {	
		
		if (parameter < ageLimit) {
			
			underAge++;
			
		} 
		
	}

	public static double underAgeProb(double parameterA) {
		
		double parameterB = 0;
		
		if (underAge > 0) {
			
			parameterB = (underAge / parameterA) * 100;
			
		}
		
		return parameterB;
		
	}
	
	public static void printAge(String parameterA, int parameterB) {
		
		if (parameterB < 16) {
			
			System.out.println(parameterA);
			
		}
		
	}
}
