package application;

import java.util.Locale;

import entities.Approved;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Approved execute = new Approved();

		System.out.print("How many students will be typed?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectFirstGrade().length; i++) {
			
			System.out.println("Enter name, first and second grade of student" + " " + (i + 1) + ":");
			
			execute.allVectsValueInserter(i);
			execute.vectAverageGradeOperator(i);
			
		}

		System.out.println("Approved students:");
		for (int i = 0; i < execute.getVectSecondGrade().length; i++) {
			
			execute.approvedStudentsExhibitor(i);
			
		}

	}

}
