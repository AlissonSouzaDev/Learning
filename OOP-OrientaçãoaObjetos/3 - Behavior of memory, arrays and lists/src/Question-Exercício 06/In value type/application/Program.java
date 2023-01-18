package application;

import util.SumVect;

public class Program {

	public static void main(String[] args) {

		System.out.print("How many values will each vector have?" + " ");
		SumVect.vectDefiner();

		System.out.println("Enter the values of vector A:");
		SumVect.vectParcelAExecution();

		System.out.println("Enter the values of vector B:");
		SumVect.vectParcelBExecution();

		System.out.println("RESULTING VECTOR:");
		SumVect.vectSumCExecution();

	}

}
