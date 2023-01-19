package entities;

import java.util.Scanner;

public class Older {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private String[] vectName;
	private int[] vectAge;
	private String olderPerson = null;
	private int olderPersonAge = 0;
	
	public int[] getVectAge() {
		
		return vectAge;
		
	}

	public String getOlderPerson() {
		
		return olderPerson;
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectAge = new int[n];
		
	}
	
	public void vectNameValueInserter(int parameter) {
		
		System.out.print("Name:" + " ");
		vectName[parameter] = sc.next();
		sc.nextLine();
		
	}
	
	public void vectAgeValueInserter(int parameter) {
		
		System.out.print("Age:" + " ");
		vectAge[parameter] = sc.nextInt();
		
	}
	
	public void olderPersonDefiner(int parameter) {
		
		if (vectAge[parameter] > olderPersonAge) {
			
			olderPerson = vectName[parameter];
			olderPersonAge = vectAge[parameter];
			
		}
		
	}

}
