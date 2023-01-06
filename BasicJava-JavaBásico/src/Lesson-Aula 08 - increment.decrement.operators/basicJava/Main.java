package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutes = sc.nextInt();
		double count = 50.0;
		
		if (minutes > 100) {
			
			count = count + (minutes - 100) * 2.0;
			
		}

		System.out.printf("Payable amount: R$ %.2f%n", count);

		sc.close();

	}

}
