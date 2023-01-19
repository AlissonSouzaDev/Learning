package application;

import entities.Older;

public class Program {

	public static void main(String[] args) {

		Older execute = new Older();

		System.out.print("How many people will you type?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectAge().length; i++) {
			
			System.out.println("Person" + " " + (i + 1) + " " + "data:");
			
			execute.vectNameValueInserter(i);
			execute.vectAgeValueInserter(i);
			execute.olderPersonDefiner(i);
			
		}

		System.out.print("OLDER PERSON:" + " " + execute.getOlderPerson());

	}
	
}