package entities;

import java.util.Scanner;

public class SumVect {

	public Scanner sc = new Scanner(System.in);
	
	public int n;
	private int[] vectParcelA;
	private int[] vectParcelB;
	private int[] vectSumC;
	
	public SumVect() {
		
	}

	public int[] getVectParcelA() {
		
		return vectParcelA;
		
	}

	public int[] getVectParcelB() {
		
		return vectParcelB;
		
	}

	public int[] getVectSumC() {
		
		return vectSumC;
		
	}
	
	public void vectDefiner() {
		
		n = sc.nextInt();
		
	}
	
	public void vectParcelAExecution() {
		
		vectParcelA = new int[n];
		
		for (int i = 0; i < vectParcelA.length; i++) {
			
			vectParcelA[i] = sc.nextInt();
			
		}
	
	}
	
	public void vectParcelBExecution() {
		
		vectParcelB = new int[n];
		
		for (int i = 0; i < vectParcelB.length; i++) {
			
			vectParcelB[i] = sc.nextInt();
			
		}
		
		sc.close();
	
	}
	
	public void vectSumCExecution() {
		
		vectSumC = new int[n];
		
		for (int i = 0; i < vectParcelB.length; i++) {
			
			vectSumC[i] = vectParcelA[i] + vectParcelB[i];
			System.out.println(vectSumC[i]);
			
		}
	
	}
	
}
