package entities;

import java.util.Scanner;

public class HighestValue {
	
	private double[] vect;
	
	public Scanner sc = new Scanner(System.in);

	public double hValue = 0.0;
	public int n;
	public int position = 0;

	public HighestValue() {
		
	}

	public double[] getVect() {
		
		return vect;
		
	}

	public void setVect(double[] vect, double parameter) {
		
		vectValueInserter(parameter);
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vect = new double[n];
		
	}
	
	public void vectValueInserter(double parameter) {
		
		vect[(int)parameter] = sc.nextDouble();
		
	}
	
	public void vectHigherValueComparator(double parameterA, int parameterB) {
		
		if (parameterA > hValue) {
			
			hValue = parameterA;
			position = parameterB;
			
		} 
		
	}
	
	public void vectResultsPrinter() {
		
		System.out.println();
		System.out.printf("HIGHEST VALUE = %.1f%n", hValue);
		System.out.printf("HIGHEST VALUE POSITION = %d", position);
		
	}
	
}
