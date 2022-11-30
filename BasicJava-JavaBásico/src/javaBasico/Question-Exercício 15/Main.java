package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		
		double income;
		
		if (salary <= 2000.0) {
			
			income = 0.0;
			
		} else if (salary <= 3000.0) {
			
			income = (salary - 2000.0) * 0.08;
			
		} else if (salary <= 4500.0) {
			
			income = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
			
		} else {
			
			income = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
		}

		if (income == 0.0) {
			
			System.out.println("Exempt");
			
		} else {
			
			System.out.printf("R$ %.2f%n", income);
			
		}
		
		sc.close();
		
	}

}
