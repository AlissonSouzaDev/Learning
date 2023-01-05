package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = N;

		for (int i = 1; i <= N; i++) {
			
			int divisor = N / a;

			if (N % a == 0) {
				
				System.out.println(divisor);
				
			}

			a--;
			
		}

		sc.close();

	}

}
