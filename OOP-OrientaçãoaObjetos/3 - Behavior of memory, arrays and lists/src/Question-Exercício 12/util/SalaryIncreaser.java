package util;

import java.util.List;
import java.util.Scanner;

public class SalaryIncreaser {
	
	public static Scanner sc = new Scanner(System.in);
	
	private static int employeeId;
	private static double salary;

	public static int getEmployeeId() {
		
		return employeeId;
		
	}
	
	public static double getSalary() {
		
		return salary;
		
	}

	public static void setSalaryIncrease(List<Integer> parameterA, double[] vect) {
		
		employeeId = sc.nextInt();
		Integer parameterB = parameterA.stream().filter(x -> x == employeeId).findFirst().orElse(null);
		
		if (parameterB != null) {
			
			System.out.print("Enter the percentage:" + " ");
			salary = sc.nextDouble();
			vect[parameterA.indexOf(employeeId)] += (vect[parameterA.indexOf(employeeId)] * (salary / 100.0));
			System.out.println();
			
		} else {
			
			System.out.println("This id does not exist!");
			System.out.println();
			
		}
		
	}

}
