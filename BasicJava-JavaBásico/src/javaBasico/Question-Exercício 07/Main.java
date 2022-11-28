package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, length, meter, area, price;
		width = sc.nextDouble();
		length = sc.nextDouble();
		meter = sc.nextDouble();
		area = width * length;
		
		System.out.printf("AREA: %.2f%n", area);
		
		price = meter * area;
		
		System.out.printf("PRICE: %.2f%n", price);
		
		sc.close();

	}

}
