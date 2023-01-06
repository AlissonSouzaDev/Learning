package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int m = 0; m < N; m++) {
			
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			double div = (double) numerator / denominator;

			if (denominator == 0) {
				
				System.out.println("Impossible Division");
				
			} else {
				
				System.out.println(div);
				
			}
		}

		sc.close();

	}

}
