package application;

import util.Older;

public class Program {

	public static void main(String[] args) {

		System.out.print("How many people will you type?" + " ");
		Older.vectStarter();

		for (int i = 0; i < Older.vectAge.length; i++) {
			
			System.out.println("Person" + " " + (i + 1) + " " + "data:");
			
			Older.vectNameValueInserter(i);
			Older.vectAgeValueInserter(i);
			Older.olderPersonDefiner(i);
			
		}

		System.out.print("OLDER PERSON:" + " " + Older.olderPerson);

	}

}
