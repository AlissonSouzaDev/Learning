package application;

import java.util.Locale;

import entities.BelowAverage;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		BelowAverage execute = new BelowAverage();

		System.out.print("How many elements will the vector have?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVect().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.vectSumOperator(i);
			
		}

		System.out.println();
		System.out.printf("AVERAGE OF THE VECTOR: %.3f%n", execute.vectAverageOperator());
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for (int i = 0; i < execute.getVect().length; i++) {
			
			execute.vectBelowAverageOperator(i);
			
		}

	}
	
}
