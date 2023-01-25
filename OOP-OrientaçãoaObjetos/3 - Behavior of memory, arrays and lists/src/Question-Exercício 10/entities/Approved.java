package entities;

import java.util.Scanner;

import util.Average;

public class Approved {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private String[] vectName;
	private double[] vectFirstGrade;
	private double[] vectSecondGrade;
	
	public void setVectName(int parameter) {
		
		sc.nextLine();
		vectName[parameter] = sc.nextLine();
		
	}
	
	public double[] getVectFirstGrade() {
		
		return vectFirstGrade;
		
	}

	public void setVectFirstGrade(int parameter) {

		vectFirstGrade[parameter] = sc.nextDouble();
		
	}
	
	public double[] getVectSecondGrade() {
		
		return vectSecondGrade;
		
	}

	public void setVectSecondGrade(int parameter) {
		
		vectSecondGrade[parameter] = sc.nextDouble();
		
	}
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectFirstGrade = new double[n];
		vectSecondGrade = new double[n];
		Average.vectStarter(n);
		
	}
	
	public void approvedStudents(int parameter) {
		
		if (Average.getVectAverage()[parameter] >= 6.0) {
			
			System.out.println(vectName[parameter]);
			
		}
		
	}
	
}
