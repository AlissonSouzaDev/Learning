package application;

import java.util.Locale;

import entities.HighestValue;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		HighestValue execute = new HighestValue();

		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVect().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.vectValueInserter(i);
			execute.vectHigherValueComparator(execute.getVect()[i], i);
			
		}

		execute.vectResultsPrinter();

	}
	
}
