package application;

import java.util.Locale;

import entities.SumVectA;
import util.Average;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SumVectA execute = new SumVectA();

		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.setVectNumbers(i);
			
		}

		System.out.println();
		System.out.print("VALUES =" + " ");
		for (int i = execute.getVectNumbers().length; i > 0; i--) {
			
			execute.vectValuePrinter(i);
			
		}

		System.out.println();
		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			Sum.setSumResult(execute.getVectNumbers(), i);
			
		}

		System.out.printf("SUM = %.2f%n", Sum.getSumResult());	
		Average.setAverage(Sum.getSumResult(), execute.getVectNumbers().length);
		System.out.printf("AVERAGE = %.2f%n", Average.getAverage());

		Sum.reset();
		Average.reset();
		
		execute.sc.close();
		
	}
	
}
