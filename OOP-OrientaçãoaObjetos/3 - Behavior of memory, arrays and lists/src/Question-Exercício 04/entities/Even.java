package entities;

import java.util.Scanner;

public class Even {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private int[] vectNumbers;
	
	public Even() {
		
	}

	public int[] getVectNumbers() {
		
		return vectNumbers;
		
	}

	public void setVectNumbers(int parameter) {
		
		vectNumbers[parameter] = sc.nextInt();
		
	}
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectNumbers = new int[n];
		
	}
	
	public void skipEmptySpace() {
		
		System.out.println();
		System.out.println();
		
	}
	
}
