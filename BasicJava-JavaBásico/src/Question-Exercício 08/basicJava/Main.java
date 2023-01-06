package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
		if (A < 0) {
			
			System.out.println("NEGATIVE");
			
		} else {
			
			System.out.println("NON-NEGATIVE");
			
		}

		sc.close();

	}

}
