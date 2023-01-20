package util;

import java.util.Scanner;

public class Approved {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static String[] vectName;
	public static double[] vectFirstGrade;
	public static double[] vectSecondGrade;
	public static double[] vectAverageGrade;
	
	public static void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectFirstGrade = new double[n];
		vectSecondGrade = new double[n];
		vectAverageGrade = new double[n];
		
	}
	
	public static void allVectsValueInserter(int parameter) {
		
		sc.nextLine();
		vectName[parameter] = sc.nextLine();
		vectFirstGrade[parameter] = sc.nextDouble();
		vectSecondGrade[parameter] = sc.nextDouble();
		
	}
	
	public static void vectAverageGradeOperator(int parameter) {
		
		vectAverageGrade[parameter] = (vectFirstGrade[parameter] + vectSecondGrade[parameter]) / 2.0;
		
	}
	
	public static void approvedStudentsExhibitor(int parameter) {
		
		sc.close();
		
		if (vectAverageGrade[parameter] >= 6.0) {
			
			System.out.println(vectName[parameter]);
			
		}
		
	}
	
}
