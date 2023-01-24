package util;

public class HighestNumber {

	private static double highestValue;
	private static int valuePosition;
	
	public static double getHighestValue() {
		
		return highestValue;
		
	}

	public static int getValuePosition() {
		
		return valuePosition;
		
	}

	public static void setHighestValueAndPosition(double parameterA, int parameterB) {
		
		if (parameterA > highestValue) {
			
			highestValue = parameterA;
			valuePosition = parameterB;
			
		}
		
	}
	
	public static void setHighestValueAndPosition(double[] parameterA, int parameterB) {
		
		if (parameterA[parameterB] > highestValue) {
			
			highestValue = parameterA[parameterB];
			valuePosition = parameterB;
			
		}
		
	}
	
	public static void reset() {
		
		highestValue = 0;
		valuePosition = 0;
		
	}
	
}
