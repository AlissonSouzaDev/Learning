package application;

import java.util.Locale;

import entities.BelowAverage;
import util.Average;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		BelowAverage execute = new BelowAverage();

		System.out.print("How many elements will the vector have?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.setVectNumbers(i);
			Sum.setSumResult(execute.getVectNumbers(), i);
			
		}

		System.out.println();
		Average.setAverage(Sum.getSumResult(), execute.getVectNumbers().length);
		System.out.printf("AVERAGE OF THE VECTOR: %.3f%n", Average.getAverage());
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			Average.belowAverageElements(execute.getVectNumbers(), i);
			
		}
		
		Sum.reset();
		Average.reset();
		
		execute.sc.close();

	}
	
}
