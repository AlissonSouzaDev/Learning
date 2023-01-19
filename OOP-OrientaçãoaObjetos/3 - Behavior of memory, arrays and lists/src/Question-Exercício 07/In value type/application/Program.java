package application;

import java.util.Locale;

import util.BelowAverage;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("How many elements will the vector have?" + " ");
		BelowAverage.vectStarter();

		for (int i = 0; i < BelowAverage.vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			BelowAverage.vectSumOperator(i);
			
		}

		System.out.println();
		System.out.printf("AVERAGE OF THE VECT: %.3f%n", BelowAverage.vectAverageOperator());
		
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for (int i = 0; i < BelowAverage.vect.length; i++) {
			
			BelowAverage.vectBelowAverageOperator(i);
			
		}

	}

}
