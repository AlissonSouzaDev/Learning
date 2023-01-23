package application;

import entities.Negative;

public class Program {

	public static void main(String[] args) {

		Negative execute = new Negative();
		
		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.vectValueInserter(i);
			
		}

		System.out.println("NEGATIVE NUMBERS:" + " ");
		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			execute.negativeNumbers(i);
			
		}
		
		execute.sc.close();

	}

}