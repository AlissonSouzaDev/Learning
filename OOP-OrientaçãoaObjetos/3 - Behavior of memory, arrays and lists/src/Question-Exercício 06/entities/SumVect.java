package entities;

import java.util.Scanner;

public class SumVect {

	public Scanner sc = new Scanner(System.in);
	
	public int n;
	private int[] vectParcelA;
	private int[] vectParcelB;
	
	public SumVect() {
		
	}

	public int[] getVectParcelA() {
		
		return vectParcelA;
		
	}

	public void setVectParcelA(int parameter) {
		
		vectParcelA[parameter] = sc.nextInt();
		
	}
	
	public int[] getVectParcelB() {
		
		return vectParcelB;
		
	}
	
	public void setVectParcelB(int parameter) {
		
		vectParcelB[parameter] = sc.nextInt();

	}
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectParcelA = new int[n];
		vectParcelB = new int[n];
		
	}
	
}
