package util;

import java.util.Scanner;

public class HighestValue {

	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static double[] vect;
	public static double hValue = 0.0;
	public static int position = 0;
	
	public static void vectStarter() {
		
		n = sc.nextInt();
		vect = new double[n];
		
	}
	
	public static void vectValueInserter(double parameter) {
		
		vect[(int)parameter] = sc.nextDouble();
		
	}
	
	public static void vectHigherValueComparator(double parameterA, int parameterB) {
		
		if (parameterA > hValue) {
			
			hValue = parameterA;
			position = parameterB;
			
		} 
		
	}

	public static void vectResultsPrinter() {
		
		System.out.println();
		System.out.printf("HIGHEST VALUE = %.1f%n", hValue);
		System.out.printf("HIGHEST VALUE POSITION = %d", position);
		
	}
	
}