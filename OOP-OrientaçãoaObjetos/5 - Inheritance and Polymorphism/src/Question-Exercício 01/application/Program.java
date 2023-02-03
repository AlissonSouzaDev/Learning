package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:" + " ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)?" + " ");
			sc.nextLine();
			String answer = sc.nextLine().substring(0);
				
			while (!answer.toLowerCase().equals("y") && !answer.toLowerCase().equals("n")) {
					
				System.out.print("Invalid answer, type again:" + " ");
				answer = sc.nextLine().substring(0);
					
			}			
			
			System.out.print("Name:" + " ");
			String name = sc.nextLine();
			System.out.print("Hours:" + " ");
			Integer hours = sc.nextInt();
			System.out.print("Value Per Hour:" + " ");
			Double valuePerHour = sc.nextDouble();
			
			if (answer.toLowerCase().equals("n")) {
				
				list.add(new Employee(name, hours, valuePerHour));
				
			} else {
				
				System.out.print("Additional Charge:" + " ");
				Double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee e : list) {
			
			System.out.println(e);
			
		}
		
		sc.close();
	
	}

}
