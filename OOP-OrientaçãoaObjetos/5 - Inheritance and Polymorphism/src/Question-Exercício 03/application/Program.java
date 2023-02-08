package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Companies;
import entities.Individuals;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:" + " ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Tax Payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)?" + " ");
			sc.nextLine();
			String answer = sc.nextLine().substring(0);
			
			while (!answer.toLowerCase().equals("i") && !answer.toLowerCase().equals("c")) {
				
				System.out.print("Invalid answer, type again:" + " ");
				answer = sc.nextLine().substring(0);
				
			}
			
			System.out.print("Name:" + " ");
			String name = sc.nextLine();
			System.out.print("Annual Income:" + " ");
			Double anualIncome = sc.nextDouble();
			
			if (answer.toLowerCase().equals("i")) {
				
				System.out.print("Health Expenditures:" + " ");
				Double healthExpenditures = sc.nextDouble();
				
				while (healthExpenditures < 0.0) {
					
					System.out.print("Invalid value, type again:" + " ");
					healthExpenditures = sc.nextDouble();
					
				}
				
				list.add(new Individuals(name, anualIncome, healthExpenditures));
				
			} else {
				
				System.out.print("Number of Employees:" + " ");
				Integer numberOfEmployees = sc.nextInt();
				
				list.add(new Companies(name, anualIncome, numberOfEmployees));
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer tp : list) {
			
			
			System.out.println(tp);
			
		}
		
		double sum = 0.0;
		for (TaxPayer tp : list) {
			
			sum += tp.tax();
			
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES:" + " " + String.format("%.2f", sum));		
		
		sc.close();
		
	}
	
}
