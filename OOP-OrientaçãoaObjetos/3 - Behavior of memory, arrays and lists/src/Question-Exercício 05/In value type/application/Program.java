package application;

import java.util.Locale;

import util.HighestValue;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("How many numbers will you enter?" + " ");
		HighestValue.vectStarter();

		for (int i = 0; i < HighestValue.vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			HighestValue.vectValueInserter(i);
			HighestValue.vectHigherValueComparator(HighestValue.vect[i], i);
			
		}
				
		HighestValue.vectResultsPrinter();
	
	}

}
