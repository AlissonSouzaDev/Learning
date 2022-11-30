package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A;

		A = sc.nextInt();

		if (A % 2 == 0) {
			
			System.out.println("EVEN");
			
		} else {
			
			System.out.println("ODD");
			
		}

		sc.close();

	}

}
