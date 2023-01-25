package entities;

import java.util.Scanner;

public class Older {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private String[] vectName;
	private int[] vectAge;
	
	
	
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
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectAge = new int[n];
		
	}

}
