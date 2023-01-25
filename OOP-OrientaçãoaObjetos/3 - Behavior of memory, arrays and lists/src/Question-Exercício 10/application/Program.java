package application;

import java.util.Locale;

import entities.Approved;
import util.Average;
import util.Sum;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Approved execute = new Approved();

		System.out.print("How many students will be typed?" + " ");
		execute.vectStarter();

		for (int i = 0; i < execute.getVectFirstGrade().length; i++) {
			
			System.out.println("Enter name, first and second grade of student" + " " + (i + 1) + ":");
			execute.setVectName(i);
			execute.setVectFirstGrade(i);
			execute.setVectSecondGrade(i);
			Average.setVectAverage(execute.getVectFirstGrade(), execute.getVectSecondGrade(), i);
			
		}

		System.out.println("Approved students:");
		for (int i = 0; i < execute.getVectSecondGrade().length; i++) {
			
			execute.approvedStudents(i);
			
		}

		Sum.reset();
		Average.reset();
		
		execute.sc.close();
		
	}

}
