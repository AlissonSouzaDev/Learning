package util;

public class NegativeNumbers {

	public static void operator(int parameter) {
		
		if (parameter < 0) {
			
			System.out.println(parameter);
			
		}
		
	}
	
	public static void vectOperator(int[] vect, int parameter) {
		
		if (vect[parameter] < 0) {
			
			System.out.println(vect[parameter]);
			
		}
		
	}
	
}
