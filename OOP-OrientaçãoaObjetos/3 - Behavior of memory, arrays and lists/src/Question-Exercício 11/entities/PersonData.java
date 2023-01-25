package entities;

import java.util.Scanner;

public class PersonData {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private double[] vectHeight;
	private String[] vectGender;
	
	public PersonData() {
		
	}

	public double[] getVectHeight() {
		return vectHeight;
	}

	public void setVectHeight(int parameter) {
		
		vectHeight[parameter] = sc.nextDouble();
		
	}
	
	public String[] getVectGender() {
		return vectGender;
	}
	
	public void setVectGender(int parameter) {
		
		vectGender[parameter] = sc.next();
		sc.nextLine();
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vectHeight = new double[n];
		vectGender = new String[n];
		
	}
	
}
