package entities;

public class Student {

	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;
	
	public double finalGrade() {
		
		return gradeA + gradeB + gradeC;
		
	}
	
	public void showResults(double value) {
		
		if (finalGrade() > 60.00) {
			
			System.out.printf("FINAL GRADE: %.2f%n", finalGrade());
			System.out.println("PASS");
			
		} else {
			
			double failedResult = 60.00 - finalGrade();
			System.out.printf("FINAL GRADE: %.2f%n", finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", failedResult);
			
		}
		
	}
	
}
