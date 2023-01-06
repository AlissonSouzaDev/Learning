package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pass = sc.nextInt();
		
		while (pass != 2002) {
			
			System.out.println("Password Invalid");
			
			pass = sc.nextInt();
		}
		
		System.out.println("Access Allowed");
		
		sc.close();

	}

}
