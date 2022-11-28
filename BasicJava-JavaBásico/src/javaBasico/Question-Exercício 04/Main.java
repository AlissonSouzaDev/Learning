package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numberEmployee, hoursEmployee;
		double amount, salary;

		numberEmployee = sc.nextInt();
		hoursEmployee = sc.nextInt();
		amount = sc.nextDouble();
		salary = (double) hoursEmployee * amount;
		System.out.println("NUMBER = " + numberEmployee);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		sc.close();

	}

}
