package application;

import java.util.Locale;

import entities.HighestValue;
import util.HighestNumber;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		HighestValue execute = new HighestValue();

		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.setVectNumbers(i);
			HighestNumber.setHighestValueAndPosition(execute.getVectNumbers(), i);	
			
		}

		System.out.println();
		System.out.printf("HIGHEST VALUE = %.1f%n", HighestNumber.getHighestValue());
		System.out.printf("HIGHEST VALUE POSITION = %d", HighestNumber.getValuePosition());
		
		HighestNumber.reset();
		
		execute.sc.close();

	}
	
}
