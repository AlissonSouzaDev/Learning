package application;

import entities.SumVect;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		SumVect execute = new SumVect();
		
		System.out.print("How many values will each vector have?" + " ");
		execute.vectStarter();

		System.out.println("Enter the values of vector A:");
		for (int i = 0; i < execute.getVectParcelA().length; i++) {
		
			execute.setVectParcelA(i);
		
		}

		System.out.println("Enter the values of vector B:");
		for (int i = 0; i < execute.getVectParcelB().length; i++) {
		
			execute.setVectParcelB(i);
		
		}
		
		System.out.println("RESULTANT VECTOR:");
		for (int i = 0; i < execute.getVectParcelB().length; i++) {
			
			Sum.setSumResult(execute.getVectParcelA(), execute.getVectParcelB(), i);
			System.out.println(Sum.getSumResult());
			
		}
		
		Sum.reset();
		
		execute.sc.close();
		
	}
	
}
