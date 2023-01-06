package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("You have typed: " + x);

		int y;
		y = sc.nextInt();
		System.out.println("Your number is: " + y);

		double z;
		z = sc.nextDouble();
		System.out.printf("You have $ %.2f%n", z);

		char gender;
		gender = sc.next().charAt(0);
		System.out.printf("O sexo da pessoa é: %s%n", gender);

		String name;
		int age;
		double wallet;
		char genderA;

		name = sc.next();
		age = sc.nextInt();
		wallet = sc.nextDouble();
		genderA = sc.next().charAt(0);

		System.out.printf("Your name is %s, you're %d years old, you earn $ %.2f, and you're a %s.%n", name, age, wallet, genderA);

		sc.close();

	}

}
