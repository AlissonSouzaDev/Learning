package application;

import java.util.Locale;

import entities.SumVect;
import util.Average;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SumVect execute = new SumVect();

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
			
			Sum.setVectSumResult(execute.getVectNumbers(), i);
			
		}

		System.out.printf("SUM = %.2f%n", Sum.getVectSumResult());	
		System.out.printf("AVERAGE = %.2f%n", Average.operation(Sum.getVectSumResult(), execute.getVectNumbers().length));

		Sum.vectResultReset();
		
		execute.sc.close();
		
	}
	
}
