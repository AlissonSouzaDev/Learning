package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();
		int alcohol = 0;
		int gas = 0;
		int diesel = 0;

		while (code != 4) {
			
			if (code == 1) {
				
				alcohol += 1;
				
			} else if (code == 2) {
				
				gas += 1;
				
			} else if (code == 3) {
				
				diesel += 1;
				
			} else {
				
				System.out.println("Enter a valid code!");
				
			}
			
			code = sc.nextInt();
			
		}

		System.out.println("THANK YOU!");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gas);
		System.out.println("Diesel: " + diesel);

		sc.close();
		
	}

}
