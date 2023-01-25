package util;

public class PersonHeight {
	
	private static double height;

	public static double getHeight() {
		
		return height;
		
	}

	public static void setSmallestHeight(double[] vect, int parameter) {
		
		if (parameter == 0) {
			
			height = vect[parameter];
			
		} else if (vect[parameter] < height) {
			
			height = vect[parameter];
			
		}
		
	}
	
	public static void setGreaterHeight(double[] vect, int parameter) {
		
		if (vect[parameter] > height) {
			
			height = vect[parameter];
			
		}
		
	}
	
	public static void reset() {
		
		height = 0;
		
	}

}
