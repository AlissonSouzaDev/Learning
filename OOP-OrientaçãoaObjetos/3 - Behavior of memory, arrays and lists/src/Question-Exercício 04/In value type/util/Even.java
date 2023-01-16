package util;

public class Even {

	public static int pairTotal = 0;
	
	public static void accumulator(int parameter) {
		
		if (parameter % 2 == 0) {
			
			System.out.print(parameter + " ");
			
			pairTotal++;
			
		}
		
	}
	
	public static void skipEmptySpace() {
		
		System.out.println();
		System.out.println();
		
	}
	
}
