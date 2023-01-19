package entities;

import java.util.Scanner;

public class PeerAverage {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private int[] vect;
	private double sum = 0.0;
	private int peerAverage = 0;
	private double average = 0.0;

	public int[] getVect() {
		
		return vect;
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vect = new int[n];
		
	}
	
	public void vectValueInserter(int parameter) {
		
		vect[parameter] = sc.nextInt();
		
	}
	
	public void vectSumPeerAverageOperator(int parameter) {
		
		if (vect[parameter] % 2 == 0) {
			
			sum += vect[parameter];
			peerAverage++;
			
		}
		
	}
	
	public double vectPeerAverageOperator() {
		
		sc.close();
		
		average = sum / peerAverage;
		
		return average;
		
	}
	
	public void averageOfEvenNumbersPrinter(double parameter) {
		
		if (sum != 0.0) {
			
			System.out.print("PEER AVERAGE =" + " " + parameter);
			
		} else {
			
			System.out.print("NO EVEN NUMBERS");
			
		}
		
	}
	
}
