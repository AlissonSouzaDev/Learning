package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codePart1, numberPart1, codePart2, numberPart2;
		double unitValue1, unitValue2, totalAmmount;

		codePart1 = sc.nextInt();
		numberPart1 = sc.nextInt();
		unitValue1 = sc.nextDouble();
		codePart2 = sc.nextInt();
		numberPart2 = sc.nextInt();
		unitValue2 = sc.nextDouble();
		totalAmmount = (double) (numberPart1 * unitValue1) + (numberPart2 * unitValue2);
		
		System.out.printf("PAYABLE AMOUNT: $ %.2f%n", totalAmmount);

		sc.close();

	}

}
