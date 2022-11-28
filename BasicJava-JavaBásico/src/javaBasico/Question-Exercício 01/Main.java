package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, sum;
		x = sc.nextInt();
		y = sc.nextInt();
		sum = x + y;
		System.out.println("Sum = " + sum);

		sc.close();

	}

}
