package javaBasico;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("Good Morning!");
		System.out.print("Good Afternoon, ");
		System.out.println("How are you?");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULT = " + y + " METERS");
		System.out.printf("RESULT = %.2f meters%n", x);
		
		String name = "Maria";
		int age = 31;
		double wallet = 4000.0;
		
		System.out.printf("%s have %d years and earns $ %.2f%n", name, age, wallet);

	}

}
