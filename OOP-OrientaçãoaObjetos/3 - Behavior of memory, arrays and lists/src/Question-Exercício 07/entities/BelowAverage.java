package entities;

import java.util.Scanner;

public class BelowAverage {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private double[] vectNumbers;
	
	public BelowAverage() {
		
	}
	
	public double[] getVectNumbers() {
		
		return vectNumbers;
		
	}
	
	public void setVectNumbers(int parameter) {
		
		vectNumbers[parameter] = sc.nextDouble();
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vectNumbers = new double[n];
		
	}
	
}
