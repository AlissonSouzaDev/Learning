package util;

import java.util.Scanner;

public class BelowAverage {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static double[] vect;
	public static double sum = 0.0;
	public static double average = 0.0;
	
	public static void vectStarter() {
		
		n = sc.nextInt();
		vect = new double[n];
		
	}

	public static void vectValueInserter(int parameter) {
		
		vect[parameter] = sc.nextDouble();
		
	}
	
	public static void vectSumOperator(int parameter) {
			
		sum += vect[parameter];
				
	}
	
	public static double vectAverageOperator() {
		
		average = sum / vect.length;
		
		sc.close();
		
		return average;
		
	}
	
	public static void vectBelowAverageOperator(int parameter) {
		
		if (vect[parameter] < average) {
			
			System.out.println(vect[parameter]);
			
		}
		
	}
	
}
