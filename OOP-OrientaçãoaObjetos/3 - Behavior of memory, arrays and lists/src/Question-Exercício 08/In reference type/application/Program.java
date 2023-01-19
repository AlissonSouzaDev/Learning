package application;

import java.util.Locale;

import entities.PeerAverage;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		PeerAverage execute = new PeerAverage();

		System.out.print("How many elements will the vector have?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVect().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			
			execute.vectValueInserter(i);
			execute.vectSumPeerAverageOperator(i);
		}

		execute.averageOfEvenNumbersPrinter(execute.vectPeerAverageOperator());

	}

}
