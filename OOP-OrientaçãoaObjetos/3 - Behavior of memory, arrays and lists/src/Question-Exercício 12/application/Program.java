package application;

import java.util.Locale;

import entities.Employee;
import util.SalaryIncreaser;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Employee execute = new Employee();
		
		System.out.print("How many employees will be registered?" + " ");
		execute.vectStarter();
		
		for (int i = 0; i < execute.getVectName().length; i++) {
			
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id:" + " ");
			execute.setId(i);
			System.out.print("Name:" + " ");
			execute.setVectName(i);
			System.out.print("Salary:" + " ");
			execute.setVectSalary(i);
			
		}
		for (Integer obj : execute.getId()) {
			
			System.out.println(obj);
			
		}
		System.out.print("Enter the employee id that will have salary increase :" + " ");
		SalaryIncreaser.setSalaryIncrease(execute.getId(), execute.getVectSalary());
		
		System.out.println("List of employees:");
		for (int i = 0; i < execute.getVectSalary().length; i++) {
			
			System.out.println(execute.toString(i));
			
		}
		
	}
	
}
	
