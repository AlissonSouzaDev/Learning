package entities;

import java.util.Scanner;

public class BelowAverage {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private double[] vect;
	private double sum = 0.0;
	private double average = 0.0;	
	
	public double[] getVect() {
		
		return vect;
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vect = new double[n];
		
	}
	
	public void vectSumOperator(int parameter) {
		
		vect[parameter] = sc.nextDouble();
		sum += vect[parameter];
		
	}
	
	public double vectAverageOperator() {
		
		average = sum / vect.length;
		
		sc.close();
		
		return average;
		
	}
	
	public void vectBelowAverageOperator(int parameter) {
		
		if (vect[parameter] < average) {
			
			System.out.println(vect[parameter]);
			
		}
		
	}
}
