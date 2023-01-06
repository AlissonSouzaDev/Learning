package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A < B && A < C) {
			
			System.out.println("SMALLER = " + A);
			
		} else if (B < C) {
			
			System.out.println("SMALLER = " + B);
			
		} else {
			
			System.out.println("SMALLER = " + C);
			
		}

		sc.close();

	}

}
