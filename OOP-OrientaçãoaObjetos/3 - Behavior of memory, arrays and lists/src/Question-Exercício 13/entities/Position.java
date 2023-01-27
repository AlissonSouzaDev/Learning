package entities;

import java.util.Scanner;

public class Position {

	public Scanner sc = new Scanner(System.in);
	
	private int[][] matrixNumbers;
	
	private int m;
	private int n;
	
	public Position() {
		
	}

	public int[][] getMatrixNumbers() {
		
		return matrixNumbers;
		
	}

	public void setMatrixNumbers(int parameterA, int parameterB) {
		
		matrixNumbers[parameterA][parameterB] = sc.nextInt();
		
	}
	
	public void matrixStarter() {
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		matrixNumbers = new int[m][n];
		
	}
	
}
