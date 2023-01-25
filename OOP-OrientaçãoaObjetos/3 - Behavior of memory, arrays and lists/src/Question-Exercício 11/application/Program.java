package application;

import java.util.Locale;

import entities.PersonData;
import util.Average;
import util.Counter;
import util.PersonHeight;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		PersonData execute = new PersonData();

		System.out.print("How many people will be typed?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectHeight().length; i++) {
			
			System.out.print("Height of the person" + " " + (i + 1) + ":" + " ");
			execute.setVectHeight(i);
			System.out.print("Gender of person" + " " + (i + 1) + ":" + " ");
			execute.setVectGender(i);
			Counter.setMGenderQuantity(execute.getVectGender(), i);
			
		}

		for (int i = 0; i < execute.getVectHeight().length; i++) {
			
			PersonHeight.setSmallestHeight(execute.getVectHeight(), i);
			
		}
		System.out.printf("Smallest height = %.2f%n", PersonHeight.getHeight());
		
		PersonHeight.reset();

		for (int i = 0; i < execute.getVectHeight().length; i++) {
			
			PersonHeight.setGreaterHeight(execute.getVectHeight(), i);
			
		}
		System.out.printf("Greater height = %.2f%n", PersonHeight.getHeight());

		for (int i = 0; i < execute.getVectHeight().length; i++) {
			
			Counter.setFGenderQuantity(execute.getVectGender(), execute.getVectHeight(), i);
			
		}
		
		System.out.printf("Average height of women = %.2f%n", Average.getAverage(Sum.getSumResult()));
		System.out.println("Number of men =" + " " + Counter.getQuantity());

		Counter.reset();
		Sum.reset();
		Average.reset();
		PersonHeight.reset();
		
		execute.sc.close();

	}

}
