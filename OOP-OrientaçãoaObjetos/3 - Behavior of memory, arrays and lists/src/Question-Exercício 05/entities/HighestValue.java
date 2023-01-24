package entities;

import java.util.Scanner;

public class HighestValue {
	
	public Scanner sc = new Scanner(System.in);
	
	public int n;
	private double[] vectNumbers;	

	public HighestValue() {
		
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