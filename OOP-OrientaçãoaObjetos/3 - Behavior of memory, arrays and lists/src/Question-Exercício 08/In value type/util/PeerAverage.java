package util;

import java.util.Scanner;

public class PeerAverage {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static int[] vect;
	public static double sum = 0.0;
	public static int peerAverage = 0;
	public static double average = 0.0;

	public static void vectStarter() {
		
		n = sc.nextInt();
		vect = new int[n];
		
	}
	
	public static void vectValueInserter(int parameter) {
		
		vect[parameter] = sc.nextInt();
		
	}
	
	public static void vectSumPeerAverageOperator(int parameter) {
		
		if (vect[parameter] % 2 == 0) {
			
			sum += vect[parameter];
			peerAverage++;
			
		}
		
	}
	
	public static double vectPeerAverageOperator() {
		
		sc.close();
		
		average = sum / peerAverage;
		
		return average;
		
	}
	
	public static void averageOfEvenNumbersPrinter(double parameter) {
		
		if (sum != 0.0) {
			
			System.out.print("PEER AVERAGE =" + " " + parameter);
			
		} else {
			
			System.out.print("NO EVEN NUMBERS");
			
		}
		
	}
	
}
