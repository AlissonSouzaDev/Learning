package application;

import java.util.Locale;

import entities.PeerAverage;
import util.Average;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		PeerAverage execute = new PeerAverage();

		System.out.print("How many elements will the vector have?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectNumbers().length; i++) {
			
			System.out.print("Enter a number:" + " ");
			
			execute.setVectNumbers(i);
			Average.setPeerAverage(execute.getVectNumbers(), i);
			
		}

		Average.setAverageOfPeerAverage(Sum.getSumResult());
		Average.peerAverageElements(Average.getAverage());
		
		Sum.reset();
		Average.reset();
		
		execute.sc.close();

	}

}
