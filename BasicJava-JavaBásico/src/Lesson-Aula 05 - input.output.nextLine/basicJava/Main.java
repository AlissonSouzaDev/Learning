package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Entered Data: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		int x;
		String g1, g2, g3;

		x = sc.nextInt();
		sc.nextLine();
		g1 = sc.nextLine();
		g2 = sc.nextLine();
		g3 = sc.nextLine();

		System.out.println("Entered Data: ");
		System.out.println(x);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);

		sc.close();

	}

}
