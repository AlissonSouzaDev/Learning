package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= N; i++) {

			factorial *= i;

		}

		if (N == 0) {

			N = factorial;

			System.out.println(N);

		} else {

			System.out.println(factorial);

		}
		
		sc.close();

	}
	
}
