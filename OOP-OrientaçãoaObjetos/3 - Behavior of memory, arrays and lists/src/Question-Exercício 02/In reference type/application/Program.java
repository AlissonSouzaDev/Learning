package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SumVect;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter?" + " ");
		int n = sc.nextInt();
		SumVect[] vect = new SumVect[n];
		SumVect average = new SumVect();

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			vect[i] = new SumVect(sc.nextDouble());
			
		}

		System.out.println();
		System.out.print("VALUES =" + " ");
		for (int i = vect.length; i > 0; i--) {
			
			System.out.print(vect[vect.length - i].getNumber() + " ");
			
		}

		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			
			average.add(vect[i].getNumber());
			
		}

		System.out.printf("SUM = %.2f%n", average.getSum());	
		System.out.printf("AVERAGE = %.2f%n", average.avg(vect.length));

		sc.close();
		
	}
	
}
