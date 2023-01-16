package application;

import java.util.Locale;
import java.util.Scanner;

import util.Average;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter?" + " ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			vect[i] = sc.nextDouble();
			
		}

		System.out.println();
		System.out.print("VALUES =" + " ");
		for (int i = vect.length; i > 0; i--) {
			
			System.out.print(vect[vect.length - i] + " ");
			
		}

		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			
			Average.accumulator = Average.sum(Average.accumulator, vect[i]);
		
		}

		System.out.printf("SUM = %.2f%n", Average.accumulator);
		System.out.printf("AVERAGE = %.2f%n", Average.avg(Average.accumulator, vect.length));

		sc.close();

	}

}
