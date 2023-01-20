package application;

import java.util.Locale;

import util.Approved;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("How many students will be typed?" + " ");
		Approved.vectStarter();

		for (int i = 0; i < Approved.vectFirstGrade.length; i++) {
			
			System.out.println("Enter name, first and second grade of student" + " " + (i + 1) + ":");
			
			Approved.allVectsValueInserter(i);
			Approved.vectAverageGradeOperator(i);
			
		}

		System.out.println("Approved students:");
		for (int i = 0; i < Approved.vectSecondGrade.length; i++) {
			
			Approved.approvedStudentsExhibitor(i);
			
		}

	}

}
