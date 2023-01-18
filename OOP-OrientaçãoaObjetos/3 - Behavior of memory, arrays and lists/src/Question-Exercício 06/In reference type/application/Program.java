package application;

import entities.SumVect;

public class Program {

	public static void main(String[] args) {

		SumVect execute = new SumVect();
		
		System.out.print("Quantos valores vão ter cada vetor?" + " ");
		execute.vectDefiner();

		System.out.println("Digite os valores do vetor A:");
		execute.vectParcelAExecution();

		System.out.println("Digite os valores do vetor B:");
		execute.vectParcelBExecution();
		
		System.out.println("VETOR RESULTANTE:");
		execute.vectSumCExecution();

	}
	
}
