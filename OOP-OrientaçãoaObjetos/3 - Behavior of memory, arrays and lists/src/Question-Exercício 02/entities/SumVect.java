package entities;

import java.util.Scanner;

public class SumVect {
	
	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private double[] vectNumbers;
	private static double sumResult = 0.0;

	public SumVect() {
		
	}	

	public double[] getVectNumbers() {
		
		return vectNumbers;
		
	}
	
	public static double getSumResult() {
		
		return sumResult;
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vectNumbers = new double[n];
		
	}
	
	public void vectValueInserter(int parameter) {
		
		vectNumbers[parameter] = sc.nextDouble();
		
	}
	
	public void vectValuePrinter(int parameter) {
		
		System.out.print(vectNumbers[vectNumbers.length - parameter] + " ");
		
	}

	public void vectValueAdder(int parameter) {
		
		sumResult += vectNumbers[parameter];
		
	}
	
}
