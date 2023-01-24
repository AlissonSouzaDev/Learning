package entities;

import java.util.Scanner;

public class SumVect {
	
	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private double[] vectNumbers;

	public SumVect() {
		
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
	
	public void vectValuePrinter(int parameter) {
		
		System.out.print(vectNumbers[vectNumbers.length - parameter] + " ");
		
	}

}
