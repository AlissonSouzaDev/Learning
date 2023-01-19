package application;

import java.util.Locale;

import util.PeerAverage;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("How many elements will the vector have?" + " ");
		PeerAverage.vectStarter();

		for (int i = 0; i < PeerAverage.vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			PeerAverage.vectValueInserter(i);
			PeerAverage.vectSumPeerAverageOperator(i);
			
		}
		
		PeerAverage.averageOfEvenNumbersPrinter(PeerAverage.vectPeerAverageOperator());

	}

}
