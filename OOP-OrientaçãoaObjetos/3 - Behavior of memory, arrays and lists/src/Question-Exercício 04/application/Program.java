package application;

import entities.Even;
import util.EvenNumbers;

public class Program {

	public static void main(String[] args) {

		Even execute = new Even();

		System.out.print("How many numbers will you enter?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			execute.setVectNumbers(i);
			
		}

		System.out.println();
		System.out.println("EVEN NUMBERS:" + " ");
		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			EvenNumbers.setVectPairTotal(execute.getVectNumbers(), i);
			
		}

		execute.skipEmptySpace();

		System.out.print("QUANTITY OF EVEN NUMBERS =" + " " + EvenNumbers.getVectPairTotal());

		EvenNumbers.vectResultReset();
		
		execute.sc.close();

	}

}
