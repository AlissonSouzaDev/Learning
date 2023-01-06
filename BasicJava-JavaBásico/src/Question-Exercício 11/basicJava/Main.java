package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, maxHour;
		
		A = sc.nextInt();
		B = sc.nextInt();
		maxHour = 24;
		
		if (A > B ) { 
			
			int C = (maxHour - A + B);
			
			System.out.printf("THE MATCH LASTED %d HOURS", C);	
			
		} else if (A < B) {
			
			int D = (B - A);
			
			System.out.printf("THE MATCH LASTED %d HOURS", D);
			
		} else {
			
			System.out.printf("THE MATCH LASTED %d HOURS", maxHour);
			
		}
		
		sc.close();

	}

}
