package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			
			System.out.println("Are multiple");
			
		} else {
			
			System.out.println("Aren't multiple");
			
		}

		sc.close();

	}

}
