package application;

import entities.Older;
import util.OlderPerson;

public class Program {

	public static void main(String[] args) {

		Older execute = new Older();

		System.out.print("How many people will you type?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectAge().length; i++) {
			
			System.out.println("Person" + " " + (i + 1) + " " + "data:");
			System.out.print("Name:" + " ");
			execute.setVectName(i);
			System.out.print("Age:" + " ");
			execute.setVectAge(i);
			OlderPerson.setOlderPerson(execute.getVectAge(), execute.getVectName(), i);
			
		}

		System.out.print("OLDER PERSON:" + " " + OlderPerson.getOlderPerson());

		OlderPerson.reset();
		
		execute.sc.close();
		
	}
	
}