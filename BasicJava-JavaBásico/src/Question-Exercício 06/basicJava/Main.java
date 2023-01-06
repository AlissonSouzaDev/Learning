package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, pi, rightTriangle, circle, trapezoid, square, rectangle;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		rightTriangle = A * C / 2;
		circle = pi * C * C;
		trapezoid = (A + B) * C / 2;
		square = B * B;
		rectangle = A * B;
		
		System.out.printf("RIGHT TRIANGLE: %.3f%n", rightTriangle);
		System.out.printf("CIRCLE: %.3f%n", circle);
		System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
		System.out.printf("SQUARE: %.3f%n", square);
		System.out.printf("RECTANGLE: %.3f%n", rectangle);

		sc.close();

	}

}
