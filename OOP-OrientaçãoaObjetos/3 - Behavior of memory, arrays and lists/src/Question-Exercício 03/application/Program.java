package application;

import java.util.Locale;

import entities.Height;
import util.Average;
import util.Sum;
import util.UnderAge;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Height execute = new Height();
		
		System.out.print("How many people will be typed?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectName().length; i++) {
			
			System.out.println("Person data" + " "+ (i + 1) + ":");
			System.out.print("Name:" + " ");
			execute.setVectName(i);
			
			System.out.print("Age:" + " ");
			execute.setVectAge(i);
			
			System.out.print("Height:" + " ");
			execute.setVectHeight(i);
		
		}
		
		System.out.println();
		for (int i = 0; i < execute.getVectHeight().length; i++) {
			
			Sum.vectOperation(execute.getVectHeight(), i);
			
		}
		
		System.out.printf("Medium height: %.2f%n", Average.operation(Sum.getVectSumResult(), execute.getVectHeight().length));

		for (int i = 0; i < execute.getVectAge().length; i++) {
			
			UnderAge.vectNumberOfMinors(execute.getVectAge(), i);
			
		}
		
		System.out.printf("People under 16 years old: %.1f%%%n", UnderAge.likelihoodOfMinors(execute.getVectAge().length));

		for (int i = 0; i < execute.getVectAge().length; i++) {
			
			UnderAge.vectPrinterForMinors(execute.getVectAge(), execute.getVectName(), i);
			
		}
		
		execute.sc.close();

	}

}
