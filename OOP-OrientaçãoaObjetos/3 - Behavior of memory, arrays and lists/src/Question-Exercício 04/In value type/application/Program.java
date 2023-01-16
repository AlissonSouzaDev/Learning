package application;

import java.util.Scanner;

import util.Even;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter?" + " ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			vect[i] = sc.nextInt();
			
		}

		System.out.println();
		System.out.println("EVEN NUMBERS:" + " ");
		for (int i = 0; i < vect.length; i++) {
			
			Even.accumulator(vect[i]);
			
		}

		Even.skipEmptySpace();

		System.out.print("QUANTITY OF EVEN NUMBERS =" + " " + Even.pairTotal);

		sc.close();

	}

}
