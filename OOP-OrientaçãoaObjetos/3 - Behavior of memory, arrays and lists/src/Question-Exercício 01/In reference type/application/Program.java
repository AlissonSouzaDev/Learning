package application;

import java.util.Scanner;

import entities.Negative;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will you enter?" + " ");
		int n = sc.nextInt();

		Negative[] vect = new Negative[n];

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Enter a number:" + " ");
			vect[i] = new Negative(sc.nextInt());
			
		}

		System.out.println("NEGATIVE NUMBERS:" + " ");
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i].getNumber() < 0) {
				
				System.out.println(vect[i].getNumber());
				
			}

			sc.close();
			
		}

	}

}