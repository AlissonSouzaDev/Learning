package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double x, y, z;

		for (int m = 0; m < N; m++) {
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			double media = (((x * 2.0) + (y * 3.0) + (z * 5.0)) / (2.0 + 3.0 + 5.0));

			System.out.printf("%.1f%n", media);
			
		}

		sc.close();

	}

}
