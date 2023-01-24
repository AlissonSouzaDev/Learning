package application;

import entities.Negative;
import util.NegativeNumbers;

public class Program {

	public static void main(String[] args) {

		Negative execute = new Negative();
		
		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.setVectNumbers(i);
			
		}

		System.out.println("NEGATIVE NUMBERS:" + " ");
		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			NegativeNumbers.vectOperator(execute.getVectNumbers(), i);
			
		}
		
		execute.sc.close();

	}

}