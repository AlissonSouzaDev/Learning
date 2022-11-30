package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double range = sc.nextDouble();

		if (range >= 0 && range <= 25) {
			
			System.out.println("Range [0,25]");
			
		} else if (range > 25 && range <= 50) {
			
			System.out.println("Range [25,50]");
			
		} else if (range > 50 && range <= 75) {
			
			System.out.println("Range [50,75]");
			
		} else if (range > 75 && range <= 100) {
			
			System.out.println("Range [75,100]");
			
		} else {
			
			System.out.println("Out of range");
			
		}
		
		sc.close();

	}

}
