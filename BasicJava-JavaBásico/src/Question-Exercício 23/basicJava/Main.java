package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int sum = 0;
		int quantity = 0;
		
		while (age >= 0) {
			
			sum += age;
			quantity += 1;
			age = sc.nextInt();
			
		}
		
		if (quantity > 0) {
			
			double media = (double) sum / quantity;
			
			System.out.printf("%.2f%n", media);
			
		} else {
			
			System.out.println("Unable to calculate");
			
		}
		
		sc.close();

	}

}
