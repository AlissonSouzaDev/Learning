package entities;

import java.util.Scanner;

public class Approved {

	public Scanner sc = new Scanner(System.in);
	
	private int n;
	private String[] vectName;
	private double[] vectFirstGrade;
	private double[] vectSecondGrade;
	private double[] vectAverageGrade;
	
	public double[] getVectFirstGrade() {
		
		return vectFirstGrade;
		
	}

	public double[] getVectSecondGrade() {
		
		return vectSecondGrade;
		
	}

	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectFirstGrade = new double[n];
		vectSecondGrade = new double[n];
		vectAverageGrade = new double[n];
		
	}
	
	public void allVectsValueInserter(int parameter) {
		
		sc.nextLine();
		vectName[parameter] = sc.nextLine();
		vectFirstGrade[parameter] = sc.nextDouble();
		vectSecondGrade[parameter] = sc.nextDouble();
		
	}
	
	public void vectAverageGradeOperator(int parameter) {
		
		vectAverageGrade[parameter] = (vectFirstGrade[parameter] + vectSecondGrade[parameter]) / 2.0;
		
	}
	
	public void approvedStudentsExhibitor(int parameter) {
		
		sc.close();
		
		if (vectAverageGrade[parameter] >= 6.0) {
			
			System.out.println(vectName[parameter]);
			
		}
		
	}
	
}
