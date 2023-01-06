package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int code, quantity;
		double productA, productB, productC, productD, productE, total;
		
		code = sc.nextInt();
		quantity = sc.nextInt();
		productA = 4.00;
		productB = 4.50;
		productC = 5.00;
		productD = 2.00;
		productE = 1.50;
		
		if (code == 1) {
			
			total = (double) productA * quantity;
			
			System.out.printf("Total: $ %.2f%n", total);
			
		} else if (code == 2) {
			
			total = (double) productB * quantity;
			
			System.out.printf("Total: $ %.2f%n", total);
			
		} else if (code == 3) {
			
			total = (double) productC * quantity;
			
			System.out.printf("Total: $ %.2f%n", total);
			
		} else if (code == 4) {
			
			total = (double) productD * quantity;
			
			System.out.printf("Total: $ %.2f%n", total);
			
		} else if (code == 5) {
			
			total = (double) productE * quantity;
			
			System.out.printf("Total: $ %.2f%n", total);
			
		} else {
			
			System.out.println("Invalid Code");
			
		}

		sc.close();

	}

}

