package application;

import java.util.Scanner;

import entities.Even;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter?" + " ");
		int n = sc.nextInt();
		Even[] vect = new Even[n];
		Even method = new Even();

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			vect[i] = new Even(sc.nextInt());
			
		}

		System.out.println();
		System.out.println("EVEN NUMBERS:" + " ");
		for (int i = 0; i < vect.length; i++) {
			
			method.accumulator(vect[i].getNumber());
			
		}

		method.skipEmptySpace();

		System.out.print("QUANTITY OF EVEN NUMBERS =" + " " + method.pairTotal);

		sc.close();

	}

}
