package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius, pi, area, squaredRadius;
		
		radius = sc.nextDouble();
		pi = 3.14159;
		squaredRadius = Math.pow(radius, 2.0);
		area = pi * squaredRadius;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();

	}

}
