package entities;

import java.util.Scanner;

public class Height {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private String[] vectName;
	private int[] vectAge;
	private double[] vectHeight;
	
	public Height() {
		
	}

	public String[] getVectName() {
		
		return vectName;
		
	}
	
	public void setVectName(int parameter) {
		
		vectName[parameter] = sc.next();
		sc.nextLine();
		
	}

	public int[] getVectAge() {
		
		return vectAge;
		
	}
	
	public void setVectAge(int parameter) {
		
		vectAge[parameter] = sc.nextInt();
		
	}

	public double[] getVectHeight() {
		
		return vectHeight;
		
	}
	
	public void setVectHeight(int parameter) {
		
		vectHeight[parameter] = sc.nextDouble();
		
	}
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectAge = new int[n];
		vectHeight = new double[n];
		
	}
	
}
